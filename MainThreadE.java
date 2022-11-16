//Creating Threads by Extending Thread class
class ExtendThread extends Thread{
    String name;
	ExtendThread(String name){
	  this.name=name;
	}
    public void run(){
	   try{
	      for(int i=1;i<=10;i++){
		    System.out.println(name+":"+i);
			Thread.sleep(0);
	       }
		}
        catch(InterruptedException e){
		  e.printStackTrace();
		}
        System.out.println("Child Thread Exiting");
	 }
}
class MainThreadE{
   public static void main(String args[]){
      ExtendThread et=new ExtendThread("Larry Page");
      et.start();      
	  try{
          System.out.println("Main Thread Starting");
          for(int i=10;i>=1;i--){
             System.out.println("Sergey Brin:"+i);
             Thread.sleep(0);
           }
        }
        catch(Exception e){
           e.printStackTrace();
        }
        System.out.println("Main Thread Exiting");
    }
}	
	 
	 






