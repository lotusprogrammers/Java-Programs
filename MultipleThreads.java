//Creating Multiple Threads
import java.awt.*;
class ThreadEx extends Thread{
      String name;
	  ThreadEx(String name){
		  this.name=name;
	  }	  
	  public void run(){
      try{
		    
		 if(name=="s1"){ 
	     for(int i=1;i<=10;i++){
		    System.out.println("s1:"+i);
			Thread.sleep(1000);
		 }
		 }
		 else if(name=="s2"){
			for(int i=1;i<=10;i++){
			   System.out.println("s2:Disturbed: creates beep sound");	
		       Toolkit.getDefaultToolkit().beep();
			   Thread.sleep(1000);
		    } 
		 }
		 else if(name=="s3"){
			for(int i=10;i>=1;i--){
		    System.out.println("s3:"+i);
			Thread.sleep(1000);
		   } 
		 }
      }catch(Exception e){e.printStackTrace();}
   }
}
class MultipleThreads{
    public static void main(String args[]){
	  System.out.println("Main Thread Running");
	  ThreadEx t1=new ThreadEx("s1");
	  ThreadEx t2=new ThreadEx("s2"); 
	  ThreadEx t3=new ThreadEx("s3"); 
      t1.start();
	  t2.start();
	  t3.start();
	  try{
		  t1.join();
		  t2.join();
		  t3.join();
	    }
        catch(Exception e){
           e.printStackTrace();
		}		   
	  System.out.println("Main Thread Exiting");
	}
}	
/*
F:\BHAVAJAVA\MultiThreading>javac MultipleThreads.java

F:\BHAVAJAVA\MultiThreading>java MultipleThreads
Main Thread Running
Main Thread Exiting
s2:Disturbed: creates beep sound
s3:10
s1:1
s1:2
s3:9
s2:Disturbed: creates beep sound
s1:3
s3:8
s2:Disturbed: creates beep sound
s1:4
s3:7
s2:Disturbed: creates beep sound
s3:6
s1:5
s2:Disturbed: creates beep sound
s1:6
s3:5
s2:Disturbed: creates beep sound
s1:7
s3:4
s2:Disturbed: creates beep sound
s3:3
s1:8
s2:Disturbed: creates beep sound
s1:9
s3:2
s2:Disturbed: creates beep sound
s3:1
s1:10
s2:Disturbed: creates beep sound
*/
	  
	
	