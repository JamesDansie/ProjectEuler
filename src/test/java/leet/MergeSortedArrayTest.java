package leet;

import org.junit.Test;

import static org.junit.Assert.*;

public class MergeSortedArrayTest {

    @Test
    public void merge() {
        int[] nums1 = new int[]{1,2,3,0,0,0};
        int m = 3;
        int[] nums2 = new int[]{2,5,6};
        int n = 3;

        assertArrayEquals("m is not changed yet",
                new int[]{1,2,3,0,0,0},
                nums1);

        MergeSortedArray.merge(nums1, m, nums2, n);

        assertArrayEquals("m has changed",
                new int[]{1, 2, 2, 3, 5, 6},
                nums1);
    }

    @Test
    public void little() {
        int[] nums1 = new int[]{1};
        int m = 1;
        int[] nums2 = new int[]{};
        int n = 0;

        MergeSortedArray.merge(nums1, m, nums2, n);

        assertArrayEquals("little array",
                new int[]{1},
                nums1);
    }

    @Test
    public void dafuq() {
        int[] nums1 = new int[]{2, 0};
        int m = 1;
        int[] nums2 = new int[]{1};
        int n = 1;

        MergeSortedArray.merge(nums1, m, nums2, n);

        assertArrayEquals("Little array",
                new int[]{1, 2},
                nums1);
    }
}