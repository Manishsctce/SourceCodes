package thisDemo;

//Program of this() constructor call (constructor chaining)  

class Student1{  
  int id;  
  String name;  
  Student1(){System.out.println("default constructor is invoked");}  
    
  Student1(int id,String name){  
  this ();//it is used to invoked current class constructor.  
  this.id = id;  
  this.name = name;  
  }  
  void display(){System.out.println(id+" "+name);}  
    
  public static void main(String args[]){  
  Student1 e1 = new Student1(111,"karan");  
  Student1 e2 = new Student1(222,"Aryan");  
  e1.display();  
  e2.display();  
 }  
}
