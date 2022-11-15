//To check whether number is Armstrong or not
//Armstrong.java
import java.util.*;
class Armstrong{
	public static void main(String[] args){
		Scanner sin=new Scanner(System.in);
		System.out.println("Enter Number=");
		int n=sin.nextInt();
		int sum=0,rem;
		int original=n;
		while(n>0){
			rem=n%10;
			sum=sum+(rem*rem*rem);
			n=n/10;
		}	
        if(sum==original)
			System.out.println(original+" is Armstrong Number");
		else
			System.out.println(original+" is not Armstrong Number");
			
	}
}	
/*
F:\BHAVAWIPRO23\BhavaWiproMettl>javac Armstrong.java

F:\BHAVAWIPRO23\BhavaWiproMettl>java Armstrong
Enter Number=
153
153 is Armstrong Number

F:\BHAVAWIPRO23\BhavaWiproMettl>java Armstrong
Enter Number=
125
125 is not Armstrong Number

*/	


		
			
		
