import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Arrays;

public class MergeSort {

    public static int[] sort(int[] array, int from, int len) {
        if (len == 0) {
            return new int[0];
        } else if (len == 1) {
            return new int[]{array[from]};
        } else if (len == 2) {
            if (array[from] < array[from + 1]) {
                return new int[]{array[from], array[from + 1]};
            } else {
                return new int[]{array[from + 1], array[from]};
            }
        } else {
            int[] left = sort(array, from, len / 2);
            int[] right = sort(array, from + (len / 2), len - (len / 2));

            return merge(left, right);
        }
    }

    private static int[] merge(int[] a, int[] b) {
        int[] result = new int[a.length+b.length];
        for(int i =0,j=0;i+j<a.length+b.length;){
            if(i == a.length){
                System.arraycopy(b,j,result,i+j,b.length-j);
                break;
            }else if(j==b.length){
                System.arraycopy(a,i,result,i+j,a.length-i);
                break;
            }

            if(b[j]>a[i]){
                result[i+j]=a[i];
                i++;
            }else if(a[i]>b[j]){
                result[i+j] =b[j];
                j++;
            } else {
                result[i+j] = a[i];
                i++;
            }
        }
        System.out.print(Arrays.toString(a) + " + " + Arrays.toString(b));
        System.out.println(" -> " + Arrays.toString(result));
        return result;
    }
}
