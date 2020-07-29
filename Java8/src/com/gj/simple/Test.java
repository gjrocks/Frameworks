package com.gj.simple;

import java.util.ArrayList;
import java.util.Arrays;

import com.gj.model.RoleType;


public class Test {

	public static void main(String[] args) {
		int x= 5_____3;

		//Arrays.asList(UserRoleType.values()).forEach(y->System.out.print(y+","));

		RoleType ganesh=new RoleType("ganesh","b");
		RoleType bhavna=new RoleType("bhavna","b");
		RoleType aarvi=new RoleType("aarvi","b");
		//!@\"#$%^&*,.;:_=<>?'`|+(){}\\[\\]\\-\\/\\\\]
		char[] CHAR_SPECIALS = { '!', '$', '*', '+', '-', '.', '=', '?', '@', '^', '_', '|', '~' };
		
		ArrayList<RoleType> li=new ArrayList();
	//	li.add(new String("ganesh"));//this wont compile, needs only RoleType
		li.add(ganesh);
	     RoleType temp=li.get(0);//this does not compel us to do type cast
	     //System.out.println(temp.getName());
		
	     li=new ArrayList<>();
	  //   li.add(new String("ganesh"));//this wont compile, needs only RoleType
			li.add(ganesh);
		    temp=li.get(0);//this does not compel us to do explicit type cast
		     //System.out.println(temp.getName());
		
		        
		     //System.out.println(3%10);
		     
		     
		     String a="ganesh";
		   //  System.out.println(a+'e');
		     a.charAt(0);
                  
		    Arrays.sort(CHAR_SPECIALS);
		    for(int i=0;i<CHAR_SPECIALS.length;i++){
		    	System.out.println(CHAR_SPECIALS[i]);
		    }
		     
	}

}
