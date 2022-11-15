//Demonstration for this keyword and Instance Variable Hiding
class Box {
	double width,height,depth;
	Box() {
		width=0;
		height=0;
		depth=0;
	}
    Box(double width,double height,double depth){
		this.width=width;
		this.height=height;
		this.depth=depth;
	}
    double volume(){
         //calling members with this keyword is optional 
		 return this.width*this.height*this.depth;
    }
}
class InstanceDemo{
	public static void main(String[] args) {
		Box b=new Box(2.0,5.0,7.5);
		System.out.println("Volume="+b.volume());
	}
}	
/*
F:\BHAVAJAVA\UNIT-I>javac InstanceDemo.java
F:\BHAVAJAVA\UNIT-I>java InstanceDemo
Volume=75.0
*/
	
		