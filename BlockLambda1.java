// A block lambda that computes the factorial of an int value.
interface NumericFunc {
	int factlambda(int n);
}
class BlockLambda1 {
	public static void main(String args[])
	{
		// This block lambda computes the factorial of an int value.
		NumericFunc factorial = (n) -> {
			int result = 1;
			for(int i=1; i <= n; i++)
				result = i * result;
			return result;
	    };
		System.out.println("The factoral of 3 is " + factorial.factlambda(3));
		System.out.println("The factoral of 5 is " + factorial.factlambda(5));
	}
}
/*Input and Output
F:\BHAVAJAVA\Lambda>javac BlockLambda1.java
F:\BHAVAJAVA\Lambda>java BlockLambda1
The factoral of 3 is 6
The factoral of 5 is 120
*/