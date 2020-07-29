package com.gj.simple.interfaces;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;

import com.gj.model.Person;

public class Java8InterfaceTest {

	public static void main(String[] args) throws Exception{
		
		List<Person> li=Person.createShortList();
		printList(li);
		
		Collections.sort(li, new Comparator<Person>() {
			@Override
			public int compare(Person o1, Person o2) {
				return o1.getAge() - o2.getAge();
			}
		});
		System.out.println("---------------Sort by Age-----------------");
		 
		printList(li);
		
         Comparator<Person> comparatorByAge=(Person p1, Person p2)->{return p1.getAge()-p2.getAge();};
         Comparator<Person> comparatorByFirstName=(Person p1, Person p2)->{return p1.getGivenName().compareTo(p2.getGivenName());};
         Comparator<Person> comparatorByLastName=(Person p1, Person p2)->{return p1.getSurName().compareTo(p2.getSurName());};
        
        li=Person.createShortList();
        
        System.out.println("---------------Normal List-----------------");
        printList(li);
        
        //Collections.sort(li,(Person p1, Person p2)->{return p1.getAge()-p2.getAge();});
        //Collections.sort(li,comparatorByAge);
        System.out.println("---------------Sort by Age-----------------");
        
       
        
        
        
        CustomComparator<Person> customComparatorByAge=(Person p1, Person p2)->{return p1.getAge()-p2.getAge();};
        CustomComparator<Person> customComparatorByFirstName=(Person p1, Person p2)->{return p1.getGivenName().compareTo(p2.getGivenName());};
        CustomComparator<Person> customComparatorByLastName=(Person p1, Person p2)->{return p1.getSurName().compareTo(p2.getSurName());};
        
        Function<Person,Comparable> agefn=(Person p)-> p.getAge();
        Function<Person,Comparable> givenNamefn=(Person p)-> p.getGivenName();
        Function<Person,Comparable> surNamefn=(Person p)-> p.getSurName();
        
        
        CustomComparator<Person> customComparatorByAge_= CustomComparator.comparing(Person::getAge); //or call using by passing agefn or directly lambda
        
        CustomComparator<Person> customComparatorByGivenName_= CustomComparator.comparing(Person::getGivenName); //or call using by passing givenNamefn or directly lambda
        
        CustomComparator<Person> customComparatorBySurName_= CustomComparator.comparing(Person::getSurName); //or call using by passing surNamefn or directly lambda
        
        //Collections.sort(li,customComparatorByAge_);
       // printList(li);
        
        
        //lets make comparing method more generic and add chaining of comparators 
        
        CustomComparator<Person> chain=customComparatorByGivenName_.thenCustomComparing(customComparatorByAge_);
        
        //lets make chaining of lambdas
        
		CustomComparator<Person> chain2 = CustomComparator.comparing(givenNamefn).thenCustomComparing(agefn);

		Collections.sort(li, chain2);

		printList(li);
        
	}
	
	
	public static void printList(List<Person> li){
		li.forEach(p->System.out.println(p.getGivenName() + "::"+p.getAge()));
	}

}
