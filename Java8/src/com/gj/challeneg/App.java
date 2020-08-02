package com.gj.challeneg;

import java.net.URI;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

public class App {

	public static void main(String[] args) throws Exception {
	
		Stream<String> lines = Files.lines(Paths.get(new URI("file:///C:/temp/data.txt")));
		Map<String,Integer> libs=new HashMap<String, Integer>();
		lines.forEach( line ->{
			
			String [] tokens=line.split(",");
			String version1=tokens[2].trim().substring(1);
			int version=Integer.parseInt(version1);
			Integer val=libs.get(tokens[1]);
			if(val==null){
				libs.put(tokens[1], version);
			}else{ //computeif, putifpresent
				if(version>val){
					libs.put(tokens[1], version);
				}
			}
		});
		
		System.out.println(libs);
	}

}
