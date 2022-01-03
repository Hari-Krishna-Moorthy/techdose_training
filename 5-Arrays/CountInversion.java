import java.util.Arrays;

class CountInversion {

	// Brute Fource 
/*
	public static int countInversion(int[] arr) {
		int count =0;
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i] > arr[j]) count++;
			}
		}
		return count;
	}
*/

	// Merge Sort


	static private int merge(int[] arr, int l, int m, int r) {
		int left = m - l + 1, right = r - m;
		int count = 0;
		int[] leftArray = new int[left], rightArray = new int[right];
		int x = 0, y = 0, z = l;

		for(int i=0;i<left;i++) leftArray[i] = arr[l+i];
		for(int i=0;i<right;i++) rightArray[i] = arr[m+i+1];
		while(x < left && y < right) {
			if(leftArray[x] < rightArray[y]) {
				arr[z++] =  leftArray[x++];
			} else {
				arr[z++] = rightArray[y++];
				count += (m - x);
			}
		}
		while(x < left) {
			arr[z++] = leftArray[x++];
		}while(y < right) {
			arr[z++] = rightArray[y++];
		}
		return count;
	}
	public static int countInversion(int[] arr, int l, int r) {
		if(l>=r) return 0;
		
		int mid = l + (r-l)/2;
		int c = countInversion(arr, l, mid);
		c += countInversion(arr, mid+1, r);
		c += merge(arr, l, mid, r);
		return c;
	}

	public static void main(String[] args) {
		// System.out.println(countInversion(new int[] {1, 20, 6, 7, 5, 8, 11, 3}));	
		System.out.println(countInversion(new int[] {1, 20, 6, 7, 5, 8, 11, 3}, 0, 7));	
	}
}