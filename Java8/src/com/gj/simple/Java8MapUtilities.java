package com.gj.simple;

import java.util.HashMap;
import java.util.Map;

public class Java8MapUtilities {

	public static void main(String[] args) {
	
		
		Map<String,String> mp=new HashMap<>();
		
        mp.put("Ganesh", "9531");
        mp.put("aarvi", "9532");
        mp.put("Bhavna", "9535");
        mp.put("Sanu", "9538");
        
        
        System.out.println(mp.containsKey("Ganesh"));
        mp.putIfAbsent("sidhu", "9878");
        System.out.println(mp.containsKey("sidhu") + " Value :" + mp.get("sidhu"));
        mp.put("sidhu", "9999");
        System.out.println(mp.containsKey("sidhu") + "Value :" + mp.get("sidhu"));
        mp.putIfAbsent("sidhu", "9765");
        System.out.println(mp.containsKey("sidhu") + "Value :" + mp.get("sidhu"));
        
        mp.merge("sidhu", mp.get("sidhu"), (key,value)->{if(value.equals("9999"))
        	return "10000";
        return value;
        });
        System.out.println(mp.containsKey("sidhu") + "Value :" + mp.get("sidhu"));
        
       mp.compute("sidhu", (key, value)->{if(value.equals("10000")) return "1"; return value;}); 
       System.out.println(mp.containsKey("sidhu") + "Value :" + mp.get("sidhu"));
       
       mp.computeIfAbsent("piku", (String key)->{return null;});
       mp.computeIfPresent("piku", (String key, String value)->{
    	   if(mp.get(key).equals("-1"))
    		   return "87462";
    	   return "-1";
       });
       
       
       mp.forEach((key,value)->System.out.println(value));
	}

}
