//Write a program to accept a number N 
//and print whether the number is EVEN or ODD
import java.util.*;
class EvenOdd{
	public static void main(String[] args){
		Scanner sin=new Scanner(System.in);
		System.out.println("Accept a number");
		int n=sin.nextInt();
		if(n%2==0)
			System.out.println(n+" is an even number");
		else
			System.out.println(n+" is an odd number");
	}
}	
/*
F:\BHAVAWIPRO23\BhavaWiproMettl>javac EvenOdd.java

F:\BHAVAWIPRO23\BhavaWiproMettl>java EvenOdd
Accept a number
9
9 is an odd number

F:\BHAVAWIPRO23\BhavaWiproMettl>java EvenOdd
Accept a number
12
12 is an even number
*/