import java.util.Arrays;

class CountSort {
	static int findMax(int[] arr) {
		int max = arr[0];
		for(int num : arr) {
			if(num > max) max = num;
		}
		return max;
	}
	static int findMin(int[] arr) {
		int min = arr[0];
		for(int num : arr) {
			if(num < min) min = num;
		}
		return min;
	}

	static void countSort(int[] arr) {
        int max = findMax(arr);
        int min = findMin(arr);
        int range = max - min + 1;
        int count[] = new int[range];
        int output[] = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            count[arr[i] - min]++;
        }
 
        for (int i = 1; i < count.length; i++) {
            count[i] += count[i - 1];
        }
 
        for (int i = arr.length - 1; i >= 0; i--) {
            output[count[arr[i] - min] - 1] = arr[i];
            count[arr[i] - min]--;
        }
 
        for (int i = 0; i < arr.length; i++) {
            arr[i] = output[i];
        }
    } 
    public static void main(String[] args) {
        int[] arr = {12, 2, 9, 42};
		countSort(arr);
		System.out.println(Arrays.toString(arr));
    }
}