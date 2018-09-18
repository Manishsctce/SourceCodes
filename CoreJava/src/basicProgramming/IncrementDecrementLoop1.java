package basicProgramming;
/*
 * in if loop postfix operation happen after condition opration
 */
public class IncrementDecrementLoop1 {
	public static void main(String[] args) {
		int a =1;
		int b=0;
		int tempa=0,tempb=0,tempbb=0;
		for(int c=1;c<4;c++){
			System.out.println(a +" "+b+" "+tempa+" "+tempb+"(b++ > 2) & (++a>1): "+((tempb++ > 2) & (++tempa > 1))+ " "+tempbb++);
			if((b++ > 2) & (++a>1)){
				System.out.println(a);
				++a;
			}
			tempa=a;tempb=b;tempbb=b;
			System.out.println("After Increment: "+a +" "+b);
		}
		System.out.println("Final value: "+a + ", "+b);
	}

}
