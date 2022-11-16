class ThreadEx extends Thread{
   String str;
   ThreadEx(String str){
      this.str=str;
	  System.out.println(getState());
			
   }
   public void run(){
      System.out.println("I am Child Thread,created from Main Thread");		
	  System.out.println("Child Thread Prints from 10.....1");
	  try{
	     for(int i=10;i>=1;i--){
		    System.out.println("Child Thread="+i);
			System.out.println(getState());
			Thread.sleep(1000);
		 }
      }catch(Exception e){e.printStackTrace();}
	  System.out.println("Child Thread Completed");
		  
   }
}
class MainThreadEx{
    public static void main(String args[]){
	  System.out.println("Main Thread Running");
	  ThreadEx t=new ThreadEx("Child"); 
	  t.start();
	  System.out.println("State="+t.getState());
	  try{
	     for(int i=1;i<=10;i++){
		    System.out.println("Main Thread="+i);
			Thread.sleep(1000);
	     }
      }catch(Exception e){e.printStackTrace();}
	  System.out.println("Main Thread Completed");  
	}
}	

/*
F:\BHAVAJAVA\MultiThreading>javac MainThreadEx.java

F:\BHAVAJAVA\MultiThreading>java MainThreadEx
Main Thread Running
Main Thread=1
I am Child Thread,created from Main Thread
Child Thread Prints from 10.....1
Child Thread=10
Main Thread=2
Child Thread=9
Child Thread=8
Main Thread=3
Main Thread=4
Child Thread=7
Main Thread=5
Child Thread=6
Child Thread=5
Main Thread=6
Main Thread=7
Child Thread=4
Main Thread=8
Child Thread=3
Main Thread=9
Child Thread=2
Main Thread=10
Child Thread=1
Main Thread Completed
Child Thread Completed
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  
*/	  
	
	