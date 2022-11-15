//BreakDemo.java
//Loop iteration terminated based on user input
import java.util.*;
class BreakDemo{
	public static void main(String[] args){
		Scanner sin=new Scanner(System.in);
		System.out.println("Enter input to terminate the loop between 1-1000");
		int n=sin.nextInt();
		for(int i=1;i<=1000;i++){
			if(i==n)
				break;
			System.out.println("i="+i);
		}
	}
}	

/*	
F:\BHAVAJAVA\EEE>javac BreakDemo.java

F:\BHAVAJAVA\EEE>java BreakDemo
Enter input to terminate the loop between 1-1000
10
i=1
i=2
i=3
i=4
i=5
i=6
i=7
i=8
i=9
*/	