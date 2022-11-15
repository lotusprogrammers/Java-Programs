// An example of capturing a local variable from the enclosing scope.
interface MyFunc {
	int func(int n);
}
class VarCapture {
	public static void main(String args[])
	{
		// A local variable that can be captured.
        int num = 10;
		num++;
         MyFunc myLambda = (n) -> {
         int v = num + n;
        //num++ is illegal.'num' variable captured as final. 
        // num++;
		return v;
        };
        // The following line would also cause an error,
		//because it would try to remove the effectively final status from num.
        System.out.println(" num+n="+myLambda.func(5));
		//num++;
     }
}

/*Input and Output
F:\BHAVAJAVA\Lambda>javac VarCapture.java
VarCapture.java:12: error: local variables referenced from a lambda expression must be final or effectively final
         int v = num + n;
                 ^
1 error
*/
