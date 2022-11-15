//GenDemo.java
class Gen<T extends Number>{
	T[] nums;
	Gen(T[] nums){
		this.nums=nums;
	}
    //Return Type double works for all Number types
	double getSum(){
		double sum=0;
		for( T t:nums){
			sum=sum+t.doubleValue();
		}
  		return sum;
	}
}
class BoundedArrayDemo{
	public static void main(String[] args){
		Integer ia[]={1,3,5,7,9};
		Gen<Integer> gia=new Gen<Integer>(ia);
		System.out.println("Generic is Integer Type...");
		System.out.println("Sum of Integer Array="+gia.getSum());
		Double da[]={7.979,5.97,8.9,3.37,4.57};
		Gen<Double> gda=new Gen<Double>(da);
		System.out.println("Generic is Double Type...");
		System.out.println("Sum of Double Array="+gda.getSum());
		Float fa[]={1.2F,5.7F,9.5F,9.9F,2.7F};
		Gen<Float> gfa=new Gen<Float>(fa);
		System.out.println("Generic is Float Type...");
		System.out.println("Sum of Float Array="+gfa.getSum());
   }
}
/*
F:\BHAVAJAVA\GENERICS>javac BoundedArrayDemo.java

F:\BHAVAJAVA\GENERICS>java BoundedArrayDemo
Generic is Integer Type...
Sum of Integer Array=25.0
Generic is Double Type...
Sum of Double Array=30.789
Generic is Float Type...
Sum of Float Array=28.999999523162842

*/	
		
	
		
		