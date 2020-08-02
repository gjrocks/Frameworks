package com.gj.simple;

import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

import com.gj.model.Gender;
import com.gj.model.Person;

public class MapReduceTest {

	public static void main(String[] args) {

		List<Person> li = Person.createShortList();

		li.stream().filter((Person p) -> {
			return p.getAge() > 16 && p.getAge() < 25 && p.getGender() == Gender.MALE;
		}).map((Person r) -> r.geteMail()).forEach(email -> System.out.println(email));

		System.out.println("Using generic process element");
		processElements(li,
				(Person p) -> {
					return p.getAge() > 16 && p.getAge() < 25 && p.getGender() == Gender.MALE;
				} , (Person p) -> p.geteMail(),

				(String email) -> System.out.println(email));
		
		
		//Collections.sort(li, (Person a, Person b)->{return Integer.compare(a.getAge(),b.getAge());});
		//Collections.sort(li,(Person a, Person b)-> Person.compareByAge(a,b));
		Collections.sort(li,Person::compareByAge);
		li.forEach(p-> System.out.println(p.getGivenName() + "::" +p.getAge()));
		
	}

	
	public static<X,Y> void processElements( Iterable<X> source,
			Predicate<X> tester,
			Function<X,Y> mapper,
			Consumer<Y> block
			){
		
		for(X p:source){
			if(tester.test(p)){
				Y data=mapper.apply(p);
				block.accept(data);
			}
		}
	}
	
}
