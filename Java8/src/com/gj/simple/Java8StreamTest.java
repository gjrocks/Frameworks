package com.gj.simple;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import org.zefer.html.doc.s;

import com.sun.syndication.io.SyndFeedOutput;

public class Java8StreamTest {

	public static void main(String[] args) {
		
		List<String> stringCollection = new ArrayList<>();
		stringCollection.add("ddd2");
		stringCollection.add("aaa2");
		stringCollection.add("bbb1");
		stringCollection.add("aaa1");
		stringCollection.add("bbb3");
		stringCollection.add("ccc");
		stringCollection.add("bbb2");
		stringCollection.add("ddd1");
	
	
		//list all-print all
		stringCollection.stream()
		                .forEach((k)->System.out.println(k));
	    //sort, printall
		System.out.println("--------------sorted-------------");
		stringCollection.stream()
		                .sorted()
		                .forEach(System.out::println);
		System.out.println("--------------Filter Starts with a-------------");
		stringCollection.stream()
		                .filter((z)->z.startsWith("a"))
		                .forEach(System.out::println); 
		  
		System.out.println("--------------apply Function to each (Map)-------------");	
	     	
		stringCollection.stream()
		                .map((s)-> {return s.toUpperCase();})
		                .forEach(System.out::println);
		
		System.out.println("--------------apply Function to each filtered (Map)-------------");	
     	
		stringCollection.stream()
		                 .filter((s)-> s.startsWith("a"))
		                .map((s)-> {return s.toUpperCase();})
		                .forEach(System.out::println);
		System.out.println("--------------apply anymatch -------------");	
     	
		boolean anyStartsWithA =
			    stringCollection
			        .stream()
			        .anyMatch((s) -> s.startsWith("a"));

			System.out.println(anyStartsWithA);      // true

			System.out.println("--------------apply all starts with  -------------");	
			
			boolean allStartsWithA =
			    stringCollection
			        .stream()
			        .allMatch((s) -> s.startsWith("a"));

			System.out.println(allStartsWithA);      // false

			System.out.println("--------------none  starts with  -------------");	
			boolean noneStartsWithZ =
			    stringCollection
			        .stream()
			        .noneMatch((s) -> s.startsWith("z"));

			System.out.println(noneStartsWithZ);      // true
			
			
			System.out.println("--------------apply count  -------------");	
		
			long cnt=stringCollection.stream()
					                 .filter((s)->s.startsWith("a"))
					                 .count();
			System.out.println(cnt);
			
			System.out.println("--------------apply distinct count  -------------");
			
			long distinctCnt= stringCollection.stream()
            .filter((s)->s.startsWith("a")).distinct().count();

			System.out.println("--------------apply filter collect the thing in another collection  -------------");
			
			List<String> startwthAList=stringCollection.stream()
					                                   .filter((s)->s.startsWith("a"))
					                                   .collect(Collectors.toList());
			startwthAList.forEach(System.out::println);
			
			//getting map from list using index as key
			//use 1 this is because it is list of String, in  case user defined objects,
			//if key is to be used is from object itself like id or any other unique field then there is other way
			
			
			Map<Integer,String> mp=IntStream.range(0, stringCollection.size())
			                                         .mapToObj((i)->new MapObject(i, stringCollection.get(i)))
			                                         .collect(Collectors.toMap((MapObject mapObj)-> { return mapObj.getKey(); }, (MapObject obj)->{return (String)obj.getValue();}));
			
			mp.forEach((k,v)->System.out.println(k+"::"+v));
			
		    	
			//list to map  for UDT
			
			List<Employee> employeeList=new ArrayList<>();
			employeeList.add(new Employee(9531, "ganesh", "jadhav",35));
			employeeList.add(new Employee(9529, "aarvi", "jadhav",2));
			employeeList.add(new Employee(9535, "Bhavna", "jadhav",30));
			employeeList.add(new Employee(9537, "Asha", "jadhav",50));
			
			Map<Integer,Employee> mpp=employeeList.stream()
			            .collect(Collectors.toMap((emp)-> {return emp.getEmpId();}, p->p));  
			mpp.forEach((key,value)-> System.out.println(key +"::"+value));
			//reduction example using jdk methods
			int sum=employeeList.stream()
			            .mapToInt((p)->p.getAge())
			            .sum();
             System.out.println("Sum ::" +sum);            
             
             //reduction using general things
             int sum1=employeeList.stream()
            		              .map((p)->p.getAge())
            		              .reduce(0, (a,b)->a+b);
             
             
             System.out.println("Sum1 ::" +sum1);
             
             
	}                            
	                                

	
	
}


class Employee{
	int empId;
	String name;
	String lastname;
	int age;	
	
	public Employee(int empId, String name, String lastname, int age) {
		super();
		this.empId = empId;
		this.name = name;
		this.lastname = lastname;
		this.age=age;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", lastname=" + lastname + ", age=" + age + "]";
	}
	
	
	
	
}



class MapObject{
	
	int key;
	Object value;
	
	public MapObject(int key, Object value) {
		super();
		this.key = key;
		this.value = value;
	}

	public int getKey() {
		return key;
	}

	public void setKey(int key) {
		this.key = key;
	}

	public Object getValue() {
		return value;
	}

	public void setValue(Object value) {
		this.value = value;
	}
	
	
	
}