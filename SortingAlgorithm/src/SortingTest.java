/**
 * Author: HAO LI
 *
 * Summer, 2019
 *
 * The Test will create 3 arrays, one is original array as template, the second one is sorted array,
 * as template to confirm the sorting algorithm is all corrected, the last array is test array, it will
 * copy the original array every time for each sorting algorithms.
 *
 * The result will show the name of tested sorting algorithm, the size of test array, the test time for each
 * sorting algorithm, the correction of each sorting algorithm, the average of runtime for each sorting algorithm.
 *
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SortingTest {

    /**
     * copy the original array to test array
     * @param o_array original array
     * @param c_array test(copied) array
     */
    static void CopyArray(int[] o_array, int[] c_array){
        System.arraycopy(o_array, 0, c_array, 0, o_array.length);
    }

    /**
     * Copy the original array to new array and sort by collections
     * @param o_array original array
     * @param c_array copied and sorted array
     */
    static void CopySort(int[] o_array, int[] c_array){
        ArrayList<Integer> temp_sort = new ArrayList<>();
        for (int value : o_array) {
            temp_sort.add(value);
        }
        Collections.sort(temp_sort);
        for (int i = 0; i<temp_sort.size(); i++) {
            c_array[i] = temp_sort.get(i);
        }
    }

    /**
     * A function to print out the result of the test
     * @param result array list which contained the result
     */
    static void ResultDisplay(ArrayList<TestValue> result){
        System.out.println();
        System.out.println("———————————————————————————————————————————————————————————————————————————————————————————————————————————————————————————");
        for (TestValue value : result) {
            System.out.print("|"+value.getName());
            System.out.print("| Size of Array: "+value.getCapacity());
            System.out.print(" | Test Time: "+value.getRunTime());
            System.out.print(" | Correction: "+value.isTestFlag());
            System.out.print(" | Average of Time take: "+((value.getTimeTake()/1000.00)/10)+"s");
            System.out.println();
            System.out.print("———————————————————————————————————————————————————————————————————————————————————————————————————————————————————————————");
            System.out.println();
        }
        System.out.println();
    }
    public static void main(String[] args){

        //Initial all of the sorting algorithms
        BubbleSort bubble = new BubbleSort();
        BucketSort bucket = new BucketSort();
        CountingSort counting = new CountingSort();
        HeapSort heap = new HeapSort();
        InsertionSort insertion = new InsertionSort();
        MergeSort merge = new MergeSort();
        QuickSort quick = new QuickSort();
        RadixSort radix = new RadixSort();
        SelectSort select = new SelectSort();
        ShellSort shell = new ShellSort();

        //Create a original array(size 10 * 4) with random number values(0 - 10000)
        int size = (int)Math.pow(10,4); // the size of original array
        int time = 10; // test times
        int[] original_array = new int[size]; // the original array
        int random_min = 0; // minimum random number of test
        int random_max = 10000; // maximum random number of test
        long start_time, end_time; // the start and end time for each algorithm
        ArrayList<TestValue> accounting = new ArrayList<>(); // Create a array-list to store the value of test
        /*
         * Generate random numbers and save to the test array
         */
        for (int r = 0; r < size; r++){
            original_array[r] = random_min+(int)(Math.random() * (random_max - random_min + 1));
        }

        //Create a sorted array copied from original array
        int[] sorted_array = new int[size];
        CopySort(original_array,sorted_array);

        //Create a array copied from original array
        int[] test_array = new int[size];

        // add the capacity of each sort array and the test times to the array-list
        for (int a = 0; a < 10; a++){
            accounting.add(new TestValue(null,100000,10,0,true));
        }

        // add each name to the array-list
        accounting.get(0).setName(" Bubble Sort   ");
        accounting.get(1).setName(" Bucket Sort   ");
        accounting.get(2).setName(" Counting Sort ");
        accounting.get(3).setName(" Heap Sort     ");
        accounting.get(4).setName(" Insertion Sort");
        accounting.get(5).setName(" Merge Sort    ");
        accounting.get(6).setName(" Quick Sort    ");
        accounting.get(7).setName(" Radix Sort    ");
        accounting.get(8).setName(" Select Sort   ");
        accounting.get(9).setName(" Shell Sort    ");

        //Start testing
        while (time>0){

            // Bubble sort
            CopyArray(original_array,test_array); // copy the original array
            start_time = System.currentTimeMillis(); // set start test time
            bubble.bubbleSort(test_array); // start test the bubble sort
            end_time = System.currentTimeMillis(); // set end test time
            if (!Arrays.equals(test_array, sorted_array)){
                accounting.get(0).setTestFlag(false);
            }
            accounting.get(0).setTimeTake(accounting.get(0).getTimeTake()+(end_time-start_time)); // add the time to the array

            // Bucket Sort
            CopyArray(original_array,test_array);
            start_time = System.currentTimeMillis();
            bucket.bucketSort(test_array);
            end_time = System.currentTimeMillis();
            if (!Arrays.equals(test_array, sorted_array)){
                accounting.get(1).setTestFlag(false);
            }
            accounting.get(1).setTimeTake(accounting.get(1).getTimeTake()+(end_time-start_time));


            // Counting Sort
            CopyArray(original_array,test_array);
            start_time = System.currentTimeMillis();
            counting.countSort(test_array);
            end_time = System.currentTimeMillis();
            if (!Arrays.equals(test_array, sorted_array)){
                accounting.get(2).setTestFlag(false);
            }
            accounting.get(2).setTimeTake(accounting.get(2).getTimeTake()+(end_time-start_time));


            // Heap Sort
            CopyArray(original_array,test_array);
            start_time = System.currentTimeMillis();
            heap.heapSort(test_array);
            end_time = System.currentTimeMillis();
            if (!Arrays.equals(test_array, sorted_array)){
                accounting.get(3).setTestFlag(false);
            }
            accounting.get(3).setTimeTake(accounting.get(3).getTimeTake()+(end_time-start_time));


            // Insertion Sort
            CopyArray(original_array,test_array);
            start_time = System.currentTimeMillis();
            insertion.insertionSort(test_array);
            end_time = System.currentTimeMillis();
            if (!Arrays.equals(test_array, sorted_array)){
                accounting.get(4).setTestFlag(false);
            }
            accounting.get(4).setTimeTake(accounting.get(4).getTimeTake()+(end_time-start_time));


            // Merge Sort
            CopyArray(original_array,test_array);
            start_time = System.currentTimeMillis();
            merge.mergeSort(test_array,0,test_array.length-1);
            end_time = System.currentTimeMillis();
            if (!Arrays.equals(test_array, sorted_array)){
                accounting.get(5).setTestFlag(false);
            }
            accounting.get(5).setTimeTake(accounting.get(5).getTimeTake()+(end_time-start_time));


            // Quick Sort
            CopyArray(original_array,test_array);
            start_time = System.currentTimeMillis();
            quick.quickSort(test_array,0,test_array.length-1);
            end_time = System.currentTimeMillis();
            if (!Arrays.equals(test_array, sorted_array)){
                accounting.get(6).setTestFlag(false);
            }
            accounting.get(6).setTimeTake(accounting.get(6).getTimeTake()+(end_time-start_time));


            // Radix Sort
            CopyArray(original_array,test_array);
            start_time = System.currentTimeMillis();
            radix.radixsort(test_array,test_array.length);
            end_time = System.currentTimeMillis();
            if (!Arrays.equals(test_array, sorted_array)){
                accounting.get(7).setTestFlag(false);
            }
            accounting.get(7).setTimeTake(accounting.get(7).getTimeTake()+(end_time-start_time));



            // Select Sort
            CopyArray(original_array,test_array);
            start_time = System.currentTimeMillis();
            select.selectSort(test_array);
            end_time = System.currentTimeMillis();
            if (!Arrays.equals(test_array, sorted_array)){
                accounting.get(8).setTestFlag(false);
            }
            accounting.get(8).setTimeTake(accounting.get(8).getTimeTake()+(end_time-start_time));


            // Shell Sort
            CopyArray(original_array,test_array);
            start_time = System.currentTimeMillis();
            shell.shellSort(test_array);
            end_time = System.currentTimeMillis();
            if (!Arrays.equals(test_array, sorted_array)){
                accounting.get(9).setTestFlag(false);
            }
            accounting.get(9).setTimeTake(accounting.get(9).getTimeTake()+(end_time-start_time));

            time--;
        }

        // Print out the result of the test
        ResultDisplay(accounting);
    }
}

class TestValue {
    String name;
    int capacity, runTime;
    long timeTake;
    boolean testFlag;
    TestValue(String name, int capacity, int runTime, long timeTake,boolean testFlag){
        this.capacity = capacity;
        this.name = name;
        this.runTime = runTime;
        this.timeTake = timeTake;
        this.testFlag = testFlag;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getRunTime() {
        return runTime;
    }

    public void setRunTime(int runTime) {
        this.runTime = runTime;
    }

    public long getTimeTake() {
        return timeTake;
    }

    public void setTimeTake(long timeTake) {
        this.timeTake = timeTake;
    }

    public boolean isTestFlag() {
        return testFlag;
    }

    public void setTestFlag(boolean testFlag) {
        this.testFlag = testFlag;
    }
}
