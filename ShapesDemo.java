interface Shapes{
	double pi=3.14;
	double areaCircle(int r);
	double areaRectangle(int l,int b);
}
class ShapesImpl implements Shapes{
	public double areaCircle(int r){
		return pi*r*r;
	}
     public double areaRectangle(int l,int b){
		 return l*b;
	 }
}
class ShapesDemo{
	public static void main(String args[]){
		Shapes s=new ShapesImpl();
		double ac=s.areaCircle(3);
		System.out.println("Area of Circle="+ac);
		double ar=s.areaRectangle(5,4);
		System.out.println("Area of rectangle="+ar);
	}
}	
/*
F:\BHAVAJAVA\UNIT-II>javac ShapesDemo.java
F:\BHAVAJAVA\UNIT-II>java ShapesDemo
Area of Circle=28.259999999999998
Area of rectangle=20.0
*/		
	
		 
	
	
	


