package org.manoj.problem;

 public class Utilites{

     public static void printArrays(int [] array, int begin, int end){

         System.out.print("{");
         for(int i = begin; i<end; i++){
             System.out.print( array[i]+" ");
         }

         System.out.print("}");
     }

     public static void printArrays(String [] array, int begin, int end){

         System.out.print("{");
         for(int i = begin; i<end; i++){
             System.out.print( array[i]+" ");
         }

         System.out.print("}");
     }
}
