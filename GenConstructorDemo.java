//Demostration of Generic Constructor in Non Generic Constructor
class NonGen{
	double val;
	<T extends Number>NonGen(T ob){
		val=ob.doubleValue();
	}
	void showVal(){
		System.out.println("Double Value val="+val);
	}
}
class GenConstructorDemo{
	public static void main(String[] args){
		System.out.println("Calling Generic Constructor as Integer type...");
		NonGen ng1=new NonGen(9);
		ng1.showVal();
		System.out.println("Calling Generic Constructor as Float type...");
		NonGen ng2=new NonGen(9.99F);
		ng2.showVal();
	}
}	
/*
F:\BHAVAJAVA\GENERICS>javac GenConstructorDemo.java

F:\BHAVAJAVA\GENERICS>java GenConstructorDemo
Calling Generic Constructor as Integer type...
Double Value val=9.0
Calling Generic Constructor as Float type...
Double Value val=9.989999771118164	
*/		