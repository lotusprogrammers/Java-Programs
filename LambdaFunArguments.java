interface StringFunc {
	String func(String n);
}
class LambdaFunArguments {
	static String stringOp(StringFunc sf, String s) {
        return sf.func(s);
    }
	public static void main(String args[])
	{
		// This block lambda reverses the characters in a string.
      instr="Lambda Expressions are Java 8.0 Feature"
	  outstr = stringOp((str) -> {
			                      String result = "";
			                      int i;
			                      for(i = str.length()-1; i >= 0; i--)
				                      result += str.charAt(i);
			                       return result;
                                 },instr);
	   System.out.println("Lambda reversed is " +reverse));
	  
	   outstr = stringOp((str) -> {
			                       String result=str.toUpperCase();
			                       return result;
                                  },instr);
       System.out.println("Uppercase String  is "+outstr"));
       outstr = stringOp((str) -> {
			                       String result=str.toLowerCase();
		                           return result;
                                  },instr);
       System.out.println("Lowercase String  is "+outstr"));
     }
}

