//ThrowsDemo.java
import java.util.*;
class Division{
	int divide(int a,int b)throws ArithmeticException{
		int c=a/b;
	    return c;
	}
}	
		
class ThrowsDemo{
	public static void main(String[] args){
		Division d=new Division();
		Scanner sin=new Scanner(System.in);
		System.out.println("Enter a,b");
		int a=sin.nextInt();
		int b=sin.nextInt();
		try{
			int div=d.divide(a,b);
			System.out.println("Division Result="+div);
		   }
		    catch(Exception e){
				e.printStackTrace();
			}
	}
}
/*
F:\BHAVAJAVA\UNIT-III>javac ThrowsDemo.java

F:\BHAVAJAVA\UNIT-III>java ThrowsDemo
Enter a,b
10
2
Division Result=5

F:\BHAVAJAVA\UNIT-III>java ThrowsDemo
Enter a,b
2
0
java.lang.ArithmeticException: / by zero
        at Division.divide(ThrowsDemo.java:5)
        at ThrowsDemo.main(ThrowsDemo.java:18)
*/	
			
		