package com.gj.simple.oops;

public interface IDo {

	public default void doit(){
		System.out.println("interface Do it");
	}
}
