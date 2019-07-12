/**
 * Author: HAO LI
 *
 * Summer, 2019
 *
 * The Quick Sort
 * Chose a pivot firth, then dividing a sequence to two separate part, one sub-sequence's values all larger/smaller
 * than the other sub-sequence. The two parts of the records can be further sorted separately
 * to achieve the order of the whole sequence.
 *
 */

public class QuickSort {

    /**
     * Partition Algorithm
     * @param array original array
     * @param low lower value sub-array
     * @param high higher value sub-array
     * @return new pivot
     */
    int partition(int[] array, int low, int high){
        int pivot = array[high];
        int i = (low - 1);
        for (int j = low; j < high; j++){
            if (array[j] <= pivot){
                i++;
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        int temp = array[i+1];
        array[i+1] = array[high];
        array[high] = temp;
        return i+1;
    }

    /**
     * Chose the pivot and sort the array
     * @param array original array
     * @param low lower sub-array
     * @param high higher sub-array
     */
    void quickSort(int[] array, int low, int high){
        if (low < high){
            int par_index = partition(array,low,high);
            quickSort(array,low,par_index-1);
            quickSort(array,par_index+1,high);
        }
    }

}
