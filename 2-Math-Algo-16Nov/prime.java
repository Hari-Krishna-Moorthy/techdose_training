import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

class prime{

	public static boolean isPrime(int num) {
		Double end = Math.sqrt(num); 
		for(int ind=2; ind<end;ind++) {
			if(num%ind == 0) return false;
		}
		return true;
	}

	public static List allPrime(int num) {
		Double end = Math.sqrt(num);
		boolean[] arr = new boolean[num+1];
		List<Integer> res = new ArrayList<Integer>();
		for(int i=0;i<num+1;i++) {
			arr[i] = false;
		}

		for(int i=2;i<=num;i++) {
			if(arr[i] == false) {
				for(int j=i; i*j<=num;j++) {
					arr[i*j] = true;
				}
				res.add(i);
			}
		}
		return res;
	}

	public static void main(String[] args) {
		System.out.println(allPrime(17));
		System.out.println(allPrime(100));		
	}
}