//Multiplication.java-Reading Input through Scanner class object
import java.util.*;
class Multiplication{
	public static void main(){
		//Create object for Scanner class
		Scanner sin=new Scanner(System.in);
		System.out.println("Enter a,b,c");
		float a=sin.nextFloat();
		float b=sin.nextFloat();
		float c=sin.nextFloat();
		float result=a*b*c;
		System.out.println("Multiplication result="+result);
    }
}

/*
F:\BHAVAJAVA\bhavawipro>javac Multiplication.java

F:\BHAVAJAVA\bhavawipro>java Multiplication
Enter a,b,c
7.9 5.7 9.9
Multiplication result=445.79697
*/

Syntax for nextFloat() defined in Scanner class
int nextFloat()//To read floating point input
*/	

