package com.gj;

public class Util {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	
	public static String initCap(String o)
	{
		String r=o.substring(1);
		char ch=o.charAt(0);
		String ui=(ch+"").toUpperCase();
		
		return ui+r; 
	}
}
