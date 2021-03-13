package QuickSort;

import java.util.Arrays;

public class QuickSortMain {

	public static void main(String[] args) {
		int[] arr = {6, 3, 10, 8, 9, 0, 7, 1, 4, 2, 5};
		int[] arr1 = {6, 3, 10, 8,0, 6, 0, 9, 0, 7, 1, 4, 2, 5, 0};
		System.out.println("Original array:" + Arrays.toString(arr1));
		QuickSort qs = new QuickSort(arr1);
		System.out.println("Sorted Array: " + Arrays.toString(qs.getSortedArray()));
	}
}
