//Demonstration of Main Thread
class MainThreadDemo{
   public static void main(String args[]){
      Thread t=Thread.currentThread();
	  System.out.println("Current Thread="+t);
	  t.setName("AITS-WIPRO");
	  System.out.println("After Name Changing="+t.getName());
	  System.out.println("Thread Priority="+t.getPriority());
	  System.out.println("Thead is alive="+t.isAlive());
	  System.out.println("Thread Description="+t);
	  try{
	      for(int i=1;i<=5;i++){
		     System.out.println("i value is="+i);
			 Thread.sleep(10000);
		  }
         }catch(InterruptedException e){
             e.printStackTrace();
          }
     System.out.println("HAVE A NICE DAY");
    }
}	
/*
F:\BHAVAJAVA\MultiThreading>javac MainThreadDemo.java

F:\BHAVAJAVA\MultiThreading>java MainThreadDemo
Current Thread=Thread[main,5,main]
After Name Changing=AITS-II CSE
Thread Priority=5
Thead is alive=true
Thread Description=Thread[AITS-II CSE,5,main]
i value is=1
i value is=2
i value is=3
i value is=4
i value is=5
HAVE A NICE DAY
*/