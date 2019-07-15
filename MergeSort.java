/**
 * Author: HAO LI
 *
 * Summer, 2019
 *
 * The Merge Sort
 * This algorithm is a typical algorithm of Divide and Conquer. This algorithm combine
 * ordered sub-sequences to obtain a completely ordered sequence; that is, divide one
 * sequences to two sub-sequences, then divide again until can not divide. Then order the
 * smallest sub-sequences, combine together, then, order again, and combine again until the
 * completely sequence.
 *
 */

public class MergeSort {

    /**
     * Merge two sequences to one
     * @param array original array
     * @param left left part of original sequence
     * @param right right part of original sequence
     * @param mid middle of the original sequence
     */
    void merge(int[] array, int left, int right, int mid){
        int list1 = mid - left + 1;
        int list2 = right - mid;
        int[] left_seq = new int[list1];
        int[] right_seq = new int[list2];

        for (int i = 0; i < list1; i++){
            left_seq[i] = array[left+i];
        }
        for (int j = 0; j < list2; j++){
            right_seq[j] = array[mid + 1 + j];
        }

        int i = 0, j = 0;

        int k = left;
        while (i < list1 && j < list2){
            if (left_seq[i] < right_seq[j]){
                array[k] = left_seq[i];
                i++;
            }
            else {
                array[k] = right_seq[j];
                j++;
            }
            k++;
        }
        while (i < list1){
            array[k] = left_seq[i];
            i++;
            k++;
        }
        while (j < list2){
            array[k] = right_seq[j];
            j++;
            k++;
        }
    }

    /**
     * merge sort construction
     * @param arary original array
     * @param left left part of array
     * @param right right part of array
     */
    void mergeSort(int[] arary, int left, int right){
        if (left < right){
            int mid = (left + right) / 2; // find the middle of the array
            mergeSort(arary, left, mid); // sort left part
            mergeSort(arary, mid+1, right); // sort right part
            merge(arary, left, right, mid); // merge them together
        }
    }


}
