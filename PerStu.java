class Person{
	protected String name;
	protected String address;
	public Person(){
		System.out.println("From Person class constructor");
		name="Rajesh";
		address="Rajampet";
	}
	public void displayPerson(){
		System.out.println("Name="+name);
		System.out.println("Address="+address);
	}
}
class Student extends Person {
	private String roll;
	private String branch;
	public Student() {
		System.out.println("From Student  class constructor");
		roll="20701A0597";
		branch="CSE";
    }
    public void displayStudent() {
		displayPerson();
		System.out.println("Roll="+roll);
		System.out.println("Branch="+branch);
	}
}
class PerStu{
	public static void main(String args[]){
		Student s=new Student();
		s.displayStudent();
	}
}	
/*
F:\BHAVAJAVA\UNIT-II>javac PerStu.java
F:\BHAVAJAVA\UNIT-II>java PerStu
From Person class constructor
From Student  class constructor
Name=Rajesh
Address=Rajampet
Roll=20701A0597
Branch=CSE
*/
	
		
		
    	