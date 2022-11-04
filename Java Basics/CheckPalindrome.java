import java.util.*;
class CheckPalindrome{
	public static void main(String[] args){
		Scanner sin=new Scanner(System.in);
		System.out.println("Enter Number");
		int n=sin.nextInt();
		String str=Integer.toString(n);
		char ch[]=str.toCharArray();
		HashMap<Character,Integer> hm=new HashMap<Character,Integer>();
		for(int i=0;i<ch.length;i++){
			if(hm.containsKey(new Character(ch[i]))){
				int j=hm.get(new Character(ch[i]));
				hm.replace(new Character(ch[i]),j,++j);
			}
			else
				hm.put(new Character(ch[i]),1);
		}
        Collection<Integer> vls=hm.values();
		int flag=0;
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
			 
 		