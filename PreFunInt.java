// Use the Function built-in functional interface.
// Import the Function interface.
import java.util.function.Function;
class PreFunInt {
	public static void main(String args[])
	{
		// This block lambda computes the factorial of an int value.
		Function<Integer, Integer> factorial = (n) -> {
		int result = 1;
		for(int i=1; i <= n; i++)
			result = i * result;
			return result;
		};
		System.out.println("The factorial of 3 is " + factorial.apply(3));
		System.out.println("The factorial of 5 is " + factorial.apply(5));
    }
}

/*
Input and Output
F:\BHAVAJAVA\Lambda>javac PreFunInt.java
F:\BHAVAJAVA\Lambda>java PreFunInt
The factoral of 3 is 6
The factoral of 5 is 120
*/