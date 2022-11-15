//Demonstration for Inheritance
class Person {
	protected String name;
	protected String address;
	Person(){
		System.out.println("From Person Constructor");
		name="Rajesh";
		address="Rajampet";
	}	
	public void displayPerson() {
		System.out.println("Name="+name);
		System.out.println("Address="+address);
	}
}
class Student extends Person{
	protected String roll;
	protected String branch;
	Student(){
		System.out.println("From Student constructor");
		roll="599";
		branch="cse";
	}
    public void displayStudent() {
		System.out.println("Roll="+roll);
		System.out.println("Branch="+branch);
	}
}
class StuInheritance {
	public static void main(String[] args){
		Student s=new Student();
		s.displayPerson();
		s.displayStudent();
	}
}	
	
		