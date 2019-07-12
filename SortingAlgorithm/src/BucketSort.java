import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/**
 * Author: HAO LI
 *
 * Summer, 2019
 *
 * The Bucket Sort
 * The bucket sort assuming that the input data is uniformly distributed
 * The data is divided into a limited number of buckets, and each bucket is
 * sorted separately(possibly using another sorting algorithm or recursively
 * continuing to use bucket sorting).
 *
 */

public class BucketSort {
    void bucketSort(int[] input){
        final int[] code = hash(input);
        List[] buckets = new List[code[1]];
        for (int i = 0; i < code[1]; i++){
            buckets[i] = new ArrayList();
        }

        for (int i : input){
            buckets[hash(i, code)].add(i);
        }

        for (List bucket : buckets){
            Collections.sort(bucket);
        }

        int ndx = 0;

        for (int b = 0; b < buckets.length; b++){
            for (Object v : buckets[b]){
                input[ndx++] = (int)v;
            }
        }
    }


    int[] hash(int[] input){
        int m = input[0];
        for (int i = 1; i < input.length; i++){
            if (m < input[i]){
                m = input[i];
            }
        }
        return new int[] {m, (int)Math.sqrt(input.length)};
    }

    int hash(int i, int[] code){
        return (int)((double) i / code[0] * (code[1] - 1));
    }
}
