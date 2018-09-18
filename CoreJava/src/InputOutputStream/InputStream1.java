package InputOutputStream;

import java.io.*;


//abstract InputStream class can read 1 byte
//subclass FileInputStream, FilterInputStream, ObjectInputStream, ByteArrayInputStream, BufferedInputStream, RandomAccessFile

public class InputStream1 {
	public static void main(String[] args) {
		try{
		InputStream ipstrm = new FileInputStream("");
		}
		catch(FileNotFoundException e){
			e.printStackTrace();
		}
		
		//InputStream inputStream = new ObjectInputStream("hello");
	}

}
