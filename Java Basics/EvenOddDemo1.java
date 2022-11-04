class EvenOdd{
	boolean test(int number){
		if(number%2==0)
			return true;
		else
			return false;
	}
}
class EvenOddDemo1{
	public static void main(String[] args){
		EvenOdd eo=new EvenOdd();
		if(eo.test(3))
			System.out.println("Number is Even");
		else
			System.out.println("Number is Odd");
	}
}	
	
/*
F:\BHAVAJAVA\bhavawipro>javac EvenOddDemo1.java
F:\BHAVAJAVA\bhavawipro>java EvenOddDemo1
Number is Odd
*/	
	
		
