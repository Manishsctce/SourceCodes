package junit;

import java.util.*;

public class EmpBusinessLogic {
	   // Calculate the yearly salary of employee
	   public double calculateYearlySalary(Employee employeeDetails){
	      double yearlySalary=0;
	      yearlySalary = employeeDetails.getMonthlySalary() * 12;
	      return yearlySalary;
	   }
		
	   // Calculate the appraisal amount of employee
	   public double calculateAppraisal(Employee employeeDetails){
	      double appraisal=0;
	      if(employeeDetails.getMonthlySalary() < 10000){
	         appraisal = 500;
	      }else{
	         appraisal = 1000;
	      }
	      return appraisal;
	   }
	   
	   //Calculate the age
	   
	   
	   //Find employee with given letter	   
	   public List<Employee> findEmployee(List<Employee> emplist, String ch){
		   List<Employee> empl = new ArrayList<Employee>();
		   Iterator itr = emplist.iterator();
		   while(itr.hasNext()){
			   Employee emp;
			   emp = (Employee) itr.next();
			   if(emp.getName().startsWith(ch)){
				   empl.add(emp);
			   }
		   }
		   return empl;
	   }
	   
	   
	   //Reverse of string
	   public String reverse(String str){
		   StringBuilder strbuild = new StringBuilder(str);
		   return strbuild.reverse().toString();
	   }
}
