import java.util.Arrays;
class gendrate_all_possible_subset {
	public static void main(String[] args) {
		char[] arr = {'a', 'b', 'c'};
		int len = arr.length;
		int end = (int) Math.pow(2, len);
		String[] res = new String[end];

		for(int ind=0;ind<end;ind++) {
			res[ind] = "";
			for(int j=0;j<len;j++) {
				System.out.print( ind << j + ",");
			}
		}

		System.out.println(Arrays.toString(res));
	}
}