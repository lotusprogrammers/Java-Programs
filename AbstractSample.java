abstract class Figure{
	double dim1,dim2;
	public Figure(){
		this.dim1=0;
		this.dim2=0;
	}
    public Figure(double dim1,double dim2){
		this.dim1=dim1;
		this.dim2=dim2;
	}
    void display(){
		System.out.println("Dimensions ar...");
		System.out.println("Dim1="+dim1);
		System.out.println("Dim2="+dim2);
	}
    abstract double area();
}
class RectangleFigure extends Figure{
	RectangleFigure(){
		super();
	}
    RectangleFigure(double dim1,double dim2){
		super(dim1,dim2);
	}
    double area(){
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
    double area(){
		return 0.5*dim1*dim2;
	}
}
class AbstractSample{
	public static void main(String[] args){
		Figure f;
		f=new RectangleFigure(2,5);
		System.out.println("f refers RectangleFigure object...");
		f.display();
		System.out.println("Area of Rectangle="+f.area());
		f=new TraingleFigure(2,5);
		System.out.println("f refers TraingleFigure object...");
		f.display();
		System.out.println("Area of Traingle="+f.area());
	}
}	
	
 		
		
	
		
		
  	
		
		