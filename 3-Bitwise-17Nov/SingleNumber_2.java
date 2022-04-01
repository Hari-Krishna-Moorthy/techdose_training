import java.util.HashMap;
import java.util.Arrays;
class SingleNumber_2 {
	
	static int singleNumberHashmap(int[] arr) {
		int len  = arr.length;
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>(); 

		for(int num : arr) {
			if(map.containsKey(num)) map.put(num, map.get(num) + 1);
			else map.put(num, 1);
		} 
		for(int key : map.keySet()) {
			if(map.get(key) == 1) return key;
		}
		return -1;
	}
	static int singleNumberSort(int[] arr) {
		int len  = arr.length;
		Arrays.sort(arr);

		if(arr.length==1 || (arr[0] != arr[1])) return arr[0];
		if(arr[arr.length-1] != arr[arr.length-2]) return arr[arr.length-1];

		for(int ind=1;ind<arr.length-1;ind++) {
			if(arr[ind] != arr[ind-1] && arr[ind] != arr[ind+1]) return arr[ind];
		}
		return -1;
	}

	public static int singleNumberCountSetBits(int[] arr) {
		int ans = 0; 
		int mask = 1;
		for(int ind=0; ind<32;ind++) {
			int count = 0;

			for(int num : arr) {
				if((num & mask) > 0)count++;
			}
			ans += (count%3) << ind;
			count = 0;
			mask <<= 1;
		}
		return ans;
	}

	public static int singleNumberBitManipulation(int[] arr) {
		int once = 0, twos = 0; 

		for(int num : arr) {
			once = (once ^ num) & (~twos);
			twos = (twos ^ num) & (~once);
		}
		return once;
	}

	public static void main(String[] args) {
		int[] arr = {2, 2, 2, 3, 4, 4, 4};
		System.out.println(singleNumberHashmap(arr));
		System.out.println(singleNumberSort(arr));
		System.out.println(singleNumberCountSetBits(arr));
		System.out.println(singleNumberBitManipulation(arr));
	}
}