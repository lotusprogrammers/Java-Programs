interface GenAdd<T>{
	T add(T a,T b);
}
class GenLambda{
	public static void main(String args[])
	{
		// This block lambda reverses the characters in a string.
	   GenAdd<Integer> iadd = (a,b) -> {
			return (a+b);
       };
	   System.out.println("Integers addition from Lambda is " +iadd.add(2,3));
	   GenAdd<Double> dadd = (a,b) -> {
			return (a+b);
       };
	   System.out.println("Double addition from Lambda is " +dadd.add(2.5,3.7));
	   GenAdd<String> sadd = (a,b) -> {
			return (a+b);
       };
	   System.out.println("Strings addition from Lambda is " +sadd.add("India","America")); 
	
  }
}
/*Input and Output
F:\BHAVAJAVA\Lambda>javac GenLambda.java
F:\BHAVAJAVA\Lambda>java GenLambda
Integers addition from Lambda is 5
Double addition from Lambda is 6.2
Strings addition from Lambda is IndiaAmerica
*/

