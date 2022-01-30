class No_Of_islands {

	public static void fill_island(int[][] arr, int i, int j) {
		if(i < 0 || j < 0) return ;
		if(i >= arr.length || j >= arr[0].length) return;

		if(arr[i][j] != 1) return ;

		arr[i][j] = 2;
		fill_island(arr, i+1, j);
		fill_island(arr, i-1, j);
		fill_island(arr, i, j+1);
		fill_island(arr, i, j-1);
	} 

	public static void main(String[] args) {
		int[][] arr = {
			{1, 1, 1, 1, 1},
			{1, 1, 0, 0, 1},
			{0, 0, 0, 0, 0},
			{0, 0, 0, 1, 1},
		};

		int count  = 0;

		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				if(arr[i][j] == 1) {
					count++;
					fill_island(arr, i, j);
				}
			}
		}

		System.out.println(count);
	}
}