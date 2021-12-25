import java.util.Arrays;

class SelectionSort {
	public static void selectionSort(int[] arr) {
		for(int x=0;x<arr.length-1;x++) {
			int index = x;
			boolean isSwapped = false;
			for(int y=x+1;y<arr.length;y++) {
				if(arr[y] < arr[index])	{
					index = y;
					isSwapped = true;
				}
			}
			if(isSwapped) {
				int temp = arr[index];
				arr[index] = arr[x];
				arr[x] = temp;
			}
		}
	}

	public static void main(String[] args) {
		int[] arr = {12, 2, 9, 42};
		selectionSort(arr);
		System.out.println(Arrays.toString(arr));
	}
}