//Sum of Two elements by receiving elements from command prompt
//SumCommand.java
class PrintCommand{
	public static void main(String args[]){
		String s1=args[0];
		String s2=args[1];
		String s3=args[2];
		String res=s1+" "+s2+" "+s3;
		System.out.println("res="+res);
    }
}	
/*
F:\BHAVAJAVA\EEE>javac PrintCommand.java

F:\BHAVAJAVA\EEE>java PrintCommand Hello Java World!
res=Hello Java World!
*/
