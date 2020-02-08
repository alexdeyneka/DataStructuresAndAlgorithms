/**
 * Bubble sort, Insertion sort, Selection sort, Quick sort, Heap sort, Merge sort
 * Mentorship program's topic: Data Structures and Algorithms in Java
 *
 * @author Oleksandr Deineka
 * @version 1.0
 * @since 2020-02-08
 */
public class SortTypes {

    public int[] doBubbleSort(int[] array) {
        System.out.println("Bubble sort:");
        int n = array.length;
        int temp = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (array[j - 1] > array[j]) {
                    temp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }

    public int[] doInsertionSort(int[] array) {
        System.out.println("Insertion sort:");
        int n = array.length;
        for (int i = 1; i < n; ++i) {
            int key = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = key;
        }
        return array;
    }

    public int[] doSelectionSort(int[] array) {
        System.out.println("Selection sort:");
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            int min_idx = i;
            for (int j = i + 1; j < n; j++)
                if (array[j] < array[min_idx])
                    min_idx = j;
            int temp = array[min_idx];
            array[min_idx] = array[i];
            array[i] = temp;
        }
        return array;
    }

    public int[] doQuickSort(int[] array, int start, int end) {
        System.out.println("Quick sort:");

        return array;
    }

    public int[] doHeapSort(int[] array) {
        System.out.println("Heap sort:");

        return array;
    }

    public int[] doMergeSort(int[] array) {
        System.out.println("Merge sort:");

        return array;
    }
}
