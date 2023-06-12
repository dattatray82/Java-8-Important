package com.inteviewquestions;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class PerformOperation {
	public static void main(String[] args) {
		List<Employee> list=new ArrayList<Employee>();
		
		list.add(new Employee(2, "asha", "nashik", 26, 55000));
		list.add(new Employee(4, "pravin", "pune", 25, 40000));
		list.add(new Employee(1, "datta", "pune", 27, 50000));
		list.add(new Employee(3, "satyawan", "nashik", 28, 65000));
		
		System.out.println("Even or odd list");
		//list.stream().filter(x->x.getId()% 2==1).forEach(System.out:: println);
		list.stream().filter(e->e.getId()%2==0).filter(e->e.getSalary()>50000).forEach(System.out::println);
		
		System.out.println("age > 26");
		list.stream().filter(age->age.getAge()>26).forEach(age->System.out.println(age));
		
		//Sort using id;
		System.out.println("sort using id");
		list.stream().sorted(Comparator.comparingInt(Employee :: getId)).forEach(id->System.out.println(id));
		
		System.out.println("sort using name");
		list.stream().sorted((e1,e2)->e1.getName().compareTo(e2.getName())).forEach(name->System.out.println(name));
		
		System.out.println(" get data from city");
		Map<String,List<Employee>> getbycity = list.stream().collect(Collectors.groupingBy(Employee :: getCity));
		System.out.println(getbycity);
		
		// get each highest paid employee from each city
		/*System.out.println("get each highest paid employee from each city");
		Map<String, List<Employee>> highestpaid=list.stream().collect(Collectors.groupingBy(Employee::getCity));
		Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparingInt(Employee::getSalary)),Optional::get);
		System.out.println(highestpaid);*/
		
		System.out.println("city->pune ..salary+10000");
		list.stream().filter(city->city.getCity().equalsIgnoreCase("pune"))
		.map(salary->(salary.getSalary()+10000)).forEach(name->System.out.println(name));
		
		System.out.println("salary above 55000 show only name");
		list.stream().filter(salary->salary.getSalary()>=55000).map(name->name.getName()).forEach(name->System.out.println(name));
		
		// 65000,55000,50000,40000
		System.out.println("Get nth Highest salary"); /// skip madhe je takto te + 1 kel tr ti salary nigte..skip(3)->4th 
		Optional<Integer> thirdhightest=list.stream().map(e->e.getSalary()).sorted(Comparator.reverseOrder()).skip(2).findFirst();
		System.out.println(thirdhightest);
	
	}

}
