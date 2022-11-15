//Constructor Demonstration
class Sample{
	int a,b,c;
	//Default Constructor
	Sample(){
		System.out.println("From Default Constructor...");
		a=5;
		b=2;
		c=3;
	}
    //Parameterized Constructor
	Sample(int x){
		System.out.println("From one argument Constructor...");
		a=b=c=x;
	}
    Sample(int a,int b,int c){
		System.out.println("From three  arguments Constructor...");
		this.a=a;
		this.b=b;
		this.c=c;
	}
	void display(){
		System.out.println("a="+a);
		System.out.println("b="+b);
		System.out.println("c="+c);
	}	
		
}
class ConstructorDemo{
	public static void main(String[] args){
		Sample s=new Sample();
		s.display();
		Sample s1=new Sample(2);
		s1.display();
		Sample s2=new Sample(10,20,30);
		s2.display();
	}
}	


/*
F:\>javac ConstructorDemo.java

F:\>java ConstructorDemo
From Default Constructor...
a=5
b=2
c=3
From one argument Constructor...
a=2
b=2
c=2
From three  arguments Constructor...
a=10
b=20
c=30
*/		
	
		