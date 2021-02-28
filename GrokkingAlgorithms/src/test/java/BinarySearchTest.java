import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class BinarySearchTest {
	@Test
	@DisplayName("Binary search test")
	void binarySearchTest() {
		int[] testList = {1, 2, 12, 17, 18, 22, 17, 29, 33, 48, 99};
		Assertions.assertEquals(0, new BinarySearch(testList, 1).getIndex());
		Assertions.assertEquals(-1, new BinarySearch(testList, 100).getIndex());
	}

	@Test
	@DisplayName("Check if the list is empty")
	void checkIfTheListIsEmpty() {
		
		org.junit.jupiter.api.Assertions.fail("Not implemented");
	}
}
