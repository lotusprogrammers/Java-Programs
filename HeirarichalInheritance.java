//Heirarichal Inheritance
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
class Tester extends Person{
	public void displayTester(){
		System.out.println("I am Computer Software Tester");
	}
}	
class HeirarichalInheritance {
	public static void main(String args[]) {
		System.out.println("Calling Programmer object...");
		Programmer p=new Engineer();
		p.displayPerson();
		p.displayProgrammer();
		System.out.println("Calling Tester object...");
		Tester t=new Tester();
		t.displayPerson();
		t.displayTester();
	}
}	

/*
F:\BHAVAJAVA\UNIT-II>javac HeirarichalInheritance.java
F:\BHAVAJAVA\UNIT-II>java HeirarichalInheritance
Calling Programmer object...
I am Indian
I am Computer Programmer
Calling Tester object...
I am Indian
I am Computer Software Tester
*/
	

		
