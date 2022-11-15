//Print numbers from 1...n Using while loop
import java.util.*;
class NumbersDoWhile{
	public static void main(String[] args){
		Scanner sin=new Scanner(System.in);
		System.out.println("Chitti Walks from step-1 to step-n");
		int n=sin.nextInt();
		int i=1;
		do{//Test condition of loop
			System.out.println("Chitti at step number="+i);
			System.out.println("Chitti loss="+i+"caleries");
            i=i+1;//i++;
        }while(i<=n);
        System.out.println("Chitti reached destination");		
	}
}	
		