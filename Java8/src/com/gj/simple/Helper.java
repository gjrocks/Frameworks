package com.gj.simple;

import java.util.ArrayList;

public class Helper {

	public static void main(String[] args) throws Exception {
	
		ArrayList<String> a=new ArrayList<>();
		a.add("006");a.add("010");a.add("012");a.add("101");a.add("102");a.add("103");a.add("104");a.add("105");a.add("106");a.add("107");a.add("108");a.add("109");a.add("112");a.add("113");a.add("114");a.add("115");a.add("123");a.add("124");a.add("125");a.add("126");a.add("127");a.add("128");a.add("129");a.add("130");a.add("131");a.add("132");a.add("133");a.add("134");a.add("135");a.add("136");a.add("155");a.add("156");a.add("157");
	
	a.stream()
	 .forEach(val->{System.out.println("_"+val+"("+val+"),");});
	}

}
