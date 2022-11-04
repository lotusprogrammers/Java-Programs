//Demonstrate break
import java.util.*;
class ReturnDemo{
	public static void main(String[] args){
		Scanner sin=new Scanner(System.in);
		System.out.println("Enter n for exiting from method between 1...10");
		int n=sin.nextInt();
		for(int i=1;i<=10;i++){
			if(i==n){
				System.out.println("Exit from Method Excution no other stmts in method executed");
				return;
			}	
			else
				System.out.println("i="+i);
		}
		System.out.println("This Statement not Executed...");
	}
}
/*
F:\BHAVAJAVA\bhavawipro>javac ReturnDemo.java

F:\BHAVAJAVA\bhavawipro>java ReturnDemo
Enter n for exiting from method between 1...10
5
i=1
i=2
i=3
i=4
Exit from Method Excution no other stmts in method executed

*/





