public class BinarySearch {

	private int low;
	private int high;
	private final int[] list;
	private final int item;
	private final int index;

	public BinarySearch(int[] list, int item) {
		this.list = list;
		this.item = item;
		low = 0;
		high = list.length - 1;

		index = runBinarySearch();
	}

	public BinarySearch(int[] list, int item, int low, int high) {
		this.list = list;
		this.item = item;
		this.low = low;
		this.high = high;

		index = runBinarySearch();
	}

	private int runBinarySearch() {
		if (high < low) {
			return -2;
		}
		while (low <= high) {
			int middle = (low + high) / 2;
			int guess = list[middle];
			if (guess == item) {
				return middle;
			}
			if (guess > item) {
				high = middle - 1;
			} else {
				low = middle + 1;
			}
		}
		//element was not found
		return -1;
	}

	public int getIndex() {
		return index;
	}
}
