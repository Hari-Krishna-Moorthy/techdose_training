// URL : https://leetcode.com/problems/hamming-distance/

class HammingDistance {
	static public int hammingDistance(int x, int y) {
        int count = 0;
        x = x ^ y;
        while(x > 0) {
            count += x & 1;
            x >>= 1;
        }
        return count;        
    }
	public static void main(String[] args) {
		System.out.println(hammingDistance(1, 4));	
		System.out.println(hammingDistance(3, 1));	
	}
}