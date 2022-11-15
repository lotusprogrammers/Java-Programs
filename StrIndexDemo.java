//Java Program for Searching Strings
// Demonstrate indexOf() and lastIndexOf().
class StrIndexDemo {
	public static void main(String args[]) {
		String s = "James Arthur Gosling, often referred to as "+
				   "Dr. Java, OC (born May 19, 1955) is a Canadian"+
				   "computer scientist, best known as the "+
				   "founder and lead designer behind the "+
				   "Java programming language.";
		System.out.println(s);
		System.out.println("indexOf(t) = " +s.indexOf('t'));
		System.out.println("lastIndexOf(t) = " +s.lastIndexOf('t'));
		System.out.println("indexOf(the) = " +s.indexOf("the"));
		System.out.println("lastIndexOf(the) = " +s.lastIndexOf("the"));
		System.out.println("indexOf(t, 10) = " +s.indexOf('t', 10));
		System.out.println("lastIndexOf(t, 60) = " +s.lastIndexOf('t', 60));
		System.out.println("indexOf(the, 10) = " +s.indexOf("the", 10));
	}
}

/*
F:\BHAVAJAVA\EEE>javac StrIndexDemo.java

F:\BHAVAJAVA\EEE>java StrIndexDemo
James Arthur Gosling, often referred to as
 Dr. Java, OC (born May 19, 1955) is a  Canadian
computer scientist, best known as the
 founder and lead designer behind the 
Java programming language.
indexOf(t) = 8
lastIndexOf(t) = 160
indexOf(the) = 123
lastIndexOf(the) = 160
indexOf(t, 10) = 24
lastIndexOf(t, 60) = 37
indexOf(the, 10) = 123
*/