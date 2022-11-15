//DynMethodAbstractClasses.java
//Demonstration of Abstract classes,
//Demonstration of Inheritance,
//Demonstration of super keyword 
//Demonstration of overriding
//Demonstration of Dynamic Method dispatch
abstract class Figure{
	double dim1;
	double dim2;
	Figure(){
		double dim1=0;
		double dim2=0;
	}
    Figure(double dim1,double dim2){
		this.dim1=dim1;
		this.dim2=dim2;
	}
	public void display(){//concrete method
		System.out.println("Dimenstions...");
		System.out.println("dim1="+dim1);
		System.out.println("dim2="+dim2);
	}	
	abstract public double area();//abstract method
		
}
class RectangleFigure extends Figure{
	RectangleFigure(){
		super();
	}
    RectangleFigure(double dim1,double dim2){
		super(dim1,dim2);
	}
	public double area(){
		System.out.println("Figure is Rectangle...");
		return dim1*dim2;
	}
}	
class TraingleFigure extends Figure{
	TraingleFigure(){
		super();
	}
    TraingleFigure(double dim1,double dim2){
		super(dim1,dim2);
	}
	public double area(){
		System.out.println("Figure is Rectangle...");
		return 0.5*dim1*dim2;
	}
}	
class DynMethodAbstractClasses{
	public static void main(String[] args){
		Figure f;
		//f=new Figure(5,7);//Figure class should n't instantiated(Figure is abstract)
		//f.display(); //Error!
		//System.out.println("Area of Figure=");
		//System.out.println(f.area());//Error!
		f=new RectangleFigure(5,7);//Figure ref assigned with RectangleFigure object
		f.display();
		System.out.println("Area of RectangleFigure=");
		System.out.println(f.area());
		f=new TraingleFigure(5,7);//Figure ref assigned with TraingleFigure object
		f.display();
		System.out.println("Area of RectangleFigure=");
		System.out.println(f.area());
	}
}
/*
F:\>javac DynMethodAbstractClasses.java
F:\>java DynMethodAbstractClasses
Dimenstions...
dim1=5.0
dim2=7.0
Area of RectangleFigure=
Figure is Rectangle...
35.0
Dimenstions...
dim1=5.0
dim2=7.0
Area of RectangleFigure=
Figure is Rectangle...
17.5
*/	
