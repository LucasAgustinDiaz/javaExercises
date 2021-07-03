package sort;

import Interface.Sorter;

import java.util.Comparator;

public class QuickSort<T> implements Sorter {
    @Override
    public void sort(Object[] arr, Comparator c) {
        quickSort(arr,0,arr.length-1,c);
    }

    private static void swap(Object[] arr, int i, int j) {
        Object temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    /**
     *  This function takes last element as pivot, places the pivot element at its correct position in sorted
     *  array, and places all smaller (smaller than pivot) to left of pivot and all greater elements to right of pivot
     */
    private static int partition(Object[] arr, int low, int high, Comparator c) {

        Object pivot = arr[high];
        int i = (low - 1);

        for(int j = low; j <= high - 1; j++) {
            if (c.compare(arr[j], pivot) < 0) {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, high);
        return (i + 1);
    }

    /** The main function that implements QuickSort
     * arr[] --> Array to be sorted,
     * low --> Starting index,
     * high --> Ending index
     */
    private static void quickSort(Object[] arr, int low, int high,Comparator c) {
        if (low < high) {
            int pi = partition(arr, low, high, c);
            quickSort(arr, low, pi - 1, c);
            quickSort(arr, pi + 1, high, c);
        }
    }
}
