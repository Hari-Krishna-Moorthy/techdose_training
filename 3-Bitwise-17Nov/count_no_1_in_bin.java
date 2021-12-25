/*
	

	N = 17 (1 0001)
	
	N 		=>   17, 8, 4, 2, 1
	Count 	=>    0, 1, 0, 0, 1


*/

class count_no_1_in_bin {

	public static int count_no_1(int n) {
		int count = 0;
		while(n > 0) {
			count += n%2;
			n/=2;
		}
		return count;
	}

	public static void main(String[] args) {
		int n = 7;
		System.out.println(count_no_1(n));
	}
}