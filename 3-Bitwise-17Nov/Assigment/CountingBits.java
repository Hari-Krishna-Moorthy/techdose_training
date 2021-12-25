// URL : https://leetcode.com/problems/counting-bits/

import java.util.Arrays;

class CountingBits {
	static public int[] countBits(int n) {
        int[] res = new int[n+1];
        res[0] = 0;
        for(int i=1;i<n+1;i+=2) {
            res[i] = res[i>>1] + 1;
            if(i < n) res[i+1] = res[(i+1) >> 1];
        }
        return res;        
    }

	public static void main(String[] args) {
		System.out.println(Arrays.toString(countBits(5)));
		System.out.println(Arrays.toString(countBits(2)));
	}
}