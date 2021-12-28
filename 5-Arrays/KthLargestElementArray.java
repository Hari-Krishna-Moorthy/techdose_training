import java.util.Arrays;
class KthLargestElementArray {
	
	static public void swap(int[] nums, int i, int j) {
		int temp = nums[i];
		nums[i] = nums[j];
		nums[j] = temp;
	}

	static public int partition(int[] nums, int low, int high) {
		int i = low-1, pivot = nums[high];

		for(int j=low;j<high;j++) {
			if(nums[j] < pivot) {
				i++;
				swap(nums, i, j);
			}
		}
		swap(nums, i+1,high);
		return i+1;
	}

	static public void quickSort(int[] nums, int low, int high) {
		if(low>=high) return;
		int pi = partition(nums, low, high);
		quickSort(nums, low, pi-1);
		quickSort(nums, pi+1, high);
     	   System.out.println(Arrays.toString(nums));

	}
	static public int findKthLargest(int[] nums, int k) {
     	   quickSort(nums, 0, nums.length-1);
     	   // System.out.println(Arrays.toString(nums));
     	   return nums[nums.length - k ];
    }	
    public static void main(String[] args) {
    	System.out.println(findKthLargest(new int[] {3,2,1,5,6,4}, 2));
    	System.out.println(findKthLargest(new int[] {3,2,3,1,2,4,5,5,6}, 4));
    }

}