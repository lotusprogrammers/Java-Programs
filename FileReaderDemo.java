//Reading Input through FileReader 
//Reading data from DataInputDemo.java file
import java.io.*;
class FileReaderDemo{
	public static void main(String[] args) throws Exception{
		FileReader fin=new FileReader("DataInputDemo.java");
        int i;
		while((i=fin.read())!=-1){
			System.out.print((char)i);
        }
        System.out.println();
        fin.close();  		
	}
}	

