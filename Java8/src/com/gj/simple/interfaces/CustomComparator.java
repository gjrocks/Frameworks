package com.gj.simple.interfaces;

import java.util.Comparator;
import java.util.function.Function;



@FunctionalInterface
public interface CustomComparator<T> extends Comparator<T> {

	public int compare(T p1, T p2);

	public static<U> CustomComparator<U> comparing(Function<U, Comparable> agefn){
		return (p1,p2)->agefn.apply(p1).compareTo(agefn.apply(p2));
	}

	public default CustomComparator<T> thenCustomComparing(CustomComparator<T> other){
		return (p1,p2)->compare(p1,p2)==0?other.compare(p1, p2):compare(p1,p2);
	}

	public default CustomComparator<T> thenCustomComparing(Function<T, Comparable> other){
		CustomComparator<T> cust=comparing(other);
		return thenCustomComparing(cust);
	}
}
