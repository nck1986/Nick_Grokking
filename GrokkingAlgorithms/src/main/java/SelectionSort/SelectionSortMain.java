package SelectionSort;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SelectionSortMain {
	public static void main(String[] args) {
		int[] arr = {122, 10, 18, 46, 0, 7, 19, 228, 16, 47, 17, 10};
		System.out.println("Before selection sort");
		System.out.println(Arrays.toString(arr));
		System.out.println("After descending sort");
		System.out.println(Arrays.toString(new SelectionSort(arr).sortedDescending()));
		System.out.println("After ascending sort");
		System.out.println(Arrays.toString(new SelectionSort(arr).sortedAscending()));
	}
}
