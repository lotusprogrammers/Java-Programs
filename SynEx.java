//Synchronization
class Resource{
    public void display(String str){
      try{
	     System.out.print("["+str);
		 Thread.sleep(1000);
		 }catch(InterruptedException e){
		    e.printStackTrace();
		  }	
		 System.out.println("]");
   }
}
class ResourceCaller extends Thread{
		String msg;
		Resource r;
		Thread t;
		public ResourceCaller(Resource r,String msg){
			this.r=r;
			this.msg=msg;
	    }
         public void run(){
				//synchronized(r){
					r.display(msg);
				//}	
		 }
}
class SynEx{
		public static void main(String str[]){
			Resource r=new Resource();
			ResourceCaller r1=new ResourceCaller(r,"Hello");
			ResourceCaller r2=new ResourceCaller(r,"Java");
		    ResourceCaller r3=new ResourceCaller(r,"World");
			r1.start();
			r2.start();
			r3.start();
			try{
				r1.join();
				r2.join();
				r3.join();
			}catch(Exception e){
				e.printStackTrace();
			 }
			System.out.println("r1"+r1.isAlive());
			System.out.println("r2"+r2.isAlive());
			System.out.println("r3"+r3.isAlive());
		}
}		
			