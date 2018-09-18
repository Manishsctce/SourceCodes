package immutability;

class Address{
	private String buildingName;
	private String city;
	private long pincode;
	
	Address(String buildingName, String city, long pincode) {
		this.buildingName = buildingName;
		this.city = city;
		this.pincode = pincode;
	}
	
	public String getBuildingName() {
		return buildingName;
	}
	public String getCity() {
		return city;
	}
	public long getPincode() {
		return pincode;
	}

	public void setBuildingName(String buildingName) {
		this.buildingName = buildingName;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public void setPincode(long pincode) {
		this.pincode = pincode;
	}

	@Override
	public String toString() {
		return "Address [buildingName=" + buildingName + ", city=" + city + ", pincode=" + pincode + "]";
	}
	
}

final class Employee{
	final private int id;
	final private String name;
	final private String designation;
	private Address address;
	
	Employee(int id, String name, String designation, Address address) {
		this.id = id;
		this.name = name;
		this.designation = designation;
		//this.address = address;
		this.address = new Address(address.getBuildingName(), address.getCity(),address.getPincode());
	}
	
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getDesignation() {
		return designation;
	}
	/*
	 *  We should not return the reference of original instance variable.
    * Instead, a new Address object with content copied to it, should be returned.
	 */
	public Address getAddress() {
		return new Address(address.getBuildingName(),address.getCity(),address.getPincode());
	}
	
	public String toString(){
		return "Employee Id: "+id+" , Name: "+name+" , Designation: "+designation+"\n"+address.toString();		
	}
}
public class ImmutableClassDemo2 {
	public static void main(String[] args) {
		final Address manasAddr = new Address("Sai Vatika","Pune",411015);
		
		Employee manas = new Employee(1,"Manish","AMTS",manasAddr);
		System.out.println(manas.toString());
		
		manasAddr.setBuildingName("Anmol Residency");
		
		Address addr = manas.getAddress();
		addr.setBuildingName("Anmol Residency");
		System.out.println(manas.toString());
	}

}
