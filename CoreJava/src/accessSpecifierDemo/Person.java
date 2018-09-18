package accessSpecifierDemo;

public class Person {
	public String name;
	String state;
	private String income;
	protected String nickname; 
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		
		this.name = name;
	}
	public String getNickName() {
		return nickname;
	}
	public void setNickName(String nickname) {
		this.nickname = nickname;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getIncome() {
		return income;
	}
	public void setIncome(String income) {
		this.income = income;
	}
	
	@Override
	public String toString() {	
		return name+"("+nickname+"):"+income+":"+state;
	}
}
