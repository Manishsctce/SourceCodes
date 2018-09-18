package serialization;

import java.io.Serializable;

public class SavingAccount extends Account implements Serializable{
	private double minimumBalance = 500.00; 
	private int interestRate= 12;
	{
		accountNo = 1000;
	}
	public SavingAccount() {
		super();
		//setAccountNo(1000);
		this.accountNo++;
	}
	public SavingAccount(Customer customer, double balance) {
		super(customer,balance);
		setAccountNo(1000);
		
	} 

	public void withdraw(double amount){
		if(super.balanceEnquiry()<=500){
			System.out.println("Balance is low.");
		}
		else{
			if((super.balanceEnquiry() - amount )>=500){
				balance = balance - amount;
				System.out.println("Transaction Successfull");
				System.out.println("Now the current balance is "+balance);
			}
			else{
					System.out.println("Insufficient Balance");	
			}
		}
	}
	public void calculateInterest(){
		
	}
	
	/*public void accountInfo(){
		System.out.println(
				"User Id:  \t"+getCustomer().getCustomerId()+
				"\nAccount No:\t"+this.getAccountNo()+
				"\nName :\t\t"+getCustomer().getCustomerName()+
				"\nAddres: \t"+getCustomer().getCustomerAddress()+
				"\nPincode:\t"+getCustomer().getPincode()+"\n");
	}
	
	public void deposit(double amount){
		this.balance = this.balance+amount;
		System.out.println("Dear "+getCustomer().getCustomerName().substring(0, getCustomer().getCustomerName().indexOf(" "))
				+",\n\t You have Successfully deposited "+amount+".\n\tYour Current balance is "+balance);
	}*/
	
}
