//Palindrome Number-Reverse of a number is equal to given number
//PalindromeNumber.java
import java.util.*;
class PalindromeNumber{
	public static void main(String[] args){
		Scanner sin=new Scanner(System.in);
		System.out.println("Enter a Number");
		int n=sin.nextInt(); 
		int rem;
		int sum=0;
		int original=n;
		while(n>0){
			rem=n%10; 
		    sum=sum*10+rem;
			n=n/10;
		}
        if(original==sum){
			System.out.println(original+"  number is Palindrome Number");
		}
        else{
            System.out.println(original+" number not a Palindrome Number");			
		}	
	}
}	
/*
F:\BHAVAJAVA\bhavawipro>javac PalindromeNumber.java

F:\BHAVAJAVA\bhavawipro>java PalindromeNumber
Enter a Number
363
363  number is Palindrome Number

F:\BHAVAJAVA\bhavawipro>java PalindromeNumber
Enter a Number
123
123 number not a Palindrome Number

F:\BHAVAJAVA\bhavawipro>java PalindromeNumber
Enter a Number
79197
79197  number is Palindrome Number
*/


/*sum=0
123  3  sum=sum*10+3=3                             12
12   2  sum=sum*10+2=3*10+2=32                      1
1    1  sum=sum*10+1=32*10+1=321                    0
*/ 