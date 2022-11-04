class EvenOdd{
	int number;
	EvenOdd(int number){
		this.number=number;
	}
    boolean test(){
		if(number%2==0)
			return true;
		else
			return false;
	}
}
class EvenOddDemo{
	public static void main(String[] args){
		EvenOdd eo=new EvenOdd(3);
		if(eo.test())
			System.out.println("Number is Even");
		else
			System.out.println("Number is Odd");
	}
}	
	
/*
F:\BHAVAJAVA\bhavawipro>javac EvenOddDemo.java

F:\BHAVAJAVA\bhavawipro>java EvenOddDemo
Number is Odd
*/	
	
		
