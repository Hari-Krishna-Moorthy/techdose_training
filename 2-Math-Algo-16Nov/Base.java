class Base {
	public static void main(String[] args) {
		int base_number = 1000;
		int base = 2;
		long res = 0;

		for(int i=1; base_number>0; i*=base, base_number/=10) {
			res += i * base_number%10;
			// System.out.println( i + " " + base_number%10 + " = " + res );
		}

		System.out.println(res);

		int decimal_number = 9;
		base = 2;
		res = 0;

		while(decimal_number > 0) {
			res = res * 10 + decimal_number%2;
			decimal_number/=2; 
		}
		System.out.println(res);

	}
}