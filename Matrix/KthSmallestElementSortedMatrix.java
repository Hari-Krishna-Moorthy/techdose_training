import java.util.Arrays;

class KthSmallestElementSortedMatrix {
	static public int kthSmallest(int[][] matrix, int k) {
        int n = matrix.length, arrInd = 0; ;
        int[] arr = new int[n*n];
        for(int i=0;i<n*n;i++)
            arr[arrInd++] = matrix[i/n][i%n]; 
        Arrays.sort(arr);
        return arr[k-1];
    }
    public static void main(String[] args) {
    	System.out.println(kthSmallest(new int[][] {{1,5,9},{10,11,13},{12,13,15}}, 8));
    	System.out.println(kthSmallest(new int[][] {{-5}}, 1));
    }
}