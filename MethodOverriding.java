//MethodOverriding.java
//Redefining super class method in sub class with same signature and same return type
//Whether method declared as final method, method should not be overriden.
//Whether class is declared as final,class should not be ineherited
//This program also demonstrates dynamic method dispatch or Runtime polymorphism
class Parent{
    double addition(double a,double b,double c){
		System.out.println("From Parent class-This method may not be redefined by Child class");
		System.out.println("If my Child is Intelligent");
		double d= a+b+c;
		return d;
	}
}
class Child extends Parent{
	//Override addition method from Parent class
	double addition(double a,double b,double c){
		System.out.println("I have my own way to do the task,My Parent permitted to redefine");
		double res=c+a+b;
		return res;
	}
}
class GrandChild extends Child{
	double addition(double a,double b,double c){
		System.out.println("I am superfast ,I have own way to redefine the task");
		return (a+b+c);
	}
}	
class MethodOverriding{
	public static void main(String[] args){	
		Parent p;
		p=new Parent();
		//calling Parent class display method
		double r;
		r=p.addition(2,3,5);
		System.out.println("Addition result from parent="+r);
		System.out.println("P is an instance of Parent"+(p instanceOf Parent));
		p=new Child();
		//Calling Child class display method
	    r=p.addition(2,3,5);
		System.out.println("Addition result from child="+r);
		System.out.println("P is an instance of Parent"+(p instanceOf Parent));
		p=new GrandChild();
		r=p.addition(2,3,5);
		System.out.println("Addition result from Grand Child="+r);
		System.out.println("P is an instance of Parent"+(p instanceOf Parent));

		
	}
}
/*	
F:\>javac MethodOverriding.java

F:\>java MethodOverriding
From Parent class-This method may not be redefined by Child class
If my Child is Intelligent
Addition result from parent=10.0
I have my own way to do the task,My Parent permitted to redefine
Addition result from child=10.0
I am superfast ,I have own way to redefine the task
Addition result from Grand Child=10.0	
*/