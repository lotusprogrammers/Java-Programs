//Demonstration of join() and isAlive() methods
//ThreadJoin.java
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
			   System.out.println("s2:"+i);	
		       Thread.sleep(1000);
		    } 
		 }
		 else if(name=="s3"){
			for(int i=1;i<=10;i++){
		    System.out.println("s3:"+i);
			Thread.sleep(1000);
		   } 
		 }
      }catch(Exception e){e.printStackTrace();}
	}
}
class ThreadJoin{
    public static void main(String args[]){
	  System.out.println("Main Thread Running");
	  ThreadEx t1=new ThreadEx("s1");
	  ThreadEx t2=new ThreadEx("s2"); 
	  ThreadEx t3=new ThreadEx("s3"); 
	  t1.start();
	  t2.start();
	  t3.start();
	  System.out.println("Thread s1 is alive="+t1.isAlive());
	  System.out.println("Thread s2 is alive="+t2.isAlive());     
	  System.out.println("Thread s3 is alive="+t3.isAlive());     
	  try{
	       t1.join();
	       t2.join();
	       t3.join();
	  }catch(InterruptedException e){e.printStackTrace();}
      System.out.println("Thread s1 is alive="+t1.isAlive());
	  System.out.println("Thread s2 is alive="+t2.isAlive());     
	  System.out.println("Thread s3 is alive="+t3.isAlive());     
	  System.out.println("Main Thread Exiting");
	}
}	
/*
F:\BHAVAJAVA\MultiThreading>javac ThreadJoin.java

F:\BHAVAJAVA\MultiThreading>java ThreadJoin
Main Thread Running
Thread s1 is alive=true
s1:1
Thread s1 is alive=true
s3:1
s2:1
Thread s1 is alive=true
s1:2
s2:2
s3:2
s1:3
s2:3
s3:3
s1:4
s2:4
s3:4
s1:5
s2:5
s3:5
s1:6
s2:6
s3:6
s1:7
s3:7
s2:7
s1:8
s2:8
s3:8
s1:9
s3:9
s2:9
s1:10
s2:10
s3:10
Thread s1 is alive=false
Thread s1 is alive=false
Thread s1 is alive=false
Main Thread Exiting
*/




























	  