package com.gj.simple;

import java.io.File;

public class Kachara {

	public static void main(String[] args) {
		
		File f=new File("C:/Ganesh-Tech-projects/mavenall/Spring-security-all-projects/ebulktemp/target/ebulktemp-0.0.1-SNAPSHOT/WEB-INF/lib");
		
		String [] files=f.list();
        
		for(String file : files){
			System.out.println(file);
		}
		
		
	}

}
