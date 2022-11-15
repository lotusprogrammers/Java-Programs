//SumArrayInit.java
class SumArrayInit{
	public static void main(String[] args){
		//Array a inititialization
		double a[]={5.75,9.72,8.9,3.5,99.9};
		double sum=0;
		for(int i=0;i<a.length;i++)
			sum=sum+a[i];
		System.out.println("Sum of Array Elements="+sum);
	}
}	

/*
F:\BHAVAJAVA\EEE>javac SumArrayInit.java

F:\BHAVAJAVA\EEE>java SumArrayInit
Sum of Array Elements=127.77000000000001
*/		