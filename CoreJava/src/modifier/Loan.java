package modifier;
/*
 * 
 */
public class Loan {
	private int loanNo;
	private int accountNo;
	int customerNo;
	float loanAmount;
	int loanDuration;
	float interest;
	
	static int count;
	
	Loan(){
		count++;
	}
	
	Loan(int accountNo, int customerNo, float loanAmount, int loanDuration,
			float interest) {
		//super();
		this();//constructor call must be the first statement 
		this.accountNo = accountNo;
		this.customerNo = customerNo;
		this.loanAmount = loanAmount;
		this.loanDuration = loanDuration;
		this.interest = interest;
		count++;
	}

public float calculateInstallments(){
		return (float)(loanAmount/loanDuration);
	}

	public int getAccountNo(){
		return this.accountNo;		 
	}
	public int getCustomerno(){
		return this.customerNo;
	}
	float getLoanAmount(){
		return this.loanAmount;
	}
	public float getInterest(){
		return this.interest;
	}

	public void setAccountNo(int accountNo){
		this.accountNo = accountNo;
	}
	public void setCustomerNo(int customerNo) {
		this.customerNo = customerNo;
	}
	public void setLoanDuration(int loanDuration){
		this.loanDuration = loanDuration;
	}
	public void setLoanAmount(float loanAmount){
		this.loanAmount = loanAmount;
	}
	public void setInterest(float interest) {
		this.interest = interest;
	} 
	
	public void display(){
		System.out.println("Account No: "+this.accountNo+"\n"+"Customer No: "+this.customerNo+"\nLoanAmount: "+this.loanAmount);
		System.out.println("Loan Duration: "+this.loanDuration+"\nInterest: "+this.interest);
	}
	
}
