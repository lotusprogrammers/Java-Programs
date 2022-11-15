//Print numbers from 1...n Using for loop
import java.util.*;
class NumbersForReturn{
	public static void main(String[] args){
		Scanner sin=new Scanner(System.in);
		System.out.println("Chitti Walks from step-1 to step-n");
		int n=sin.nextInt();
		System.out.println("At which step Bye Bye from method");
		int bye=sin.nextInt();
		for(int i=1;i<=n;i++){	
			if(i==bye){
				System.out.println("Chitti make jump");		
			    return;
			}	
			System.out.println("Chitti at step number="+i);
			System.out.println("Chitti loss="+i+"caleries");
        }
		System.out.println("This statement not executed");
        System.out.println("I am speak less");		
	}
}	
		