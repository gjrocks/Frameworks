package com.gj.model;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

/**
 * @author gjadhav
 */
public class Person implements Comparable<Person>{
  private String givenName;
  private String surName;
  private int age;
  private Gender gender;
  private String eMail;
  private String phone;
  private String address;
  
  public static class Builder{
    
    private String givenName="";
    private String surName="";
    private int age = 0;
    private Gender gender = Gender.FEMALE;
    private String eMail = "";
    private String phone = "";
    private String address = "";
       
    public Person.Builder givenName(String givenName){
      this.givenName = givenName;
      return this;
    }
    
    public Person.Builder surName(String surName){
      this.surName = surName;
      return this;
    }
    
    public Person.Builder age (int val){
      age = val;
      return this;
    }
    
    public Person.Builder gender(Gender val){
      gender = val;
      return this;
    }
    
    public Person.Builder email(String val){
      eMail = val;
      return this;
    }
    
    public Person.Builder phoneNumber(String val){
      phone = val;
      return this;
    }
    
    public Person.Builder address(String val){
      address = val;
      return this;
    }
    
    public Person build(){
      return new Person(this);
    }
  }
    
  private Person(){
    super();
  }
    
  private Person(Person.Builder builder){
    givenName = builder.givenName;
    surName = builder.surName;
    age = builder.age;
    gender = builder.gender;
    eMail = builder.eMail;
    phone = builder.phone;
    address = builder.address;
        
  }
  
  public String getGivenName(){
    return givenName;
  }
  
  public String getSurName(){
    return surName;
  }
  
  public int getAge(){
    return age;
  }
            
  public void print(){
    System.out.println(
      "\nName: " + givenName + " " + surName + "\n" + 
      "Age: " + age + "\n" +
      "Gender: " + gender + "\n" + 
      "eMail: " + eMail + "\n" + 
      "Phone: " + phone + "\n" +
      "Address: " + address + "\n"
                );
  } 
  
  public void printName(){    
    System.out.println(
      "Name: " + givenName + " " + surName);
  }

  @Override
  public String toString(){
    return "Name: " + givenName + " " + surName + "\n" + "Age: " + age + "  Gender: " + gender + "\n" + "eMail: " + eMail + "\n" + "Address: " + address + "\n";
  } 
  

  public static List<Person> createShortList(){
    List<Person> people = new ArrayList<>();
    
    people.add(
      new Person.Builder()
            .givenName("Bob")
            .surName("Baker")
            .age(21)
            .gender(Gender.MALE)
            .email("bob.baker@example.com")
            .phoneNumber("201-121-4678")
            .address("44 4th St, Smallville, KS 12333")
            .build() 
      );
    
    people.add(
      new Person.Builder()
            .givenName("Jane")
            .surName("Doe")
            .age(25)
            .gender(Gender.FEMALE)
            .email("jane.doe@example.com")
            .phoneNumber("202-123-4678")
            .address("33 3rd St, Smallville, KS 12333")
            .build() 
      );
    
    people.add(
      new Person.Builder()
            .givenName("John")
            .surName("Doe")
            .age(25)
            .gender(Gender.MALE)
            .email("john.doe@example.com")
            .phoneNumber("202-123-4678")
            .address("33 3rd St, Smallville, KS 12333")
            .build()
    );
    
    people.add(
      new Person.Builder()
            .givenName("James")
            .surName("Johnson")
            .age(45)
            .gender(Gender.MALE)
            .email("james.johnson@example.com")
            .phoneNumber("333-456-1233")
            .address("201 2nd St, New York, NY 12111")
            .build()
    );
    
    people.add(
      new Person.Builder()
            .givenName("Joe")
            .surName("Bailey")
            .age(67)
            .gender(Gender.MALE)
            .email("joebob.bailey@example.com")
            .phoneNumber("112-111-1111")
            .address("111 1st St, Town, CA 11111")
            .build()
    );
    
    people.add(
      new Person.Builder()
            .givenName("Phil")
            .surName("Smith")
            .age(55)
            .gender(Gender.MALE)
            .email("phil.smith@examp;e.com")
            .phoneNumber("222-33-1234")
            .address("22 2nd St, New Park, CO 222333")
            .build()
    );
    
    people.add(
      new Person.Builder()
            .givenName("Betty")
            .surName("Jones")
            .age(85)
            .gender(Gender.FEMALE)
            .email("betty.jones@example.com")
            .phoneNumber("211-33-1234")
            .address("22 4th St, New Park, CO 222333")
            .build()
    );
    
    people.add(
    	      new Person.Builder()
    	            .givenName("g")
    	            .surName("J")
    	            .age(66)
    	            .gender(Gender.FEMALE)
    	            .email("g.j@example.com")
    	            .phoneNumber("211-33-1234")
    	            .address("22 4th St, New Park, CO 222333")
    	            .build()
    	    );
    
    people.add(
  	      new Person.Builder()
  	            .givenName("g")
  	            .surName("JJ")
  	            .age(26)
  	            .gender(Gender.MALE)
  	            .email("g.jj@example.com")
  	            .phoneNumber("211-33-1234")
  	            .address("22 4th St, New Park, CO 222333")
  	            .build()
  	    );
    return people;
  }

@Override
public int compareTo(Person o) {
	
	return this.getGivenName().compareTo(o.getGivenName());
}

public Gender getGender() {
	return gender;
}

public void setGender(Gender gender) {
	this.gender = gender;
}

public String geteMail() {
	return eMail;
}

public void seteMail(String eMail) {
	this.eMail = eMail;
}

public String getPhone() {
	return phone;
}

public void setPhone(String phone) {
	this.phone = phone;
}

public String getAddress() {
	return address;
}

public void setAddress(String address) {
	this.address = address;
}

public void setGivenName(String givenName) {
	this.givenName = givenName;
}

public void setSurName(String surName) {
	this.surName = surName;
}

public void setAge(int age) {
	this.age = age;
}
  
//Function interface example public R apply(T t){ }

		public String printCustom(Function<Person,String> f){
			return f.apply(this);
		}
		
		public static int compareByAge(Person a, Person b){
			return Integer.compare(a.getAge(),b.getAge());
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((givenName == null) ? 0 : givenName.hashCode());
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Person other = (Person) obj;
			if (givenName == null) {
				if (other.givenName != null)
					return false;
			} else if (!givenName.equals(other.givenName))
				return false;
			return true;
		}

		
}
