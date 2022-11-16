//Synchronization Methods
class Resource{
   synchronized public void display(String str){
	  try{
		  System.out.print("["+str);
		   Thread.sleep(1000);
		  }
         catch(InterruptedException e){
            e.printStackTrace();
          }
          System.out.println("]");
   }
}	 
class ResourceCaller extends Thread{
	   String str;
	   Resource r;
	   ResourceCaller(String str,Resource r){
		   this.str=str;
		   this.r=r;
	   }
       public void run(){
			r.display(str);
   	   }
}
class SynchronousMethod{
		public static void main(String args[]){
			Resource r=new Resource();
			ResourceCaller t1=new ResourceCaller("Hello",r);
			ResourceCaller t2=new ResourceCaller("Java",r);
			ResourceCaller t3=new ResourceCaller("world",r);
			t1.start();
			t2.start();
			t3.start();
			try{
				t1.join();
				t2.join();
				t3.join();
		    }
			catch(InterruptedException e){
					e.printStackTrace();
			}
            System.out.println("Main Thread Exiting");	
		}
}		

/*
F:\BHAVAJAVA\MultiThreading>javac SynchronousMethod.java
F:\BHAVAJAVA\MultiThreading>java SynchronousMethod
[Hello]
[world]
[Java]
Main Thread Exiting
*/			
	   
 
		  