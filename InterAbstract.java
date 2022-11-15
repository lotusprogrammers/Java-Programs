interface Sample{
	void abstractMethod();
	void concreteMethod();
}
abstract class AbstractSample implements Sample{
	public void concreteMethod(){
		System.out.println("Interface Concrete Method Implemented in AbstractSample class");
	}
    //public abstract void abstractMethod();
}
class ExampleSample extends AbstractSample{
	public void abstractMethod(){
		System.out.println("Interface Abtstact Method implemented in ExampleSample class"); 
 	}
}
class InterAbstract{
	public static void main(String[] args){
		Sample s=new ExampleSample();
		s.concreteMethod();
		s.abstractMethod();
	}
}	
/*
F:\BHAVAJAVA\UNIT-II>javac InterAbstract.java
F:\BHAVAJAVA\UNIT-II>java InterAbstract
Interface Concrete Method Implemented in AbstractSample class
Interface Abtstact Method implemented in ExampleSample class
*/	
	