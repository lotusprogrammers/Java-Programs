interface StringFunc {
	String func(String n);
}
class BlockLambda2 {
	public static void main(String args[])
	{
		// This block lambda reverses the characters in a string.
		StringFunc reverse = (str) -> {
			String result = "";
			int i;
			for(i = str.length()-1; i >= 0; i--)
				result += str.charAt(i);
			return result;
       };
	   System.out.println("Lambda reversed is " +reverse.func("Lambda"));
	  
	  StringFunc upper = (str) -> {
			String result=str.toUpperCase();
			return result;
       };
       System.out.println("Uppercase String  is "+upper.func("annamacharya"));
       StringFunc lower = (str) -> {
			String result=str.toLowerCase();
			return result;
       };
       System.out.println("Lowercase String  is "+lower.func("JAVA PROGRAMMING"));
     }
}

/*Input and Output
F:\BHAVAJAVA\Lambda>javac BlockLambda2.java
F:\BHAVAJAVA\Lambda>java BlockLambda2
Lambda reversed is adbmaL
Uppercase String  is ANNAMACHARYA
Lowercase String  is java programming
*/