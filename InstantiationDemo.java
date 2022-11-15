//Demo for InstantiationExcpetion
abstract class AbstractSample{
	int a,b;
	AbstractSample(int a,int b){
		this.a=a;
		this.b=b;
    }
    void display(){
       System.out.println("a="+a);
       System.out.println("b="+b);
    }
}
class InstantiationDemo{
	public static void main(String[] args){
			AbstractSample s=new AbstractSample();
			s.display();
	}
}	
	