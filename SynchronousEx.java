//Synchronization
class Resource{
   public void display(String str){
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
			synchronized(r){
				r.display(str);
		    }		
	   }
}
class SynchronousEx{
		public static void main(String args[]){
			Resource r=new Resource();
			ResourceCaller t1=new ResourceCaller("Hello",r);
			ResourceCaller t2=new ResourceCaller("Java",r);
			ResourceCaller t3=new ResourceCaller("world",r);
			t1.start();
			t2.start();
			t3.start();
		}
}		
			
	   
 
		  