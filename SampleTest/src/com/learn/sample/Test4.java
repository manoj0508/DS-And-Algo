package com.learn.sample;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> list = new ArrayList<>();
		
		list.add("/root/file/version/1/01.xml");
		list.add("/root/file/version/1/02.xml");
		
		list.add("/root/file/version/2/01.xml");
		list.add("/root/file/version/2/02.xml");
		list.add("/root/file/version/3/03.xml");
		
		list.add("/root/file/version/3/01.xml");
		list.add("/root/file/version/3/02.xml");
		
		
		Map<String, Long> collect = list.stream().map(s -> s.substring(0,20)).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		
		
		System.out.println(collect);
		
		
	Map<String, Integer> map = new HashMap<>();
		
		map.put("Jayant", 80);
        map.put("Abhishek", 90);
        map.put("Anushka", 80);
        map.put("Amit", 75);
        map.put("Danish", 40);
        
        Stream<Entry<String,Integer>> sorted = map.entrySet().stream().sorted((i1,i2)-> i1.getKey().compareTo(i2.getKey()));
        
       
		
		Map<String, Integer> sortedMap = map.entrySet().stream().sorted((i1,i2)-> i1.getValue().compareTo(i2.getValue())).
				collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,(e1,e2)->e2, LinkedHashMap::new));
		
		
		System.out.print(sortedMap);
		System.out.println();
		
	
		String s = " Manoj   K   Y";
		String trim = s.replace(" ", "");
		
		System.out.println(trim);
	}

}
