//Arithemtic Operators
import java.util.*;
class Arithmetic{
	public static void main(String[] args){
		Scanner sin=new Scanner(System.in);
		System.out.println("Enter a,b");
		int a=sin.nextInt();
		int b=sin.nextInt();
		int res;
		res=a+b;
		System.out.println("Addition res="+res);
		res=a-b;
		System.out.println("Subtraction res="+res);
		res=a*b;
		System.out.println("Multiplication res="+res);
		float div;
		div=(flaot)a/b;
		System.out.println("Division res="+div);
		res=a%b;
		Systemout.println("Modulo Divison res="+res);
		res=a++;
		System.out.println("Post Increment res="+res);
		res=a--;
		System.out.println("Post Decrement res="+res);
		res=++a;
		System.out.println("Pre Increment res="+res);
		res=--a;
		System.out.println("Pre Decrement res="+res);
	}
}	

