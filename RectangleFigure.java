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