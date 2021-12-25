// URL : https://leetcode.com/problems/bitwise-and-of-numbers-range/

class BitwiseOfNumbersRange {
	static public int rangeBitwiseAnd(int left, int right) {
        byte count = 0;
        while(left != right) {
            left >>= 1;
            right >>= 1;
            count ++;
        }
        return left << count;
    }

	public static void main(String[] args) {
		System.out.println(rangeBitwiseAnd(5, 7));
		System.out.println(rangeBitwiseAnd(0, 0));
		System.out.println(rangeBitwiseAnd(1, 2147483647));
	}
}