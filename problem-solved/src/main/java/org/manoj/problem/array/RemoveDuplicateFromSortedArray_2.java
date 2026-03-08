package org.manoj.problem.array;

import org.manoj.problem.Utilites;

import java.util.HashMap;
import java.util.Map;

/**
 * Given an integer array nums sorted in non-decreasing order,
 * remove some duplicates in-place such that each unique element appears at most twice.
 * The relative order of the elements should be kept the same.
 *
 * you must instead have the result be placed in the first part of the array nums.
 * More formally, if there are k elements after removing the duplicates,
 * then the first k elements of nums should hold the final result.
 * It does not matter what you leave beyond the first k elements.
 *
 * Return k after placing the final result in the first k slots of nums.
 *
 */
public class RemoveDuplicateFromSortedArray_2 {

    public static void main(String [] args){
        int [] input = {0,0,1,1,1,1,2,3,3};

        int end = removeDuplicates(input);
        System.out.println(end);

        Utilites.printArrays(input,0,end);

        System.out.println();

        Utilites.printArrays(input,0,input.length);

    }

    public static int removeDuplicates(int[] nums) {
        Map<Integer, Integer> countMap = new HashMap<>();
        int i = 0;

        for (int num : nums) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
            if (countMap.get(num) <= 2) {
                nums[i] = num;
                i++;
            }
        }

        return i;
    }

}


