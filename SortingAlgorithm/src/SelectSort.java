/**
 * Author: HAO LI
 *
 * Summer, 2019
 *
 * The Select Sort
 * Find the smallest(largest) element first from the list, store it at the beginning of the sorting sequence.
 * Then continue to find the smallest(largest) element from the remaining unsorted sequence, and drop it to the end
 * of sorted sequence, and so on, until all the unsorted element are selected(sorted).
 */
public class SelectSort {
    int[] selectSort(int[] array){

        // initial minimum value's index and create temp number
        int min_index, temp_value;

        // sort by compare each element with current smallest(largest) number
        for (int i = 0; i < array.length-1; i++){
            min_index = i;
            for (int j = i+1; j < array.length; j++){
                if (array[j] < array[min_index]){
                    min_index = j;
                }
            }
            temp_value = array[i];
            array[i] = array[min_index];
            array[min_index] = temp_value;
        }
        return array;
    }
}
