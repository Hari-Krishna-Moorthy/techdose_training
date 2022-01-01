import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;

class FourSum {
	static public List<List<Integer>> fourSum(int[] nums, int target) {
        HashMap <Integer, ArrayList> map = new HashMap<Integer, ArrayList> ();
        int sum;
        for(int i=0;i<nums.length;i++) {
        	for(int j=i+1;j<nums.length-1;j++) {
        		sum = nums[i] + nums[j];
        		List <Integer> l = new ArrayList<Integer>();
        		l.add(i);
        		l.add(j);
        		if(!map.containsKey(sum)) {
        			map.put(sum, new ArrayList<List>());
        		}
        		map.get(sum).add(l);
        	}
        }
        List<List<Integer>> res = new ArrayList<List<Integer>>();

        for(int temp : map.keySet()) {
        	int targetSum = target - temp;

        	if(map.containsKey(targetSum)) {
        		
        	}
        }


        for(int temp : map.keySet()) {
        	System.out.println(temp + " : " + map.get(temp));
        }

        return res;
    }
    
    public static void main(String[] args) {
        fourSum(new int[] {1,0,-1,0,-2,2}, 0);
    }    
}