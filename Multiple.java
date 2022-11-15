//Is N an exact multiple of M?
//Multiple.java
import java.util.*;
class Multiple{
	public static void main(String[] args){
		Scanner sin=new Scanner(System.in);
		System.out.println("Accept N and M values...");
		int n=sin.nextInt();
		int m=sin.nextInt();
		if((n%m)==0)
			System.out.println(n+" is exact multiple of "+m);
		else
			System.out.println(n+" is not exact multiple of "+m);
	}
}
/*
F:\BHAVAWIPRO23\BhavaWiproMettl>javac Multiple.java

F:\BHAVAWIPRO23\BhavaWiproMettl>java Multiple
Accept N and M values...
9
7
9 is not exact multiple of 7

F:\BHAVAWIPRO23\BhavaWiproMettl>java Multiple
Accept N and M values...
14
7
14 is exact multiple of 7

F:\BHAVAWIPRO23\BhavaWiproMettl>java Multiple
Accept N and M values...
9
3
9 is exact multiple of 3
*/	
		
			