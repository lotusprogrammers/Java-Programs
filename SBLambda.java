interface MyNumber{
	double getValue();
}	
class SBLambda{
	public static void main(String args[]){
		MyNumber myNum;
		//Here, the lambda expression is simply a constant expression.
        // When it is assigned to myNum, a class instance is constructed.
		// Lambda expression implements the getValue() method in MyNumber.
		myNum = () -> 123.45;
		//Call getValue(),provided by assigned lambda expression.
        System.out.println("A fixed value: " + myNum.getValue());
        myNum = () -> Math.random() * 100;
        System.out.println("A random value: " + myNum.getValue());
        System.out.println("Another random value: " + myNum.getValue());
        // Error due to not compatible with functional interface!
		myNum = () -> "123.03";
   }  
}
/*Input and Output
F:\BHAVAJAVA\Lambda>javac SBLambda.java
F:\BHAVAJAVA\Lambda>java SBLambda
A fixed value: 123.45
A random value: 62.432241993471585
Another random value: 6.632275991721492

*/   
		
		
