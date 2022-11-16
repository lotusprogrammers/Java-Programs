//PriorityDemo.java
class ThreadPriority extends Thread{
	public void run(){
		System.out.println("Running Thread Name="+Thread.currentThread().getName());  
        System.out.println("Running Thread Priority="+Thread.currentThread().getPriority());  
    }  
}
class PriorityDemo{
	public static void main(String args[]){  
		ThreadPriority t1=new ThreadPriority();  
		ThreadPriority t2=new ThreadPriority();  
		t1.setPriority(Thread.MIN_PRIORITY);  
		t2.setPriority(Thread.MAX_PRIORITY);  
		t1.start();  
		t2.start();  
   }  
}     
/*
F:\BHAVAJAVA\MultiThreading>javac PriorityDemo.java
F:\BHAVAJAVA\MultiThreading>java PriorityDemo
Running Thread Name=Thread-1
Running Thread Name=Thread-0
Running Thread Priority=10
Running Thread Priority=1
*/