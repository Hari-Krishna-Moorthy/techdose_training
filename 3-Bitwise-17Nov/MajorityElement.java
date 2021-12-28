// https://leetcode.com/problems/majority-element/

class MajorityElements {
	static public int majorityElement(int[] nums) {
        int result = 0;
        for(int i=0;i<32;i++) {
        	int count = 0, countZero = 0;
        	for(int j=0;j<nums.length;j++) {
        		if(nums[j]==0){
        			countZero++;
        		}
        		if((nums[j]&1)==1) {
        			count++;
        		}
        		nums[j] >>= 1;
        	}
        	if(countZero==nums.length) break;
        	if(count >= nums.length>>1) {
        		result += 1 << i;
        	}
        }
        return result;
    }
	public static void main(String[] args) {
		System.out.println(majorityElement(new int[] {3, 2, 3}));	
	}
}