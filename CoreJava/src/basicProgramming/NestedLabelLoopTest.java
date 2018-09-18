package basicProgramming;

public class NestedLabelLoopTest {
	public static void main(String[] args) {

		int a=1;
		outer_loop:
			while(true){
				a++;
				inner_loop:
					for(int j=1;j<5;j++){
						a +=j;
						System.out.println(a);
						if(j==4){							
							continue inner_loop;}
						break outer_loop;
					}
			//	continue;
			}
		System.out.println(a);

	}

}
