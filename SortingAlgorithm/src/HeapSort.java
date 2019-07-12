/**
 * Author: HAO LI
 *
 * Summer, 2019
 *
 * The Heap Sort
 * The heap sort is very similar to a complete binary tree and satisfies the nature of stack.
 * The key or index of the child node is always smaller(or greater) than their parent
 *
 */

public class HeapSort {


    /**
     * The main sort algorithm
     * @param array original array
     */
    public void sort(int[] array)
    {
        int n = array.length;
        for (int i = n / 2 - 1; i >= 0; i--)
            heapify(array, n, i);

        // One by one extract an element from heap
        for (int i=n-1; i>=0; i--)
        {
            // Move current root to end
            int temp = array[0];
            array[0] = array[i];
            array[i] = temp;

            // call max heapify on the reduced heap
            heapify(array, i, 0);
        }
    }


    /**
     * To heapify a subtree rooted with node i which is
     * an index in array[]. n is size of heap
     * @param array original
     * @param n size of heap
     * @param i node index
     */
    void heapify(int[] array, int n, int i)
    {
        int largest = i; // Initialize largest as root
        int l = 2*i + 1; // left = 2*i + 1
        int r = 2*i + 2; // right = 2*i + 2

        // If left child is larger than root
        if (l < n && array[l] > array[largest])
            largest = l;

        // If right child is larger than largest so far
        if (r < n && array[r] > array[largest])
            largest = r;

        // If largest is not root
        if (largest != i)
        {
            int swap = array[i];
            array[i] = array[largest];
            array[largest] = swap;

            // Recursively heapify the affected sub-tree
            heapify(array, n, largest);
        }
    }
}
