public class ParseToInteger {

    public int parse(String str){
        int sum=0;
        if(str.startsWith("(")&&str.endsWith(")")){
           return parse(str.substring(1,str.length()-1));
        }else if(str.startsWith("(")&&!str.endsWith(")")){
            return parseOpposite(str);
        }else {
            int pos = 0;

            while (pos < str.length() - 1) {
                if (str.charAt(pos) >= '0' && str.charAt(pos) <= '9') {
                    pos++;

                } else {
                    int leftOperator = Integer.parseInt(str.substring(0,pos));
                    int rightOperator = parse(str.substring(pos+1));
                    switch (str.charAt(pos)) {
                        case '+':
                            return leftOperator + rightOperator;
                        case '-':
                            return leftOperator - rightOperator;
                        case '/':
                            return leftOperator / rightOperator;
                        case '*':
                            return leftOperator * rightOperator;
                    }
                }
            }
        }
        return Integer.parseInt(str);
    }

    public int parseOpposite(String str){
        int sum=0;
        if(str.startsWith("(")&&str.endsWith(")")){
            return parseOpposite(str.substring(1,str.length()-1));
        }else {
            int pos = str.length()-1;

            while (pos >=0) {
                if (str.charAt(pos) >= '0' && str.charAt(pos) <= '9') {
                    pos--;
                } else {
                    int leftOperator =parseOpposite(str.substring(0,pos));
                    int rightOperator =  Integer.parseInt(str.substring(pos+1));
                    switch (str.charAt(pos)) {
                        case '+':
                            return leftOperator + rightOperator;
                        case '-':
                            return leftOperator - rightOperator;
                        case '/':
                            return leftOperator / rightOperator;
                        case '*':
                            return leftOperator * rightOperator;
                    }
                }
            }
        }
        return Integer.parseInt(str);
    }


}
