# Sorting Algorithms
This is my practice for ten basic sorting algorithms
* Bubble Sort
* Bucket Sort
* Counting Sort
* Heap Sort
* Insertion Sort
* Merge Sort
* Quick Sort
* Radix Sort
* Select Sort
* Shell Sort

## The Type of Sorting Algorithms
* Comparison sorting
	* This type of sorting algorithms determined order of elements by comparison. Science the complexity of these algorithm cannot break O(nlogn), so it also called non-linear time comparison sorting  

* Non-comparative sorting
	* This type of sorting algorithms determined the order of elements does not by comparison. It can break through the lower bound of time based on comparison sorting and run in linear time, so it also called linear time non-comparative sorting.

## The complexity of Sorting Algorithms

| Name| Time Complexity(Average) | Space Complexity | Stability|
| :-------: | :-----------: |:-------:|:--------:|
| Bubble Sort   |  O(n^2^)	  | O(1)	  |Stable
| Bucket Sort   |  O(n+k) 	  |O(n+k)	  |Stable
| Counting Sort |  O(n+k) 	  |O(n+k)	  |Stable
| Heap Sort     | O(nlog~2~n) | O(1)	  |Unstable
| Insertion Sort| O(n^2^) 	  | O(1)	  |Stable
| Merge Sort    | O(nlog~2~n) | O(n)	  |Stable
| Quick Sort    | O(nlog~2~n) |O(nlog~2~n)|Unstable
| Radix Sort    | O(n*k)	  |O(n+k)	  |Stable
| Select Sort   | O(n^2^)	  |O(1)		  |Unstable
| Shell Sort    | O(n^1.3^)	  |O(1)		  |Unstable