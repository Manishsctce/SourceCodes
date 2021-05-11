package zzClasses;

import java.time.LocalDate;
import java.util.Optional;

public class Celebrity extends Person{
	private String name;
	private char gender;
	private LocalDate dob;
	private String origin;
	private String industry;
	private String[] top10;
	
	public Celebrity() {}
	
	public Celebrity(String name, char gender, LocalDate dob, String industry) {
		
		super(getFirstLastName(name, true),getFirstLastName(name, false), gender, dob);
		this.industry = industry;
	}
	

	public String getOrigin() {
		return origin;
	}
	public void setOrigin(String origin) {
		this.origin = origin;
	}
	public String getIndustry() {
		return industry;
	}
	public void setIndustry(String industry) {
		this.industry = industry;
	}
	public String[] getTop10() {
		return top10;
	}
	public void setTop10(String[] top10) {
		this.top10 = top10;
	}
	
	public static String getFirstLastName(String name, boolean first) {
		String[] names = name.split("//s", 1);
		String fname, lname;
		if(names == null) {
			return name;
		} else if(names !=null && names.length>1 && first) {
			return fname = names[0];
		} else if(names !=null && names.length>1 && !first) {
			return lname = names[1];
		} else if(first){
			return fname = names[0];
		}else {
			return "";
		}
	}

	@Override
	public String toString() {
		return "Celebrity [" +super.toString()+ ", industry=" + industry + "]";
	}
	
	
}
