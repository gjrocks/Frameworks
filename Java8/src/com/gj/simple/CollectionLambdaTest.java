package com.gj.simple;

import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

import com.gj.model.Person;

public class CollectionLambdaTest {

	public static void main(String[] args) {
		List<Person> li=Person.createShortList();
		
		
		//for each
		System.out.println("----print using foreach + lambda");
		li.forEach((Person p) -> p.printName());

		System.out.println("\n----print using foreach + method reference");
		li.forEach(Person::printName);
		
		System.out.println("\n----print using foreach + custom action");
		li.forEach((Person p)->{System.out.println(p.printCustom(r->{return r.getGivenName();}));});
		
		System.out.println("Printing people with age >16");
		li.stream()
		   .filter((Person p) -> p.getAge()>16)
		   .forEach((Person r)->{System.out.println(r.getGivenName() +"::" +r.getAge());});
		
		System.out.println("Printing people with age >16...collected list of such people");
		
		List<Person> allAbove16age=li.stream()
				                     .filter((Person p)->p.getAge()>16)
				                     .collect(Collectors.toList());
		allAbove16age.forEach(p->p.printName());
		
		System.out.println("Map example Sum\n");
		long totalAge=li.stream()
				        .filter((Person p)->p.getAge()>16)
				        .mapToLong(p->p.getAge())
				        .sum();
		
		System.out.println(totalAge);
		
		System.out.println("Map example average\n");
		OptionalDouble averageAge=li.stream()
				                    .filter((Person p)->p.getAge()>16)
				                    .mapToDouble(p->p.getAge())
				                    .average();
		System.out.println(averageAge);
		
		System.out.println("Map example paralle stream average\n");
		averageAge=li.parallelStream()
				     .filter((Person p)->p.getAge()>16)
				     .mapToDouble(p->p.getAge())
				     .average();
		System.out.println(averageAge);
	
		List<Person> allAbove16age1=null;
try{
	allAbove16age1=li.stream()
                .filter((Person p)->{
                	if(p.getAge()==16)
                		throw new RuntimeException("holy");
                	return p.getAge()>16;
                	
                })
                .collect(Collectors.toList());
}catch(Exception r){
	r.printStackTrace();
}
System.out.println("huuuuuuu");
allAbove16age1.forEach(p->p.printName());

		
		
		
	}
	
	
	
	

}
