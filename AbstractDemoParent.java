//AbstractDemoParent.java
abstract class Parent{
	public abstract void unKnown();
	void known(){
		System.out.println("This is concrete method in class Parent");
	}
}
class Child extends Parent{
	public void unKnown(){
		System.out.println("This is specification refered in Parent class,Implemented in Child class");
	}
    void childKnown(){
		System.out.println("I implemented abstract method from Parent");
    }
}
class AbstractDemoParent{
	public static void main(String[] args){
		//Parent p=new Parent(); Abstract class object not created
		Parent p;
		p=new Child();
		p.unKnown();
		p.known();
		Child c;
		c=new Child();
		c.childKnown();
	}
}	


/*
F:\BHAVAJAVA\bhavawipro>javac AbstractDemoParent.java

F:\BHAVAJAVA\bhavawipro>java AbstractDemoParent
This is specification refered in Parent class,Implemented in Child class
This is concrete method in class Parent
I implemented abstract method from Parent
*/

/*
F:\BHAVAJAVA\bhavawipro>javac AbstractDemoParent.java
AbstractDemo.java:17: error: Parent is abstract; cannot be instantiated
                Parent p=new Parent();
                         ^
1 error
*/
	
   		
	
	