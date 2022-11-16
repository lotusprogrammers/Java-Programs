class Resource{
	int n;
	boolean flag=false;
	synchronized int get(){
		while(!flag){
			try{
				wait();
			}
			catch(InterruptedException e){
				e.printStackTrace();
			}
        }
		System.out.println("Student"+n);
		flag=false;
		notify();
		return n;
    }
    synchronized void put(int n){
			while(flag){
				try{
					wait();
				}
				catch(InterruptedException e){
					e.printStackTrace();
				}
			}
			this.n=n;
			flag=true;
			System.out.println("Teacher"+n);
			notify();
	}
}
class Teacher implements Runnable{
		Resource r;
		Teacher(Resource r){
				this.r=r;
		}
		public void run(){
			int i=0;
			while(true){
				r.put(i++);
			}
		}
}
class Student implements Runnable{
		Resource r;
		Student(Resource r){
			this.r=r;
		}
        public void run(){
			while(true){
					r.get();
			}
		}
}
class TSSynchronize{
		public static void main(String args[]){
			Resource r=new Resource();
			Teacher t=new Teacher(r);
			Student s=new Student(r);
			Thread tt=new Thread(t,"Teacher");
			Thread st=new Thread(s,"Student");
			tt.start();
		    st.start();
			System.out.println("Press ctrl+C to stop");
		}
}		
			
        		
	