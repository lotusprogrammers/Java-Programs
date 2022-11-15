import java.io.*;
class CheckedExceptionDemo{
	public static void main(String args[]){
		File file = new File("not_existing_file.txt");
		FileInputStream stream = new FileInputStream(file);
    }
}	