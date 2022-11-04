//AdditionCommand.java
class AdditionCommand{
	public static void main(String[] args){
		String str1=args[0];
		String str2=args[1];
		int a=Integer.parseInt(str1);
		int b=Integer.parseInt(str2);
		int c;
		c=a+b;
		System.out.println("Addition of Two Numbers="+c);
	}
}	
	/*
F:\BHAVAJAVA\bhavawipro>javac AdditionCommand.java

F:\BHAVAJAVA\bhavawipro>java AdditionCommand 2 5
Addition of Two Numbers=7

F:\BHAVAJAVA\bhavawipro>java AdditionCommand 1099 789
Addition of Two Numbers=1888
*/	

/*
Description		
In java.lang package  in Integer class
static int parseInt(String str)//Returns int value for String 
*/