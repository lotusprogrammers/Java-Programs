//Return last digit of the given number
//Return second last digit of the given number
//Sum of last digits of two given numbers
import java.util.*;
class LastDigits{
	public static void main(String[] args){
		Scanner sin=new Scanner(System.in);
		System.out.println("Enter n=");
		int n=sin.nextInt();
		int ld=n%10;
		int sld=(n/10)%10;
		int sum=ld+sld;
		System.out.println("Last digit of "+n+"="+ld);
		System.out.println("Second Last digit of "+n+"="+sld);
		System.out.println("Last digit and Second Last digit of "+n+"="+sum);
	}
}
/*
F:\BHAVAWIPRO23\BhavaWiproMettl>javac LastDigits.java

F:\BHAVAWIPRO23\BhavaWiproMettl>java LastDigits
Enter n=
197
Last digit of 197=7
Second Last digit of 197=9
Last digit and Second Last digit of 197=16

F:\BHAVAWIPRO23\BhavaWiproMettl>java LastDigits
Enter n=
228
Last digit of 228=8
Second Last digit of 228=2
Last digit and Second Last digit of 228=10

F:\BHAVAWIPRO23\BhavaWiproMettl>java LastDigits
Enter n=
783
Last digit of 783=3
Second Last digit of 783=8
Last digit and Second Last digit of 783=11
*/	
		
		