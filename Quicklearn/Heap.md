# Heap Algorithum 


## 01. Heap Sort

```
	private static void swap(int[] arr, int i, int j) {
		arr[i] = arr[i] + arr[j];
		arr[j] = arr[i] - arr[j];
		arr[i] = arr[i] - arr[j];
	}
	public static void heapify(int[] arr, int n, int i) {
		int largest = i;
		int left = 2*i + 1, right = 2*i + 2;
		if(left < n && arr[left] > arr[largest])
			largest = left;
		if(right < n && arr[right] > arr[largest])
			largest = right;
		if(largest != i) {
			swap(arr, i, largest);
			heapify(arr, n, largest);
		}
	}


	public static void heapSort() {
		int[] arr = { 12, 11, 13, 5, 6, 7, 19 };
		System.out.println("Before Sorting : " + Arrays.toString(arr));

		for(int i=arr.length/2; i>=0;i--)
			heapify(arr, arr.length, i);

		 for (int i = arr.length - 1; i > 0; i--) {
		 	swap(arr, 0, i);
            heapify(arr, i, 0);
        }
		System.out.println("After Sorting : " + Arrays.toString(arr));
	}
```