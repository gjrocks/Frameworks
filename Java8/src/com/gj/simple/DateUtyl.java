package com.gj.simple;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateUtyl {

	public static void main(String[] args) throws Exception{
	
		
		  java.util.Calendar aCalendar = java.util.Calendar.getInstance();
	        aCalendar.setTime(new Date());
	        aCalendar.add(java.util.Calendar.DATE, -1);
	        aCalendar.set(Calendar.HOUR_OF_DAY, 23);
	        aCalendar.set(Calendar.MINUTE, 59);
	        aCalendar.set(Calendar.SECOND, 59);
	        aCalendar.set(Calendar.MILLISECOND, 0);
	        System.out.println(aCalendar);
	        
	        final SimpleDateFormat df = new SimpleDateFormat("dd-MMM-yyyy HH:mm:ss");
	        Date d = null;

	        try {
	         System.out.println(df.format(aCalendar.getTime()));
	        } catch (Exception pe) {
	          pe.printStackTrace();
	        }

	}

}
