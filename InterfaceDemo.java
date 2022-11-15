//Interfaces, Abstract Methods and Abstract Classes
interface Figure{
	void display();
	double area();
}	 
abstract class AbstractFigure implements Figure{
	double dim1,dim2;
	AbstractFigure(){
		this.dim1=0;
		this.dim2=0;
	}
    AbstractFigure(double dim1,double dim2){
		this.dim1=dim1;
		this.dim2=dim2;
	}
    public void display(){//Concrete method
		System.out.println("Dimensions are");
		System.out.println("Dim1="+dim1+"\t"+"Dim2="+dim2);
	}	
	public abstract double area(); //Abstract method
}
class RectangleFigure extends AbstractFigure{
	RectangleFigure(){
		super();
	}
    RectangleFigure(double dim1,double dim2){
		super(dim1,dim2);
	}
    public double area() {
		double ar=dim1*dim2;
		return ar;
	}
}
class TraingleFigure extends AbstractFigure {
	TraingleFigure() {
		super();
	}
    TraingleFigure(double dim1,double dim2){
		super(dim1,dim2);
	}
    public double area() {
		double ar=0.5*dim1*dim2;
		return ar;
	}
}
class InterfaceDemo{
	public static void main(String[] args){
		Figure f;
		double ar;
		System.out.println("Figure.....");
		pSystem.out.println("RectangleFigure.....");
		f=new RectangleFigure(5,7);
		f.display();
		ar=f.area();
		System.out.println("Area of RectangleFigure="+ar);
		System.out.println("TraingleFigure.....");
		f=new TraingleFigure(8,9);
		f.display();
		ar=f.area();
		System.out.println("Area of TraingleFigure ="+ar);
	}
}	

/*	
F:\BHAVAJAVA\UNIT-II>javac InterfaceDemo.java

F:\BHAVAJAVA\UNIT-II>java InterfaceDemo
Figure.....
RectangleFigure.....
Dimensions are
Dim1=5.0        Dim2=7.0
Area of RectangleFigure=35.0
TraingleFigure.....
Dimensions are
Dim1=8.0        Dim2=9.0
Area of TraingleFigure =36.0
*/   		
	
    		
		
		
	
	
		
		