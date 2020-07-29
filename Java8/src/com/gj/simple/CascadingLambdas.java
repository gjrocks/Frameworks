package com.gj.simple;

import java.net.URI;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class CascadingLambdas {

	public static void main(String[] args)  throws Exception{
	System.out.println("ganesh");

	
	Function<String, Integer> extractIntversion=(version) ->{
	    if(version!=null && version.length()>=2) {
	    	return Integer.parseInt(version.substring(1));
	    }
		return null;
	};
	
	//simple lambda to see if line contains word exception
	
	Predicate<String> pr=(line) ->line.indexOf("exception")!=-1;
	
	////simple lambda to see if line contains word customexception
	
	Predicate<String> pr2=(line) ->line.indexOf("customexception")!=-1;
	
	//so this is repetition  
	Function<String,Predicate<String>> strContainsPredicate=(String input) ->{
		Predicate<String> ret=(String predicateInput)->predicateInput.indexOf(input)!=-1;
		return ret;
	};
	
	
	//String test ="this is getting failed by exception at line number 120\n this one is wrong at line 123 customexception";
	
	Stream<String> lines=Files.lines(Paths.get(new URI("file:///C:/temp/cheqs_dev.log")));
	
	
	
	lines.filter(strContainsPredicate.apply("AuthenticationAction")).findFirst().ifPresent(System.out::println);
	
	
	
	System.out.println(extractIntversion.apply("v10"));
	
	
	
	
	}

	
	
}
