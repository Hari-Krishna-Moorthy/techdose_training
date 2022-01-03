import java.util.Arrays;

class MergeSort {

	public static void merge(int[] arr, int low, int mid, int high) {
		int left = mid - low + 1, right = high - mid;
		int x = 0, y = 0, z = low;
		int[] leftArray = new int[left], rightArray = new int[right];
		
		for(int i=0;i<left;i++) leftArray[i] = arr[low+i];
		for(int i=0;i<right;i++) rightArray[i] = arr[mid+1+i];

		while(x<left && y<right) arr[z++] = leftArray[x] < rightArray[y] ? leftArray[x++] : rightArray[y++];
		while(x<left) arr[z++] = leftArray[x++] ;
		while(y<right) arr[z++] = rightArray[y++];
	}
	public static void mergeSort(int[] arr, int low, int high) {
		if(low >= high) return ;

		int mid = low + (high - low)/2;
		mergeSort(arr, low, mid);
		mergeSort(arr, mid+1, high);
		merge(arr, low, mid, high);
	}
	public static void main(String[] args) {
		int[] arr = {1, 20, 6, 7, 5, 8, 11, 3};
		mergeSort(arr, 0, arr.length-1);
		System.out.println(Arrays.toString(arr));
	}
}