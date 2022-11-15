//Abstract Methods and Abstract Classes
abstract class Figure {
	double dim1,dim2;
	Figure(){
		this.dim1=0;
		this.dim2=0;
	}
    Figure(double dim1,double dim2){
		this.dim1=dim1;
		this.dim2=dim2;
	}
    void display(){//Concrete method
		System.out.println("Dimensions are");
		System.out.println("Dim1="+dim1+"\t"+"Dim2="+dim2);
	}	
	abstract double area(); //Abstract method
}
class Rectangle extends Figure{
	Rectangle(){
		super();
	}
    Rectangle(double dim1,double dim2){
		super(dim1,dim2);
	}
    double area() {
		double ar=dim1*dim2;
		return ar;
	}
}
class Traingle extends Figure {
	Traingle() {
		super();
	}
    Traingle(double dim1,double dim2){
		super(dim1,dim2);
	}
    double area() {
		double ar=0.5*dim1*dim2;
		return ar;
	}
}
class AbstractDemo{
	public static void main(String[] args){
		Figure f;
		double ar;
		System.out.println("Figure.....");
		//f=new Figure(2,5);
		//Object can n't instantiated for Figure Abstract class 
		//f.display();
		//ar=f.area(); //Error
		System.out.println("Rectangle.....");
		f=new Rectangle(5,7);
		f.display();
		ar=f.area();
		System.out.println("Area of Rectangle="+ar);
		System.out.println("Traingle.....");
		f=new Traingle(8,9);
		f.display();
		ar=f.area();
		System.out.println("Area of Traingle ="+ar);
	}
}	

/*	
F:\BHAVAJAVA\UNIT-II>javac AbstractDemo.java

F:\BHAVAJAVA\UNIT-II>java AbstractDemo
Figure.....
Rectangle.....
Dimensions are
Dim1=5.0        Dim2=7.0
Area of Rectangle=35.0
Traingle.....
Dimensions are
Dim1=8.0        Dim2=9.0
Area of Traingle =36.0
*/   		
	
    		
		
		
	
	
		
		