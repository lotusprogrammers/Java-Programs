//Constructor Overloading
//Many constructors are defined in same class with different number of arguments
class Box{
	double width,height,depth;
	//Default Constructor
	Box(){
		System.out.println("Default constructor invoked...");
		width=0;
		height=0;
		depth=0;
	}
    //Parameterized constructor with one argument
	Box(double dim){
		System.out.println("Parameterized constructor with one argument called...");
		width=height=depth=dim;
	}
    //Parameterized constructor with two arguments
    Box(double dim1,double dim2){
		System.out.println("Parameterized constructor with two arguments called...");
		width=height=dim1;
		depth=dim2;
	}
    //Parmeterized constructor with three arguments
    Box(double w,double h,double d){
		System.out.println("Parameterized constructor with three arguments called...");
		width=w;
		height=h;
		depth=d;
	}
    double volume(){
		double vol;
		vol=width*height*depth;
		return vol;
	}
}
class ConstructorOverload{
	public static void main(String[] args){
		Box b1=new Box();//Default constructor invoked
		double vol;
		vol=b1.volume();
		System.out.println("Box b1 volume="+vol);
		Box b2=new Box(3);//parmeterized constructor with one argument invoked
		vol=b2.volume();
		System.out.println("Box b2 volume="+vol);
		Box b3=new Box(3,7);//parmeterized constructor with two arguments invoked
		vol=b3.volume();
		System.out.println("Box b3 volume="+vol);
		Box b4=new Box(3,6,7);//parmeterized constructor with three arguments invoked
		vol=b4.volume();
		System.out.println("Box b4 volume="+vol);
	}
}	
/*
F:\BHAVAJAVA\EEE>javac ConstructorOverload.java

F:\BHAVAJAVA\EEE>java ConstructorOverload
Default constructor invoked...
Box b1 volume=0.0
Parameterized constructor with one argument called...
Box b2 volume=27.0
Parameterized constructor with two arguments called...
Box b3 volume=63.0
Parameterized constructor with three arguments called...
Box b4 volume=126.0
*/		
	
		
		
		
		