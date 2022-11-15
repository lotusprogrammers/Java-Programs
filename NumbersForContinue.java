//Print numbers from 1...n Using for loop
import java.util.*;
class NumbersForContinue{
	public static void main(String[] args){
		Scanner sin=new Scanner(System.in);
		System.out.println("Chitti Walks from step-1 to step-n");
		int n=sin.nextInt();
		for(int i=1;i<=n;i++){	
			if(i==20){
				System.out.println("Chitti make jump");		
			    continue;
			}	
			System.out.println("Chitti at step number="+i);
			System.out.println("Chitti loss="+i+"caleries");
        }
        		
	}
}	
		