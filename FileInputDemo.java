//Reading Input from DataInputDemo.java file
import java.io.*;
class FileInputDemo{
	public static void main(String[] args) throws Exception{
		FileInputStream fin=new FileInputStream("DataInputDemo.java");
        int i;
		while((i=fin.read())!=-1){
			System.out.print((char)i);
        }
        System.out.println();
        fin.close();  		
	}
}	








