//Reading Input through DataInputStream class object
//AddData.java
import java.io.*;
class AddData{
	public static void main(String[] args)throws IOException{
		DataInputStream din=new DataInputStream(System.in);
		System.out.println("Enter a,b");
		String str1=din.readLine();
		String str2=din.readLine();
		int a=Integer.parseInt(str1);
		int b=Integer.parseInt(str2);
		int c=a+b;
		System.out.println("Addition of "+a+" and "+b+"="+c);
	}
}	
/*		
F:\BHAVAJAVA\bhavawipro>javac AddData.java
Note: AddData.java uses or overrides a deprecated API.
Note: Recompile with -Xlint:deprecation for details.

F:\BHAVAJAVA\bhavawipro>java AddData
Enter a,b
2
5
Addition of 2 and 5=7		
*/		
		
/*	
In DataInputStream class for reading string data
public String readLine() throws IOException;
*/		