//ScopeLifetimeDemo.java
class ScopeLifetimeDemo{
	public static void main(String[] args){
		int x=10;//x is global to all blocks of main method
		System.out.println("x="+x); 
		{
		 x=x+1;
         System.out.println("x="+x);	
        }
  		{
		 int y=2;//y local to block	
		 y=y+20;
         System.out.println("y inside block="+y);
        }
		System.out.println("y outside block="+y);//y is not accessed
        System.out.println("x="+x);
	}
}	

/*
F:\BHAVAJAVA\EEE>javac ScopeLifetimeDemo.java
ScopeLifetimeDemo.java:15: error: cannot find symbol
                System.out.println("y outside block="+y);//y is not accessed
                                                      ^
  symbol:   variable y
  location: class ScopeLifetimeDemo
1 error
*/