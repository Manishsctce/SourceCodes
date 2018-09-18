package exception;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;

import com.sun.org.apache.xerces.internal.impl.xpath.regex.ParseException;

public class Java7_TryWithMultiCatchDemo1 {

	public static void main(String[] args) {
		try{
			int i= 10/0;
			File f = new File("");
			BufferedOutputStream b = new BufferedOutputStream(new OutputStream() {
				
				@Override
				public void write(int b) throws IOException {
					// TODO Auto-generated method stub
					
				}
			});
			b.close();
		}catch(NullPointerException  | ArithmeticException ae ){
			
		}catch(IOException | ParseException e){
			
		}

	}

}
