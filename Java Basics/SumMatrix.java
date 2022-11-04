//Sum of Matrix Elements
import java.util.*;
class SumMatrix{
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
		System.out.println("Matrix Elements are...");
        for(int i=0;i<r;i++){
			for(int j=0;j<c;j++){
				System.out.print(a[i][j]+"\t");
			}
            System.out.println();
        }
        System.out.println("Matrix Elements Using for-each loop");
        for(int x[]:a){
            for(int y:x){
              System.out.print(y+"\t");
            }
            System.out.println();
        } 			
		int sum=0;
		for(int x[]:a){
			for(int y:x){
				sum+=y;
			}
        }
        System.out.println("Sum of Matrix Elements="+sum);
	}
}	
			
/*
F:\BHAVAJAVA\bhavawipro>javac SumMatrix.java

F:\BHAVAJAVA\bhavawipro>java SumMatrix
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
Matrix Elements are...
1       2       3
4       5       6
7       8       9
Matrix Elements Using for-each loop
1       2       3
4       5       6
7       8       9
Sum of Matrix Elements=45

F:\BHAVAJAVA\bhavawipro>

*/

























/*
        for(int x[]:MatrixName){
			for(int y:x){
				//Access elements from matrix
			}
        }			
				
	*/		
        			  
				
			
				