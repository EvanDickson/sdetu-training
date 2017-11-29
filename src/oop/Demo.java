package oop;

class Person {
	String name;
	String email;
	String phone;
	
	void walk () {
		System.out.println(name + " is walking");
	}
	
	void sleep() {
		System.out.println(name + " is sleeping");
	}

	
	void eat() {
		System.out.println(name + " is eating");
	}
		
	}

public class Demo {

	public static void main(String[] args) {

	// This is instantiation:	
	Person Person1 = new Person();
	Person Person2 = new Person();

	// This is defining properties:
	Person1.name = "Joe";
	Person1.email = "Joe@joemail.com";
	Person1.phone = "5555551212";

	Person2.name = "Sarah";
	Person2.email = "Sarah@sarahmail.com";
	
	// Abstraction:
	Person1.walk();
	Person1.sleep();
	Person1.eat();
	
	Person2.sleep();
}
	
}	



