//Multi Level Inheritance
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
class Engineer extends Programmer{
	public void displayEngineer(){
		System.out.println("I am Software Engineer");
	}
}	
class MultiLevelInheritance {
	public static void main(String args[]) {
		Engineer p=new Engineer();
		p.displayPerson();
		p.displayProgrammer();
		p.displayEngineer();
	}
}	

/*
F:\BHAVAJAVA\UNIT-II>javac MultiLevelInheritance.java
F:\BHAVAJAVA\UNIT-II>java MultiLevelInheritance
I am Indian
I am Computer Programmer
I am Software Engineer
*/
	

		
