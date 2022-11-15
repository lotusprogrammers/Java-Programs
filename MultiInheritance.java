//Multi Level Inheritance
class Person{
	public void displayPerson(){
		System.out.println("I am Indian");
	}
}
class Programmer extends Person{
	public void displayProgrammer(){
		System.out.println("I am Computer Programmer");
	}
}
class Engineer extends Programmer{
	public void displayEngineer(){
		System.out.println("I am Software Engineer");
	}
}
class MultiInheritance{
	public static void main(String[] args){
		Engineer e=new Engineer();
		e.displayPerson();
		e.displayProgrammer();
		e.displayEngineer();
	}
}	
	
	