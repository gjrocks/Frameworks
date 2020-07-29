package com.gj.model;


import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class RefereneDataTester {

	public static void main(String[] args) {
		
		
		
		SortedSet<ReferenceData> sorted=new TreeSet<ReferenceData>();
		Set<ReferenceData> plain=new HashSet<ReferenceData>();
		ReferenceData t=new ReferenceData();
        t.setDisplayText("ganesh");
        
        ReferenceData t1=new ReferenceData();
        t1.setDisplayText("a");
        
        ReferenceData t2=new ReferenceData();
        t2.setDisplayText("a");
        plain.add(t);
        plain.add(t1);
        plain.add(t2);
        
        
        sorted.add(t);
        sorted.add(t1);
        sorted.add(t2);
        
        System.out.println(plain.size());
        System.out.println(sorted.size());
        
        System.out.println(t1.equals(t2));
       
        
	}

}
