//Demonstrate break
import java.util.*;
class BreakDemo{
	public static void main(String[] args){
		Scanner sin=new Scanner(System.in);
		System.out.println("Enter n for breaking the loop between 1...100");
		int n=sin.nextInt();
		for(int i=1;i<100;i++){
			if(i==n){
				System.out.println("Loop Terminated at i="+i);
				break;
			}	
			else
				System.out.println("i="+i);
		}
	}
}
/*	
F:\BHAVAJAVA\bhavawipro>java BreakDemo
Enter n for breaking the loop between 1...100
19
i=1
i=2
i=3
i=4
i=5
i=6
i=7
i=8
i=9
i=10
i=11
i=12
i=13
i=14
i=15
i=16
i=17
i=18
Loop Terminated at i=19
*/