import java.util.ArrayList;
import java.util.List;

class factor {

	public static List factor(int num) {
		List<Integer> res = new ArrayList<Integer>();
		int end = (int) Math.round(Math.sqrt(num));

		for(int ind=2;ind<= end;ind++) {
			if(num%ind == 0) {
				res.add(ind);
				if(ind != num/ind) res.add(num/ind);
			}
		}
		return res;
	}

	public static void main(String[] args) {
		System.out.println(factor(36));		
		System.out.println(factor(10));
		System.out.println(factor(20));		
		System.out.println(factor(300));		
	}
}