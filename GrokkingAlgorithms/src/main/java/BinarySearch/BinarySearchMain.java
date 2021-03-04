package BinarySearch;

public class BinarySearchMain {
	public static void main(String[] args) {
		int item = 22;
		int[] list = {2, 12, 16, 20, 22, 29, 45, 49, 77};
		BinarySearch binarySearch = new BinarySearch(list, item);
		int index = binarySearch.getIndex();
		if (index == -1) {
			System.out.println("Element not found");
		} else {
			System.out.println("Element found at index " + index);
		}
	}
}
