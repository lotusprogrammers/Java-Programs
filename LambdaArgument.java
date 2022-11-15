// Demonstrate a lambda expression that takes a parameter.
//LambdaArgument.java
interface NumericTest {
	boolean test(int n);
}
                            
class LambdaArgument {
	public static void main(String args[])
	{
		// A lambda expression that tests if a number is even.
		NumericTest isEven = (n) -> {(n % 2)==0};
		if(isEven.test(10)) System.out.println("10 is even");
		if(!isEven.test(9)) System.out.println("9 is not even");
		//Use a lambda expression that tests if a number is non-negative.
		isEven= (n) -> n >= 0;
		if(isNonNeg.test(1)) System.out.println("1 is non-negative");
		if(!isNonNeg.test(-1)) System.out.println("-1 is negative");
	}
}

/*Input and Output
F:\BHAVAJAVA\Lambda>javac LambdaArgument.java
F:\BHAVAJAVA\Lambda>java LambdaArgument
10 is even
9 is not even
1 is non-negative
-1 is negative
*/