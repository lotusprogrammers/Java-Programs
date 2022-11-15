//Armstrong Number -Sum of powers of digits of a number,the powers are referred
//from no of digits in corresponding input number
//ArmstrongNum.java
import java.util.*;
class ArmstrongNum{
	public static void main(String[] args){
		Scanner sin=new Scanner(System.in);
		System.out.println("Enter Input Number=");
		int n=sin.nextInt();
		int num=n;
		int nd=0;
		/* counting no of digits of number
		while(num>0){
			nd=nd+1;
			num=num/10;
		} */
        nd=(new String(""+n)).length();	
        int originalnum=n;
		int rem,sum=0;
        while(n>0){
			rem=n%10;
			sum=sum+(int)(Math.pow(rem,nd));
			//Ex:2 power 5.
			//Syntax for pow method from Math class is
			//public static double pow(double base,double pow)
			n=n/10;
		}
        if(originalnum==sum)
			System.out.println(originalnum+" is Armstrong Number ");
		else
			System.out.println(originalnum+" is not Armstrong Number ");
	}
}	

/*
F:\BHAVAWIPRO23\BhavaWiproMettl>javac ArmstrongNum.java

F:\BHAVAWIPRO23\BhavaWiproMettl>java ArmstrongNum
Enter Input Number=
153
153 is Armstrong Number

F:\BHAVAWIPRO23\BhavaWiproMettl>java ArmstrongNum
Enter Input Number=
125
125 is not Armstrong Number
*/
			
			
			