package interfaceDemo;
/*  INTERFACE
 *  interface can extend multiple interface because it does not cause diamond problem
 */
 interface ParentInterface1{
	 float pi = 3.14f;
	 double c = 3 * Math.pow(10,8);//speed of ligth c unit is m/s
	 double NA = 6.022 * Math.pow(10, 23);//Avogadro’s number unit is 1/mol
	 
	 int method1();
}
interface ParentInterface2{
	double k = 1.38 * Math.pow(10,-23);// Boltzman const unit is J/K
	double G = 6.672 *Math.pow(10,-11);//Gravitational constant: Unit = N.m2/kg2 
	int method1();
}

interface ChildInterface extends ParentInterface1, ParentInterface2{
	
}

class Implementation implements ChildInterface{

	//Only single implementation  for the both methods Hence there is no diamond problem
	public int method1() {
		return 0;
	}

}

public class InterfaceTest2 {
	public static void main(String[] args) {

	}

}
