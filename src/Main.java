public class Main {

    public static void main(String[] args) {
        ParseToInteger parseToInteger = new ParseToInteger();
        System.out.println( parseToInteger.parse("((5*9/3)+1)"));
        System.out.println( parseToInteger.parse("123"));
        System.out.println( parseToInteger.parse("2*3"));
        System.out.println( parseToInteger.parse("(1+3)*2"));
        System.out.println( parseToInteger.parse("1+(5-2*(13/6))"));
    }
}
