package labs;

public class lab2 {

	public static void main(String[] args) {
		Student stu1 = new Student("Bartholomew", "112358132");
		Student stu2 = new Student("Jefferson", "555666777");
		Student stu3 = new Student("Bungleberry", "444444444");
		
		stu1.enroll("Math");
		stu1.enroll("Physics");
		stu1.enroll("History");
		stu1.payTuition(1500);
		System.out.println(stu1);
		
		stu1.setPhone("5558675309");
		String thePHone = stu1.getPhone();
		System.out.println(thePHone);
	}
	
}


class Student {
	//properties
	private static int iD=1000;
	private String userId;
	private String name;
	private String ssn;
	private String email;
	private String courses = "";
	private static final int costOfCourse = 800;
	private int balance;
	private String phone;
	private String city;
	
	public Student(String name, String ssn) {
		iD++;
		this.name = name;
		this.ssn = ssn;
		setEmail();
		setUserId();
	}
	
	private void setEmail() {
		email = name.toLowerCase().substring(0, 4) + "." + iD + "@sdetuniversity.com";
		//System.out.println("Your email: " + email);
	}
	
	private void setUserId() {
		int max = 9000;
		int min = 1000;
		int randNum = (int) (Math.random()*((max - min)));
		randNum = randNum + min;
		userId = iD + "" + randNum + ssn.substring(5);
		//System.out.println("Your user ID: " + userId);
	}
	
	public void enroll(String course) {
		this.courses = this.courses + "\n" + course;
		balance = balance + costOfCourse;
		
		//System.out.println(courses);
		//System.out.println(balance);
		
	}
	
	public void payTuition(int amount) {
		balance = balance - amount;
		System.out.println("Student " + this.name + " paid $" + amount);
	}
	
	public void checkBalance() {
		System.out.println("Student " + this.name + " owes $" + balance);
	}
	
	public void showCourses() {
		System.out.println("Student " + this.name + " is enrolled in the following courses: " + courses);
	}
	
	public String toString() {
		return "[NAME: " + name + " ]\n[COURSES: " + courses + " ]\n[BALANCE: " + balance + " ]";
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	
	
}