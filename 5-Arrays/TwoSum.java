import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;

class TwoSum {
	static public int[] twoSum(int[] nums, int target) {
        Map <Integer, Integer> map = new HashMap<Integer, Integer>();
        int[] res = new int[2];
        
        for(int ind=0;ind<nums.length; ind++) {
            if(map.containsKey(nums[ind])) {
                res[0] = map.get(nums[ind]);
                res[1] = ind;
                return res;
            }
            int temp = target - nums[ind];
            map.put(temp, ind);   
        }
        return res;
    }
    public static void main(String[] args) {
    	System.out.println(Arrays.toString(twoSum(new int[] {2,7,11,15}, 9)));
    	System.out.println(Arrays.toString(twoSum(new int[] {3,2,4}, 6)));
    	System.out.println(Arrays.toString(twoSum(new int[] {3, 3}, 6)));
    }
}