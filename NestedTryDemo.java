//Demonstration of Nested Try
//NestedTryDemo.java
class NestedTryDemo {
   public static void main(String args[]) {
      try {
         int a[]=new int[10];
         System.out.println(a[12]);
         try {
            System.out.println("Division");
            int res = 100/ 0;
         }
         catch (ArithmeticException e) {
            System.out.println("Excception from Inner Try Block");
			e.printStackTrace();
         }
      }
      catch (ArrayIndexOutOfBoundsException e) {
         System.out.println("Excception from Outer Try Block");
		 e.printStackTrace();    
	 }
   }
}
/*
F:\BHAVAJAVA\UNIT-III>javac NestedTryDemo.java

F:\BHAVAJAVA\UNIT-III>java NestedTryDemo
Excception from Outer Try Block
java.lang.ArrayIndexOutOfBoundsException: 12
        at NestedTryDemo.main(NestedTryDemo.java:7)
*/