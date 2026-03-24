package org.manoj.problem.array;

import org.manoj.problem.Utilites;

public class RotateArrayKTimes {

    public static void main(String[] args) {
        int[] inputArray = {1, 2, 3, 4, 5, 6, 7};
        int k = 10;
        Utilites.printArrays(inputArray, 0, inputArray.length);
        rotate(inputArray, k);
        System.out.println();
        Utilites.printArrays(inputArray, 0, inputArray.length);
    }

    public static void bruteForceApproach(int[] nums, int k) {
        if (k > nums.length) {
            k = k % nums.length;
        }

        int start = 1;

        while (start <= k) {
            int temp = nums[nums.length - 1];

            for (int i = nums.length - 1; i > 0; i--) {
                nums[i] = nums[i - 1];
            }
            nums[0] = temp;
            start++;
        }
    }


    public static void rotate(int[] nums, int k) {
        int n = nums.length;

        k = k % n;

        reverseArray(nums, 0, n - 1);
        reverseArray(nums, 0, k - 1);
        reverseArray(nums, k, n - 1);

    }

    public static void reverseArray(int[] array, int left, int right) {
        while (left < right) {
            int temp = array[left];
            array[left] = array[right];
            array[right] = temp;
            left++;
            right--;
        }
    }
}



