//Creating Multiple Threads by implementing Runnable interface
//Child Thread Virat  prints numbers from 1...10
//Child Thread Dhoni  prints numbers from 1...5
//Child Thread Shreyas  prints numbers from 10...1

class Virat implements Runnable{
	//Should implement run method to define code which is Parallely executed with main thread   
    public void run(){
		try{
		    for(int i=1;i<=10;i++){
			   System.out.println("Virat="+i);
			   Thread.sleep(1000);
			}
		}catch(Exception e){
                System.out.println("Exception="+e);
         }
			System.out.println("Virat Exiting");
	}
}
class Dhoni implements Runnable{
	//Should implement run method to define code which is Parallely executed with main thread   
    public void run(){
		try{
		    for(int i=1;i<=5;i++){
			   System.out.println("Dhoni="+i);
			   Thread.sleep(1000);
			}
		}catch(Exception e){
                System.out.println("Exception="+e);
         }
			System.out.println("Dhoni Exiting");
	}
}
class Shreyas implements Runnable{
	//Should implement run method to define code which is Parallely executed with main thread   
    public void run(){
		try{
		    for(int i=10;i>=1;i--){
			   System.out.println("Shreyas="+i);
			   Thread.sleep(1000);
			}
		}catch(Exception e){
                System.out.println("Exception="+e);
         }
			System.out.println("Shreyas Exiting");
	}
}


class PlayersRunnable{
	public static void main(String[] args){
		System.out.println("AITS Main Thread Started...");
        Virat vr=new Virat();
		Dhoni dr=new Dhoni();
		Shreyas sr=new Shreyas();//vr,dr,sr are Runnable objects
		Thread vt=new Thread(vr);
		Thread dt=new Thread(dr);
		Thread st=new Thread(sr);//Creating Threads fro vr,dr and sr
		vt.start();
        dt.start();
        st.start();		
		try{
			vt.join();
			dt.join();
			st.join();
		}catch(Exception e){
			System.out.println("Exception="+e);
		}	
		System.out.println("AITS Completes the Competion...");
	}
}	
/*
F:\BHAVAJAVA\SUNIT-IV>javac PlayersRunnable.java

F:\BHAVAJAVA\SUNIT-IV>java PlayersRunnable
AITS Main Thread Started...
Virat=1
Shreyas=10
Dhoni=1
Virat=2
Shreyas=9
Dhoni=2
Shreyas=8
Virat=3
Dhoni=3
Shreyas=7
Dhoni=4
Virat=4
Shreyas=6
Dhoni=5
Virat=5
Dhoni Exiting
Virat=6
Shreyas=5
Shreyas=4
Virat=7
Shreyas=3
Virat=8
Virat=9
Shreyas=2
Virat=10
Shreyas=1
Virat Exiting
Shreyas Exiting
AITS Completes the Competion...

F:\BHAVAJAVA\SUNIT-IV>*/
