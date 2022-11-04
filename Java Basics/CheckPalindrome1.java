//To check whether Palindrome possible or not
import java.util.*;
class CheckPalindrome1{
	public static void main(String[] args){
		Scanner sin=new Scanner(System.in);
		System.out.println("Enter Number");
		int n=sin.nextInt();
		int size=Integer.toString(n).length();
		int arr[]=new int[size];
		int i=0,flag=0;
		int num=n;
		while(n>0){
			arr[i]=n%10;
			n=n/10;
			i++;
		}	
		HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
		for(i=0;i<arr.length;i++){
			if(hm.containsKey(arr[i])){
				int j=hm.get(arr[i]);
				hm.put(arr[i],++j);
			}
			else
				hm.put(arr[i],1);
		}
        Collection<Integer> vls=hm.values();
		//int flag=0;
		for(int x:vls){
			if(x%2!=0)
				flag++;
		}
        if(flag==0||flag==1)
			System.out.println("Palindrome Possible");
		else 
			System.out.println("Palindrome Not Possible");
	}
}	
			 
 		