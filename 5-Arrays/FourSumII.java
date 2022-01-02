import java.util.HashMap;

class FourSumII {
	static public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		int res = 0;

		for(int num1: nums1) {
			for(int num2 : nums2) {
				int sum = num1+num2;
				if(map.containsKey(sum)) map.put(sum, map.get(sum)+1);
				else map.put(sum, 1);
			}
		}

		for(int num3: nums3) {
			for(int num4: nums4) {
				if(map.containsKey(-(num3+num4)))
					res += map.get(-(num3+num4));
			}
		}
		return res;
    }

	public static void main(String[] args) {
		System.out.println(fourSumCount(new int[] {1, 2}, new int[] {-2, -1}, new int[] {-1, 2}, new int[] {0, 2}));
		System.out.println(fourSumCount(new int[] {0}, new int[] {0}, new int[] {0}, new int[] {0}));
	}
}