//Write a program to accept two numbers and
//print whether their sum is EVEN or ODD
import java.util.*;
class EvenOddSum{
	public static void main(String[] args){
		Scanner sin=new Scanner(System.in);
		System.out.println("Accept two numbers");
		int n1=sin.nextInt();
		int n2=sin.nextInt();
		if((n1+n2)%2==0)
			System.out.println((n1+n2)+" is an even sum result");
		else
			System.out.println((n1+n2)+" is an odd sum result");
	}
}	
/*
F:\BHAVAWIPRO23\BhavaWiproMettl>javac EvenOddSum.java

F:\BHAVAWIPRO23\BhavaWiproMettl>java EvenOddSum
Accept two numbers
25
27
52 is an even sum result

F:\BHAVAWIPRO23\BhavaWiproMettl>java EvenOddSum
Accept two numbers
25
20
45 is an odd sum result
*/