//Print numbers from 1...n Using while loop
import java.util.*;
class NumbersWhileContinue{
	public static void main(String[] args){
		Scanner sin=new Scanner(System.in);
		System.out.println("Chitti Walks from step-1 to step-n");
		int n=sin.nextInt();
		System.out.println("Chitti bypass step no?");
		int rs=sin.nextInt();
		int i=1;
		while(i<=n){//Test condition of loop			
			if(i==rs){
				System.out.println("At step no "+rs+"Chitti make jump");
				i=i+1;
				continue;
           }
		   else{	   
		     System.out.println("Chitti at step number="+i);
			 System.out.println("Chitti loss="+i+"caleries");
			 i=i+1;
		   } 
		  //i++;
        }
        System.out.println("Chitti reached destination");		
	}
}	
		