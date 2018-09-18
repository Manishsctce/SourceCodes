package cloneable;
class Department implements Cloneable{
	private int deptid = 001;
	private String deptname = "Science";
	public Department(){}
	public Department(int deptid, String deptname) {
		super();
		this.deptid = deptid;
		this.deptname = deptname;
	}
	public int getDeptid() {
		return deptid;
	}
	public void setDeptid(int deptid) {
		this.deptid = deptid;
	}
	public String getDeptname() {
		return deptname;
	}
	public void setDeptname(String deptname) {
		this.deptname = deptname;
	}
	
	public Department clone(){
		try {
			return (Department)super.clone();			
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
			throw new RuntimeException();
		}		
	}
	
	public String toString(){
		return deptid+" " +deptname+" ";
	}
}