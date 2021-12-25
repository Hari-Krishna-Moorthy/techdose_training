import java.util.Arrays;

class BubbleSort {
	public static void bubbleSort(int[] arr) {
		for(int x=0;x<arr.length-1;x++) {
			for(int y=x+1;y<arr.length;y++) {
				if(arr[x] > arr[y]) {
					arr[x] ^= arr[y];
					arr[y] ^= arr[x];
					arr[x] ^= arr[y];					
				}
			}

		}
	}
	public static void main(String[] args) {
		int[] arr = {12, 2, 9, 42};
		bubbleSort(arr);
		System.out.println(Arrays.toString(arr));
	}
}