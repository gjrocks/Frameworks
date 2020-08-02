package com.gj.simple;

class A {

	public static void staticA() {
		System.out.println("staticA");

	}

	public void nonstaticA() {
		System.out.println("nonstaticA");

	}

}
	
public class C extends A {

	/*public void nonstaticA(){
		System.out.println("nonstaticA in C");
		
		}*/
	
	public static void staticC() {
		System.out.println("staticC");
	}

	public void nonstaticC() {
		System.out.println("nonstaticC");
	}

	public static void staticA() {
		System.out.println("staticA-in C");

	}

	public static void main(String ars[]) {

		/*C t = new C();
		t.staticA();
		t.nonstaticA();
		A t1 = new C();
		t1.staticA();
		t1.nonstaticA();*/
new C().me(null);
String data="[{\"id\":1,\"fname\":\"fname\",\"lname\":\"lname\",\"address\":\"address\",\"userid\":\"userid\",\"mobileNumber\":\"mobileNumber\",\"email\":\"email@email.com\"},{\"id\":2,\"fname\":\"ganesh\",\"lname\":\"jadhav\",\"address\":\"ganesh address\",\"userid\":\"ganesh-1\",\"mobileNumber\":\"999\",\"email\":\"ganesh@ganesh.com\"},{\"id\":3,\"fname\":\"sidh\",\"lname\":\"nirwane\",\"address\":\"sidh address\",\"userid\":\"sidh-1\",\"mobileNumber\":\"998\",\"email\":\"sidh@sidh.com\"},{\"id\":4,\"fname\":\"aarvi\",\"lname\":\"jadhav\",\"address\":\"aarvi address\",\"userid\":\"aarvi-1\",\"mobileNumber\":\"997\",\"email\":\"aarvi@aarvi.com\"}]";
System.out.println(data);
	}
	
	public void me(Object r){
		System.out.println("Object");
	}
	
public void me(String r){
	System.out.println("String");
	}
}

