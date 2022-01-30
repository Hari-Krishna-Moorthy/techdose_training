import java.util.Arrays;

class HeapSort {

	private static void heapify(int[] arr, int i, int size) {
		int left = 2*i + 1;
		int right = 2*i + 2;
		int largest = i;

		if(left < size && arr[left] > arr[i]) 
			largest = left;
		if(right < size && arr[right] > arr[largest])
			largest = right;
		if(largest != i) {
			int temp = arr[i];
			arr[i] = arr[largest];
			arr[largest] = temp;
			heapify(arr, largest, size);
		}


	}

	public static void heap_sort(int[] arr) {
		for(int i=arr.length/2-1; i>=0; i--) 
			heapify(arr, i, arr.length);

		for(int i=arr.length-1;i>=0;i--) {
			int temp = arr[0];
			arr[0] = arr[i];
			arr[i] = temp;

			heapify(arr, 0, i);
		}
	}

	public static void main(String[] args) {
		int[] arr = {10, 122, 23, 89, 32, 44, 3, 4};
		heap_sort(arr);
		System.out.println(Arrays.toString(arr));
	}
}