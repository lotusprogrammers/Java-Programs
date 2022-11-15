//Creating Own Exception
//UserDefinedException.java
import java.util.*;
class InvalidAgeException extends Exception{
	InvalidAgeException(String s){
		super(s);
	}
    public String toString(){
        return "User Defined InvalidAgeException";
    }
}
class UserDefinedException{
	public static void main(String args[]){
		Scanner sin=new Scanner(System.in);
		System.out.println("Enter Age");
		int age=sin.nextInt();
		try{
			if(age<18)
				throw new InvalidAgeException("Not valid Age");
			else
				System.out.println("You are eligible for voting");
		}
		catch(InvalidAgeException e){
			e.printStackTrace();
		}
    }
}	

/*
F:\BHAVAJAVA\UNIT-III>javac UserDefinedException.java

F:\BHAVAJAVA\UNIT-III>java UserDefinedException
Enter Age
27
You are eligible for voting

F:\BHAVAJAVA\UNIT-III>java UserDefinedException
Enter Age
12
User Defined InvalidAgeException
        at UserDefinedException.main(UserDefinedException.java:19)
*/		
	