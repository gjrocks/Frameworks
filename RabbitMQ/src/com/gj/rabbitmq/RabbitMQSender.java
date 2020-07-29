package com.gj.rabbitmq;

import java.util.Arrays;
import java.util.List;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;

public class RabbitMQSender {

	 private final static String QUEUE_NAME = "test";

	  public static void main(String[] argv) throws Exception {
	    ConnectionFactory factory = new ConnectionFactory();
	    factory.setHost("localhost");
	    Connection connection = factory.newConnection();
	    Channel channel = connection.createChannel();

	    channel.queueDeclare(QUEUE_NAME, true, false, false, null);
	   // String message = "Hello World!";
	     List<String> li=Arrays.asList("ganesh","Andy","Emma","Neeraj"); 
	    
	    li.forEach( name->{
	    	try{
	    		String message="hello "+name;
	    	channel.basicPublish("", QUEUE_NAME, null, message.getBytes("UTF-8"));
		    System.out.println(" [x] Sent '" + message + "'");
	    	}catch(Exception r){
	    		r.printStackTrace();
	    	}
	    });
	    

	    channel.close();
	    connection.close();
	  }
	

}
