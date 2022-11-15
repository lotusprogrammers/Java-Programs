//Complex Number Operations
import java.util.*;
class Complex {
	int real,imag;
	Complex(){
		real=0;
		imag=0;
	}
	Complex(int real,int imag){
		this.real=real;
		this.imag=imag;
	}
     Complex addition(Complex c2){
		 Complex add=new Complex();
		 add.real=real+c2.real;
		 add.imag=imag+c2.imag;
		 return add;
	 }
     Complex subtraction(Complex c2){
		 Complex sub=new Complex();
		 sub.real=real-c2.real;
		 sub.imag=imag-c2.imag;
		 return sub;
	 }
     void display(){
		 if(imag>0){
			 System.out.println(real+"+i"+imag);
	     }
         else if(imag<0){
			 System.out.println(real+"-i"+(-imag));
		 }
		 else
             System.out.println(real);
		 }
}
class ComplexDemo {
	public static void main(String[] args) {
		Scanner sin=new Scanner(System.in);
		System.out.println("Enter Complex Number1");
		int real1=sin.nextInt();
		int imag1=sin.nextInt();
		System.out.println("Enter Complex Number 2");
		int real2=sin.nextInt();
		int imag2=sin.nextInt();
		Complex c1=new Complex(real1,imag1);
		Complex c2=new Complex(real2,imag2);
		System.out.println("Complex Numbers c1,c2=");
		c1.display();
		c2.display();
		Complex ca=c1.addition(c2);
		Complex cs=c1.subtraction(c2);
		System.out.println("ca=c1+c2");
		ca.display();
		System.out.println("cs=c1-c2");
		cs.display();
	}
}	
	 
/*
F:\BHAVAJAVA\UNIT-I>javac ComplexDemo.java

F:\BHAVAJAVA\UNIT-I>java ComplexDemo
Enter Complex Number1
4
3
Enter Complex Number 2
3
5
Complex Numbers c1,c2=
4+i3
3+i5
ca=c1+c2
7+i8
cs=c1-c2
1-i2
*/			 
 	 
		 
		 
	
