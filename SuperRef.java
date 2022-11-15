//Super Class Reference can hold sub class object
class GrandParent {
	//.....
}
class Parent extends GrandParent{
	.....
}
class Child extends Parent {
	.....
}
class SupRef {
	public static void main(String[] args) {
		//GrandParent refers GrandPrant object and also refers Parent and Child object
		GrandParent g;
		g=new GrandParent();
		g=new Parent();
		g=new Child();
		//Parent refers Prant object and also refers Child object
		Parent p;
		p=new Parent();
		p=new Child();
	}
}	
	
	
	
	