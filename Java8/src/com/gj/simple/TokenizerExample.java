package com.gj.simple;

import com.gj.simple.interfaces.Display;
import com.gj.simple.interfaces.Display2;

public class TokenizerExample implements Display, Display2 {

	public static void main(String[] args) throws Exception {

		/*String f = "::DM:";
		String[] t = f.split(":");
		
		 * for(int i=0;i<t.length;i++){ System.out.println(i+"-->"+t[i]); }
		 
		System.out.println("fganesh".substring(0, "fganesh".length() - 1));
		List<String> li = new ArrayList<String>(Arrays.asList(new String[3]));

		System.out.println(li.size());*/

		Display y = (Display) new TokenizerExample();

		y.display();
		Display2 y2 = new TokenizerExample();
		y2.display();
	}

	@Override
	public void display() {
		System.out.println("hanesh");
	}

	@Override
	public void printMe() {
		
		Display.super.printMe();
	}

}
