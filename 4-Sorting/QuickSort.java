import java.util.Arrays;

class QuickSort {
	static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	static int partition(int[] arr, int low, int high) {
		int pivot = arr[high];
		int i = low-1;
		for(int j=low;j<=high;j++) {
			if(arr[j] < pivot) {
				i++;
				swap(arr, i, j);
			}
		}
		swap(arr, i+1, high);
		return i+1;
	}	
	public static void quickSort(int[] arr, int low, int high) {
		if(low >= high) return ;
		int pi = partition(arr, low, high);
		quickSort(arr, low, pi);
		quickSort(arr, pi+1, high);
	}
	public static void main(String[] args) {
		int[] arr = {12, 2, 9, 42};
		quickSort(arr, 0, arr.length-1);
		System.out.println(Arrays.toString(arr));
	}
}