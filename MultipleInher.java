//SingleInher.java
class Person{
	void displayPerson(){
		System.out.println("I am an Indian");
	}
}
class Programmer extends Person{
	void displayProgrammer(){
		System.out.println("I am a Indian Computer Programmer");
	}
}
class Engineer extends Programmer{
	void displayEnginner(){
		System.out.println("I am an Indian Software Engineer");
	}
}	
class SingleInher{
	public static void main(String[] args){
		Engineer p=new Engineer();
		e.displayPerson();
		e.displayProgrammer();
		e.displayEngineer();
	}
}	
/*
F:\>javac SingleInher.java
F:\>java SingleInher
I am an Indian
I am a Indian Computer Programmer
*/
	
	
	