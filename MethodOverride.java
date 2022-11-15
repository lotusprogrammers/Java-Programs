//MethodOverriding
//MethodOverride.java
//Multi Level Inheritance
class Person{
	public void display(){
		System.out.println("I am Indian");
	}
}
class Programmer extends Person{
	//display() method overriden 
	public void display(){
		System.out.println("I am Computer Programmer");
	}
}
class Engineer extends Programmer{
	//display() method overriden
	public void display(){
		System.out.println("I am Software Engineer");
	}
}
class MethodOverride {
	public static void main(String[] args){
		Person p;
		p=new Person();
		p.display();
		p=new Programmer();
		p.display();
		p=new Engineer();
		p.display();
	}
}	
	
	