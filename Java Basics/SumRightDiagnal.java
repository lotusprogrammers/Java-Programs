//Sum of Matrix Elements
import java.util.*;
class SumRightDiagnal{
	public static void main(String[] args){
		Scanner sin=new Scanner(System.in);
		System.out.println("Enter rows and Colums");
		int r=sin.nextInt();
		int c=sin.nextInt();
		int a[][]=new int[r][c];
		System.out.println("Enter Matrix Elements...");
		for(int i=0;i<r;i++){
			for(int j=0;j<c;j++){
				a[i][j]=sin.nextInt();
			}
        }
		System.out.println("Matrix Elements Using for-each loop");
        for(int x[]:a){
            for(int y:x){
              System.out.print(y+"\t");
            }
            System.out.println();
        } 			
		int sum=0;
		/*
		for(int i=0;i<r;i++){
			for(j=0;j<c;j++){
				if(j==c-1-i){
					sum=sum+a[i][j];
				}
            }
        }			
		*/
		for(int i=0;i<r;i++)
			sum=sum+a[i][c-1-i];
        System.out.println("Sum of Right diagnal elements of Matrix="+sum);
	}
}	
/*
F:\BHAVAJAVA\bhavawipro>javac SumRightDiagnal.java

F:\BHAVAJAVA\bhavawipro>java SumRightDiagnal
Enter rows and Colums
3
3
Enter Matrix Elements...
1
2
3
4
5
6
7
8
9
Matrix Elements Using for-each loop
1       2       3
4       5       6
7       8       9
Sum of Right diagnal elements of Matrix=15

*/

/*

when (j=c-1-i)  r=3 c=3  
00 01 02         2==3-1-0
10 11 12         1==3-1-1      
20 21 22         0==3-1-2


*/

























/*
        for(int x[]:MatrixName){
			for(int y:x){
				//Access elements from matrix
			}
        }			
				
	*/		
        			  
				
			
				