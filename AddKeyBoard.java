//Reading input thorugh Scanner class
import java.util.*;
class AddKeyBoard{
	public static void main(String[] args){
		Scanner sin=new Scanner(System.in);
		//How to create object for class
		//ClassName ref=new ClassName(arglist);
		//From Scanner class call the following method to read int input
		//public int nextInt()
		//For reading float input
		//public float nextFloat()
		System.out.println("Enter integer a,b,c");
		int a=sin.nextInt();
		int b=sin.nextInt();
		int c=sin.nextInt();
		System.out.println("Enter d as float input"); 
		float d=sin.nextFloat();
		System.out.println("Enter e as double value");
		double e=sin.nextDouble();
		double res=a+b+c+d+e;
		System.out.println("Result of different inputs="+res);
	    System.out.println("Thanks Give Quick response");
	}
}	

/*
F:\BHAVAWIPRO23>javac AddKeyBoard.java

F:\BHAVAWIPRO23>java AddKeyBoard
Enter integer a,b,c
2
5
7
Enter d as float input
8.979
Enter e as double value
9.7777777777
Result of different inputs=32.75677786925274
Thanks Give Quick response
*/
		
		