package com.gj.simple.interfaces;

public interface SuperDisplay {

public void display();
	
	default void printMe(){
		System.out.println("SuperDisplay printME");
	}
}
