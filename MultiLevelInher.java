//MultiLevelInher.java
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
	void displayEngineer(){
		System.out.println("I am an Indian Software Engineer");
	}
}	
class MultiLevelInher{
	public static void main(String[] args){
		Engineer e=new Engineer();
		e.displayPerson();
		e.displayProgrammer();
		e.displayEngineer();
	}
}	
/*
F:\>javac MultiLevelInher.java
F:\>java MultiLevelInher
I am an Indian
I am a Indian Computer Programmer
I am an Indian Software Engineer

*/
	
	
	