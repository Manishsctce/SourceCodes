package threadDemo;
//object of any class will have default value null  
//default value of char is \b white space
public class test {
	Integer i ;
	int j;
	Float f;
	char c;
	public static void main(String args[]){		
		test t = new test();
		t.go();
		
	}
	void go(){
		//j = i;
		System.out.println(i+ " "+j+" "+f+" "+"|"+c+"|");
	}

}
