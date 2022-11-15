class Outer{
	static private int x=10;
	private int z=30;
	static class Inner {
		static private int y=20;
		static void display() {
			System.out.println("Called from Static Inner class x="+x);
			Outer zo=new Outer();
			System.out.println("non static member from Outer="+zo.z);
		}
    }//close Inner
    //outer class method
    void innerDisplay() {
       System.out.println("Inner class y="+Inner.y);
	   System.out.println("z="+z);
	   Inner.display();
	   //display();
	}
}
class StaticInner{
	public static void main(String args[]) {
		Outer o=new Outer();
		o.innerDisplay();
		
	}
}	
	