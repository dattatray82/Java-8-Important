package com.java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class OddEvenNumber {
	public static void main(String[] args) {	
		List<Integer> list=Arrays.asList(11,2,3,5,6,9,12,13,15,16);
		
		System.out.println("even number");
		List<Integer> evennumber=list.stream().filter(e->e%2==0).collect(Collectors.toList());
		System.out.println(evennumber);
		
		System.out.println("odd number");
		List<Integer> oddnumber=list.stream().filter(e->e%2!=0).collect(Collectors.toList());
		System.out.println(oddnumber);
		
		System.out.println("sorted");
		List<Integer> sorted=list.stream().sorted().collect(Collectors.toList());
		System.out.println(sorted);
		
		System.out.println("Reverse order");
		list.stream().sorted(Comparator.reverseOrder()).forEach(e->System.out.print(e+" "));
		System.out.println();
		
		//15 13 12 11 9 6 5 3 2
	
		System.out.println("2nd highest");
		list.stream().sorted(Comparator.reverseOrder()).skip(1).limit(1).forEach(e->System.out.println(e));
		
		System.out.println("sum of list");
		Optional<Integer> sum=list.stream().reduce((a, b)->a+b);
		System.out.println(sum);
		
		System.out.println("avarage if list");
		double avg=list.stream().mapToInt(e->e).average().getAsDouble();
		System.out.println(avg);
		
		System.out.println("print number starts with 1");
		list.stream().map(e->String.valueOf(e)).filter(e->e.startsWith("1")).forEach(e->System.out.print(e+" "));
		System.out.println();
		
		System.out.println("duplicate find ");
		list.stream().filter(e->Collections.frequency(list, e)>1).collect(Collectors.toSet()).forEach(e->System.out.println(e));
		
		/*System.out.println("max element");
		int max=list.stream().max(Comparator.comparingInt(Integer ::valueOf)).get();
		System.out.println(max);*/
		
		System.out.println("max element");
		int max=list.stream().max((x,y)->x-y).get();
		System.out.println(max);
		
		System.out.println("min element");
		int min=list.stream().min((x,y)->x-y).get();
		System.out.println(min);
		
		
}
}