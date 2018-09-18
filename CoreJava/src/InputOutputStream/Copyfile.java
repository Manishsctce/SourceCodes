package InputOutputStream;

//Read a file and write into another file
import java.io.*;
//File Streaming

public class Copyfile {
   public static void main(String args[]) throws IOException
   {
      FileInputStream in = null;
      FileOutputStream out = null;

      try {
         in = new FileInputStream("C:\\Users\\Manish\\Documents\\Programming\\Source Code\\CoreJava\\src\\InputOutputStream\\input.txt");
         out = new FileOutputStream("C:\\Users\\Manish\\Documents\\Programming\\Source Code\\CoreJava\\src\\InputOutputStream\\output.txt");
         
         int c;
         while ((c = in.read()) != -1) {
        	 char ch = (char)c;
        	 System.out.print(ch);
            out.write(ch);
         }
      }finally {
         if (in != null) {
            in.close();
         }
         if (out != null) {
            out.close();
         }
      }
   }
}