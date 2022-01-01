import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

class ThreeSum {
	static public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        for (int i = 0; i < nums.length && nums[i] <= 0; ++i) {
            if (i == 0 || nums[i - 1] != nums[i]) {
                twoSumII(nums, i, res);   
            }
        }
        return res;
    }
    
    static private void twoSumII(int[] nums, int i, List<List<Integer>> res) {
        int left = i + 1, right = nums.length - 1;
        while (left < right) {
            int sum = nums[i] + nums[left] + nums[right];
            if (sum == 0) {
                res.add(Arrays.asList(nums[i], nums[left], nums[right]));
                left++;
                right--;
                while (left < right && nums[left] == nums[left - 1]) {
                    left ++;
                }
            } else if (sum > 0) {
                right --;
            } else {
                left ++;
            }
        } 
    }
	public static void main(String[] args) {
		System.out.println(threeSum(new int[] {-1,0,1,2,-1,-4}));
	}
}