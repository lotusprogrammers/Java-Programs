class RunnableThread implements Runnable{
    String name;
	RunnableThread(String name){
	   this.name=name;
	}
	public void run(){
	   int i=1;	
	   try{
	      while(true){
		     i++;
			 System.out.println(name+":"+i);
			 Thread.sleep(1000);
			 if(i>100)
			 throw new InterruptedException();
		  }
           }catch(InterruptedException e){
              System.out.println(name+"runs"+i+"times");
            }
     }
}
class ThreadPriority{
   public static void main(String args[]){
       System.out.println("From Main Thread");
       RunnableThread r1=new RunnableThread("Thread1:");
       RunnableThread r2=new RunnableThread("Thread2:");		   
	   Thread t1=new Thread(r1);
	   Thread t2=new Thread(r2);
       t1.setPriority(Thread.MIN_PRIORITY);
	   t2.setPriority(Thread.MAX_PRIORITY);
	   t1.start();
	   t2.start();
	   try{
		   t1.join();
		   t2.join();
	   }
	   catch(Exception e){
		   e.printStackTrace();
	   }   
	   System.out.println("Main Thread Completed");  
     }
 }	 
	 