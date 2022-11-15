final class A{
    void display(){ 
		System.out.println("This class not Inherited");
	}
}
class B extends A{
	void display(){
		System.out.println("From Child class");
	}
}
class FinalClass {
	public static void main(String[] args){
		Parent p;
		p=new Parent();
		p.display();
		p=new Child();
		p.display();
	}
}	

/*
F:\BHAVAJAVA\UNIT-II>javac FinalClass.java
FinalClass.java:6: error: cannot inherit from final A
class B extends A{
                ^
FinalClass.java:16: error: cannot find symbol
                p=new Child();
                      ^
  symbol:   class Child
  location: class FinalClass
2 errors
*/
		
	
	
