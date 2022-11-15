class Outer{
  static private int x=20;
  static class Inner{
     static void display(){
	    System.out.println("Calling from Inner"+x);
     }
   }
    void callInnerMethod(){
        // Inner i=new Inner();
         Inner.display();
    }
}

class InnerOuterDemo{
  public static void main(String args[]){
     Outer o=new Outer();
	 o.callInnerMethod();
  }
}  
     	 