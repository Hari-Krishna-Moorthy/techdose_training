// URL : https://leetcode.com/problems/sort-colors/ 

import java.util.HashMap;
import java.util.Arrays;

class SortColors {
	static public void sortColors(int[] nums) {
        HashMap <Integer, Integer> map = new HashMap<Integer, Integer>();
        map.put(0, 0);
        map.put(1, 0);
        map.put(2, 0);
        
        for(int num : nums) {
            map.put(num, map.get(num)+1);
        }
        int ind=0;
        for(int i=0;i<3;i++) {
            int Count = map.get(i);
            for(int j=0;j<Count;j++) {
                nums[ind++] = i;
            }
        }       
    }
	public static void main(String[] args) {
		int[] nums1 = {2,0,2,1,1,0};
		sortColors(nums1);
		System.out.println(Arrays.toString(nums1));
		int[] nums2 = {2,1,0};
		sortColors(nums2);
		System.out.println(Arrays.toString(nums2));
	}
}