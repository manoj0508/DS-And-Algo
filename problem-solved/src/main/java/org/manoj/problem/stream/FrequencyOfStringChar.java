package org.manoj.problem.stream;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FrequencyOfStringChar {

    public static void main(String[] args){
        String inputString = "Java is an awesome programming language";
        Map<Character, Long> collect = inputString.chars().mapToObj(a -> (char) a).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));


        Map<String, Long> collect1 = Stream.of(inputString).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.println(collect);

        System.out.println(collect1);

        List<Double> decimalList = Arrays.asList(12.45,9.81,45.9,12.7,89.90,34.56,11.3);

        List<Double> sortedInReversOrder=decimalList.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());

        System.out.println(sortedInReversOrder);



    }
}
