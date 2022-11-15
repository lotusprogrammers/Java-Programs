interface StringFunc {
	String func(String n);
}
class XYZ {
	static String stringOp(StringFunc sf, String s) {
        return sf.func(s);
    }
	public static void main(String args[])
	{
		// This block lambda reverses the characters in a string.
      String instr="Lambda Expressions are Java 8.0 Feature";
	  String outstr;
	  outstr = stringOp((str) -> {
			                      String result = "";
			                      int i;
			                      for(i = str.length()-1; i >= 0; i--)
				                      result += str.charAt(i);
			                       return result;
                                 },instr);
	   System.out.println("Lambda reversed is " +outstr);
	  
	   outstr = stringOp((str) -> {
			                       String result=str.toUpperCase();
			                       return result;
                                  },instr);
       System.out.println("Uppercase String  is "+outstr);
       outstr = stringOp((str) -> {
			                       String result=str.toLowerCase();
		                           return result;
                                  },instr);
       System.out.println("Lowercase String  is "+outstr);
     }
}

/*Input and Output
F:\BHAVAJAVA\Lambda>javac XYZ.java

F:\BHAVAJAVA\Lambda>java XYZ
Lambda reversed is erutaeF 0.8 avaJ era snoisserpxE adbmaL
Uppercase String  is LAMBDA EXPRESSIONS ARE JAVA 8.0 FEATURE
Lowercase String  is lambda expressions are java 8.0 feature
*/