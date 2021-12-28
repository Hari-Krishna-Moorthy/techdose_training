import java.util.Arrays;

class MergeTwoSortedArrayWithOutExtraSpace {
 	public static int[] merge(int[] arr1, int[] arr2) {
 		int i = arr1.length-1, j = arr2.length-1;
 		arr1 = Arrays.copyOf(arr1, arr1.length+arr2.length);
 		int k = arr1.length-1;

 		while(i>=0 && j>=0) 
 			arr1[k--] = arr1[i]>=arr2[j] ? arr1[i--]:arr2[j--];
 		while(i>=0)
 			arr1[k--] = arr1[i--];
		while(j>=0) 
			arr1[k--] = arr2[j--];
 		return arr1;
 	}
	public static void main(String[] args) {
		System.out.println(Arrays.toString(merge(new int[] {1, 3 ,5}, new int[] {2, 4, 5})));
	}
}