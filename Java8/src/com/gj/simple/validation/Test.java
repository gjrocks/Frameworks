package com.gj.simple.validation;

public class Test {

	public static void main(String[] args) {
	    try{
	    	//
	    	String[] t="+44--12345-45545".split("-");
	    	System.out.println(t.length);
	    	for(int i=0;i<t.length;i++){
	    		System.out.println(t[i]);
	    	}
	    	Long.parseLong("0");
	    }catch(Exception e){
	    	e.printStackTrace();
	    }
		

	}
	

}
