//WildcardDemo.java
class AvgCompare<T extends Number>{
	T[] nums;
	AvgCompare(T[] nums){
		this.nums=nums;
	}
  	double average(){
		double sum=0.0;
		for(T x:nums){
			sum=sum+x.doubleValue();
		}
        return (sum/nums.length);		
	}
	boolean sameAvg(AvgCompare<?> ob){
		if(average()==ob.average())
			return true;
		else
			return false;
	}
}
class WildcardDemo{
	public static void main(String[] args){
		Integer inums[]={1,2,3,4,5};
		AvgCompare<Integer> ac=new AvgCompare<Integer>(inums);
		Float fnums[]={0.0F,3.0F,2.5F,3.5F,6.0F};
		AvgCompare<Float> fc=new AvgCompare<Float>(fnums);
		if(ac.sameAvg(fc))
			System.out.println("Same Average...");
		else
			System.out.println("Not Same Average...");
	}
}		

/*
F:\BHAVAJAVA\GENERICS>javac WildcardDemo.java

F:\BHAVAJAVA\GENERICS>java WildcardDemo
Same Average...

*/			
	
		
			
		