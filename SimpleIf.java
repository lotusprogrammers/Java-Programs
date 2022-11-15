//Simple If
import java.util.*;
class SimpleIf{
	public static void main(String[] args){
		Scanner sin=new Scanner(System.in);
		System.out.println("Enter Your CGPA");
		float cgpa=sin.nextFloat();
		if(cgpa>=6.0)
			System.out.println("You are eligible for Campus Recruitments");
	    System.out.println("All the Best");
	}
}	
/*
F:\BHAVAJAVA\EEE>javac SimpleIf.java

F:\BHAVAJAVA\EEE>java SimpleIf
Enter Your CGPA
7.9
You are eligible for Campus Recruitments
All the Best

F:\BHAVAJAVA\EEE>java SimpleIf
Enter Your CGPA
5.5
All the Best
*/