package org.manoj.problem;

 public class Utilites{

     public static void printArrays(int [] array, int begin, int end){

         System.out.print("{");
         for(int i = begin; i<end; i++){
             System.out.print( array[i]+" ");
         }

         System.out.print("}");
     }
}
