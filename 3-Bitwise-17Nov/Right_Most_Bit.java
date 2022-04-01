class Right_Most_Bit {
	public static int rightMostBit(int n) {
		int count = 0;
		while(n >0) {
			if( (n & 1) == 1) return count;
			n >>= 1;
			count++;
		}
		return count;
	}
	public static void main(String[] args) {
		System.out.println(rightMostBit(4));
		System.out.println(rightMostBit(8));
		System.out.println(rightMostBit(27));
		System.out.println(rightMostBit(100));
	}
}