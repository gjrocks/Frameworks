package com.gj.simple;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

import com.gj.model.Person;

public class FunctionalUtility {

	public static void main(String[] args) {
		List<Person> li=Person.createShortList();
        System.out.println("original Size :" +li.size());
        //all duplicate ( based on person.equals) are not added. the already added element is kept as it is.
        Set<Person> st=transformCollection(li, HashSet::new);
        System.out.println("new Size :" +st.size());
        //st.forEach((Person p)->{System.out.println(p.toString());});
        checkPredicate();
	}
	
	
	public static<T, DEST extends Collection<T>,SRC extends Collection<T>> DEST transformCollection(SRC collectionSRC,Supplier<DEST> factry){
		DEST result=null;
		result=factry.get();
		for(T temp:collectionSRC){
			result.add(temp);
		}
		return result;
	}

	//process each element from collection
	
	public static<X,Y> void processEachElement(Iterable<X> source,
			 Predicate<X> tester,
			 Function<X,Y> mapper,
			 Consumer<Y> applyprocess){
		
	     for(X temp:source){
	    	if(tester.test(temp)){
	    		Y outObj=mapper.apply(temp);
	    		applyprocess.accept(outObj);
	    	}
	     }
	}
		
	//in single parameter, output boolean
	public static void checkPredicate(){
		
		Predicate<String> isEmpty = String::isEmpty;
		System.out.println(isEmpty.test(""));
		System.out.println("".isEmpty());
		
		Predicate<String> isEmpty_=(String p)-> p.length()==0;
		System.out.println(isEmpty_.test(""));
		
		Predicate<String> isNumber=org.apache.commons.lang.math.NumberUtils::isNumber;
		Predicate<String> isBoolean=FunctionalUtility::isBooleanType;
		System.out.println(isEmpty.negate().and(isNumber).test("123"));
		System.out.println(isNumber.test("122"));
		
		Arrays.asList("true","false","ganesh","temp").stream()
		                                              .filter(isBoolean.negate())
		                                              .forEach(y->System.out.println(y));
		
	}
	
	public static boolean isBooleanType(String value) {
		if(value.equalsIgnoreCase("true") || value.equalsIgnoreCase("false"))
		return true;
		return false;
	}
}
