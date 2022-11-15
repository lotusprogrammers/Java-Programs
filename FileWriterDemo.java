//Writing data to the File using FileWriter
import java.io.*;
class FileWriterDemo{
	public static void main(String[] args) throws Exception{
		FileWriter fs=new FileWriter("AITS.txt");
        String s=new String("Sri Annamacharya Born in Tallapaka renounced as Padakavitha Pithamaha");
	    fs.write(s);
		fs.close();  
        //Reading Data from File   
        FileReader fin=new FileReader("AITS.txt");
        int i;
		while((i=fin.read())!=-1){
			System.out.print((char)i);
        }
        System.out.println();
        fin.close();
	}
}	

/*
F:\BHAVAJAVA\EEE\UNIT-V>javac FileWriterDemo.java

F:\BHAVAJAVA\EEE\UNIT-V>java FileWriterDemo
Sri Annamacharya Born in Tallapaka renounced as Padakavitha Pithamaha
*/