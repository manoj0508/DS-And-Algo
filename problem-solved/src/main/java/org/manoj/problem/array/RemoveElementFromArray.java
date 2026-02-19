package org.manoj.problem.array;

import org.manoj.problem.Utilites;

public class RemoveElementFromArray {

    public static void main(String[] args) {

        int[] nums = {0,1,2,2,3,0,4,2};
        int val = 2;

       int k =  removeElementApproch1(nums,val);
        System.out.println();

        Utilites.printArrays(nums,0,k);

    }

    public static int removeElementApproch1(int[] nums, int val){
        int i = 0, j = nums.length - 1, k = 0;

        for(int l=0; l<nums.length; l++){
            if(nums[l]==val){
                k++;
            }
        }

        while (i < nums.length && i<j) {
            if (nums[i] == val) {
                while (j>i) {
                    if (nums[j] != val) {
                        int temp= nums[j];
                        nums[j] = nums[i];
                        nums[i] = temp;
                        break;
                    } else {
                        j--;
                    }
                }
            }
            i++;
        }

        return nums.length-k;
    }
}
