package org.manoj.problem.array;

import org.manoj.problem.Utilites;

public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args){
        int[] nums = {0,1,2,2,3,4,5,6,7,8};
        System.out.println(removeDuplicates(nums));

        Utilites.printArrays(nums,0,nums.length);
    }

    public static int removeDuplicates(int[] nums) {
        int i=0,j= i+1;
        boolean dup = false;
        while(j< nums.length){
            if(nums[i]==nums[j]){
                dup=true;
                j++;
            }else{
                i++;
                if(dup){
                    nums[i]=nums[j];
                    dup=false;
                }

            }
        }
        return i+1;
    }


}
