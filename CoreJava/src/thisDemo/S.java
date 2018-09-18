package thisDemo;
//this keyword can be passed as an argument in the method.
class S{  
	  void m(S obj){  
	  System.out.println("method is invoked");  
	  }  
	  void p(){  
	  m(this);  //
	  }  
	    
	  public static void main(String args[]){  
	  S s1 = new S();  
	  s1.p();  
	  }  
}  