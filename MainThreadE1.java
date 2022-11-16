//Creating Threads by Extending Thread class
class ExtendThread extends Thread{
    String name;
	ExtendThread(String name){
	  this.name=name;
	}
    public void run(){
	      for(int i=1;i<=10;i++){
		    System.out.println(name+":"+i);
		  }
		   System.out.println("Child Thread Exiting");
	 }
}
class MainThreadE1{
   public static void main(String args[]){
       ExtendThread t=new ExtendThread("Child");
       t.start();
           System.out.println("Main Thread Starting");
          for(int i=10;i>=1;i--){
             System.out.println("Parent:"+i);
             
           }
        
        
        System.out.println("Main Thread Exiting");
    }
}	
	 
	 






