//Matrix Multiplication
//MatrixMul.java
import java.util.*;
class MatrixMul{
	public static void main(String[] args){
		Scanner sin=new Scanner(System.in);
		System.out.println("Enter rows and columns of a matrix");
        int r1=sin.nextInt();
		int c1=sin.nextInt();
		System.out.println("Enter rows and columns of b matrix");
        int r2=sin.nextInt();
		int c2=sin.nextInt();
		int a[][]=new int[r1][c1];
		int b[][]=new int[r2][c2];
		System.out.println("Enter a matrix elements...");
		for(int i=0;i<r1;i++){
			for(int j=0;j<c1;j++){
				a[i][j]=sin.nextInt();
			}
        }
  	    System.out.println("Enter b matrix elements...");
		for(int i=0;i<r2;i++){
			for(int j=0;j<c2;j++){
				b[i][j]=sin.nextInt();
			}
        }
		int c[][]=new int[r1][c2];
		if(c1==r2){
			System.out.println("Matrix Multiplication Possible");
			for(int i=0;i<r1;i++){
				for(int j=0;j<c2;j++){
					c[i][j]=0;
					for(int k=0;k<c1;k++){
						c[i][j]=c[i][j]+a[i][k]*b[k][j];
					}
                }
            }
            System.out.println("C  Matrix elements...");
		    for(int i=0;i<r1;i++){
				for(int j=0;j<c2;j++){
					System.out.print(c[i][j]+"\t");
				}
                System.out.println();
            }
        }
	}
}
/*
F:\BHAVAJAVA\bhavawipro>javac MatrixMul.java

F:\BHAVAJAVA\bhavawipro>java MatrixMul
Enter rows and columns of a matrix
3
3
Enter rows and columns of b matrix
3
3
Enter a matrix elements...
1
2
3
4
5
6
7
8
9
Enter b matrix elements...
1
2
1
2
2
4
3
3
2
Matrix Multiplication Possible
C  Matrix elements...
14      15      15
32      36      36
50      57      57
*/
/*
a   1 2 3
    4 5 6
    7 8 9
b   1 2 1
    2 2 4
    3 3 2
c[0][0]=c[0][0]+a[0][0]*b[0][0]=0+1*1=1
        =1+a[0][1]*b[1][0]=1+2*2=5
		=5+a[0][2]*b[2][0]=5+3*3=14
c[0][0]=14

c[1][2]=c[1][2]+a[1][0]*b[0][2]=0+4*1=4
       =4+a[1][1]*b[1][2]=4+5*4=24
       =24+a[1][2]*b[2][2]=24+6*2=36 		
				
*/	
  




  

				
		
  		