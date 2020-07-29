package com.gj.simple.algo;

public class LinkedListAlgos {

	public static void main(String[] args) {
		
     Node head=new Node(1,new Node(2,
    	 		 new Node(3,new Node(4,null))));
   
    
     Node c,n,p,temp;
     c=head;
     n=null;
     p=null;
     temp=head;
     while(true) {
    	 System.out.println(temp.getData());
    	 if(temp.getNext()==null)
    		 break;
    	 else
    		 temp=temp.getNext();
     }
     Node prev=head;
     temp=head;
     Node originalHead=head;
     //head(1)-->2-->3-->4-->null
     while(c!=null) {
    	 n=c.getNext();
    	 c.setNext(p);
    	 p=c;
    	 c=n;
    	 
     }
head=p;    
     temp=head;
     while(true) {
    	 System.out.println(temp.getData());
    	 if(temp.getNext()==null)
    		 break;
    	 else
    		 temp=temp.getNext();
     }
	}
	

	
	
}

class Node{
	int data;
	Node  next;
	public Node(int data, Node next) {
		super();
		this.data = data;
		this.next = next;
	}
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public Node getNext() {
		return next;
	}
	public void setNext(Node next) {
		this.next = next;
	}
	
}
