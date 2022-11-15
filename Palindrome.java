//Palindrome
import java.util.*;
class Palindrome{
	public static void main(String[] args){
		Scanner sin=new Scanner(System.in);
		System.out.println("Enter Number");
		int n=sin.nextInt();
		int num=n;
		int rem;
		int sum=0;
		while(n>0){
			rem=n%10;
			sum=sum*10+rem;
			n=n/10;
		}
		if(num==sum)
			System.out.println(num+" is Palindrome Number");
		else
			System.out.println(num+" is not Palindrome Number");
	}
}	

/*
F:\BHAVAJAVA\EEE>javac Palindrome.java

F:\BHAVAJAVA\EEE>java Palindrome
Enter Number
151
151 is Palindrome Number

F:\BHAVAJAVA\EEE>java Palindrome
Enter Number
154
154 is not Palindrome Number
*/