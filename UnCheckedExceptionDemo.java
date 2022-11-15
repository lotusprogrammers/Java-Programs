import java.util.*;
class UnCheckedExceptionDemo{
	public static void main(String[] args){
		Scanner sin=new Scanner(System.in);
		System.out.println("Enter a,b=");
		int a=sin.nextInt();
		int b=sin.nextInt();
		int c=a/b;
		System.out.println("c="+c);
    }	
}
/*
F:\BHAVAJAVA\UNIT-III>javac UnCheckedExceptionDemo.java
F:\BHAVAJAVA\UNIT-III>java UnCheckedExceptionDemo
Enter a,b=
10
2
c=5

F:\BHAVAJAVA\UNIT-III>java UnCheckedExceptionDemo
Enter a,b=
2
0
Exception in thread "main" java.lang.ArithmeticException: / by zero
        at UnCheckedExceptionDemo.main(UnCheckedExceptionDemo.java:8)
*/