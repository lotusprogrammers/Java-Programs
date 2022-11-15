// Throw an exception from a lambda expression.
interface DoubleNumericArrayFunc {
 double func(double[] n) throws EmptyArrayException;
}
class EmptyArrayException extends Exception {
  EmptyArrayException() {
    super("Array Empty");
  }
}
class LambdaExceptionDemo {
 public static void main(String args[]) throws EmptyArrayException
 {
  double[] values = { 1.0, 2.0, 3.0, 4.0 };
  // This block lambda computes the average of an array of doubles.
  DoubleNumericArrayFunc average = (n) -> {
                 double sum = 0;
                 if(n.length == 0)
                   throw new EmptyArrayException();
                 for(int i=0; i < n.length; i++)
	                sum += n[i];
                 return sum / n.length;
                };
  System.out.println("The average is " + average.func(values));
  // This causes an exception to be thrown.
  System.out.println("The average is " + average.func(new double[0]));
 }
}

/*Input and Output
F:\BHAVAJAVA\Lambda>java LambdaExceptionDemo
The average is 2.5
Exception in thread "main" EmptyArrayException: Array Empty
        at LambdaExceptionDemo.lambda$main$0(LambdaExceptionDemo.java:18)
        at LambdaExceptionDemo.main(LambdaExceptionDemo.java:25)
*/		