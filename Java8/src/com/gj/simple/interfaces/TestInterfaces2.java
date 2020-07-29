package com.gj.simple.interfaces;

public class TestInterfaces2 implements Display,SuperDisplay{


	public static void main(String[] args){
		SuperDisplay d=new TestInterfaces2();
				d.display();
				d.printMe();
		
	}

	
	/*public void main(String[] args,int ds){
		Display d=new TestInterfaces();
				d.display();
		Display2 d2=new TestInterfaces();
		d2.display();
	}

	public void m(){
		
	}
	public static void m(String h){
		
	}
	*/
	@Override
	public void display() {
		System.out.println("ganesh");
		
	}


	/*@Override
	public void printMe() {
	  Display.super.printMe();
	}*/

	/*@Override
	public void printMe() {
		Display2.super.printMe();
	}*/
}
