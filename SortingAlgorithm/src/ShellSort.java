/**
 * Author: HAO LI
 *
 * Summer, 2019
 *
 * The Shell Sort
 * Very similar with Insertion Sort, the difference is that the Shell sort will compare the fastest element
 * So, the Shell sort also named Reduce incremental sort
 *
 */

public class ShellSort {
    int[] shellSort(int[] array){

        //start with help size of length, then reduce the gap
        for (int gap = (array.length/2);gap > 0; gap /= 2){
            for (int i = gap; i < array.length;i++){
                int j;
                int current = array[i];
                for (j = i; j >= gap && array[j - gap] > current; j -= gap){
                    array[j] = array[j - gap];
                }
                array[j] = current;
            }
        }
        return array;
    }
}
