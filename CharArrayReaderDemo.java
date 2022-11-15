//Reading Input through CharaArrayReader 
//Reading data from DataInputDemo.java file
import java.io.*;
class CharArrayReaderDemo{
	public static void main(String[] args) throws Exception{
		char ch[]={'A','I','T','S'};
		CharArrayReader cin=new CharArrayReader(ch);
		int i;
		while((i=cin.read())!=-1){
			System.out.print((char)i);
        }
        System.out.println();
        cin.close();  		
	}
}	

/*
F:\BHAVAJAVA\EEE\UNIT-V>javac CharArrayReaderDemo.java

F:\BHAVAJAVA\EEE\UNIT-V>java CharArrayReaderDemo
AITS
*/