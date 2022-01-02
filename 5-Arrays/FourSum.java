import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

class FourSum {
	static public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();

        for(int i=0;i<nums.length-3;i++) {
            if(i>0 && nums[i]==nums[i-1]) continue;
            
            int a = nums[i];

            for(int j=i+1;j<nums.length-2;j++) {
                if(j>i+1 && nums[j] == nums[j-1]) continue;

                int b = nums[j];

                int start = j+1, end = nums.length-1;
                while(start < end) {
                    int sum = a+b+nums[start]+nums[end];
                    if(sum == target) {
                        res.add(Arrays.asList(a, b, nums[start], nums[end]));

                        while(start<end && nums[start]==nums[start+1])  start++;
                        while(start<end && nums[end]==nums[end-1])  end--;

                        start++;
                        end--;
                    } else if(sum < target) start++;
                    else end--;
                }
            }
        }
        return res;

    }
    
    public static void main(String[] args) {
        System.out.println(
            fourSum(new int[] {1,0,-1,0,-2,2}, 0));
    }    
}
