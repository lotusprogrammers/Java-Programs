package p1;
public class TraingleFigure extends AbstractFigure {
	public TraingleFigure() {
		super();
	}
    public TraingleFigure(double dim1,double dim2){
		super(dim1,dim2);
	}
    public double area() {
		double ar=0.5*dim1*dim2;
		return ar;
	}
}