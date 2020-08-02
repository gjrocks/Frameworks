package com.gj.simple.interfaces;

public class TestInterfaces implements Display,Display2{


	public static void main(String[] args){
		Display d=new TestInterfaces();
				d.display();
				d.printMe();
		Display2 d2=new TestInterfaces();
		d2.display();
		d2.printMe();
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
		System.out.println("TestInterfaces");
		
	}


	@Override
	public void printMe() {
		Display.super.printMe();
	}

	/*@Override
	public void printMe() {
		Display2.super.printMe();
	}*/
}
