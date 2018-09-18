package zzClasses;

/*Every Employee has 1 primary address and 1 communication addr and 1 emergency addr
 * 
*/
public class Address{
	private String line1;
	private String line2;
	private String city;
	private String state;
	private String country;
	private Long pin;
	
	public Address(){}
	public Address(String line1, String city, String state, Long pin){
		this(line1,city,state,null,pin);
	}
	public Address(String line1, String city, String state, String country,
			Long pin) {
		this(line1,null,city,state,null,pin);
	}
	public Address(String line1, String line2, String city, String state,
			String country, Long pin) {
		super();
		this.line1 = line1;
		this.line2 = line2;
		this.city = city;
		this.state = state;
		this.country = country;
		this.pin = pin;
	}
	public String getLine1() {
		return line1;
	}
	public void setLine1(String line1) {
		this.line1 = line1;
	}
	public String getLine2() {
		return line2;
	}
	public void setLine2(String line2) {
		this.line2 = line2;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public Long getPin() {
		return pin;
	}
	public void setPin(Long pin) {
		this.pin = pin;
	}
}

