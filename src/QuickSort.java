public class QuickSort {

    public static void quickSort(int[] array, int low, int high) {
        if (array.length == 0)
            return;

        if (low >= high)
            return;

        int middle = low + (high - low) / 2;
        int supportingElement = array[middle];

        int minIndex = low, maxIndex = high;
        while (minIndex <= maxIndex) {
            while (array[minIndex] < supportingElement) {
                minIndex++;
            }

            while (array[maxIndex] > supportingElement) {
                maxIndex--;
            }

            if (minIndex <= maxIndex) {
                int temp = array[minIndex];
                array[minIndex] = array[maxIndex];
                array[maxIndex] = temp;
                minIndex++;
                maxIndex--;
            }
        }

        if (low < maxIndex)
            quickSort(array, low, maxIndex);

        if (high > minIndex)
            quickSort(array, minIndex, high);

    }


}
