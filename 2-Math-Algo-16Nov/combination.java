/*

nCr = n! / (n-r)! r! 
	= n x (n-1) x (n-2) .... (n - (r-1)) x (n-r)!
	  -------------------------------------------
	   (n-r)! x r! 

	= n x (n-1) x (n-2) x (n-3) .... (n-(r-1)) 
	  ---------------------------------------- 
	  r x (r-1) x (r-2) x (r-3) ..... x (1)


	r = (n - r) < r ? n - r : r


*/


class combination {

	public static int find_gcd(long a, long b) {
		if(a == 0) return (int) b;
		else return find_gcd(b%a, a);
	}

	public static double ncr(int n, int r) {
		long p = 1, q  = 1;
		if( (n - r) < r ) r = n-r;
		if(r == 0) return 1;
		if(r == 1) return n;
		while(r > 0) {
			 p *= n;
			 q *= r;

			 int gcd = find_gcd(p, q);
			 p/= gcd;
			 q/= gcd;

			 n--;
			 r--;
		}
		return p/q;
	}

	public static void main(String[] args) {
		System.out.println(ncr(18, 3));	
	}
}