//Thread Creation by implementing Runnable interface
class RunnableThread implements Runnable{
    String name;
	RunnableThread(String name){
	   this.name=name;
	}
	public void run(){
	   System.out.println("I am Child Thread,created from Main Thread");		
	   System.out.println("Child Thread Prints from 10.....1");
       try{
	      for(int i=10;i>=1;i--){
		     System.out.println(name+":"+i);
			 Thread.sleep(1000);
		  }
         }catch(InterruptedException e){
              e.printStackTrace();
          }
          System.out.println("Child Thread Exited");
		  	
     }
}
class MainThreadR{
   public static void main(String args[]){
       System.out.println("From Main Thread");
       RunnableThread r=new RunnableThread("Child Thread");	   
	   Thread t=new Thread(r);
       t.start();
	   System.out.println("Main Thread Prints from 1.....10");
        try{
           for(int i=1;i<=10;i++){
              System.out.println("Main Thread:"+i);	
              Thread.sleep(1000);
            }
         }catch(InterruptedException e){
             e.printStackTrace();
           }
		   System.out.println("Main Thread Completed");  
     }
 }	 
/*
F:\BHAVAJAVA\MultiThreading>javac MainThreadR.java
F:\BHAVAJAVA\MultiThreading>java MainThreadR
From Main Thread
Main Thread Prints from 1.....10
I am Child Thread,created from Main Thread
Child Thread Prints from 10.....1
Main Thread:1
Child Thread:10
Child Thread:9
Main Thread:2
Main Thread:3
Child Thread:8
Main Thread:4
Child Thread:7
Main Thread:5
Child Thread:6
Main Thread:6
Child Thread:5
Main Thread:7
Child Thread:4
Main Thread:8
Child Thread:3
Child Thread:2
Main Thread:9
Main Thread:10
Child Thread:1
Main Thread Completed
Child Thread Exited
*/	 