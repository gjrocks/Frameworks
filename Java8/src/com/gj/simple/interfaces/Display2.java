package com.gj.simple.interfaces;

public interface Display2 extends SuperDisplay {

	public void display();
	
	default void printMe(){
		System.out.println("Display2 printME");
	}
}
