// Demonstrate a method reference to an instance method
interface StringFunc {
	String func(String n);
}
class MyStringOps {
	String strReverse(String str) {
		String result = "";
		int i;
		for(i = str.length()-1; i >= 0; i--)
		result += str.charAt(i);
		return result;
	}
}
class MethodRef {
	static String stringOp(StringFunc sf, String s) {
		return sf.func(s);
   }
   public static void main(String args[])
   {
    String inStr = "Lambdas add power to Java";
    String outStr;
    // Create a MyStringOps object.
    MyStringOps strOps = new MyStringOps( );
    outStr = stringOp(strOps::strReverse, inStr);
    System.out.println("Original string: " + inStr);
    System.out.println("String reversed: " + outStr);
   }
}

/*Input and Output
F:\BHAVAJAVA\Lambda>javac MethodRef.java
F:\BHAVAJAVA\Lambda>java MethodRef
Original string: Lambdas add power to Java
String reversed: avaJ ot rewop dda sadbmaL
*/


