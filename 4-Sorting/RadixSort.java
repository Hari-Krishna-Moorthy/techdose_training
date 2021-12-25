import java.util.Arrays;

class RadixSort {
	public static int max(int[] arr) {
		int max = 0;
		for(int num: arr) {
			if(max < num) max = num; 
		}
		return max;
	}
	private static void countSort(int[] arr, int exp) {
		int[] count = new int[10], output = new int[arr.length];

		for(int i=0;i<arr.length;i++)	count[(arr[i]/exp)%10]++;
		for(int i=1;i<10;i++) count[i] += count[i-1];
		for(int i=arr.length-1;i>=0;i--) {
			output[count[(arr[i]/exp)%10]-1] = arr[i];
			count[(arr[i]/exp)%10]--;
		}
		for(int i=0;i<arr.length;i++) arr[i] = output[i];
	}

	public static void radixSort(int[] arr) {
		int maxNum = max(arr);
		for(int exp = 1; exp<=maxNum; exp *= 10) {
			countSort(arr, exp);
		}
	}
	public static void main(String[] args) {
		int[] arr = {12, 2, 9, 42};
		radixSort(arr);
		System.out.println(Arrays.toString(arr));
	}
}