package junit;

import java.util.*;
import org.junit.*;

/* Test Annotation state that this method is for testing
 * 
 */
public class TestEmployee{
	List<Employee> empl = new ArrayList<Employee>();
	EmpBusinessLogic empBusinessLogic = new EmpBusinessLogic();
	Employee emp1,emp2;
	
	{
		emp1 = new Employee("Manish Agrawal",28500,26);
		emp2 = new Employee("Gaurav Agrawal",35500,25);
		Employee emp3 = new Employee("Sourav Agrawal",40500,28);
		Employee emp4 = new Employee("Neha Agrawal",34500,27);
		empl.add(emp1);	empl.add(emp2);empl.add(emp3);empl.add(emp4);
	}
	
	@Ignore
	@BeforeClass
	public void  initialization(){
		
	}
	
	@Test
	public void testCalculateAppraisal(){
		double appraisal = empBusinessLogic.calculateAppraisal(emp1);
		Assert.assertEquals(1000, appraisal, 0.0);
	}
	@Test
	public void calculateYearlySalary(){
		double salary = empBusinessLogic.calculateYearlySalary(emp1);
		Assert.assertTrue("Fine", salary>300000);
	}
	
	@Test
	public void testFindEmployee(){
		 List<Employee> l = empBusinessLogic.findEmployee(empl, "M");
		 Assert.assertEquals((l.iterator().next().getName().startsWith("M")),true);
	}
}
