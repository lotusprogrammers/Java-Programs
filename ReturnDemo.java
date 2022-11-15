//ReturnDemo.java
//Exit from Method Execution
import java.util.*;
class ReturnDemo{
	public static void main(String[] args){
		Scanner sin=new Scanner(System.in);
		System.out.println("Enter input to exit from method either 0 or 1");
		int n=sin.nextInt();
		if(n==0)
			return;
		else if(n==1){
			System.out.println("Our Programming Learning Journey Continues till the end of life");
			System.out.println("So concentrate on improving logical thinking");
		}
        System.out.println("I executed when n=1,but i won't executed  n==0");		
	}
}	

/*
F:\BHAVAJAVA\EEE>javac ReturnDemo.java

F:\BHAVAJAVA\EEE>java ReturnDemo
Enter input to exit from method either 0 or 1
1
Our Programming Learning Journey Continues till the end of life
So concentrate on improving logical thinking
I executed when n=1,but i won't executed  n==0

F:\BHAVAJAVA\EEE>java ReturnDemo
Enter input to exit from method either 0 or 1
0
*/		
