//Reading Input through DataInputStream 
//Perform Addition of Two Numbers
import java.io.*;
class DataInputDemo{
	public static void main(String[] args) throws Exception{
		DataInputStream din=new DataInputStream(System.in);
		System.out.println("Enter a=");
		String str1=din.readLine();
		int a=Integer.parseInt(str1);
		System.out.println("Enter b=");
		String str2=din.readLine();
		int b=Integer.parseInt(str2);
		int c;
		c=a+b;
		System.out.println("Addition of Two Numbers="+c);
	}
}	

/*
F:\BHAVAJAVA\EEE\UNIT-V>javac DataInputDemo.java
Note: DataInputDemo.java uses or overrides a deprecated API.
Note: Recompile with -Xlint:deprecation for details.
F:\BHAVAJAVA\EEE\UNIT-V>java DataInputDemo
Enter a=
2
Enter b=
5
Addition of Two Numbers=7
*/		