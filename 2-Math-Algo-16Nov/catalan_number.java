import java.util.Arrays;

class catalan_number {

	public static int[] catalanNumber(int n) {
		int[] catalan = new int[n+1];

		catalan[0] = 1;
		catalan[1] = 1;

		for(int x=2;x<n+1;x++) {
			for(int y=0;y<x;y++) {
				catalan[x] += catalan[y] * catalan[x - y - 1];
			}
		}
		return catalan;
	}

	public static void main(String[] args) {
		System.out.println(Arrays.toString(
			catalanNumber(10)));
	}
}