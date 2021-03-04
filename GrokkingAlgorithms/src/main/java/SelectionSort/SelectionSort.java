package SelectionSort;

public class SelectionSort {

	private int[] sortedArray;

	public int[] sortedDescending() {
		sortDescending();
		return sortedArray;
	}

	public int[] sortedAscending() {
		sortAscending();
		return sortedArray;
	}

	public SelectionSort(int[] arr) {
		sortedArray = new int[arr.length];
		sortedArray = arr;
	}


	private void sortAscending() {
		for (int i = 0; i < sortedArray.length - 1; i++) {
			int minIndex = i;
			int min = sortedArray[i];
			for (int j = i + 1; j < sortedArray.length; j++) {
				if (sortedArray[j] < min) {
					minIndex = j;
					min = sortedArray[minIndex];
				}
			}

			if (minIndex != i) {
				sortedArray[minIndex] = sortedArray[i];
				sortedArray[i] = min;
			}
		}
	}

	private void sortDescending() {
		for (int i = 0; i < sortedArray.length - 1; i++) {
			int maxIndex = i;
			int max = sortedArray[i];
			for (int j = i + 1; j < sortedArray.length; j++) {
				if (sortedArray[j] > max) {
					maxIndex = j;
					max = sortedArray[maxIndex];
				}
			}

			if (maxIndex != i) {
				sortedArray[maxIndex] = sortedArray[i];
				sortedArray[i] = max;
			}
		}
	}
}
