package com.gj.kachara;

import java.util.Random;

import org.apache.commons.lang.math.RandomUtils;
import org.apache.commons.validator.UrlValidator;

public class URLUtils {

	public static void main(String[] args) {
		/*UrlValidator urlValidator = new UrlValidator(UrlValidator.ALLOW_2_SLASHES);
		
		System.out.println(urlValidator.isValid("http://127.0.0.1/dbsbasicsubmitws/dbs/basic/submit"));
			String s=System.currentTimeMillis()+"";
			if(s.length()-10>0)
			System.out.println(s.substring(s.length()-10));
		*/
		 Random numGen =new Random();
	/*System.out.println(RandomUtils.nextInt(10));
	System.out.println(RandomUtils.nextInt(10));
	System.out.println(RandomUtils.nextInt(10));
	System.out.println(RandomUtils.nextInt(10));
	System.out.println(RandomUtils.nextInt(10));
	System.out.println(RandomUtils.nextInt(10));
	System.out.println(RandomUtils.nextInt(10));
	System.out.println(RandomUtils.nextInt(10));*/
	
	
	System.out.println(numGen.nextInt(10));
	System.out.println(numGen.nextInt(10));
	System.out.println(numGen.nextInt(10));
	System.out.println(numGen.nextInt(10));
	System.out.println(numGen.nextInt(10));
	System.out.println(numGen.nextInt(10));
	System.out.println(numGen.nextInt(10));
	System.out.println(numGen.nextInt(10));
	System.out.println(numGen.nextInt(10));
	}

}
