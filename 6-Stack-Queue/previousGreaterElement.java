import java.util.Arrays;
import java.util.LinkedList;
import java.util.Stack;
import java.util.Map;
import java.util.HashMap;

class previousGreaterElement {
	static public int[] previousGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> stk = new Stack<Integer>();
        Map<Integer, Integer> values = new HashMap<Integer, Integer>();
        
        stk.add(0);
        values.put(nums2[0], -1);

        for(int i=1;i<nums2.length;i++) {
            // System.out.println(!queue.isEmpty()+ " " + queue.peek()+ " " +nums2[queue.peek()] + " " + nums2[i] + " " + (nums2[queue.peek()] < nums2[i]));
            while(!stk.empty() && nums2[stk.peek()] < nums2[i]) {
                stk.pop();
            }
            if(stk.empty()) values.put(nums2[i], -1);
            else values.put(nums2[i], nums2[stk.peek()]);
            stk.push(i);
        }
        for(int i=0;i<nums1.length;i++) {
            nums1[i] = values.get(nums1[i]);
        }
        return nums1;
    }

    public static void main(String[] args) {
    	System.out.println(Arrays.toString(previousGreaterElement(new int[] {4,1,2}, new int[] {1,3,4,2})));
    	System.out.println(Arrays.toString(previousGreaterElement(new int[] {2,4}, new int[] {10, 1, 2, 3, 4})));
    }
}

/*

{1, 3, 4, 2}
{-1, -1, -1, 4}

{4}


*/