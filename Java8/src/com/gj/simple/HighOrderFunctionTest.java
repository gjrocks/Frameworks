package com.gj.simple;

import java.util.function.Function;

public class HighOrderFunctionTest {

	public static void main(String[] args) {
	
		
		Function<Double,Double> add1= x->(double) x+1;
		System.out.println(add1.apply(1.0));
		
		Function<Integer,Integer> add1_1=HighOrderFunctionTest::incrementByOne;
		System.out.println(add1_1.apply(1));
		
		Function<Double,Double> multiply=x->x*10;
		System.out.println(multiply.apply(12.0));
		
		
		System.out.println(multiply.apply(add1.apply(12.0)));
		
		java.util.function.BinaryOperator<Double> binaryOp = (Double a,Double b)->a+b; 
		System.out.println(binaryOp.apply(12.0, 13.0));
		
		/*
		 * T - the type of the first argument to the function
U - the type of the second argument to the function
R - the type of the result of the function
All Known Subinterfaces:
BinaryOperator<T>
Functional Interface:
This is a functional interface and can therefore be used as the assignment target for a lambda expression or method reference.

@FunctionalInterface
public interface BiFunction<T,U,R>
		 */
		java.util.function.BinaryOperator<Function<Double,Double>> composeOp = (a,b)->x->a.apply(b.apply(x));
		System.out.println(composeOp.apply(add1, multiply).apply(12.0));	
		
		//another way of composition
		System.out.println(add1.compose(multiply).apply(12.0));
	}

	public static Integer incrementByOne(Integer t){
		return (t+1);
	}
}
