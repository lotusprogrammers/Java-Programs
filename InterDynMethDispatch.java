//InterDynMethDispatch.java
interface Figure{
	void display();
	double area();
}
abstract class AbstractFigure implements Figure{
	double dim1,dim2;
	AbstractFigure(){
		dim1=0;
		dim2=0;
	}
    AbstractFigure(double dim1,double dim2){
		this.dim1=dim1;
		this.dim2=dim2;
	}
    public void display(){
		System.out.println("Dimensions are...");
		System.out.println("dim1="+dim1);
		System.out.println("dim2="+dim2);
	}	
	abstract public double area();
}
class TraingleFigure extends AbstractFigure{
	TraingleFigure(){
		super();
	}
    TraingleFigure(double dim1,double dim2){
		super(dim1,dim2);
	}
    public double area(){
		return 0.5*dim1*dim2;
	}
}
class RectangleFigure extends AbstractFigure{
	RectangleFigure(){
		super();
	}
    RectangleFigure(double dim1,double dim2){
		super(dim1,dim2);
	}
    public double area(){
		return dim1*dim2;
	}
}
class InterDynMethDispatch{
	public static void main(String args[]){
		Figure f;
		//Interface reference can hold object of implemeted sub classes
		f=new TraingleFigure(2,7);
		f.display();
		System.out.println("Traingle area="+f.area());
		f=new RectangleFigure(9,27);
		f.display();
		System.out.println("Rectangle are="+f.area());
	}
}	
		
	
		
		
	
		
		

	
		
	