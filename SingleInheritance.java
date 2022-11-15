//Single Inheritance
class Person{
	public void displayPerson() {
		System.out.println("I am Indian");
	}
}
class Programmer extends Person {
	public void displayProgrammer(){
		System.out.println("I am Computer Programmer");
	}
}
class SingleInheritance {
	public static void main(String args[]) {
		Programmer p=new Programmer();
		p.displayPerson();
		p.displayProgrammer();
	}
}	
	
/*
F:\BHAVAJAVA\UNIT-II>javac SingleInheritance.java

F:\BHAVAJAVA\UNIT-II>java SingleInheritance
I am Indian
I am Computer Programmer
*/
		
