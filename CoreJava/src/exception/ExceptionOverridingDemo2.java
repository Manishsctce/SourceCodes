package exception;
/*If the superclass method does not declare an exception, 
* subclass overridden method cannot declare the checked exception 
* but can declare unchecked exception.
*/

import java.io.*;  
class ExceptionOverridingDemo2{  
  void msg(){System.out.println("parent");}  
}  
  
class Child2 extends ExceptionOverridingDemo2{  
  void msg()throws ArithmeticException{  
    System.out.println("child");  
  }  
  public static void main(String args[]){  
   ExceptionOverridingDemo2 p=new Child2();  
   p.msg();  
  }  
}  
