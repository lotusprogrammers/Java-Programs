import java.awt.*;
class ThreadEx extends Thread{
      String name;
	  ThreadEx(String name){
		  this.name=name;
	  }	  
	  public void run(){
		try{
			for(int i=1;i<=30;i++){
				System.out.println(name+":"+i);
				Thread.sleep(1000);
			}
		}catch(Exception e){
		  e.printStackTrace();
	     }
      }
}
class SuspendResume{
    public static void main(String args[]){
	  System.out.println("Main Thread Running");
	  ThreadEx t1=new ThreadEx("s1");
	  ThreadEx t2=new ThreadEx("s2"); 
	  ThreadEx t3=new ThreadEx("s3"); 
	  t1.start();
	  t2.start();
	  t3.start();
	  try{
		Thread.sleep(500);
		t2.suspend();
		t3.suspend();
		Thread.sleep(5000);
		t2.resume();
		Thread.sleep(500);
		t3.resume();
		t1.suspend();
		Thread.sleep(500);
		t1.resume();
	    t1.join();
	    t2.join();
	    t3.join();
	  }catch(InterruptedException e){e.printStackTrace();}
	  System.out.println("Main Thread Exiting");
	}
}	
/*

F:\BHAVAJAVA\MultiThreading>javac SuspendResume.java
Note: SuspendResume.java uses or overrides a deprecated API.
Note: Recompile with -Xlint:deprecation for details.

F:\BHAVAJAVA\MultiThreading>java SuspendResume
Main Thread Running
s1:1
s3:1
s2:1
s1:2
s1:3
s1:4
s1:5
s1:6
s2:2
s3:2
s2:3
s1:7
s3:3
s2:4
s1:8
s3:4
s2:5
s1:9
s3:5
s2:6
s1:10
s3:6
s2:7
s1:11
s3:7
s2:8
s1:12
s3:8
s2:9
s1:13
s3:9
s2:10
s1:14
s3:10
s2:11
s1:15
s3:11
s2:12
s1:16
s3:12
s2:13
s1:17
s3:13
s2:14
s1:18
s3:14
s2:15
s1:19
s3:15
s2:16
s1:20
s3:16
s2:17
s1:21
s3:17
s2:18
s1:22
s3:18
s2:19
s1:23
s3:19
s2:20
s1:24
s3:20
s2:21
s1:25
s3:21
s2:22
s1:26
s3:22
s2:23
s1:27
s3:23
s2:24
s1:28
s3:24
s2:25
s1:29
s3:25
s2:26
s1:30
s3:26
s2:27
s3:27
s2:28
s3:28
s2:29
s3:29
s2:30
s3:30
Main Thread Exiting
*/	  