import java.util.Arrays;

class InsertSort {
	public static void insertSort(int[] arr) {
		int n = arr.length;

		for(int i=0;i<n;i++) {
			int key = arr[i];
			int j = i-1;
			while(j >= 0 && arr[j] > key) {
				arr[j+1] = arr[j--];
			}
			arr[j+1] = key;
		}

	}
	public static void main(String[] args) {
	    int[] arr = {12, 2, 9, 42};
		insertSort(arr);
		System.out.println(Arrays.toString(arr));	
	}
}