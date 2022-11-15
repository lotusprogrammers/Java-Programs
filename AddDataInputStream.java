//Reading input through DataInputStream class object
import java.io.*;
class AddDataInputStream{
	public static void main(String[] args) throws Exception{
		DataInputStream din=new DataInputStream(System.in);
		//To read input through DataInputStream we have call
		//String readLine() throws Exception
		System.out.println("Enter 3 subject marks"); 
		String str1=din.readLine();//<=30
		String str2=din.readLine();//<=30
		String str3=din.readLine();//<=40
		int a=Integer.parseInt(str1);
		int b=Integer.parseInt(str2);
		int c=Integer.parseInt(str3);
		int res=a+b+c;
		if(res>100){
			System.out.println("My Teacher Overrated me");
		}
        else if(res>=80 && res<=100){
			System.out.println("Today i got good result,Tommorrow more practice...");
		}
        else if(res>=70 && res<80){
             System.out.println("I have to improve a lot");
        }
        else if(res<70){
             System.out.println("More Hardwork required.Such hard work came to my soul");
		}
    
	System.out.println("Thank you for your Quick response");
	}
}	
			
		