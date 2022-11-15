class Mango{//Super class
	 String color;
	 double weight;
	 public void setColor(String color){
		 this.color=color;
	 }
     public void setWeight(double weight){
		 this.weight=weight;
	 }
	 public String getColor(){
		 return color;
	 }
     public double getWeight(){
		 return weight;
	 }
}
class ChildMango extends Mango{//Sub class
	public void display(){
		System.out.println("I am Children of Mango");
	}
}	
class MangoInheritance{
	public static void main(String[] args){
		Mango m=new Mango();
		System.out.println("Calling through Mango parent class object");
		m.setColor("Yellow");
		m.setWeight(500.50);
		System.out.println("Mango Color="+m.getColor());
		System.out.println("Mango weight="+m.getWeight());
		System.out.println("Calling through ChildMango child class object");
		ChildMango cm=new ChildMango();
		cm.setColor("YellowRed");
		cm.setWeight(700.75);
		System.out.println("Child Mango Color="+cm.getColor());
		System.out.println("Child Mango weight="+cm.getWeight());
		cm.display();
		System.out.println("Calling through Mango reference and ChildMango class object");
		Mango mg=new ChildMango();//Reference is Parent class and object is Child class
		mg.setColor("Orange");
		mg.setWeight(900.99);
		System.out.println("Child Mango Color accessed through Mango ref="+mg.getColor());
		System.out.println("Child Mango weight accessed through Mango ref="+mg.getWeight());
		//mg.display();//Error Not Exceuted 
		//Eventhough mg is ChildMango class object but refered through mango reference
		//display() unknown to Mango
	}
}	
/*
F:\>java MangoInheritance
Calling through Mango parent class object
Mango Color=Yellow
Mango weight=500.5
Calling through ChildMango child class object
Child Mango Color=YellowRed
Child Mango weight=700.75
I am Children of Mango
Calling through Mango reference and ChildMango class object
Child Mango Color accessed through Mango ref=Orange
Child Mango weight accessed through Mango ref=900.99
*/


/*	
//Inheritance Syntax:
class SubClass extends ParentClass{
    //SubClass inherits properties and Responsibilities(methods) from ParentClass
    //May define their own properties and responsibilities
} 

*/	
		 
		 
	 
