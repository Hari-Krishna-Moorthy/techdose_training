
class SearchinRotatedSortedArray {
	static private int searchUtil(int[] nums, int left, int right, int target) {
		if (left>right) return -1;
		int mid = left + (right - left)/2;
		if(nums[mid] == target) return mid;
		else if(nums[mid] > target) return searchUtil(nums, left, mid-1, target);
		return searchUtil(nums, mid+1, right, target);
	}
	static public int search(int[] nums, int target) {
		int i = 0;
		if(nums.length == 0) return -1;
		if(nums.length==1 && nums[0]==target) return 0;  
		if(nums.length==1 && nums[0]!=target) return -1;  

		while(nums.length-1 > i && nums[i]<nums[i+1] ) i++;
		int res1 = searchUtil(nums, 0, i, target);
		int res2 = searchUtil(nums, i+1, nums.length-1, target);
		if(res1!=-1) return res1;
		else if(res2!=-1) return res2;
		return -1;
    }
    public static void main(String[] args) {
    	System.out.println(search(new int[] {4,5,6,7,0,1,2}, 0));	
    	System.out.println(search(new int[] {4,5,6,7,0,1,2}, 3));	
    	System.out.println(search(new int[] {1}, 0));	
    	System.out.println(search(new int[] {1, 3}, 0));	
    	System.out.println(search(new int[] {3, 1}, 1));	
    }
}