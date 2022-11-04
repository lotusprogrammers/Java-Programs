//Addition.java-Reading Input through Scanner class object
import java.util.*;
class Addition{
	public static void main(String[] args){
		//Create object for Scanner class
		Scanner sin=new Scanner(System.in);
		System.out.println("Enter a,b,c");
		int a=sin.nextInt();
		int b=sin.nextInt();
		int c=sin.nextInt();
		int result=a+b+c;
		System.out.println("Addition result="+result);
    }
}	

/*
F:\BHAVAJAVA\bhavawipro>javac Addition.java

F:\BHAVAJAVA\bhavawipro>java Addition
Enter a,b,c
27
77
99
Addition result=203

F:\BHAVAJAVA\bhavawipro>java Addition
Enter a,b,c
777
5757
9999
Addition result=16533
*/		
		
		
		
		
		
		
/*		
How to create object
ClassName objname=new ClassName(arglist);

Syntax for nextInt() defined in Scanner class
int nextInt()//To read integer input
*/