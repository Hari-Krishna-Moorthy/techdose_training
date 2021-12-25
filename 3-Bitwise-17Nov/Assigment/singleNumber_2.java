// URL : https://leetcode.com/problems/single-number/


class singleNumber_2 {
	static public int singleNumber(int[] nums) {
        int res = 0;
        for(int num : nums) {
        	res ^= num;
        }
        return res;
    }

	public static void main(String[] args) {
		System.out.println(singleNumber(new int[] {2,2,3,2}));	
		System.out.println(singleNumber(new int[] {0,1,0,1,0,1,99}));	
		System.out.println(singleNumber(new int[] {1}));	

	}
}