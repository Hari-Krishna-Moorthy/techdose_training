class CountingInversion {

	public static int mergeUtill(int[] arr, int left, int right, int mid) {

		int l = mid - left + 1, r = right - mid;
		int[] leftArray = new int[l], rightArray = new int[r];
		int x = 0, y = 0, z = 0, swap = 0;

		while(x<l) leftArray[x++] = arr[z++];
		while(y<r) rightArray[y++] = arr[z++];
		x = y = z = 0;

		while(x<l && y<r) {
			if(leftArray[x] <= rightArray[y]) arr[z++] = leftArray[x++];
			else {
				arr[z++] = rightArray[y++];
				swap += (mid+1) - (left+x);
			}
		}

		while(x<l) arr[z++] = leftArray[x++];
		while(y<r) arr[z++] = rightArray[y++];
		return swap;
	}

 	public static int countingInversion(int[] arr, int l, int r) {
 		if(l >= r) return 0;
 		int count =0, mid = l + (r-l)/2;

 		count += countingInversion(arr, l, mid);
 		count += countingInversion(arr, l, mid);
 		count += mergeUtill(arr, l, r, mid);

 		return count;
 	}

	public static void main(String[] args) {
		System.out.println(countingInversion(new int[] {1, 20, 6, 4, 5}, 0, 4));	
	}
}