//MethodOverriding
//MethodOverride.java
//Multi Level Inheritance
class Person{
	Person(){
		System.out.println("From Person class Constructor.........");
		System.out.println("I am Indian");
	}
}
class Programmer extends Person{
	Programmer(){
		System.out.println("From Programmer class Constructor.........");
		System.out.println("I am Computer Programmer");
	}
}
class Engineer extends Programmer{
	Engineer(){
		System.out.println("From Engineer class Constructor.........");
		System.out.println("I am Software Engineer");
	}
}
class ConstructorOrder {
	public static void main(String[] args){
		new Engineer();
	}
}	

/*
F:\BHAVAJAVA\UNIT-II>javac ConstructorOrder.java

F:\BHAVAJAVA\UNIT-II>java ConstructorOrder
From Person class Constructor.........
I am Indian
From Programmer class Constructor.........
I am Computer Programmer
From Engineer class Constructor.........
I am Software Engineer
*/	
	