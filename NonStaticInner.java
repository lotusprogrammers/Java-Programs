class Outer{
	 private int x=10;
	 class Inner {
	   private int y=20;
	   void display() {
			System.out.println("Called from Static Inner class x="+x);
		}
    }//close Inner
    //outer class method
    void innerDisplay() {
	   System.out.println("Outer class x="+x);
	   Inner i=new Inner();
	   System.out.println(i.y);
	   i.display();
	}
}
class NonStaticInner{
	public static void main(String args[]) {
		Outer o=new Outer();
		o.innerDisplay();
	}
}	
	