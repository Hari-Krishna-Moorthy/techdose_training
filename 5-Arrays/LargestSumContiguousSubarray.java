class LargestSumContiguousSubarray {
	public static int largestSubArraySum(int[] nums) {
		int num1 = nums[0], num2 = nums[0];

		for(int ind=1;ind<nums.length;ind++) {
			num1 = nums[ind]>(num1+nums[ind]) ? nums[ind] : num1+nums[ind];
			num2 = num1>num2 ? num1 : num2;
		}
		return num2;
	}
	public static void main(String[] args) {
		System.out.println(largestSubArraySum(new int[] {-9, 10, -2, 2, -4, 9, 0}));		
	}
}