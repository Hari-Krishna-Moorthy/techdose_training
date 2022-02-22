// URL : https://leetcode.com/problems/partition-equal-subset-sum/submissions/

public class PartitionEqualSubsetSum {
    static Boolean[][] memo = null;
    static public boolean subsetSum(int[] nums, int pos, int sum) {
        if (sum == 0)
            return true;
        else if(pos>=nums.length || sum<0)
            return false;
        if (memo[pos][sum] == null)
            memo[pos][sum] = (subsetSum(nums, pos + 1, sum - nums[pos]) || subsetSum(nums, pos + 1, sum));
        return memo[pos][sum];
    }

    static public boolean canPartition(int[] nums) {
        int sum = 0, max = nums[0];
        for (int num : nums) {
            sum += num;
            if (num > max)
                max = sum;
        }
        if ((sum & 1) == 1)
            return false;
        if(max>(sum>>1))
            return false;
        
        memo = new Boolean[nums.length+1][(sum>>1)+1];
        return subsetSum(nums, 0, sum >> 1);
    }
    public static void main(String[] args) {
        System.out.println(canPartition(new int[] { 1, 5, 11, 5 }));
    }
}
