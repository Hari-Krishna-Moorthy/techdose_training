/*

	2 ^ N = 
	
	2 ^ 32 (two to the power 32)
	(((((2^2)^2)^2)^2)^2)  

*/

class binary_exponation {

	public static long power(long n, int pow) {
		long res = 1;
		while(pow > 0) {
			if(pow%2 == 1) res *= n;
			n *= n;
			pow/=2;
		}
		return res ;
	}

	public static void main(String[] args) {
		System.out.println(power(2, 7));
		System.out.println(power(2, 8));
		System.out.println(power(2, 9));
		System.out.println(power(2, 10));
		System.out.println(power(2, 11));
		System.out.println(power(2, 12));
	}
}