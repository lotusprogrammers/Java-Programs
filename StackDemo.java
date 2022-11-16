import java.util.*;
class StackDemo{
	public static void main(String args[]){
		Stack<String> st=new Stack<String>();
		Scanner sin=new Scanner(System.in);
		String item;
		char ch;
		do{
			System.out.println("Enter choice to perform stack operations");
		    System.out.println("1-push 2-Pop 3-Peek 4-Check Empty 5-Search");
		    int choice=sin.nextInt();
			switch(choice){
				case 1:System.out.println("Enter Item");
						item=sin.next();
						st.push(item);
						break;
				case 2:item=st.pop();
					   System.out.println("Popped item is:"+item);
					   break;
				case 3:item=st.peek();
					   System.out.println("Top of the Stack:"+item);
				       break;
		        case 4:if(st.empty())
						System.out.println("Stack Empty");
                       else
						System.out.println("Stack not Empty");
				       break;
                case 5:System.out.println("Enter Element to Search");
					   item=sin.next();
			           int pos=st.search(item);
				       if(pos==-1)
					      System.out.println("Element not found");
                       else
                          System.out.println("Element Found at:"+pos);
			  }	
              System.out.println("Do You want to continue Press Y");
              ch=sin.next().charAt(0);
		     }while(ch=='Y'); 
	}
}	
/*Input and Output
F:\BHAVAJAVA\Collections>javac StackDemo.java
F:\BHAVAJAVA\Collections>java StackDemo
Enter choice to perform stack operations
1-push 2-Pop 3-Peek 4-Check Empty 5-Search
1
Enter Item
7
Do You want to continue Press Y
Y
Enter choice to perform stack operations
1-push 2-Pop 3-Peek 4-Check Empty 5-Search
1
Enter Item
25
Do You want to continue Press Y
Y
Enter choice to perform stack operations
1-push 2-Pop 3-Peek 4-Check Empty 5-Search
1
Enter Item
34
Do You want to continue Press Y
Y
Enter choice to perform stack operations
1-push 2-Pop 3-Peek 4-Check Empty 5-Search
1
Enter Item
43
Do You want to continue Press Y
Y
Enter choice to perform stack operations
1-push 2-Pop 3-Peek 4-Check Empty 5-Search
1
Enter Item
44
Do You want to continue Press Y
Y
Enter choice to perform stack operations
1-push 2-Pop 3-Peek 4-Check Empty 5-Search
2
Popped item is:44
Do You want to continue Press Y
Y
Enter choice to perform stack operations
1-push 2-Pop 3-Peek 4-Check Empty 5-Search
3
Top of the Stack:43
Do You want to continue Press Y
Y
Enter choice to perform stack operations
1-push 2-Pop 3-Peek 4-Check Empty 5-Search
5
Enter Element to Search
25
Element Found at:3
Do You want to continue Press Y
Y
Enter choice to perform stack operations
1-push 2-Pop 3-Peek 4-Check Empty 5-Search
4
Stack not Empty
Do You want to continue Press Y
Y
Enter choice to perform stack operations
1-push 2-Pop 3-Peek 4-Check Empty 5-Search
3
Top of the Stack:43
Do You want to continue Press Y
Y
Enter choice to perform stack operations
1-push 2-Pop 3-Peek 4-Check Empty 5-Search
1
Enter Item
77
Do You want to continue Press Y
Y
Enter choice to perform stack operations
1-push 2-Pop 3-Peek 4-Check Empty 5-Search
1
Enter Item
99
Do You want to continue Press Y
N
*/				   
                   			
		