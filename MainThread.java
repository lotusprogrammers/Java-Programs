import java.awt.*;
class RunnableEx implements Runnable{
   String str;
   RunnableEx(String str){
	this.str=str;
   }
   public void run(){
       try{
		for(int i=1;i<=100;i++){
			System.out.println("disturbed");
		   Toolkit.getDefaultToolkit().beep();
		   Thread.sleep(1000);
		}
	    }catch(Exception e){e.printStackTrace();}	
   }
}
class MainThread{
    public static void main(String args[]){
        System.out.println("Main Thread Started");
        RunnableEx re=new RunnableEx("Child");
        Thread t=new Thread(re);
        t.start();
		try{
        for(int i=1;i<=100;i++){
          System.out.println("Main:"+i);
		  Thread.sleep(1000);
        }
		}catch(Exception e){e.printStackTrace();}
   	}
}	
		