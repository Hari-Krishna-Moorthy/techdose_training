/*


CHECK POWER OF TWO

if n is power of 2  (n & n-1) = 0

n = 16 =>  1 0000							n  = 17  => 1 0001
n-1=15 =>  0 1111  &						n-1= 16  => 1 0000   &
-------------------- 					   ----------------------
		   0 0000	== 0 (power of 2)                   1 0000  != 0 (Not a power of 2)



GET POWER

8 => 2 ^ 3  => (((1 << 1) << 1) << 1)  (shift 3 times 1 with 1)

*/


class check_power_of2 {

	public static boolean isPowerOfTwo(int num) {
		return (num & num-1) == 0;
	}

	public static int getPowerOfTwo(int num) {
		int power = 0, n = 1;

		while(num != n) {
			n = n << 1;
			power++;
		}
		return power;
	}


	public static void main(String[] args) {
		int n = 16;
		if(isPowerOfTwo(n)) {
			System.out.println("Power of 2");
			System.out.println(getPowerOfTwo(n));
		} else {
			System.out.println("Not Power of 2");
		}
	}
}