import java.util.Arrays;

public class AllPermutation {


    public static void permute(int[] arr,int size){
        if(size<2){
            System.out.println(Arrays.toString(arr));

        }else{
            for(int k = 0; k < size; k++) {
                if(size!=arr.length&&k==size-1){
                    swap(arr, k, size);
                }else{
                    swap(arr, k, size - 1);
                }
                permute(arr, size - 1);
            }
        }

    }

    public static void swap(int[] arr, int index0, int index1){
        int tmp = arr[index0];
        arr[index0] = arr[index1];
        arr[index1] = tmp;
    }
}
