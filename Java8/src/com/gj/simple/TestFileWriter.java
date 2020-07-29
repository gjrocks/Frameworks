package com.gj.simple;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class TestFileWriter {

	public static void main(String[] args) throws Exception {
		
		
		File di=new File("C:\\ebulk-code-git\\ebulk\\cheqs\\WebContent\\WEB-INF\\lib");
		
		
		for (File f:di.listFiles()){
			System.out.println(f.getName());
			
			/*
		
		FileWriter wt=new FileWriter(new File("C:/ebulk/97-devops/from-server/masking/invoice-fix-sept/reports/masked_records_output/"+f.getName()));
		
		BufferedReader rd=new BufferedReader(new FileReader(f));
		
		String str=null;
		
		while((str=rd.readLine())!=null){
			
			//System.out.println("INSERT INTO `ref_documents_rule` (`rdr_rid_id`, `rdr_application_category`, `rdr_crb_route`, `rdr_document_sequence`, `rdr_valid`) VALUES ('"+str+"','NON_EEA_PAID','5','3','1');");
			wt.write(str);
			wt.write("\n");
		}
		
          wt.close();
          rd.close();
		*/}
		  
	}

}
