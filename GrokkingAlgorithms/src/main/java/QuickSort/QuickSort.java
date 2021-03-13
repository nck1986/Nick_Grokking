package QuickSort;

public class QuickSort {

	private int[] sortedArray;

	public int[] getSortedArray() {
		return sortedArray;
	}

	public QuickSort(int[] arr) {
		int length = arr.length;
		sortedArray = new int[length];
		sortedArray = arr;
		qs(sortedArray, 0, length - 1);
	}

	private void qs(int[] arr, int left, int right) {
		if (left < right) {
			int index = partition(arr, left, right);
			qs(arr, left, index - 1);
			qs(arr, index + 1, right);
		}
	}

	private int partition(int[] arr, int left, int right) {
		int pivot = arr[right];
		int i = left - 1;
		for (int j = left; j < right; j++) {
			if (arr[j] <= pivot) {
				i++;
				int tmp = arr[i];
				arr[i] = arr[j];
				arr[j] = tmp;
			}
		}
		int tmp = arr[i + 1];
		arr[i + 1] = arr[right];
		arr[right] = tmp;
		return i + 1;
	}

}
