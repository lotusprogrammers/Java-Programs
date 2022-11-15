//AbstractEx.java
abstract class AbstractSample{
	//Concrete Method
	void concreteDisplay(){
		System.out.println("From Concrete Method of Abstract Sample class");
	}
    //abstract method
	abstract void abstractDisplay();	
}
class Sample extends AbstractSample{
	//should implement abstractDisplay method
	void abstractDisplay(){
		System.out.println("Abstract Method implemented,Inherited from Abstract Sample class");
	} 
}
class AbstractEx{
	public static void main(String[] args){
		//AbstractSample as=new AbstractSample(); //Error!Abstract classes not instantiated.
		AbstractSample s=new Sample();
		s.concreteDisplay();
		s.abstractDisplay();
	}
}
	