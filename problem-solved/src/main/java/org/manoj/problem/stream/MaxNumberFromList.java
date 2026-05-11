package org.manoj.problem.stream;

import java.util.Arrays;
import java.util.List;

public class MaxNumberFromList {

    public static void main(String [] args){
        List<Integer> list = Arrays.asList(10, 20, 30, 40, 50);

        Integer maxValue = list.stream().max(Integer::compare).get();

        IO.println("Max Integer Value  " +maxValue);

        Integer minValue = list.stream().min(Integer:: compare).get();

        IO.println(minValue);
    }
}