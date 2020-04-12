public class QuickSort {

    public static void quickSort(int[] array, int low, int high) {
        if (array.length == 0)
            return;//завершить выполнение, если длина массива равна 0

        if (low >= high)
            return;//завершить выполнение если уже нечего делить

        // выбрать опорный элемент
        int middle = low + (high - low) / 2;
        int supportingElement = array[middle];

        // разделить на подмассивы, который больше и меньше опорного элемента
        int minIndex = low, maxIndex = high;
        while (minIndex <= maxIndex) {
            while (array[minIndex] < supportingElement) {
                minIndex++;
            }

            while (array[maxIndex] > supportingElement) {
                maxIndex--;
            }

            if (minIndex <= maxIndex) {//меняем местами
                int temp = array[minIndex];
                array[minIndex] = array[maxIndex];
                array[maxIndex] = temp;
                minIndex++;
                maxIndex--;
            }
        }

        // вызов рекурсии для сортировки левой и правой части
        if (low < maxIndex)
            quickSort(array, low, maxIndex);

        if (high > minIndex)
            quickSort(array, minIndex, high);

    }


}
