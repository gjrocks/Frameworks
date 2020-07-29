package com.gj.security;

public interface IDigester {

    public static final String DEFAULT_CHARSET = "UTF8";
    
    public byte[] createDigest(String data) throws Exception ;
    
    public String createEncodedDigest(String data) throws Exception ;
    
    public String createEncodedDigest(String password, String salt) throws Exception;
}
