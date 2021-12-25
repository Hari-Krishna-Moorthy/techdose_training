class Concaternate_binary {

	public static long log2(int n) {
		return (long) (Math.log(n) / Math.log(2));
	}

	public static long ConcaternateBinary(int n) {
		long res = 0;
		int x = 1;

		while(x <= n) {
			res = ((res << (1+log2(x)))%100000007 +x )%100000007;
			x++;
		} 
		return res;
	}
	public static void main(String[] args) {
		System.out.println(ConcaternateBinary(2));
		System.out.println(ConcaternateBinary(4));
		System.out.println(ConcaternateBinary(5));
		System.out.println(ConcaternateBinary(10));
		System.out.println(ConcaternateBinary(20));
	}
}