package serialization;

import java.io.*;
class Persist{
 public static void main(String args[])throws Exception{
  Student s1 =new Student(211,"ravi","LMC","6");
  String path_filename = "C:\\Users\\Manish\\Documents\\Programming\\Source Code\\CoreJava\\src\\serialization\\student.txt";
  FileOutputStream fout=new FileOutputStream(path_filename);
  ObjectOutputStream out=new ObjectOutputStream(fout);

  out.writeObject(s1);
  out.flush();

  System.out.println("success");
 }
}