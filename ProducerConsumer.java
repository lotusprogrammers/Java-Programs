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
		System.out.println("Consumer="+n);
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
			System.out.println("Producer="+n);
			notify();
	}
}
class Producer implements Runnable{
		Resource r;
		Producer(Resource r){
				this.r=r;
		}
		public void run(){
			int i=0;
			while(true){
				r.put(i++);
			}
		}
}
class Consumer implements Runnable{
		Resource r;
		Consumer(Resource r){
			this.r=r;
		}
        public void run(){
			while(true){
					r.get();
			}
		}
}
class ProducerConsumer{
		public static void main(String args[]){
			Resource r=new Resource();
			Producer t=new Producer(r);
			Consumer s=new Consumer(r);
			Thread pt=new Thread(t,"Producer");
			Thread ct=new Thread(s,"Consumer");
			pt.start();
		    ct.start();
			System.out.println("Press ctrl+C to stop");
		}
}		
/*
F:\BHAVAJAVA\MultiThreading>javac ProducerConsumer.java

F:\BHAVAJAVA\MultiThreading>java ProducerConsumer
Press ctrl+C to stop
Producer=0
Consumer=0
Producer=1
Consumer=1
Producer=2
Consumer=2
Producer=3
Consumer=3
Producer=4
Consumer=4
Producer=5
Consumer=5
Producer=6
Consumer=6
Producer=7
Consumer=7
Producer=8
Consumer=8
Producer=9
Consumer=9
Producer=10
Consumer=10
Producer=11
Consumer=11
Producer=12
Consumer=12
Producer=13
Consumer=13
Producer=14
Consumer=14
Producer=15
Consumer=15
Producer=16
Consumer=16
Producer=17
Consumer=17
Producer=18
Consumer=18
*/			
        		
	