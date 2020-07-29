package com.gj;

public class StringOperations {

	public static void main(String[] args) {
		

	}
	
	public StringOperations()
	{
		System.out.println("Callled");
	}

	public String getCap(String n)
	{
		System.out.println("Zolled " +n);
		if(n!=null)
			return n.toUpperCase();
		else
			return "null";
	}
}
