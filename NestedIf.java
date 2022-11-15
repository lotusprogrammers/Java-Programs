//Maximum of Three Numbers
//NestedIf.java
import java.util.*;
class NestedIf{
	public static void main(String[] args){
		Scanner sin=new Scanner(System.in);
		System.out.println("Enter a,b,c");
		int a=sin.nextInt();
		int b=sin.nextInt();
		int c=sin.nextInt();
		if(a>b){
			if(a>c){
				System.out.println("a is greater");
			}
            else{
                System.out.println("c is greater");
            }
        }
        else{
			if(b>c){
				System.out.println("b is greater");
	     	} 
            else{
                System.out.println("c is greater");
		   }
	   }
   }
}  

/*
F:\BHAVAJAVA\EEE>javac NestedIf.java

F:\BHAVAJAVA\EEE>java NestedIf
Enter a,b,c
57
89
32
b is greater

F:\BHAVAJAVA\EEE>java NestedIf
Enter a,b,c
99
25
112
c is greater

F:\BHAVAJAVA\EEE>java NestedIf
Enter a,b,c
97
12
79
a is greater

*/









































 
		