package com.gj;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import org.apache.commons.cli.ParseException;
import org.apache.commons.lang.time.DateUtils;


public class DateTester {

	/*private static final String[] DATE_FORMATS = new String[] {
        "yyyy-MMZ", "yyyy-MM-ddZ"
        };
	*/
	private static final String[] DATE_FORMATS = new String[] {
        "yyyy-MMZ"
        };
	public static void main(String[] args) throws Exception
	{
		//System.out.println(TimeZone.getDefault());
		Date aDate=new Date();
		DateFormat df = DateFormat.getInstance();
		System.out.println(df.format(aDate));
		df.setTimeZone(TimeZone.getTimeZone("UTC"));
		Date utcDate=getUTCDate(aDate);
		System.out.println(df.format(utcDate));
		/*String formattedUTCDate=formatDate(utcDate);
		System.out.println(formattedUTCDate);
		System.out.println(convertToXMLGregorianCalendar(utcDate));*/
		//System.out.println(convertToXMLGregorianCalendar(parse(df.format(getUTCDate(aDate)));
	}
	
	 public static java.util.Date getUTCDate(java.util.Date aDate)
	    {
	    	Calendar c = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
	    	c.setTime(aDate);
	    	return c.getTime();
	    }
	 
	    public static XMLGregorianCalendar convertToXMLGregorianCalendar(Date date) {/*
	    	if (date == null) return null;

	        DateWrapper dw = new DateWrapper(date);
	        XMLGregorianCalendar xmlCalender=null;
	        GregorianCalendar calender = new GregorianCalendar();
	        try {
	        	DatatypeFactory factory = DatatypeFactory.newInstance();
	        	calender.setTime(date);
	        	xmlCalender = DatatypeFactory.newInstance().newXMLGregorianCalendar(calender);
	        	return xmlCalender;
	        	//return factory.newXMLGregorianCalendar( new GregorianCalendar(dw.getYear(), (dw.getMonth() -1), dw.getDay()));
	        } catch (DatatypeConfigurationException e) {
				System.out.println("Failed to convert "+dw.getDateString()+" to XMLGregorianCalendar; reason="+e.getMessage());
				return null;
			}

	    */
	    	return null;
	    	}
	    
	    public static XMLGregorianCalendar convertToXMLGregorianCalendar(String date) {
	    	if (date == null) return null;

	       // DateWrapper dw = new DateWrapper(date);
	    	XMLGregorianCalendar xmlCalender=null;
	        GregorianCalendar calender = new GregorianCalendar();
	       // calender.setTime(Util.stringToJavaDate(date));
	      //  xmlCalender = DatatypeFactory.newInstance().newXMLGregorianCalendar(calender);
	        
	        try {
	        	DatatypeFactory factory = DatatypeFactory.newInstance();
	        	
	        	return factory.newXMLGregorianCalendar( date);
	        } catch (DatatypeConfigurationException e) {
				System.out.println("Failed to convert "+date+" to XMLGregorianCalendar; reason="+e.getMessage());
				return null;
			}

	    }
	    //1989-04-02+01:00
	public static Date parse(String date) {

		Date parsedDate = null;
		try {
			parsedDate = DateUtils.parseDate(date, DATE_FORMATS);
		} catch (Exception e) {
			System.out.println("dates should be in valid format" + e);
			return null;
		}
		return parsedDate;
	}
	
	public static String formatDate(Date dt) throws Exception
	{
		DateFormat formatter = new SimpleDateFormat("yyyy-MM-ddZ");
		return formatter.format(dt);
		
	}
}
