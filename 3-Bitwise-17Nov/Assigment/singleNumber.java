// URL : https://leetcode.com/problems/single-number/


class singleNumber {
	static public int singleNumber(int[] nums) {
        int res = 0;
        for(int num : nums) {
        	res ^= num;
        }
        return res;
    }

	public static void main(String[] args) {
		System.out.println(singleNumber(new int[] {2, 2, 1}));	
		System.out.println(singleNumber(new int[] {4,1,2,1,2}));	
		System.out.println(singleNumber(new int[] {1}));	

	}
}