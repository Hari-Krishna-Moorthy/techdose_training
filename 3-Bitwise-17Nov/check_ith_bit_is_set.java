
/*

N = 8 (1000)

N   => 1000			 N => 1000			N => 1000			N => 1000	
i(0)=> 0001 &	   i(1)=> 0010 &      i(2)=> 0100 &		  i(3)=> 1000 &
----------			  ----------	   ------------		    -----------		
	 0000(NOT SET)		  0000(NOT SET)      0000(NOT SET) 		 1000(SET) != 0

*/


class check_ith_bit_is_set {
	public static boolean check_ith_bit(int n, int i){
		return (n & 1 << i)  != 0;
	}
	public static void main(String[] args) {
		int n = 8;
		for(int i = 0;i < 4;i++) 
			System.out.println( check_ith_bit(n, i));
	}
}
