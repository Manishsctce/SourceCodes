package inheritance;

public class Customer {
	private static int customerId =100; 
	private String customerName ; 
	private String customerAddress ; 
	private int pincode ;
	
	public Customer() {
		customerId++;
	}

	public Customer(String customerName,
			String customerAddress, int pincode) {
		super();
		customerId++;
		this.customerName = customerName;
		this.customerAddress = customerAddress;
		this.pincode = pincode;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerAddress() {
		return customerAddress;
	}

	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	
	public void customerInfo(){	
		System.out.println(
				"User Id:  \t"+this.getCustomerId()+
				"\nName :\t\t"+this.getCustomerName()+
				"\nAddres: \t"+this.getCustomerAddress()+
				"\nPincode:\t"+this.pincode);
	}
}
