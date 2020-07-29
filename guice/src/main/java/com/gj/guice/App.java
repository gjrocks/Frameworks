package com.gj.guice;

import com.google.inject.Guice;
import com.google.inject.Injector;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        Injector injector = Guice.createInjector(new DummyModule());
        HttpService comms = injector.getInstance(HttpService.class);
        System.out.println(comms);
    }
}
