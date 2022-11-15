//ExceptionDemo.java
import java.util.*;
class ExceptionDemo{
	public static void main(String[] args){
		Scanner sin=new Scanner(System.in);
		System.out.println("Enter a,b");
		int a=sin.nextInt();
		int b=sin.nextInt();
		try{
			int c=a/b;
			System.out.println("c="+c);
    		}
		    catch(ArithmeticException e){
				System.out.println("Exception occured="+e);
			}
	}
}
/*
F:\BHAVAJAVA\UNIT-III>javac ExceptionDemo.java

F:\BHAVAJAVA\UNIT-III>java ExceptionDemo
Enter a,b
2
0
Exception occured=java.lang.ArithmeticException: / by zero
F:\BHAVAJAVA\UNIT-III>javac ExceptionDemo.java

F:\BHAVAJAVA\UNIT-III>java ExceptionDemo
Enter a,b
5
2
c=2
*/	
			
		