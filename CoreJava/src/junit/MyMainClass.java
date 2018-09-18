package junit;

public class MyMainClass {

	public static void main(String[] args) {
		Employee emp1 = new Employee("Manish Agrawal",28500,26);
		
		EmpBusinessLogic empBusinessLogic = new EmpBusinessLogic();
		System.out.println(emp1.getName()+" annual salary is "+empBusinessLogic.calculateYearlySalary(emp1));;
		
		System.out.println("Appraisal Amount: "+empBusinessLogic.calculateAppraisal(emp1));

	}

}
