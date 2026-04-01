package org.manoj.problem.twopointer;

public class ValidPalindrome {

    public static void main (String [] args){

        String input = "0P";
        System.out.println(isPalindrome(input));

    }

    public static boolean isPalindrome(String s) {
       String modifiedString= s.toLowerCase().replaceAll("[^a-z0-9]","").strip();

        System.out.println(modifiedString);

       int left=0, right=modifiedString.length()-1;

       while (left < right){
           if(modifiedString.charAt(left) != modifiedString.charAt(right)){
               return false;
           }

           left++;
           right--;
       }

        return true;
    }
}
