package com.problems;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

import com.learn.sample.Emp;

/**
 * 
 * arrange the arraylist by employee salary and employee list. for same salary
 * all employee together
 * 
 * @author manojkumar
 *
 */
public class CreatMapOfSalaryWithAllEmployeeUsingStream {

	public static void main(String[] args) {

		List<Emp> list = Arrays.asList(new Emp(1, "Manoj", 100), new Emp(2, "Kumar", 300), new Emp(3, "Ram", 400),
				new Emp(4, "Man", 300));

		Map<Integer, List<Emp>> collect2 = list.stream()
				.collect(Collectors.groupingBy(Emp::getSalary, Collectors.mapping(p -> p, Collectors.toList())));

		List<Entry<Integer, List<Emp>>> collect = collect2.entrySet().stream()
				.sorted(Comparator.comparingInt(obj -> obj.getKey())).collect(Collectors.toList());

		System.out.println(collect);

	}

}
