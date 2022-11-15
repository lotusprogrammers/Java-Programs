// Demonstrate a method reference for a static method.
interface StringFunc {
	String func(String n);
}
// This class defines a static method called strReverse().
class MyStringOps {
	// A static method that reverses a string.
	static String strReverse(String str) {	
		String result = "";
		int i;
		for(i = str.length()-1; i >= 0; i--)
			result += str.charAt(i);
		return result;
	}
}
class StaticMethRef {
	static String stringOp(StringFunc sf, String s) {
		return sf.func(s);
	}
	public static void main(String args[])
	{
		String inStr = "Lambdas add power to Java";
		String outStr;
		// Here, a method reference to strReverse is passed to stringOp().
		outStr = stringOp(MyStringOps::strReverse,inStr);
		System.out.println("Original string: " + inStr);
        System.out.println("String reversed: " + outStr);
     }
}

/*Input and Output
F:\BHAVAJAVA\Lambda>javac StaticMethRef.java
F:\BHAVAJAVA\Lambda>java StaticMethRef
Original string: Lambdas add power to Java
String reversed: avaJ ot rewop dda sadbmaL
*/

