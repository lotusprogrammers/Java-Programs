//Main Thread prints odd number series from 1...100
//Child Thread prints even number series from 100...1
class Child implements Runnable{
	public void run(){
		try{
			for(int i=1;i<=100;i++){
				if(i%2==0){
					System.out.println("Even="+i);
					Thread.sleep(1000);
				}
			}
        }
        catch(Exception e){
			System.out.println(e);
		}
         System.out.println("Even Thread Exiting");
	}
}
class EvenOddThread{
	public static void main(String[] args){
		Child cr=new Child();
		Thread ct=new Thread(cr);
		ct.start();
		try{
			for(int i=1;i<=100;i++){
				if(i%2!=0){
					System.out.println("Odd="+i);
					Thread.sleep(1000);
				}
			}
		}catch(Exception e){
            System.out.println(e);
		}
         System.out.println("Odd Thread Exiting");
    }
}	
	
			
/*
F:\BHAVAJAVA\MultiThreading>javac EvenOddThread.java

F:\BHAVAJAVA\MultiThreading>java EvenOddThread
Odd=1
Even=2
Even=4
Odd=3
Even=6
Odd=5
Odd=7
Even=8
Odd=9
Even=10
Even=12
Odd=11
Even=14
Odd=13
Odd=15
Even=16
Odd=17
Even=18
Odd=19
Even=20
Odd=21
Even=22
Odd=23
Even=24
Odd=25
Even=26
Odd=27
Even=28
Odd=29
Even=30
Odd=31
Even=32
Odd=33
Even=34
Odd=35
Even=36
Odd=37
Even=38
Odd=39
Even=40
Odd=41
Even=42
Odd=43
Even=44
Odd=45
Even=46
Odd=47
Even=48
Odd=49
Even=50
Odd=51
Even=52
Odd=53
Even=54
Odd=55
Even=56
Odd=57
Even=58
Odd=59
Even=60
Odd=61
Even=62
Odd=63
Even=64
Odd=65
Even=66
Odd=67
Even=68
Odd=69
Even=70
Odd=71
Even=72
Odd=73
Even=74
Odd=75
Even=76
Odd=77
Even=78
Odd=79
Even=80
Odd=81
Even=82
Odd=83
Even=84
Odd=85
Even=86
Odd=87
Even=88
Odd=89
Even=90
Odd=91
Even=92
Odd=93
Even=94
Odd=95
Even=96
Odd=97
Even=98
Odd=99
Even=100
Odd Thread Exiting
Even Thread Exiting

F:\BHAVAJAVA\MultiThreading>
*/






















































		