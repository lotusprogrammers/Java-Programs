import java.lang.*;
class DivCommand{
	public static void main(String[] args){
		String arg0=args[0];//"7"
		String arg1=args[1];//"5"	
		float a=Float.parseFloat(arg0);//7
		float b=Float.parseFloat(arg1);//5
		int res=(int)a/(int)b;//7.000/5
		System.out.println("Division of "+a+","+b+"="+res);
	}
}	