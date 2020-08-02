package com.gj.simple.interfaces;

public interface Display extends SuperDisplay {

	public void display();
	
	default void printMe(){
		System.out.println("Display printME");
	}
}
