package org.manoj.problem.array;

import java.util.Arrays;

/**
 * You are given two integer arrays nums1 and nums2, sorted in non-decreasing order,
 * and two integers m and n, representing the number of elements in nums1 and nums2 respectively.
 * <p>
 * Merge nums1 and nums2 into a single array sorted in non-decreasing order.
 * <p>
 * The final sorted array should not be returned by the function,
 * but instead be stored inside the array nums1. To accommodate this, nums1 has a length of m + n,
 * where the first m elements denote the elements that should be merged, and the last n elements are
 * set to 0 and should be ignored. nums2 has a length of n.
 * <p>
 * Example 1:
 * <p>
 * Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
 * Output: [1,2,2,3,5,6]
 * Explanation: The arrays we are merging are [1,2,3] and [2,5,6].
 * The result of the merge is [1,2,2,3,5,6] with the underlined elements coming from nums1.
 *
 */
public class MergeTwoSortedArray {

    public static void main(String[] args) {
        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {2,5,6};
        int m = 3, n = 3;

      //  mergeArrays(nums1, m, nums2, n);
        mergeArrays2(nums1, m, nums2, n);

        for (int i = 0; i < m + n; i++) {
            System.out.print(nums1[i] + ",");
        }
    }

    public static void mergeArrays(int[] nums1, int m, int[] nums2, int n) {

        if (nums2.length == 0) return;

        int j = 0;
        for (int i = 0; i < m; i++) {
            int value = nums1[i];
            if (value > nums2[j]) {
                int temp = nums1[i];
                nums1[i] = nums1[i + 1];
                nums1[i + 1] = temp;
                nums1[i] = nums2[j];
                j++;
            }
        }


        if (null != nums2 && nums2.length > 0) {
            for (int i = m + j; i < m + n; i++) {
                nums1[i] = nums2[j];
                j++;
            }
        }
    }

    public static void mergeArrays2(int[] nums1, int m, int[] nums2, int n) {
        int midx = m - 1;
        int nidx = n - 1;
        int right = m + n - 1;

        while (nidx >= 0) {
            if (midx >= 0 && nums1[midx] > nums2[nidx]) {
                nums1[right] = nums1[midx];
                midx--;
            } else {
                nums1[right] = nums2[nidx];
                nidx--;
            }
            right--;
        }
    }


}
