//Constructor Demonstration
class Sample{
	int a,b,c;
	//Default Constructor
	Sample(){
		System.out.println("From Sample class Default Constructor");
		a=2;
		b=5;
		c=7;
	}
    //Parameterized Constructor
	Sample(int a1,int b1,int c1){
		System.out.println("From Sample class Paramerized Constructor");
		a=a1;
		b=b1;
		c=c1;
	}
    void display(){
		System.out.println("Members of a class...");
		System.out.println("a="+a);
		System.out.println("b="+b);
		System.out.println("c="+c);
	}
}
class SampleDemo{
	public static void main(String[] args){
		Sample s=new Sample();//Object creation procedes with default constructor execution
	    s.display();
		Sample s1=new Sample(33,66,99);//Object creation procedes with paramerized constructor execution
		s1.display();
	}
}	

/*
F:\BHAVAJAVA\EEE>javac SampleDemo.java

F:\BHAVAJAVA\EEE>java SampleDemo
From Sample class Default Constructor
Members of a class...
a=2
b=5
c=7
From Sample class Paramerized Constructor
Members of a class...
a=33
b=66
c=99
*/
		
 	
		
		