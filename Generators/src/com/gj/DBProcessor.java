package com.gj;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Properties;


public class DBProcessor {

	public static Properties props=new Properties(); 	
	
	public static Properties getProps() {
		return props;
	}
	public static void setProps(Properties props) {
		DBProcessor.props = props;
	}

/*	static{
		try{
			props=loadProperties("config.properties",props);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}*/
	
	
	public static String getProperty(String key)
	{
		return props.getProperty(key);
	}
	
	public static void main(String[] args) throws Exception {
		Connection conn=getConnection();
		//System.out.println(getColumnNames("REF_ENTITIES_RULES_M",conn));
		//System.out.println(conn);
		//List<RelationVO> li = ExportData.createRelationsMetaDataList();
		Map<String,String> y=getColumnNames("onedesk_ngv_invoice",conn);
		//createProc(li);
		System.out.println(y);
		FileWriter wt=new FileWriter(new File("C:/temp/java.java"));
		
		y.entrySet().stream()
		            .forEach(entry->{
		            	String key=entry.getKey();
		            	String value=entry.getValue();
		            	int inx=key.indexOf("_");
		            	String variable="";
		            	String dataType="";
		            	if(inx!=-1) {
		            		String [] arr=key.split("_");
		            		variable=variable+arr[0]+Util.initCap(arr[1]);
		            	}else {
		            		variable=variable+key;
		            	}
		            	if(value.indexOf("VARCHAR")!=-1 || value.indexOf("TEXT")!=-1) {
		            		dataType="java.lang.String";
		            	}
		            	if(value.indexOf("INT")!=-1) {
		            		dataType="java.lang.Integer";
		            	}
		            	if(value.indexOf("DECIMAL")!=-1) {
		            		dataType="java.lang.Double";
		            	}
		            	if(value.indexOf("DATE")!=-1 || value.indexOf("DATETIME")!=-1) {
		            		dataType="java.util.Date";
		            	}
					try {
						wt.write("\n");
						wt.write("@Column(name=\""+key+"\")");
						wt.write("\n");
						wt.write(dataType + " " + variable +";");
						wt.write("\n");
						
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
		        		            	
		            });
		 wt.close();
		//System.out.println("done");
	}
	public static Properties loadProperties(String fileName,Properties temp) {
		try{
			
			InputStream fin=Thread.currentThread().getContextClassLoader().getSystemResourceAsStream(fileName);
			temp.load(fin);
		//	System.out.println("Properties loaded");
		}catch(Exception exp)
		{
			exp.printStackTrace();
		}
		return temp;
	}

	public static Connection getConnection()
	 {
		Connection conn=null;
		try{
		if(props.size()==0)
			loadProperties("db.properties",props);
		   
		
		  /*  String dbServer=props.getProperty(mode.toLowerCase()+".db.server");
		    
		    
		    if(dbServer!=null && dbServer.equalsIgnoreCase("oracle"))
		    {
		//	DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
			conn=DriverManager.getConnection("jdbc:oracle:thin:@"+props.getProperty(mode+".db.host.name")+":"+props.getProperty(mode+".db.port")+":"+props.getProperty(mode+".db.service.id"),props.getProperty(mode+".db.usr"),props.getProperty(mode+".db.pwd"));
		    }
		    if(dbServer!=null && dbServer.equalsIgnoreCase("mssql"))
		    {
		    //	DriverManager.registerDriver(new net.sourceforge.jtds.jdbc.Driver());
		    	String url="jdbc:jtds:sqlserver://"+props.getProperty(mode+".db.host.name")+":"+props.getProperty(mode+".db.port")+"/"+props.getProperty(mode+".db.service.id")+"";
			     System.out.println(url);
		    	conn=DriverManager.getConnection(url,props.getProperty(mode+".db.usr"),props.getProperty(mode+".db.pwd"));
		    }*/
		String url=props.getProperty("jdbc.url");
		
//	DriverManager.registerDriver(new com.mysql.jdbc.Driver());
		Class.forName("com.mysql.jdbc.Driver");
		conn=DriverManager.getConnection(url,props.getProperty("jdbc.username"),props.getProperty("jdbc.password"));
			System.out.println(conn);		
		}catch(Exception exp)
		{
			exp.printStackTrace();
		}
		return conn;
		
	 }
	
	
	
	public static Connection getConnection(String h)
	 {
		Connection conn=null;
		try{
		if(props.size()==0)
			loadProperties("config.properties",props);
		
		    String dbServer=props.getProperty("db.server");
		    if(dbServer!=null && dbServer.equalsIgnoreCase("oracle"))
		    {
			//DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
			conn=DriverManager.getConnection("jdbc:oracle:thin:@"+props.getProperty("db.host.name")+":"+props.getProperty("db.port")+":"+props.getProperty("db.service.id"),props.getProperty("data.source.company.usr"),props.getProperty("data.source.company.pwd"));
		    }
		    if(dbServer!=null && dbServer.equalsIgnoreCase("mssql"))
		    {
		  //  	DriverManager.registerDriver(new net.sourceforge.jtds.jdbc.Driver());
		    	String url="jdbc:jtds:sqlserver://"+props.getProperty("db.host.name")+":1433/"+props.getProperty("db.service.id")+"";
			System.out.println(url);
		    	conn=DriverManager.getConnection(url,props.getProperty("data.source.company.usr"),props.getProperty("data.source.company.pwd"));
		    }
			System.out.println(conn);		
		}catch(Exception exp)
		{
			exp.printStackTrace();
		}
		return conn;
		
	 }
	 
	 
	 public static void closeResource(Object obj)
	 {
		try{
			if(obj!=null && obj instanceof java.sql.Connection)
			{
			   Connection conn=(Connection)obj;
			// System.out.println("Connection closed");
			   conn.close();
			}
			if(obj!=null && obj instanceof java.sql.PreparedStatement)
			{
				PreparedStatement ps=(PreparedStatement)obj;
				//System.out.println("PreparedStatement is closed");
			    ps.close();
			}
			if(obj!=null && obj instanceof java.sql.ResultSet)
			{
				ResultSet ps=(ResultSet)obj;
				//System.out.println("ResultSet is closed");
			    ps.close();
			}
			
			
		}catch(Exception exp)
		{
			exp.printStackTrace();
		}
	 }
	
	 public static Map<String,String> getColumnNames(String tableName,Connection conn) {
			
			if(conn==null)
			conn=getConnection();
			PreparedStatement pstmt=null;
			ResultSet rs=null;
			ResultSetMetaData rtmt=null;
			Map<String,String> cols=new LinkedHashMap<String,String>();
			if(conn==null)
				return null;
			
			try{
			 pstmt=conn.prepareStatement("select * from "+tableName +" where 1=2");
			  rs=pstmt.executeQuery();
			rtmt=rs.getMetaData();
			
			int colCnt=rtmt.getColumnCount();
			for(int i=1;i<=colCnt;i++)
			{
				String columnName=rtmt.getColumnName(i);
				String colType=rtmt.getColumnTypeName(i) +"("+rtmt.getColumnDisplaySize(i)+")";
				
			    cols.put(columnName,colType);	
			}
			}catch(Exception exp)
			{
				exp.printStackTrace();
			}finally{
				closeResource(rs);
				closeResource(pstmt);
				}
			return cols;
		}
	 private static String getRowCount(String name, Connection conn) {
			
			PreparedStatement ps=null;
			ResultSet rs=null;
			int cnt=0;
			try{
				
			ps=conn.prepareStatement("select count(*) from "+name);
			rs=ps.executeQuery();
			while(rs.next())
				cnt=rs.getInt(1);
				
			closeResource(rs);
			closeResource(ps);
			}catch(Exception exp)
			{
				exp.printStackTrace();
			}
			 return cnt+"";
			 
			}
	public static int getColumnCount(String tableName) {
		
		PreparedStatement ps=null;
		ResultSet rs=null;
		Connection conn=null;
		int cnt=0;
		try{
		conn=getConnection();	
		ps=conn.prepareStatement("select * from "+ tableName);
		rs=ps.executeQuery();
		return rs.getMetaData().getColumnCount();
			}catch(Exception exp)
		{
			exp.printStackTrace();
		}finally{
			closeResource(rs);
			closeResource(ps);
			closeResource(conn);
		}
		 
		 
		
		return 0;
	}
	
	public static String getDBType()
	{
		return (String)props.get("db.server");
	}
	
	
}
