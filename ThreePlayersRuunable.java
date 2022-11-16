//Creating Multiple Threads by implementing Runnable interface
//Child Thread Virat  prints numbers from 1...100
//Child Thread Dhoni  prints numbers from 1...500
//Child Thread Shreyas  prints numbers from 100...1

class Virat implements Runnable{
	//Should implement run method to define code which is Parallely executed with main thread   
    public void run(){
		try{
		    for(int i=1;i<=100;i++){
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
		    for(int i=1;i<=50;i++){
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
		    for(int i=100;i>=1;i--){
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

