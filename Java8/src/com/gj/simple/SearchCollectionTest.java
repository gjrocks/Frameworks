package com.gj.simple;

import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

import com.gj.model.Gender;
import com.gj.model.Person;

public class SearchCollectionTest {

	public static void main(String[] args) {
	List<Person> li=Person.createShortList();
	SearchCollectionTest test=new SearchCollectionTest();
	System.out.println(".....Plain version....");
	test.findAllgt16(li);
	System.out.println("\n.....Search criteria in a Method version....");
	test.findAllgt16_1(li);
	
	System.out.println("\n.....Search criteria in a innner class version....");
	test.findAllgt16_2(li,new MySearch<Person>() {

		@Override
		public boolean search(Person t) {
			
			return t.getAge()>16;
		}
	});
	System.out.println("\n.....Search criteria in a predicate version....");
	
	Predicate<Person> predicate= (Person p) -> p.getAge() > 16;
	test.findAllgt16_3(li, predicate);
	
	//test printCustom from Person class 
	
	//
	System.out.println("\n.....lets print first name + last name....");
	Function<Person,String> f=(Person p)->{return p.getGivenName() +" " +p.getSurName();};
	for(Person person:li){
		System.out.println(person.printCustom(f));
	}
	System.out.println("\n.....lets print last name + first name....");
	Function<Person, String> l=(p)->{return p.getSurName() +" " +p.getGivenName();};
	for(Person person:li){
		System.out.println(person.printCustom(l));
	}
	
	System.out.println("\n.....lets print last name + age....");
	
	for(Person person:li){
		System.out.println(person.printCustom((p)->{return p.getSurName() + " " +p.getAge();}));
	}
	
	System.out.println("\n.....lets print name ...");
	li.forEach(Person::printName);
	}
	
	
	
	
    //findAll with age greater than 16
	public void findAllgt16(List<Person> li){
		
		for (Person person : li) {
			if(person.getAge()>16) //search condition
				System.out.println(person.getGivenName()+ "::" +person.getAge());
		}
	}
	
	public void findAllMaleAgeBt16n25(List<Person> li){
		for (Person person : li) {
			if(person.getAge()>16 && person.getAge()<25 && person.getGender()==Gender.MALE) //search condition
				System.out.println(person.getGivenName()+ "::" +person.getAge());
		}
	}
	
	public void findAllAgeBt25n63(List<Person> li){
		for (Person person : li) {
			if(person.getAge()>25 && person.getAge()<63) //search condition
				System.out.println(person.getGivenName()+ "::" +person.getAge());
		}
	}
	
	public void findAllgt16_1(List<Person> li) {

		for (Person person : li) {
			if (isGreater16(person)) // search condition in method
				System.out.println(person.getGivenName() + "::" + person.getAge());
		}
	}

	public void findAllMaleAgeBt16n25_1(List<Person> li) {
		for (Person person : li) {
			if (isMaleAndBetween16n25(person)) // search condition in method
				System.out.println(person.getGivenName() + "::" + person.getAge());
		}
	}

	public void findAllAgeBt25n63_1(List<Person> li) {
		for (Person person : li) {
			if (isAgeBetween25n63(person)) // search condition in method
				System.out.println(person.getGivenName() + "::" + person.getAge());
		}
	}

	private boolean isAgeBetween25n63(Person person) {

		return (person.getAge() > 25 && person.getAge() < 63);
	}

	private boolean isGreater16(Person person) {

		return person.getAge() > 16;
	}

	private boolean isMaleAndBetween16n25(Person person) {

		return (person.getAge() > 16 && person.getAge() < 25 && person.getGender() == Gender.MALE);
	}
	
	//following methods uses MySearch<Person>, these methods takes search criteria in the form of inner class.
	
	public void findAllgt16_2(List<Person> li,MySearch<Person> m) {

		for (Person person : li) {
			if (m.search(person)) // search condition in inner class
				System.out.println(person.getGivenName() + "::" + person.getAge());
		}
	}

	public void findAllMaleAgeBt16n25_2(List<Person> li,MySearch<Person> m) {
		for (Person person : li) {
			if (m.search(person)) // search condition in inner class
				System.out.println(person.getGivenName() + "::" + person.getAge());
		}
	}

	public void findAllAgeBt25n63_2(List<Person> li,MySearch<Person> m) {
		for (Person person : li) {
			if (m.search(person)) // search condition in inner class
				System.out.println(person.getGivenName() + "::" + person.getAge());
		}
	}
	
	
	//following methods uses Predicate<Person>, these methods takes search criteria in the form of lambda.
	
		public void findAllgt16_3(List<Person> li,Predicate<Person> m) {

			for (Person person : li) {
				if (m.test(person)) // search condition in inner class
					System.out.println(person.getGivenName() + "::" + person.getAge());
			}
		}

		public void findAllMaleAgeBt16n25_3(List<Person> li,Predicate<Person> m) {
			for (Person person : li) {
				if (m.test(person)) // search condition in inner class
					System.out.println(person.getGivenName() + "::" + person.getAge());
			}
		}

		public void findAllAgeBt25n63_3(List<Person> li,Predicate<Person> m) {
			for (Person person : li) {
				if (m.test(person)) // search condition in inner class
					System.out.println(person.getGivenName() + "::" + person.getAge());
			}
		}
	
		
		
		
}


interface MySearch<T>{
	public boolean search(T t);
}