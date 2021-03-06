import java.util.Scanner;
import java.util.Arrays;

class NextPermutation {
    static private void swap(int[] arr, int i, int j) {
    	int temp = arr[i];
    	arr[i] = arr[j];
    	arr[j] = temp;
    }
    static private void reverse(int[] nums, int i, int j) {
    	while(i<j) swap(nums, i++, j--);
    }
	public void nextPermutation(int[] nums) {
        if(nums.length <= 1) return;
        int i = nums.length - 2;
        while(i >= 0 && nums[i] >= nums[i+1])i--;
        if(i >= 0) {
        	int j = nums.length - 1;
        	while(nums[j] <= nums[i]) j--;
        	swap(nums, i, j);
        }
        reverse(nums, i+1, nums.length-1);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];

        for(int i=0;i<n;i++) {
            arr[i] = scanner.nextInt();
        }

        nextPermutation(arr);

        for(int i=0;i<n;i++) {
            System.out.print(arr[i] + " ");
        }        

    }


}