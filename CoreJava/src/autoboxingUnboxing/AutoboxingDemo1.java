package autoboxingUnboxing;

public class AutoboxingDemo1 {

	public static void main(String[] args) {
		Integer i1 = new Integer(12);
		int i2 = i1;
		System.out.println(i2);
		Integer a = i1;
		//Integer b = i;
		switch(4){
		case 1:
			System.out.println("Twelve");
		case 2:
			System.out.println("there");
		default:
			System.out.println("default");
		case 3:
			System.out.println("3");
		case 4:
			System.out.println("4");
		}
		
		Float f = new Float("12");
		System.out.println(f);
		short c = 12;
		switch (c) {
		case 12:
			System.out.println("hellow");
			break;
		case 66:
			System.out.println('B');
			break;
		case 97:
			System.out.println('a');
		default:
			break;
		}
		System.out.println("-----------------------------");
		int i = 0, j = 5; 
		tp: for (;;) 
		    {
		        i++;  
		        for (;;) 
		        {
		            if(i > --j) 
		            {
		                break tp; 
		            } 
		        } 
		        
		    }
		System.out.println("i =" + i + ", j = " + j);
	}

}
