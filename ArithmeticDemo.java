//class definition and object creation
class Arithmetic{
	int add(int a,int b){
		int c;
		c=a+b;
		return c;
	}
    int subtract(int a,int b){
		int c;
		c=a-b;
		return c;
	}
    int multiply(int a,int b){
		int c;
		c=a*b;
		return c;
	}
    double division(int a,int b){
		double c;
		c=(float)a/b;
		return c;
	}
}
class ArithmeticDemo{
	public static void main(String[] args){
		Arithmetic ar;
		ar=new Arithmetic();
		//Arithmetic ar=new Arithmetic();
		int ad=ar.add(5,7);
		System.out.println("Addition="+ad);
		int sb=ar.subtract(7,9);
		System.out.println("Subtraction="+sb);
		int ml=ar.multiply(9,9);
		System.out.println("Multiplication="+ml);
		double dv=ar.division(5,2);
		System.out.println("Dividion="+dv);
	}
}	
	
/*
F:\BHAVAJAVA\EEE>javac ArithmeticDemo.java

F:\BHAVAJAVA\EEE>java ArithmeticDemo
Addition=12
Subtraction=-2
Multiplication=81
Dividion=2.5

F:\BHAVAJAVA\EEE>javap Arithmetic.class
Compiled from "ArithmeticDemo.java"
class Arithmetic {
  Arithmetic();
  int add(int, int);
  int subtract(int, int);
  int multiply(int, int);
  double division(int, int);
}
	
*/	
		
		
		
	