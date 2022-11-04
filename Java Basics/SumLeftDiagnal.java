//Sum of Matrix Elements
import java.util.*;
class SumLeftDiagnal{
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
		for(int i=0;i<r;i++){
			for(int j=0;j<c;j++){
				if(i==j){
					sum=sum+a[i][j];//sum=sum+a[i][i];//sum=sum+a[j][j];
				}	
			}
		}
		/*This code also work
		for(int i=0;i<r;i++){
				sum=sum+a[i][i];
		  }
		}*/
        System.out.println("Sum of Left diagnal elements of Matrix="+sum);
	}
}	

/*
F:\BHAVAJAVA\bhavawipro>javac SumLeftDiagnal.java

F:\BHAVAJAVA\bhavawipro>java SumLeftDiagnal
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
Sum of Left diagnal elements of Matrix=15
*/
			
/*


when i==j
00 01 02
10 11 12
20 21 22


*/

























/*
        for(int x[]:MatrixName){
			for(int y:x){
				//Access elements from matrix
			}
        }			
				
	*/		
        			  
				
			
				