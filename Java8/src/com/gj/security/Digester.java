/*
 * Copyright (c) 2008 Nick Allen.  All rights reserved.
 * Distribution and use of this source code (or the application compiled from this source code) 
 * and associated documentation ("Software"), with or without modification is prohibited.
 */
package com.gj.security;

import java.io.UnsupportedEncodingException;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.Security;
import java.security.spec.InvalidKeySpecException;
import java.util.HashMap;
import java.util.Map;

import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;

import org.apache.commons.codec.binary.Base64;
import org.apache.log4j.Logger;

import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.jasypt.salt.RandomSaltGenerator;

public class Digester implements IDigester {

	public static Map<Long, String> saltmap=new HashMap<Long,String>();
	public static Map<Long, String> usermap=new HashMap<Long,String>();
	public static Map<Long, String> passwordmap=new HashMap<Long,String>();
	  private String algorithmName = "SHA-256";
	    // this refers to bouncycastle provider
	    private String providerName  = "BC"; 
	    
	    private static int DEFAULT_ITERATIONS=10000;
	    private static int DEFAULT_KEYLENGTH=256;
	    private static int DEFAULT_SALT_SIZE=32;
	    private static String DEFAULT_KEY_DEVIATION_ALGORITHM="PBKDF2WithHmacSHA512";
    static {
        Security.addProvider(new BouncyCastleProvider());
        usermap.put(1L, "xxxxx1");
        usermap.put(2L, "ganesh@Ad$1221");
        usermap.put(3L, "andy@12345£");
        try{
        saltmap.put(1L, encodeBase64(generateSaltBouncyCastle(DEFAULT_SALT_SIZE)));
        saltmap.put(2L, encodeBase64(generateSaltBouncyCastle(DEFAULT_SALT_SIZE)));
        saltmap.put(3L, encodeBase64(generateSaltBouncyCastle(DEFAULT_SALT_SIZE)));
        }catch(Exception t){
        	t.printStackTrace();
        }
    }
    
   
    
    
  
    
    public Digester() {
   
    }

    public Digester(String algorithmName,String providerName)  {
        this.algorithmName = algorithmName;   
        this.providerName = providerName;
    }

    public byte[] createDigest(String data) throws Exception {
       
        try {
            final byte[] dataAsBytes = data.getBytes(DEFAULT_CHARSET);
            
            MessageDigest md = null;
            
           System.out.println("createDigest: algorithm=" + algorithmName+";providerName="+providerName);
            
            if (this.providerName != null) {
                md = MessageDigest.getInstance(this.algorithmName, this.providerName);
            } else {
                md = MessageDigest.getInstance(this.algorithmName);
            }
            
            final byte[] digest = md.digest(dataAsBytes);
            
             System.out.println("digest=" + digest);
            
            return digest;
            
        } catch (UnsupportedEncodingException uee) {
            System.out.println("Exception caught converting String to bytes, message: " + uee.getMessage());
        }
        
        return null;
    }
    
    
    public static byte[] hashPassword( final char[] password, final byte[] salt){
    	return hashPassword(DEFAULT_KEY_DEVIATION_ALGORITHM,password,salt,DEFAULT_ITERATIONS,DEFAULT_KEYLENGTH);
    }
    		
    public static byte[] hashPassword( final String algorithm,final char[] password, final byte[] salt, final int iterations, final int keyLength ) {
    	 
        try {
            SecretKeyFactory skf = SecretKeyFactory.getInstance(algorithm);
            PBEKeySpec spec = new PBEKeySpec( password, salt,iterations,keyLength);
            SecretKey key = skf.generateSecret( spec );
            byte[] res = key.getEncoded( );
            return res;
  
        } catch( NoSuchAlgorithmException | InvalidKeySpecException e ) {
            throw new RuntimeException( e );
        }
    }
    
    public String createEncodedDigest(String s) throws Exception {
    
        final byte[] digest = createDigest(s);
    
        byte[] encodedBytes = new Base64().encode(digest);
        
        return new String(encodedBytes, DEFAULT_CHARSET);
    }  
    
    public static String encodeBase64(byte [] val) throws Exception{
    	return new String(new Base64().encode(val),DEFAULT_CHARSET);
    }
    
    public static byte[] decodeBase64(String val) throws Exception{
    	return  new Base64().decode(val.getBytes());
    }
   
    public static byte[] generateSaltSunPlatform(int length) throws Exception{
    	byte [] rndBytes=new byte[length];
        SecureRandom rnd=SecureRandom.getInstance("SHA1PRNG","SUN");
        rnd.nextBytes(rndBytes);
       // System.out.println("JJ :" +new String(new Base64().encode(rndBytes),DEFAULT_CHARSET));
        return rndBytes;
    }
 
    public static byte[] generateSaltNativePlatform(int length) throws Exception{
    	 byte [] rndBytes=new byte[length];
    	 SecureRandom rnd=SecureRandom.getInstance("NativePRNG","SUN");
    	 rnd.nextBytes(rndBytes);
        // System.out.println("JJ :" +new String(rndBytes,DEFAULT_CHARSET));
        return rndBytes;
    }
    
    public static byte[] generateSaltBouncyCastle(int length) throws Exception{
        byte [] rndBytes= new RandomSaltGenerator().generateSalt(length);
        System.out.println("JJ :" +new String(rndBytes,DEFAULT_CHARSET));
       // System.out.println("JJ :" +new String(new Base64().encode(rndBytes),DEFAULT_CHARSET));
        return rndBytes;
    }
    
    
    @Override
	public String createEncodedDigest(String password, String salt) throws Exception{
		// decode salt get bytes[]
    	//char[] from password
    	//get hashpassword
    	//encode above hashpassword
    	/*char[] passwordchars=password.toCharArray();
    	byte [] saltBytes=salt.getBytes();
        return encodeBase64(hashPassword(passwordchars, saltBytes));*/
    	String newPassword=new StringBuilder().append(salt).append(password).toString();
    	return createEncodedDigest(newPassword);
	}
    
    
    public static void main(String[] args) throws Exception {
    
    	//Digester obj = new Digester();
       /* Digester obj = new Digester();
        
        String password="xxxxx1";
        String salt="poka1212121ljksdjksldksldksldksldksldksldlsd34343434343";
        System.out.println("digest='"+obj.createEncodedDigest(password)+"'");
        char [] passwordbytes=password.toCharArray();
        byte [] saltbytes=salt.getBytes(DEFAULT_CHARSET);
        
        System.out.println("Salt Bytes length" + saltbytes.length);
         long start=System.currentTimeMillis();
        byte[] ret=hashPassword(passwordbytes, saltbytes, 10000, 256);
        long end=System.currentTimeMillis();
        System.out.println("Time it took" +(end-start));
        byte[] encodedBytes = new Base64().encode(ret);
        System.out.println("Final salt plus :"+new String(encodedBytes, DEFAULT_CHARSET));*/
    	
    	/*byte [] u=generateSaltBouncyCastle(32);
    	String encodedU= new String(new Base64().encode(u),DEFAULT_CHARSET);
    	System.out.println(encodedU);
    	byte [] u1=new Base64().decode(encodedU.getBytes());
    	String encodedU1= new String(new Base64().encode(u1),DEFAULT_CHARSET);
    	System.out.println(encodedU1);*/
    	
    	//generateSaltNativePlatform(32); //not working
    	//generateSaltSunPlatform(32);
    	
    	/*usermap.keySet().stream()
    	                .forEach(key->{
    	                	try{
    	                	String plainpassword=usermap.get(key);
    	                	String salt=saltmap.get(key);
    	                	byte[] password=hashPassword(plainpassword.toCharArray(), salt.getBytes());
    	                	String passwordHashSalt=encodeBase64(password);
    	                	passwordmap.put(key,passwordHashSalt);
    	                	}catch(Exception y){
    	                	y.printStackTrace();	
    	                	}
    	                	
    	                });
    	
    	
    	System.out.println(passwordmap);
    	
    	*/
    	/*Long userid=1L;
    	String password="xxxxx1";
    	//String salt=saltmap.get(userid);
    	String salt=encodeBase64(generateSaltBouncyCastle(32));
    	System.out.println(salt);
    	String hashedSaltedPassword=encodeBase64(hashPassword(password.toCharArray(), salt.getBytes()));
    	System.out.println(hashedSaltedPassword);
    	*/
    	String salt=generateEncodedSalt();
    	System.out.println("salt Hash to store :" + salt);
    	 String password="xxxxx1";
    	 String completePassword=salt+password;
    	 
    	 System.out.println("Comp : 1 :" +completePassword);
    	 //System.out.println("Comp :2" +new StringBuilder().append(salt).append(password).toString());
          System.out.println("Final hash :" +new Digester().createEncodedDigest(password, salt));    	 
    }
    
   
	public static String generateEncodedSalt() throws Exception {
		return generateEncodedSaltBouncyCastle();
	}

	 public static String generateEncodedSaltBouncyCastle() throws Exception{
	        byte [] rndBytes= new RandomSaltGenerator().generateSalt(DEFAULT_SALT_SIZE);
	        return encodeBase64(rndBytes);
	    }
}
