//Arithemtic Operators
import java.util.*;
class Arithmetic{
	public static void main(String[] args){
		Scanner sin=new Scanner(System.in);
		System.out.println("Enter a,b");
		int a=sin.nextInt();
		int b=sin.nextInt();
		int res;
		res=a+b;
		System.out.println("Addition res="+res);
		res=a-b;
		System.out.println("Subtraction res="+res);
		res=a*b;
		System.out.println("Multiplication res="+res);
		float div;
		div=(float)a/b;
		System.out.println("Division res="+div);
		res=a%b;
		System.out.println("Modulo Divison res="+res);
		res=a++;//res=25  a=26
		System.out.println("Post Increment res="+res);
		res=a--;//res=26 a=25
		System.out.println("Post Decrement res="+res);
		res=++a;//res=26 a=26
		System.out.println("Pre Increment res="+res);
		res=--a;//res=25   a=25
		System.out.println("Pre Decrement res="+res);
	}
}
/*
F:\BHAVAJAVA\EEE>javac Arithmetic.java

F:\BHAVAJAVA\EEE>java Arithmetic
Enter a,b
25
7
Addition res=32
Subtraction res=18
Multiplication res=175
Division res=3.5714285
Modulo Divison res=4
Post Increment res=25
Post Decrement res=26
Pre Increment res=26
Pre Decrement res=25	
*/
