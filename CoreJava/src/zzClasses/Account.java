package zzClasses;

public abstract class Account {
	protected static int accountNo ; 
	private Customer customer ;
	protected double balance ;
	public Account(Customer customer, double balance) {
		super();		
		this.customer = customer;
		this.balance = balance;
	}
	public Account() {
		//this.accountNo++;
	}
	
	public static int getAccountNo(){
		return accountNo;
	}
	public static void setAccountNo(int accountNo){
		Account.accountNo = accountNo;
	}
	public Customer getCustomer(){
		return this.customer;
	}
	public double balanceEnquiry(){
		return this.balance;
	}
	
	
	
//	public abstract void accountInfo();
	public abstract void withdraw(double amount);
	
	public void accountInfo(){
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
	}
}
