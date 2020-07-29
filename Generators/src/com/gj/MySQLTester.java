package com.gj;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class MySQLTester {

	public static void main(String[] args) throws Exception{
	
  Connection conn=DBProcessor.getConnection();
  
  int [] ids=new int[2];
  ids[0]=1;
  ids[1]=2;
  
  
  for(int i=0;i<ids.length;i++){
	  
	  String fileDL = "select * from anna where id="+ids[i];
	  try {
          Statement st = conn.createStatement();
          ResultSet rs = st.executeQuery(fileDL);
          while(rs.next()){
              Blob blob = rs.getBlob("data");
              InputStream input = blob.getBinaryStream();
              int fileSize = (int) blob.length();
              System.out.println(fileSize);
              
              OutputStream output=new FileOutputStream(new File("resources/"+i+".txt"));
              
              byte[] buffer = new byte[4096];
              int bytesRead = -1;

              while ((bytesRead = input.read(buffer)) != -1) {
                  output.write(buffer, 0, bytesRead);
              }
              input.close();
             output.close(); 
          }
          }catch(Exception r){
        	 r.printStackTrace(); 
          }
  }
  
	}

}
