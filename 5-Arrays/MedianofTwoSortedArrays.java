// https://leetcode.com/problems/median-of-two-sorted-arrays

class MedianofTwoSortedArrays {
    static public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length + nums2.length;
        int[] res = new int[n];
        int i = 0,j = 0, k = 0;
        while(i<nums1.length && j<nums2.length) res[k++] = nums1[i] < nums2[j] ? nums1[i++] : nums2[j++];
        while(i<nums1.length) res[k++] = nums1[i++];
        while(j<nums2.length) res[k++] = nums2[j++];
        if((n&1) == 1) {
            return res[n>>1];
        } else {
            return (res[n>>1] + res[(n>>1) - 1]) / 2.0;
        }        
    }
    public static void main(String[] args) {
        System.out.println(findMedianSortedArrays(new int[] {1,3}, new int[] {2}));
        System.out.println(findMedianSortedArrays(new int[] {1,2}, new int[] {3, 4}));
    }
}