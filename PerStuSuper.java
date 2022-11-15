class Person{
	protected String name;
	protected String address;
	public Person(String name,String address){
		this.name=name;
		this.address=address;
	}
	public void display(){
		System.out.println("Name="+name);
		System.out.println("Address="+address);
	}
}
class Student extends Person {
	private String roll;
	private String branch;
	public Student(String roll,String name,String branch,String address) {
		super(name,address);
		this.roll=roll;
		this.branch=branch;
	}
    public void display() {
		super.display();
		System.out.println("Roll Number="+roll);
		System.out.println("Branch="+branch);
	}
}
class PerStuSuper{
	public static void main(String args[]){
		Student s=new Student("20701A0599","Rajesh","CSE","Rajampet");
		s.display();
	}
}	
/*
F:\BHAVAJAVA\UNIT-II>javac PerStuSuper.java

F:\BHAVAJAVA\UNIT-II>java PerStuSuper
Name=Rajesh
Address=Rajampet
Roll Number=20701A0599
Branch=CSE
*/
	
		
		
    	