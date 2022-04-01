// https://leetcode.com/problems/single-number/

class Solution {
    public int singleNumber(int[] nums) {
        int res = 0;
        for(int num : nums) {
            res ^= num;
        }
        return res;
    }
}

/*

#test : 01 
res = 0000
nums = [2, 2, 1]
nums => 0010 , 0010, 0001
res  => 0010 , 0000, 0001



#test : 02

res = 0000
nums = [4,1,2,1,2]
nums => 0100 , 0001, 0010, 0001, 0010
res  => 0100 , 0101, 0111, 0110, 0100


*/