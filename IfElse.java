// If Else
import java.util.*;
class IfElse{
	public static void main(String[] args){
		Scanner sin=new Scanner(System.in);
		System.out.println("Enter Your CGPA");
		float cgpa=sin.nextFloat();
		if(cgpa>=6.0)
			System.out.println("You are eligible for Campus Recruitments");
	    else {
			System.out.println("You are not eligible");
			System.out.println("Try and practice differently,You may have chance");
		}
		System.out.println("All the Best");
	}
}
/*
F:\BHAVAJAVA\EEE>javac IfElse.java

F:\BHAVAJAVA\EEE>java IfElse
Enter Your CGPA
7.9
You are eligible for Campus Recruitments
All the Best

F:\BHAVAJAVA\EEE>java IfElse
Enter Your CGPA
5.5
You are not eligible
Try and practice differently,You may have chance
All the Best
*/	