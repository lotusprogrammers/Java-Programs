//Calling Super class constructor and super class method
class Person {
	String name;
	String aadhar;
	Person(){
		name=null;
		aadhar=null;
	}
    Person(String name,String aadhar){
		this.name=name;
		this.aadhar=aadhar;
	}
    void display(){
		System.out.println("From Person class");
		System.out.println("Name="+name);
		System.out.println("Aadhar Number="+aadhar);
	}
}
class Student extends Person{
	String roll,branch;
	Student(){
		roll=null;
		branch=null;
	}
    Student(String roll,String name,String branch,String aadhar){
		super(name,aadhar);//calling super class constructor
		this.roll=roll;
		this.branch=branch;
	}
    void display(){
		super.display();//Calling Person class display() method
		System.out.println("From Student class");
		System.out.println("Roll number="+roll);
		System.out.println("Branch="+branch);
	}
}
class SuperEx{
	public static void main(String[] args){
		Person p;
		p=new Student("599","rajesh","cse","12345678ABCD");
		p.display();
	}
}	
	
	
		
		
		
 	
		
		
	