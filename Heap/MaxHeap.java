import java.util.Arrays;

class MaxHeap {

	public static void max_heapify(int[] arr, int i) {
		int left = 2*i + 1;
		int right = 2*i + 2;

		// System.out.println("parent : " + i + " left : " + left + " Right : " + right  );

		int largest = i;

		if(left < arr.length && arr[left] > arr[largest])
			largest = left;
		else if(right < arr.length && arr[right] > arr[largest])
			largest = right;

		if(largest != i) {
			int temp = arr[largest];
			arr[largest] = arr[i];
			arr[i] = temp;
			max_heapify(arr, largest);
		}
	}

	public static void main(String[] args) {
		
		int[] arr = {1, 14, 10, 8, 7, 9, 3, 2, 4, 6};
		for(int i=0;i<arr.length;i++) {
			max_heapify(arr, i);
		}
		
		System.out.println(Arrays.toString(arr));

	}

}