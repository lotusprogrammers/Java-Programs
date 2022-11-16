//Creating Multiple Threads by extending Thread class
//Child Threads prints numbers from 1...100
class ChildThread extends Thread{
	String name;
	ChildThread(String name){
		this.name=name;
	}
    //Override run method to define code which is Parallely executed with main thread   
    public void run(){
		try{
		    for(int i=1;i<=10;i++){
			   System.out.println(name+"="+i);
			   Thread.sleep(1000);
			}
		}catch(Exception e){
                System.out.println("Exception="+e);
         }
			System.out.println(name+" Exiting");
	}
}
class AITSExtend{
	public static void main(String[] args){
		System.out.println("AITS Main Thread Started...");
		ChildThread ct1=new ChildThread("Virat Kohli");
		ChildThread ct2=new ChildThread("Dhoni");
		ChildThread ct3=new ChildThread("Shreyas");
	    ct1.start();
		ct2.start();
		ct3.start();
		try{
			ct1.join();
			ct2.join();
			ct3.join();
		}catch(Exception e){
			System.out.println("Exception="+e);
		}	
		System.out.println("AITS Completes the Competion...");
	}
}	
/*
F:\BHAVAJAVA\SUNIT-IV>javac AITSExtend.java

F:\BHAVAJAVA\SUNIT-IV>java AITSExtend
AITS Main Thread Started...
Virat Kohli=1
Shreyas=1
Dhoni=1
Virat Kohli=2
Dhoni=2
Shreyas=2
Virat Kohli=3
Shreyas=3
Dhoni=3
Dhoni=4
Shreyas=4
Virat Kohli=4
Shreyas=5
Dhoni=5
Virat Kohli=5
Dhoni=6
Virat Kohli=6
Shreyas=6
Shreyas=7
Dhoni=7
Virat Kohli=7
Shreyas=8
Virat Kohli=8
Dhoni=8
Dhoni=9
Virat Kohli=9
Shreyas=9
Shreyas=10
Virat Kohli=10
Dhoni=10
Dhoni Exiting
Virat Kohli Exiting
Shreyas Exiting
AITS Completes the Competion...
*/
