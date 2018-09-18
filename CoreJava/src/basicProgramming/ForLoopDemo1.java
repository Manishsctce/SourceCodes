package basicProgramming;

public class ForLoopDemo1 {

	public static void main(String[] args) {
		demo1();
		//demo2();
	}

	static void demo1(){
		final int x ;
		x = 12;
		//x = 134;
		final int a[];
		a = new int[4];
		
		a[0] = 9;
		System.out.println(a[0]);
		a[0]=90;
		System.out.println(a[0]);
//		for(;;)
//			System.out.println("hellow");
	}
	
	static void demo2(){
		int i = 0, j = 5; 
		tp1: for (;;) 
		    {
		        i++;  
		      tp2:  for (;;) 
		        {
		            if(i > --j) 
		            {
		                break tp1;
		            	
		            } 
		        }		        
		    }
		   System.out.println("i =" + i + ", j = " + j);
	}
}
