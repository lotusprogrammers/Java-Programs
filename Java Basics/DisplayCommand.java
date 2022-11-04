//Print command Line Arguments and displaying no of arguments passed
class DisplayCommand{
	public static void main(String[] args){
		int len=args.length;
		//args.length returns no of arguments received into args[] arry
		System.out.println("Command Line arguments are...");
		System.out.println("No of arguments="+len);
		for(int i=0;i<len;i++){
			System.out.println(args[i]);
		}
	}
}	
/*
F:\BHAVAJAVA\bhavawipro>javac DisplayCommand.java

F:\BHAVAJAVA\bhavawipro>java DisplayCommand Hello Java World
Command Line arguments are...
No of arguments=3
Hello
Java
World

F:\BHAVAJAVA\bhavawipro>java DisplayCommand Java is Island name in Indonesiya
Command Line arguments are...
No of arguments=6
Java
is
Island
name
in
Indonesiya

F:\BHAVAJAVA\bhavawipro>java DisplayCommand 1 2 3 4 5
Command Line arguments are...
No of arguments=5
1
2
3
4
5

F:\BHAVAJAVA\bhavawipro>java DisplayCommand 12.7 9 J 15.77 7 Java
Command Line arguments are...
No of arguments=6
12.7
9
J
15.77
7
Java
*/     		