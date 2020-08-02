package com.gj.simple;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.gj.model.Person;

public class ComparatorTest {

	public static void main(String[] args) {
		
		
		List<Person> li=Person.createShortList();
		for (Person person : li) {
			System.out.println(person.getGivenName());
		}
        Collections.sort(li);
        System.out.println("\n------------After sorted by comparable-------------");
        for (Person person : li) {
        	System.out.println(person.getGivenName());
        }
        
        System.out.println("\n----------After sorted by separate comparator--------");
        Collections.sort(li,new ComaparatorHelper());
        for (Person person : li) {
        	System.out.println(person.getGivenName());
        }
        
        System.out.println("\n----------After sorted by inner class comparator--------");
        Collections.sort(li,new Comparator<Person>() {

			@Override
			public int compare(Person o1, Person o2) {
				
				return o1.getGivenName().compareTo(o2.getGivenName());
			}
        	
		});
        for (Person person : li) {
        	System.out.println(person.getGivenName());
        }
        
        System.out.println("\n----------After sorted ASC by lambda comparator--------");
        
        Collections.sort(li,(Person p1, Person p2)-> {return p1.getGivenName().compareTo(p2.getGivenName());} );
        for (Person person : li) {
        	System.out.println(person.getGivenName());
        }
        
        System.out.println("\n----------After sorted DESC by lambda comparator--------");
        
        Collections.sort(li,(p1, p2)-> {return p2.getGivenName().compareTo(p1.getGivenName());} );
        for (Person person : li) {
        	System.out.println(person.getGivenName());
        }
	}
	
	

}

class ComaparatorHelper implements Comparator<Person>{

	@Override
	public int compare(Person o1, Person o2) {
		
		return o1.getGivenName().compareTo(o2.getGivenName());
	}
	
}
