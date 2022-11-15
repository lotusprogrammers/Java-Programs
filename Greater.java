//Write a program to accept two numbers 
//and print the greater value of the two
import java.util.*;
class Greater{
	public static void main(String[] args){
		Scanner sin=new Scanner(System.in);
		System.out.println("Accept two numbers");
		int n1=sin.nextInt();
		int n2=sin.nextInt();
		if(n1>n2)
			System.out.println(n1+" is greater than "+n2);
		else
			System.out.println(n1+" is less than "+n2);
	}
}	
/*
F:\BHAVAWIPRO23\BhavaWiproMettl>javac Greater.java

F:\BHAVAWIPRO23\BhavaWiproMettl>java Greater
Accept two numbers
25
75
25 is less than 75

F:\BHAVAWIPRO23\BhavaWiproMettl>java Greater
Accept two numbers
95
25
95 is greater than 25
*/