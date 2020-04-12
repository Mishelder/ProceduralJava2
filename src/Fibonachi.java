public class Fibonachi {

    public static int feb(int num){
        return num<2 ? 1 : feb(num-2)+feb(num-1);
    }
}
