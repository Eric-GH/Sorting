

public class Main {

    /**
     * Create a array with random numbers with random order
     * @param array array to be added
     * @return
     */
    int[] RandomArray(int[] array){

        int random_min = 0; // minimum random number of test
        int random_max = 50; // maximum random number of test

        /**
         * Generate random numbers and save to the test array
         */
        for (int r = 0; r < 10; r++){
            array[r] = random_min+(int)(Math.random() * (random_max - random_min + 1));
        }
        return array;
    }

    /**
     * copy the original array to test array
     * @param o_array original array
     * @param c_array test(copied) array
     */
    void CopyArray(int[] o_array, int[] c_array){
        for (int i = 0; i< o_array.length; i++){
            int temp = o_array[i];
            c_array[i] = temp;
        }
    }

    /**
     * Create vertical line on left side
     */
    void blankLine(){
        System.out.println();
        System.out.print("| ");
        System.out.println();
    }

    /**
     * Main function for test all algorithm
     * @param args null
     */
    public static void main(String[] args){
        Main main = new Main();
        int index = 1; // the index number of test
        int Max_Test = 10; // total test times
        int[] arrayTest = new int[10]; // test array

        /*
            Initial all sort algorithms
         */
        BubbleSort bubble = new BubbleSort();
        SelectSort select = new SelectSort();
        InsertionSort insertion = new InsertionSort();
        ShellSort shell = new ShellSort();
        MergeSort mergeSort = new MergeSort();
        QuickSort quick = new QuickSort();
        HeapSort heap = new HeapSort();
        CountingSort counting = new CountingSort();
        BucketSort bucket = new BucketSort();
        RadixSort radix = new RadixSort();

        /*
            Test start
         */
        while (Max_Test!=0){
            int[] test = new int[arrayTest.length];
            System.out.println(" ----------------------------------------");
            System.out.println("| Test "+index+":");// Print the index
            main.RandomArray(arrayTest); // Generate random number
            System.out.println("| Original Array: "); // Print original array
            System.out.print("| ");
            for (int original:arrayTest) {
                System.out.print(original+" ");
            }


            main.blankLine();
            main.CopyArray(arrayTest,test);
            bubble.bubbleSort(test); // sort by bubble sort
            System.out.println("| Bubble Sort Result: "); // Print bubble sort result
            System.out.print("| ");
            for (int result:test) {
                System.out.print(result+" ");
            }

            main.blankLine();
            main.CopyArray(arrayTest,test); // Copy the original array
            select.selectSort(test); // sort by select sort
            System.out.println("| Select Sort Result: "); // Print select sort result
            System.out.print("| ");
            for (int result:test) {
                System.out.print(result+" ");
            }

            main.blankLine();
            main.CopyArray(arrayTest,test); // Copy the original array
            insertion.insertionSort(test); // sort by insertion sort
            System.out.println("| Insertion Sort Result: "); // Print select sort result
            System.out.print("| ");
            for (int result:test) {
                System.out.print(result+" ");
            }


            main.blankLine();
            main.CopyArray(arrayTest,test); // Copy the original array
            shell.shellSort(test); // sort by Shell sort
            System.out.println("| Shell Sort Result: "); // Print select sort result
            System.out.print("| ");
            for (int result:test) {
                System.out.print(result+" ");
            }

            main.blankLine();
            main.CopyArray(arrayTest,test); // Copy the original array
            mergeSort.mergeSort(test,0,test.length-1); // sort by Merge sort
            System.out.println("| Merge Sort Result: "); // Print merge sort result
            System.out.print("| ");
            for (int result:test) {
                System.out.print(result+" ");
            }

            main.blankLine();
            main.CopyArray(arrayTest,test); // Copy the original array
            quick.quickSort(test,0,test.length-1); // sort by Quick sort
            System.out.println("| Quick Sort Result: "); // Print quick sort result
            System.out.print("| ");
            for (int result:test) {
                System.out.print(result+" ");
            }

            main.blankLine();
            main.CopyArray(arrayTest,test); // Copy the original array
            heap.sort(test); // sort by heap sort
            System.out.println("| Heap Sort Result: "); // Print heap sort result
            System.out.print("| ");
            for (int result:test) {
                System.out.print(result+" ");
            }

            main.blankLine();
            main.CopyArray(arrayTest,test); // Copy the original array
            counting.sort(test);
            System.out.println("| Counting Sort Result: "); // Print Counting sort result
            System.out.print("| ");
            for (int result:test) {
                System.out.print(result+" ");
            }

            main.blankLine();
            main.CopyArray(arrayTest,test); // Copy the original array
            bucket.bucketSort(test); // sort by bucket sort
            System.out.println("| Bucket Sort Result: "); // Print bucket sort result
            System.out.print("| ");
            for (int result:test) {
                System.out.print(result+" ");
            }

            main.blankLine();
            main.CopyArray(arrayTest,test); // Copy the original array
            radix.radixsort(test,test.length); // sort by Radix sort
            System.out.println("| Radix Sort Result: "); // Print Radix sort result
            System.out.print("| ");
            for (int result:test) {
                System.out.print(result+" ");
            }


            System.out.println();
            System.out.println(" ----------------------------------------");
            System.out.println("\n\n"); // Start next test or stop the test


            //cycling
            index++;
            Max_Test--;
        }
        // End of the test
    }

}
