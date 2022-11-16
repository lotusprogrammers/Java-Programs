import java.awt.*;
class ThreadEx extends Thread{
      String name;
	  ThreadEx(String name){
		  this.name=name;
		  setName(name);
	  }	  
	  public void run(){
		try{
			for(int i=1;i<=30;i++){
				System.out.println(getName()+":"+i);
				System.out.println("Thread "+getName()+" State="+getState());
				Thread.sleep(1000);
			}
		}catch(Exception e){
		  e.printStackTrace();
	     }
      }
}
class ThreadState{
    public static void main(String args[]){
	  System.out.println("Main Thread Running");
	  ThreadEx t1=new ThreadEx("t1");
	  ThreadEx t2=new ThreadEx("t2"); 
	  ThreadEx t3=new ThreadEx("t3"); 
      System.out.println("Thread t1 State="+t1.getState());
	  System.out.println("Thread t2 State="+t2.getState());
	  System.out.println("Thread t3 State="+t3.getState());
	  t1.start();
	  t2.start();
	  t3.start();
	  System.out.println("Thread t1 State="+t1.getState());
	  System.out.println("Thread t2 State="+t2.getState());
	  System.out.println("Thread t3 State="+t3.getState());
	  try{
		Thread.sleep(500);
		t2.suspend();
		t3.suspend();
        System.out.println("Thread t2 State="+t2.getState());
	    System.out.println("Thread t3 State="+t3.getState());
	  	Thread.sleep(5000);
		t2.resume();
        System.out.println("Thread t2 State="+t2.getState());
	   	Thread.sleep(500);
		t3.resume();
		t1.suspend();
		Thread.sleep(500);
		t1.resume();
	    t1.join();
	    t2.join();
	    t3.join();
	    System.out.println("Thread t1 State="+t1.getState());
	    System.out.println("Thread t2 State="+t2.getState());
	    System.out.println("Thread t3 State="+t3.getState());
	  }catch(InterruptedException e){e.printStackTrace();}
	  System.out.println("Main Thread Exiting");
	}
}	

/*

F:\BHAVAJAVA\MultiThreading>javac ThreadState.java
Note: ThreadState.java uses or overrides a deprecated API.
Note: Recompile with -Xlint:deprecation for details.

F:\BHAVAJAVA\MultiThreading>java ThreadState
Main Thread Running
Thread t1 State=NEW
Thread t2 State=NEW
Thread t3 State=NEW
Thread t1 State=RUNNABLE
t3:1
Thread t2 State=BLOCKED
t2:1
t1:1
Thread t2 State=RUNNABLE
Thread t3 State=BLOCKED
Thread t3 State=RUNNABLE
Thread t1 State=RUNNABLE
Thread t2 State=TIMED_WAITING
Thread t3 State=TIMED_WAITING
t1:2
Thread t1 State=RUNNABLE
t1:3
Thread t1 State=RUNNABLE
t1:4
Thread t1 State=RUNNABLE
t1:5
Thread t1 State=RUNNABLE
t1:6
Thread t1 State=RUNNABLE
t2:2
Thread t2 State=RUNNABLE
Thread t2 State=RUNNABLE
t3:2
Thread t3 State=RUNNABLE
t2:3
Thread t2 State=RUNNABLE
t1:7
Thread t1 State=RUNNABLE
t3:3
Thread t3 State=RUNNABLE
t2:4
Thread t2 State=RUNNABLE
t1:8
Thread t1 State=RUNNABLE
t3:4
Thread t3 State=RUNNABLE
t2:5
Thread t2 State=RUNNABLE
t1:9
Thread t1 State=RUNNABLE
t3:5
Thread t3 State=RUNNABLE
t2:6
Thread t2 State=RUNNABLE
t1:10
Thread t1 State=RUNNABLE
t3:6
Thread t3 State=RUNNABLE
t2:7
Thread t2 State=RUNNABLE
t1:11
Thread t1 State=RUNNABLE
t3:7
Thread t3 State=RUNNABLE
t2:8
Thread t2 State=RUNNABLE
t1:12
Thread t1 State=RUNNABLE
t3:8
Thread t3 State=RUNNABLE
t2:9
Thread t2 State=RUNNABLE
t1:13
Thread t1 State=RUNNABLE
t3:9
Thread t3 State=RUNNABLE
t2:10
Thread t2 State=RUNNABLE
t1:14
Thread t1 State=RUNNABLE
t3:10
Thread t3 State=RUNNABLE
t2:11
Thread t2 State=RUNNABLE
t1:15
Thread t1 State=RUNNABLE
t3:11
Thread t3 State=RUNNABLE
t2:12
Thread t2 State=RUNNABLE
t1:16
Thread t1 State=RUNNABLE
t3:12
Thread t3 State=RUNNABLE
t2:13
Thread t2 State=RUNNABLE
t1:17
Thread t1 State=RUNNABLE
t3:13
Thread t3 State=RUNNABLE
t2:14
Thread t2 State=RUNNABLE
t1:18
Thread t1 State=RUNNABLE
t3:14
Thread t3 State=RUNNABLE
t2:15
Thread t2 State=RUNNABLE
t1:19
Thread t1 State=RUNNABLE
t3:15
Thread t3 State=RUNNABLE
t2:16
Thread t2 State=RUNNABLE
t1:20
Thread t1 State=RUNNABLE
t3:16
Thread t3 State=RUNNABLE
t2:17
Thread t2 State=RUNNABLE
t1:21
Thread t1 State=RUNNABLE
t3:17
Thread t3 State=RUNNABLE
t2:18
Thread t2 State=RUNNABLE
t1:22
Thread t1 State=RUNNABLE
t3:18
Thread t3 State=RUNNABLE
t2:19
Thread t2 State=RUNNABLE
t1:23
Thread t1 State=RUNNABLE
t3:19
Thread t3 State=RUNNABLE
t2:20
Thread t2 State=RUNNABLE
t1:24
Thread t1 State=RUNNABLE
t3:20
Thread t3 State=RUNNABLE
t2:21
Thread t2 State=RUNNABLE
t1:25
Thread t1 State=RUNNABLE
t3:21
Thread t3 State=RUNNABLE
t2:22
Thread t2 State=RUNNABLE
t1:26
Thread t1 State=RUNNABLE
t3:22
Thread t3 State=RUNNABLE
t2:23
Thread t2 State=RUNNABLE
t1:27
Thread t1 State=RUNNABLE
t3:23
Thread t3 State=RUNNABLE
t2:24
Thread t2 State=RUNNABLE
t1:28
Thread t1 State=RUNNABLE
t3:24
Thread t3 State=RUNNABLE
t2:25
Thread t2 State=RUNNABLE
t1:29
Thread t1 State=RUNNABLE
t3:25
Thread t3 State=RUNNABLE
t2:26
Thread t2 State=RUNNABLE
t1:30
Thread t1 State=RUNNABLE
t3:26
Thread t3 State=RUNNABLE
t2:27
Thread t2 State=RUNNABLE
t3:27
Thread t3 State=RUNNABLE
t2:28
Thread t2 State=RUNNABLE
t3:28
Thread t3 State=RUNNABLE
t2:29
Thread t2 State=RUNNABLE
t3:29
Thread t3 State=RUNNABLE
t2:30
Thread t2 State=RUNNABLE
t3:30
Thread t3 State=RUNNABLE
Thread t1 State=TERMINATED
Thread t2 State=TERMINATED
Thread t3 State=TERMINATED
Main Thread Exiting

*/





















































