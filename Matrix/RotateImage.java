 // URL : https://leetcode.com/problems/rotate-image/



class RotateImage {
    static public void rotate(int[][] matrix) {
         for(int i=0;i<matrix.length;i++) {
            for(int j=i;j<matrix[0].length;j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        for(int i=0;i<matrix.length;i++) {
            for(int j=0;j<(matrix[0].length>>1);j++) {
                int temp = matrix[i][matrix[0].length-j-1];
                matrix[i][matrix[0].length-j-1] = matrix[i][j];
                matrix[i][j] = temp;
            }
        }
    }

   public static void main(String[] args) {
        // int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        int[][] arr = {{5,1,9,11},{2,4,8,10},{13,3,6,7},{15,14,12,16}};
        for(int[] nums : arr) {
            for(int num : nums) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
        System.out.println();

        rotate(arr);

        for(int[] nums : arr) {
            for(int num : nums) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
   }
}