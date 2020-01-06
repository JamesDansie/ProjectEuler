package leet;

//        Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as one sorted array.
//
//        Note:
//
//        The number of elements initialized in nums1 and nums2 are m and n respectively.
//        You may assume that nums1 has enough space (size that is greater or equal to m + n) to hold additional elements from nums2.
//        Example:
//
//        Input:
//        nums1 = [1,2,3,0,0,0], m = 3
//        nums2 = [2,5,6],       n = 3
//
//        Output: [1,2,2,3,5,6]

public class MergeSortedArray {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int numsindex1 = 0;
        int numsindex2 = 0;
        int[] ans = new int[nums1.length];

        if(n == 0){
            ans = nums1;
            numsindex1 = m;
            numsindex2 = n;
        }

        while(numsindex1 < m || numsindex2 < n) {
            if(numsindex1 < m && numsindex2 < n){
                if(nums1[numsindex1] < nums2[numsindex2]) {
                    ans[numsindex1 + numsindex2] = nums1[numsindex1];
                    numsindex1++;
                } else {
                    ans[numsindex1 + numsindex2] = nums2[numsindex2];
                    numsindex2++;
                }
            } else if(numsindex1 < m && numsindex2 >= n){
                ans[numsindex1 + numsindex2] = nums1[numsindex1];
                numsindex1++;
            } else if(numsindex1 >= m && numsindex2 < n){
                ans[numsindex1 + numsindex2] = nums2[numsindex2];
                numsindex2++;
            } else {
                numsindex1 = m;
                numsindex2 = n;
            }
        }

        for(int i = 0; i < nums1.length; i++){
            nums1[i] = ans[i];
        }
    }
}
