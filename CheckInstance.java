//Demonstration of instanceof operator
class CheckInstance{
	public static void main(String[] args){
		String str="III EEE-B are good students";
		if(str instanceof String)
			System.out.println("str is String type");
		else
			System.out.println("str is not a String type");
	}
}	

/*
F:\BHAVAJAVA\EEE>javac CheckInstance.java

F:\BHAVAJAVA\EEE>java CheckInstance
str is String type
*/