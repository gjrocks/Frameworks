package com.gj.simple.oops;

public class DerivedDoit extends DoitBase implements IDo {

	public static void main(String[] ags){
		DerivedDoit v=new DerivedDoit();
		v.domeWork(); //it will call base class version of it
		
	}
	
	public void domeWork(){
		this.doit();//it will call base class version of it
		IDo.super.doit();//explict call to interface version
	}
}
