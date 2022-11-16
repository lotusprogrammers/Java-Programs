//Creating Multiple Threads
import java.awt.*;
class Student extends Thread{
	String name;
	Student(String name){
		this.name=name;
	}
    public void run(){
		try{
			if(name=="Dhoni"){
				for(int i=1;i<=10;i++){
					System.out.println(name+"="+i);
					Thread.sleep(2000);
				}
            }
            if(name=="Shreyas"){
				for(int i=10;i>=1;i--){
					System.out.println(name+"="+i);
					Thread.sleep(2000);
				}
            }
            if(name=="Virat"){
				for(int i=1;i<=10;i++){
					System.out.println(name+"=Disturbed creating beep sound");
					Toolkit.getDefaultToolkit().beep();
					Thread.sleep(2000);
				}
            }
		}catch(Exception e){e.printStackTrace();}
        System.out.println(name+" Exiting");
	}
}
class EEEStudents{
	public static void main(String[] args){
		System.out.println("Teacher Thread initiating 3 student threads");
		Student st=new Student("Shreyas");
		Student dt=new Student("Dhoni");
		Student vt=new Student("Virat");
		st.start();
		dt.start();
		vt.start();
		try{
			st.join();
			dt.join();
			vt.join();
		}catch(Exception e){}	
		System.out.println("Teacher Thread Exiting");
	}
}	
	
				
				
		
