//Demonstration of Generic Method in Non Generic class
class NonGen{
	<T>void swap(T a,T b){
			System.out.println("Before Swapping a and b="+a+","+b);
			T temp;
			temp=a;
			a=b;
			b=temp;
			System.out.println("After Swapping a and b="+a+","+b);
	}
}
class GenMethodDemo{
	public static void main(String[] args){
		NonGen ng=new NonGen();
		System.out.println("Invoking 3 forms of display()generic method");
		System.out.println("Swapping of Strings...");
		ng.swap(new String("Virat"),new String("Dhoni"));
		System.out.println("Swapping of Integers...");
		ng.swap(new Integer(5),new Integer(9));
		System.out.println("Swapping of Floating Point Values...");
		ng.swap(new Float(9.79F),new Float(7.99F));
	}
}	
/*
F:\BHAVAJAVA\GENERICS>javac GenMethodDemo.java

F:\BHAVAJAVA\GENERICS>java GenMethodDemo
Invoking 3 forms of display()generic method
Swapping of Strings...
Before Swapping a and b=Virat,Dhoni
After Swapping a and b=Dhoni,Virat
Swapping of Integers...
Before Swapping a and b=5,9
After Swapping a and b=9,5
Swapping of Floating Point Values...
Before Swapping a and b=9.79,7.99
After Swapping a and b=7.99,9.79
*/		
	
    	