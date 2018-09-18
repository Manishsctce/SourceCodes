package zzJavaObjective;
/*
 * Final variable cannot be assign in method except constructor and
 * all constructor should handle it 
 */


class FinalClass{
	private final int finalvar;
	FinalClass(){
		finalvar = 0;
	}
	FinalClass(int finalvar){
		this.finalvar = finalvar;
	}
	
	public void updateFinal(int updatefinal){
	//	this.finalvar = updatefinal; //Compilation error
	}
}
public class FinalQuestion1 {
	public static void main(String[] args) {
		FinalClass f1 = new FinalClass();
		f1.updateFinal(10);

	}

}
