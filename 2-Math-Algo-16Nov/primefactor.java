import java.util.List;
import java.util.ArrayList;

class primefactor {

	public static List primefactor(int num) {
		List<Integer> res = new ArrayList<Integer>();

		int end = (int) Math.round(Math.sqrt(num));

		for(int ind=2;ind<end;ind++) {
			while(num%ind == 0) {
				num/=ind;
				res.add(ind);
			} 
		}
		return res;
	}

	public static void main(String[] args) {
		System.out.println(primefactor(36));
		System.out.println(primefactor(64));
		System.out.println(primefactor(434334));
	}
}