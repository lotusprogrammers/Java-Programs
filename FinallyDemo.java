//Finally.java
import java.io.*;
import java.util.*;
class FinallyDemo{
	public static void main(String[] args)throws IOException{
		Scanner sin=new Scanner(System.in);
		FileWriter fw=new FileWriter("divfile.txt");
		System.out.println("Enter a,b");
		int a=sin.nextInt();
		int b=sin.nextInt();
		try{
			int c=a/b;
			System.out.println("c="+c);
			fw.write("Division Successful..."+a+"/"+b+"="+c);
    		}
		    catch(ArithmeticException e){
				System.out.println("Exception occured="+e);
			}
			finally{
				System.out.println("File closed...");
				fw.close();
			}
	}
}
/*
F:\BHAVAJAVA\UNIT-III>javac FinallyDemo.java

F:\BHAVAJAVA\UNIT-III>java FinallyDemo
Enter a,b
10
2
c=5
File closed...

F:\BHAVAJAVA\UNIT-III>java FinallyDemo
Enter a,b
2
0
Exception occured=java.lang.ArithmeticException: / by zero
File closed...
*/