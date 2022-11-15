//ThrowDemo.java
import java.util.*;
class ThrowDemo{
	public static void main(String[] args){
		Scanner sin=new Scanner(System.in);
		System.out.println("Enter a,b=");
		int a=sin.nextInt();
		int b=sin.nextInt();
		try{
			if(b!=0){
			int c=a/b;
			System.out.println("c="+c);
    		}
			else
				throw new ArithmeticException();
			}
		    catch(ArithmeticException e){
				e.printStackTrace();
			}
	}
}
/*
F:\BHAVAJAVA\UNIT-III>javac ThrowDemo.java

F:\BHAVAJAVA\UNIT-III>java ThrowDemo
Enter a,b=
10
2
c=5

F:\BHAVAJAVA\UNIT-III>java ThrowDemo
Enter a,b=
2
0
java.lang.ArithmeticException
        at ThrowDemo.main(ThrowDemo.java:15)
*/	
			
		