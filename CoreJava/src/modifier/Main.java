package modifier;

public class Main {

	public static void main(String[] args) {
		//Loan(int accountNo, int customerNo, float loanAmount, int loanDuration,float interest)
		Loan l1 = new Loan();
		Loan l2 = new Loan(12345,101,10000f,12,10.5f);
		
		System.out.println("Loan Instances: "+ Loan.count);
		System.out.println("*******Loan Detail*******");
		l2.display();
		
		Loan l3 =null;		//No instance created
		System.out.println("Loan Instances: "+ l3.count);
		
		Loan l4 =new Loan();		
		System.out.println("Loan Instances: "+ l4.count);

	}

}
