package InputOutputStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.SequenceInputStream;

public class SequenceStream {
	public static void main(String args[]){  
		try{
			FileOutputStream fos = new FileOutputStream("file1.txt");
			FileInputStream fis1 = new FileInputStream("C:\\Users\\Manish\\Documents\\Programming\\Source Code\\CoreJava\\src\\InputOutputStream\\file1.txt");
			FileInputStream fis2 = new FileInputStream("C:\\Users\\Manish\\Documents\\Programming\\Source Code\\CoreJava\\src\\InputOutputStream\\file2.txt");			
			
					
			SequenceInputStream sis = new SequenceInputStream(fis1, fis2);
			int i;
			i = sis.read();
			while(i != -1){
				System.out.println((char)i);
			}
			
			char c;
			c = sis.
			while()
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
}
