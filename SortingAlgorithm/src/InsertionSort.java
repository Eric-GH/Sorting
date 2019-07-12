/**
 * Author: HAO LI
 *
 * Summer, 2019
 *
 * The Insertion Sort
 * constructing an ordered sequence with first element from unsorted sequence, then, pick next
 * element from unsorted sequence, scan backwards and forwards in the sorted sequence, find the
 * corresponding position and insert into the sorted sequence.
 *
 */

public class InsertionSort {

    int[] insertionSort(int[] array){

        int preIndex, current;// initial pre index and current index

        // pick one element and compare to each element from sorted sequences
        for (int i = 1; i < array.length; i++){
            preIndex = i - 1;
            current = array[i];
            while (preIndex >= 0 && array[preIndex] > current){
                array[preIndex + 1] = array[preIndex];
                preIndex--;
            }
            array[preIndex + 1] = current;
        }
        return array;
    }


}
