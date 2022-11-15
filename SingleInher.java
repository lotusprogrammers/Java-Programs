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
class SingleInher{
	public static void main(String[] args){
		Programmer p=new Programmer();
		p.displayPerson();
		p.displayProgrammer();
	}
}	
/*
F:\>javac SingleInher.java
F:\>java SingleInher
I am an Indian
I am a Indian Computer Programmer
*/
	
	
	