//MultipleCatch.java
import java.util.*;
class MultipleCatch1{
	public static void main(String[] args){
		Scanner sin=new Scanner(System.in);
		int x=10,y=0,c;
		int a[]={1,2,3};
		try{
			System.out.println("Enter Choice");
			int ch=sin.nextInt();
			if(ch==1){
				c=x/y;
			    System.out.println("Division="+c);
			}
			else if(ch==2){
				System.out.println("a[0]="+a[0]);
			    System.out.println("a[12]="+a[12]);
			}
		}
        catch(RuntimeException e){
			e.printStackTrace();
		}
	}
}	
			
			
	