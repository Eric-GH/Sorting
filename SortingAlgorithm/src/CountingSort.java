import java.util.Arrays;

/**
 * Author: HAO LI
 *
 * Summer, 2019
 *
 * The Counting Sort
 * Converting input data values into keys for storage in an extra space
 *
 */

public class CountingSort {
    static void countSort(int[] array)
    {
        int max = Arrays.stream(array).max().getAsInt();
        int min = Arrays.stream(array).min().getAsInt();
        int range = max - min + 1;
        int[] count = new int[range];
        int[] output = new int[array.length];
        for (int i = 0; i < array.length; i++)
        {
            count[array[i] - min]++;
        }

        for (int i = 1; i < count.length; i++)
        {
            count[i] += count[i - 1];
        }

        for (int i = array.length - 1; i >= 0; i--)
        {
            output[count[array[i] - min] - 1] = array[i];
            count[array[i] - min]--;
        }

        System.arraycopy(output, 0, array, 0, array.length);
    }
}
