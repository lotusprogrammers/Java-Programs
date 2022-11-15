//Writing data to the File using FileOutputStream
import java.io.*;
class FileOutputStreamDemo{
	public static void main(String[] args) throws Exception{
		FileOutputStream fs=new FileOutputStream("AITS.txt");
        String s=new String("Sri Annamacharya Born in Tallapaka renounced as Padakavitha Pithamaha");
		byte[] b=s.getBytes();//getBytes() methods returns bytes of s.
	    fs.write(b);//byte[] getBytes() this method from String class
		fs.close();  
        //Reading Data from File   
        FileInputStream fin=new FileInputStream("AITS.txt");
        int i;
		while((i=fin.read())!=-1){
			System.out.print((char)i);
        }
        System.out.println();
        fin.close();
	}
}	
/*
F:\BHAVAJAVA\EEE\UNIT-V>javac FileOutputStreamDemo.java

F:\BHAVAJAVA\EEE\UNIT-V>java FileOutputStreamDemo
Sri Annamacharya Born in Tallapaka renounced as Padakavitha Pithamaha
*/