//Creating Multiple Threads by extending Thread class
//Child Threads Virat  prints numbers from 1...100
//Child Threads Dhoni  prints numbers from 1...500
//Child Threads Shreyas  prints numbers from 100...1

class Virat extends Thread{
	//Override run method to define code which is Parallely executed with main thread   
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
class Dhoni extends Thread{
	//Override run method to define code which is Parallely executed with main thread   
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
class Shreyas extends Thread{
	//Override run method to define code which is Parallely executed with main thread   
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


class ThreePlayers{
	public static void main(String[] args){
		System.out.println("AITS Main Thread Started...");
        Virat vt=new Virat();
		Dhoni dt=new Dhoni();
		Shreyas st=new Shreyas();
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

