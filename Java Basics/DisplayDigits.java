//Display Digits of a Number
//DisplayDigits.java
import java.util.*;
class DisplayDigits{
	public static void main(String[] args){
		Scanner sin=new Scanner(System.in);
		System.out.println("Enter a Number");
		int n=sin.nextInt(); //78939
		int rem;
		System.out.println("Individual Digits of a number in Reverse Order...");
		while(n>0){
			rem=n%10; //7
			System.out.println("Digit="+rem);//9 3 9 8 7
			n=n/10;
		}	
	}
}	
/*
F:\BHAVAJAVA\bhavawipro>javac DisplayDigits.java

F:\BHAVAJAVA\bhavawipro>java DisplayDigits
Enter a Number
78939
Individual Digits of a number in Reverse Order...
Digit=9
Digit=3
Digit=9
Digit=8
Digit=7

*/
/		
/*		
		
		123=123%10=3   123/10=12
		    12%10=2     12/10=1
			1%10=1       1/10=0
*/
		