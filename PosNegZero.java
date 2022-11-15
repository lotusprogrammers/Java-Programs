//Write a program to accept a number N 
//and print whether it is positive, negative or zero
import java.util.*;
class PosNegZero{
	public static void main(String[] args){
		Scanner sin=new Scanner(System.in);
		System.out.println("Accept a Number=");
		int n=sin.nextInt();
		if(n>0)
			System.out.println(n+" is Positive Number");
		else if(n<0)
			System.out.println(n+" is Negative Number");
		else
			System.out.println(n+" is zero");
	}
}
/*
F:\BHAVAWIPRO23\BhavaWiproMettl>javac PosNegZero.java

F:\BHAVAWIPRO23\BhavaWiproMettl>java PosNegZero
Accept a Number=
99
99 is Positive Number

F:\BHAVAWIPRO23\BhavaWiproMettl>java PosNegZero
Accept a Number=
-23
-23 is Negative Number

F:\BHAVAWIPRO23\BhavaWiproMettl>java PosNegZero
Accept a Number=
0
0 is zero
*/	