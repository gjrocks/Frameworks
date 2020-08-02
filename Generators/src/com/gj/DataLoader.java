package com.gj;

import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.Random;
import java.sql.PreparedStatement;

public class DataLoader {

	public static Properties data=new Properties();
	public static String[] titles=null;
	public static String[] fnames=null;
	public static String[] lnames=null;
	public static String[] mnames=null;
	public static String[] rnames=null;
	public static String[] rnames2=null;
	public static String[] housenames=null;
	public static String[] city=null;
	public static String[]  company=null;
	public static String[]  courses=null;
	public static String[]  coursesduration=null;
	public static String dummy="this is test";
	
	public static void main(String[] args)  throws Exception{
	
System.out.println("Start :" +System.currentTimeMillis());
		data=DBProcessor.loadProperties("data.properties", data);
		prepareData(data);
		Map<String, Object> mp=new HashMap<String,Object>();
		//getMapForInserts(mp);
		
		Connection conn=DBProcessor.getConnection();
	for(int j=0;j<5000;j++)	
	{
		getMapForInserts(mp);
	insertResume(conn,mp);
	insertPerson(conn, mp);
	for(int i=0;i<2;i++)
	{
	insertAddress(conn, mp);
	insertEducation(conn, mp);
	getMapForInserts2(mp);
	}

	}
	
	
	Map<String,String> col=DBProcessor.getColumnNames("EDUCATION", conn);
		String b="";
		String c="?,";
		String g="";
		System.out.println(col.size());
		int i=1;
		for (Map.Entry<String, String> ent : col.entrySet()) {
			
		String key=ent.getKey();
		String val=ent.getValue();
		
		if(val.equalsIgnoreCase("bigint"))
		{
			System.out.println("education_pt.setLong(" +i+",);");
			
		}
		if(val.equalsIgnoreCase("int"))
		{
			System.out.println("education_pt.setInt(" +i+",);");
			
		}
		
		if(val.equalsIgnoreCase("TINYINT"))
		{
			System.out.println("education_pt.setBoolean(" +i+",);");
			
		}
		if(val.equalsIgnoreCase("varchar"))
		{
			System.out.println("education_pt.setString(" +i+",);");
			
		}
		if(val.equalsIgnoreCase("date"))
		{
			System.out.println("education_pt.setDate(" +i+",);");
			
		}
		i++;
		
	   b=b+key+",";
			g=g+c;
			
			
		}
		
		System.out.println(b);
		System.out.println(g);
		DBProcessor.closeResource(conn);
		
	System.out.println("End :" +System.currentTimeMillis());
		
		//insert into resume (TITLE,EXPR,FULLNAME,DUMMYFIELD1,DUMMYFIELD2,DUMMYFIELD3,DUMMYFIELD4,DUMMYFIELD5,DUMMYFIELD6,DUMMYFIELD7,DUMMYFIELD8,DUMMYFIELD9,DUMMYFIELD10,DUMMYFIELD11,DUMMYFIELD12,CREATEDATE,UPDATEDATE) values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)
	}

	
	
	private static void getMapForInserts(Map<String, Object> mp) {
	
		mp.put("titles", getRandomVal(titles));
		mp.put("fnames", getRandomVal(fnames));
		mp.put("lnames", getRandomVal(lnames));
		mp.put("mnames", getRandomVal(mnames));
		mp.put("fullName", mp.get("fnames").toString() +mp.get("lnames").toString()+mp.get("mnames").toString());
		mp.put("rnames", getRandomVal(rnames));
		mp.put("rnames2", getRandomVal(rnames2));
		mp.put("date",getRandomDate());
		mp.put("sex", getRandomBoolean());
		mp.put("marriage", getRandomBoolean());
		mp.put("company", getRandomVal(company));
		mp.put("city", getRandomVal(city));
		mp.put("houses", getRandomVal(housenames));
		mp.put("courses", getRandomVal(courses));
		mp.put("coursesduration", getRandomVal(coursesduration));
		//public static String[]  courses=null;
		//public static String[]  coursesduration=null;
	}

	private static void getMapForInserts2(Map<String, Object> mp) {
		
		mp.put("rnames", getRandomVal(rnames));
		mp.put("rnames2", getRandomVal(rnames2));
		mp.put("city", getRandomVal(city));
		mp.put("houses", getRandomVal(housenames));
		mp.put("courses", getRandomVal(courses));
		mp.put("coursesduration", getRandomVal(coursesduration));
		//public static String[]  courses=null;
		//public static String[]  coursesduration=null;
	}

	private static Object getRandomBoolean() {
	int r=randInt(0, 1);
	if(r==0)
		return false;
	return true;
	}



	private static void prepareData(Properties data2) {
	
		titles=data2.getProperty("titles").split(",");
		 fnames=data2.getProperty("fnames").split(",");;
		 lnames=data2.getProperty("lnames").split(",");
		 mnames=data2.getProperty("mnames").split(",");
		 rnames=data2.getProperty("rnames").split(",");
		 rnames2=data2.getProperty("rnames2").split(",");
		 company=data2.getProperty("company").split(",");
		 city=data2.getProperty("city").split(",");
		 housenames=data2.getProperty("housenames").split(",");
		 courses=data2.getProperty("courses").split(",");
		 coursesduration=data2.getProperty("coursesduration").split(",");
		//public static String[]  courses=null;
			//public static String[]  coursesduration=null;
	}

	
	public static void insertEducation(Connection conn,Map<String,Object> mp) throws Exception
	{
		String sql="insert into education (ID,COURSENAME,COURSEDURATION,DUMMYFIELD1,DUMMYFIELD2,DUMMYFIELD3,DUMMYFIELD4,DUMMYFIELD5,DUMMYFIELD6,DUMMYFIELD7,DUMMYFIELD8,DUMMYFIELD9,DUMMYFIELD10,DUMMYFIELD11,DUMMYFIELD12,CREATEDATE,UPDATEDATE,PERSONID) values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
		PreparedStatement education_pt=conn.prepareStatement(sql);
		education_pt.setLong(1,0l);
		education_pt.setString(2,mp.get("courses").toString());
		education_pt.setInt(3,Integer.parseInt(mp.get("coursesduration").toString()));
		education_pt.setString(4,dummy);
		education_pt.setString(5,dummy);
		education_pt.setString(6,dummy);
		education_pt.setString(7,dummy);
		education_pt.setString(8,dummy);
		education_pt.setString(9,dummy);
		education_pt.setString(10,dummy);
		education_pt.setString(11,dummy);
		education_pt.setString(12,dummy);
		education_pt.setString(13,dummy);
		education_pt.setString(14,dummy);
		education_pt.setString(15,dummy);
		education_pt.setDate(16,(java.sql.Date)mp.get("date"));
		education_pt.setDate(17,(java.sql.Date)mp.get("date"));
		education_pt.setLong(18,(Long)mp.get("personID"));
		education_pt.executeUpdate();
	}
	
	
public static void insertAddress(Connection conn,Map<String,Object> mp) throws Exception
{
	String sql="insert into Address (ID,ROADNUM1,ROADNUM2,FULLNAME,HOUSENAME,CITY,COUNTRY,PIN,DUMMYFIELD1,DUMMYFIELD2,DUMMYFIELD3,DUMMYFIELD4,DUMMYFIELD5,DUMMYFIELD6,DUMMYFIELD7,DUMMYFIELD8,DUMMYFIELD9,DUMMYFIELD10,DUMMYFIELD11,DUMMYFIELD12,CREATEDATE,UPDATEDATE,PERSONID) values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
	PreparedStatement address_pt=conn.prepareStatement(sql);
	address_pt.setLong(1,0l);
	address_pt.setString(2,mp.get("rnames").toString());
	address_pt.setString(3,mp.get("rnames2").toString());
	address_pt.setString(4,mp.get("fullName").toString());
	address_pt.setString(5,mp.get("houses").toString());
	address_pt.setString(6,mp.get("city").toString());
	address_pt.setString(7,"india");
	address_pt.setInt(8,4122);
	address_pt.setString(9,dummy);
	address_pt.setString(10,dummy);
	address_pt.setString(11,dummy);
	address_pt.setString(12,dummy);
	address_pt.setString(13,dummy);
	address_pt.setString(14,dummy);
	address_pt.setString(15,dummy);
	address_pt.setString(16,dummy);
	address_pt.setString(17,dummy);
	address_pt.setString(18,dummy);
	address_pt.setString(19,dummy);
	address_pt.setString(20,dummy);
	address_pt.setDate(21,(java.sql.Date)mp.get("date"));
	address_pt.setDate(22,(java.sql.Date)mp.get("date"));
	address_pt.setLong(23,(Long)mp.get("personID"));
	address_pt.executeUpdate();
}
	
public static void insertPerson(Connection conn,Map<String, Object> mp) throws Exception
{
	String sql="INSERT INTO PERSON (ID,TITLE,AGE,FNAME,LNAME,MNAME,SEX,MARITALSTATUS,CURRENTCOMPANY,DUMMYFIELD1,DUMMYFIELD2,DUMMYFIELD3,DUMMYFIELD4,DUMMYFIELD5,DUMMYFIELD6,DUMMYFIELD7,DUMMYFIELD8,DUMMYFIELD9,DUMMYFIELD10,DUMMYFIELD11,DUMMYFIELD12,CREATEDATE,UPDATEDATE,RESUMEID) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
	PreparedStatement person_pt=conn.prepareStatement(sql);
	
	person_pt.setLong(1,0L);
	person_pt.setString(2,mp.get("titles").toString());
	person_pt.setInt(3,randInt(21, 100));
	person_pt.setString(4,mp.get("fnames").toString());
	person_pt.setString(5,mp.get("lnames").toString());
	person_pt.setString(6,mp.get("mnames").toString());
	person_pt.setBoolean(7,(Boolean)mp.get("sex"));
	person_pt.setBoolean(8,(Boolean)mp.get("marriage"));
	person_pt.setString(9,mp.get("company").toString());
	person_pt.setString(10,dummy);
	person_pt.setString(11,dummy);
	person_pt.setString(12,dummy);
	person_pt.setString(13,dummy);
	person_pt.setString(14,dummy);
	person_pt.setString(15,dummy);
	person_pt.setString(16,dummy);
	person_pt.setString(17,dummy);
	person_pt.setString(18,dummy);
	person_pt.setString(19,dummy);
	person_pt.setString(20,dummy);
	person_pt.setString(21,dummy);
	person_pt.setDate(22,(java.sql.Date)mp.get("date"));
	person_pt.setDate(23,(java.sql.Date)mp.get("date"));
	person_pt.setLong(24,(Long)mp.get("resumeID"));
	person_pt.executeUpdate();
	ResultSet rs=conn.prepareStatement("SELECT LAST_INSERT_ID()").executeQuery();
	Long resumeID=-1L;
	while(rs.next())
	{
		resumeID=rs.getLong(1);
	}
	
	System.out.println(resumeID);
	mp.put("personID",resumeID);
	
}
	public static void insertResume(Connection conn,Map<String, Object> mp) throws Exception
	{
		String sql="insert into resume (ID,TITLE,EXPR,FULLNAME,DUMMYFIELD1,DUMMYFIELD2,DUMMYFIELD3,DUMMYFIELD4,DUMMYFIELD5,DUMMYFIELD6,DUMMYFIELD7,DUMMYFIELD8,DUMMYFIELD9,DUMMYFIELD10,DUMMYFIELD11,DUMMYFIELD12,CREATEDATE,UPDATEDATE) values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
		PreparedStatement resume_pt=conn.prepareStatement(sql);
		resume_pt.setLong(1,0l);
		resume_pt.setString(2,mp.get("titles").toString());
		resume_pt.setInt(3,randInt(0, 10));
		resume_pt.setString(4,mp.get("fullName").toString());
		resume_pt.setString(5,dummy);
		resume_pt.setString(6,dummy);
		resume_pt.setString(7,dummy);
		resume_pt.setString(8,dummy);
		resume_pt.setString(9,dummy);
		resume_pt.setString(10,dummy);
		resume_pt.setString(11,dummy);
		resume_pt.setString(12,dummy);
		resume_pt.setString(13,dummy);
		resume_pt.setString(14,dummy);
		resume_pt.setString(15,dummy);
		resume_pt.setString(16,dummy);
		resume_pt.setDate(17,(java.sql.Date)mp.get("date"));
		resume_pt.setDate(18,(java.sql.Date)mp.get("date"));
		resume_pt.executeUpdate();
		System.out.println("insertedf");
		
		ResultSet rs=conn.prepareStatement("SELECT LAST_INSERT_ID()").executeQuery();
		Long resumeID=-1L;
		while(rs.next())
		{
			resumeID=rs.getLong(1);
		}
		
		System.out.println(resumeID);
		mp.put("resumeID",resumeID);
	}
	
	
	
	private static java.sql.Date getRandomDate() {
		
		Calendar calendar = new GregorianCalendar();

		calendar.set(Calendar.YEAR, randInt(2001, 2014));
		calendar.set(Calendar.MONTH, randInt(1, 11)); // 11 = december
		calendar.set(Calendar.DAY_OF_MONTH, randInt(1, 28)); // christmas eve
		java.util.Date dt=calendar.getTime();
		return new java.sql.Date(dt.getTime());
	}



	private static String getRandomVal(String[] str) {
	
		int rnt=randInt(0,str.length-1);
		return str[rnt];
	}



	public static int randInt(int min, int max) {

	    // Usually this can be a field rather than a method variable
	    Random rand = new Random();

	    // nextInt is normally exclusive of the top value,
	    // so add 1 to make it inclusive
	    int randomNum = rand.nextInt((max - min) + 1) + min;

	    return randomNum;
	}
	
	
}
