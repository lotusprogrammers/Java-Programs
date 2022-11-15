//Demonstration of Auto Boxing and Un Boxing
class AutoBoxUnBox{
	public static void main(String[] args){
		int ip=9;
		//Auto Boxing
		Integer iob=ip;
		System.out.println("Primitive i="+ip);
		System.out.println("Integer Object iob="+iob);
		//Auto Unboxing
		int xp=iob;
		System.out.println("xp value form iob Auto Unboxing="+xp);
	}
}
/*
F:\BHAVAJAVA\GENERICS>javac AutoBoxUnBox.java

F:\BHAVAJAVA\GENERICS>java AutoBoxUnBox
Primitive i=9
Integer Object iob=9
xp value form iob Auto Unboxing=9
*/	
		
