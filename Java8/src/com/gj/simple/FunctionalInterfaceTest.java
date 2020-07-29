package com.gj.simple;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class FunctionalInterfaceTest {

	public static void main(String[] args) {
		// interface which return void , takes void   Runnable
		System.out.println("in main thread : " + Thread.currentThread().getName());
		
		//traditional
		 Thread t=new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("in thread : " + Thread.currentThread().getName());
				
			}
		});
		
		 t.start();
		 
		 //lambda style
		 new Thread(()->{System.out.println("in lambda thread : " + Thread.currentThread().getName());}).start();
		   
		 //another example of custom functional interface like runnable
		 MyWork work = () -> {System.out.println("in mywork");};
		  work.doWork();
		 
		  
		  
		  
		  //Functional interface where it takes one parameter and returns  nothing
		  System.out.println("----------Functional interface where it takes one parameter and returns  nothing---------------");
		  Consumer<String> consumer=(name)->{System.out.println("hello :" +name);};
		  consumer.accept("ganesh");
		  consumer.accept("parag");
		  
		  List<String> li=Arrays.asList("12","2","3","5","26","7");
		  li.forEach(consumer);
		  MyConsumer v=(name) ->{System.out.println(name);};
		  li.forEach(v);
		//Functional interface where it takes two parameters and returns  nothing BiConsumer
		  System.out.println("----------Functional interface where it takes two parameters and returns  nothing---------------");
		  //traditional
		  BiConsumer<String,String> b=new BiConsumer<String, String>() {
			
			@Override
			public void accept(String t, String u) {
             System.out.println(t +"::" +u);	
			}
		};
		b.accept("ganesh", "jadhav");
		
		
		b=(t1,u1)->{ System.out.println(t1 +"::" +u1);};
		b.accept("bhavna", "jadhav");
		
	}

}


