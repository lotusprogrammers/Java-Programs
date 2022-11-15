//Reading Input through BufferedInputStream 
//Reading data through BufferedInputStream
import java.io.*;
class BufferedInputDemo{
	public static void main(String[] args) throws Exception{
		BufferedInputStream bin=new BufferedInputStream(System.in);
		//System.out.println("Enter a=");
		int a,b;
		try{
	    a=bin.read();
		System.out.println("a="+a);
		}
		catch(Exception e){System.out.println(e);}
		
	}
}	

/*
F:\BHAVAJAVA\EEE\UNIT-V>javac BufferedInputDemo.java
Note: DataInputDemo.java uses or overrides a deprecated API.
Note: Recompile with -Xlint:deprecation for details.
F:\BHAVAJAVA\EEE\UNIT-V>java BufferedInputDemo
Enter a=
2
Enter b=
5
Addition of Two Numbers=7
*/		