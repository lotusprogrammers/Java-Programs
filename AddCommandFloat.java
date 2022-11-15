import java.lang.*;
class AddCommandFloat{
	public static void main(String[] args){
		String arg0=args[0];//"25.7"
		String arg1=args[1];//"75.9"
		String arg2=args[2];//"97.3"
		float a=Float.parseFloat(arg0);//25.7
		//From Float class
		//public static float parseFloat(String str);
		float b=Float.parseFloat(arg1);//75.9
		float c=Float.parseFloat(arg2);//97.3
		float res=a+b+c;
		System.out.println("Addition of "+a+","+b+" and "+c+"="+res);
	}
}	