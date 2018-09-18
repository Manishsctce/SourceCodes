package zzClasses;

public class CurrentAccount extends Account{
	private double currentAmount; 
	{
		accountNo = 2000;
	}
	CurrentAccount(){
		this.accountNo++;
	}
	public CurrentAccount(Customer customer, double balance,double currentAmount){
		super(customer,balance);
		this.currentAmount = currentAmount;
		//setAccountNo(2000);
		this.accountNo++;
	}
	
	
	public void withdraw(double amount) {
		
	}
	public double getEligiblityAmount(){
		if(super.balance > 0){
			System.out.println("Eligible Balance :" +2*balance);
			return (double)(2*balance);
		}
		else if(super.balance<0){
			System.out.println("Eligible Balance: "+balance);
			return (double)balance;
		}
		else{
			return 0;
		}
	}
	//COMMON IMPLEMENTATION
/*	public void accountInfo(){
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
