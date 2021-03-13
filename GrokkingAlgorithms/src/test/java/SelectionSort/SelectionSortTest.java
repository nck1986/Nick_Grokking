package SelectionSort;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SelectionSortTest {

	@Test
	@DisplayName("Unsorted Array with SelectionSort descending")
	void sortedDescending() {
		int[] values = {22, 11, 0, 100, 101, 100, 90, 99};
		int[] sortedValues = {101, 100, 100, 99, 90, 22, 11, 0};
		SelectionSort selectionSort = new SelectionSort(values);
		assertArrayEquals(sortedValues, selectionSort.sortedDescending());
	}

	@Test
	void sortedAscending() {
		int[] values = {22, 11, 0, 100, 101, 100, 90, 99};
		int[] sortedValues = {0, 11, 22, 90, 99, 100, 100, 101};
		SelectionSort selectionSort = new SelectionSort(values);
		assertArrayEquals(sortedValues, selectionSort.sortedAscending());
	}

	@Test
	@DisplayName("Array is empty test")
	void arrayIsEmptyTest() {
		org.junit.jupiter.api.Assertions.fail("Not implemented");
	}
}