/**
 * Author: HAO LI
 *
 * Summer, 2019
 *
 * The Bubble Sort
 * The algorithm will repeatedly visit the sequence of the elements at a time, to compare and sort them,
 * it will switch them if they are in the wrong order. The work of visiting will repeated until there is no need
 * to exchange any element again, which means that teh sequence has been sorted.
 *
 */

public class BubbleSort {

    int[] bubbleSort(int[] array){
        for (int i =0; i< array.length-1; i++){
            for (int j = 0; j< array.length-1; j++){
                // compare the sibling
                if (array[j] > array[j+1]){
                    //if next one smaller, then switch them
                    int temp_value = array[j+1];
                    array[j+1] = array[j];
                    array[j] = temp_value;
                }
            }
        }
        return array;
    }
}
