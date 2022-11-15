interface AddMul{
	static int addition(int a,int b){
		return (a+b);
	}
    static int multiplication(int a,int b){
		return (a*b);
	}
}
class StaticMethInter{
	public static void main(String[] args){
		int ad=AddMul.addition(2,5);
		int ml=AddMul.multiplication(7,9);
		System.out.println("Addition called from static method="+ad);
		System.out.println("Multiplication called from static method="+ml);
	}
}	
	