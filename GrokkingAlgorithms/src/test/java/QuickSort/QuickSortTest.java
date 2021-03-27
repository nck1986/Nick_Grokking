package QuickSort;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QuickSortTest {

	@Test
	@DisplayName("Integer Array sorted with QuickSort")
	void integerArraySortedWithQuickSort() {

		int[] given = {100, 90, 95, 96, 91, 99, 98, 93, 92, 94, 97};
		int[] expected = {90, 91, 92, 93, 94, 95, 96, 97, 98, 99, 100};
QuickSort testQS = new QuickSort(given);
		assertArrayEquals(expected, testQS.getSortedArray());

	}

}