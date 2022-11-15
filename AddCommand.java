import java.lang.*;
class AddCommand{
	public static void main(String[] args){
		String arg0=args[0];//"25"
		String arg1=args[1];//"75"
		String arg2=args[2];//"97"
		int a=Integer.parseInt(arg0);//25
		//From Integer class
		//public static int parseInt(String str);
		int b=Integer.parseInt(arg1);//75
		int c=Integer.parseInt(arg2);//97
		int res=a+b+c;
		System.out.println("Addition of "+a+","+b+" and "+c+"="+res);
	}
}	