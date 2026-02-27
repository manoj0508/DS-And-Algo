package org.manoj.problem.problem;

import java.util.HashMap;
import java.util.Map;

/**
 * Given an array nums of size n, return the majority element.
 *
 * The majority element is the element that appears more than ⌊n / 2⌋ times.
 * You may assume that the majority element always exists in the array.
 *
 * Input: nums = [3,2,3]
 * Output: 3
 *
 *
 */
public class MajorityElement {

    public static void main(String[] args) {

        int[] nums = {2, 2, 1, 1, 1, 2, 2};
        System.out.println(majorityElement(nums));
    }

    public static int majorityElement(int[] nums) {

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            Integer orDefault = map.getOrDefault(nums[i], 0);
            map.put(nums[i], orDefault + 1);
        }

        Map.Entry<Integer, Integer> integerIntegerEntry = map.entrySet().stream().max(Map.Entry.comparingByValue()).get();

        return integerIntegerEntry.getKey();
    }

}
