package junit;

import java.util.ArrayList;
import java.util.List;

import junit.framework.TestCase;

import org.junit.*;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

/* TestCase class is use to test method. It can be use in place of annotation. Befor junit3.8
 * we can use both cann't lead to any error
 * timeout value should be in long
 * 
 * TestCase method should alway be public and return void otherwise testcases will compile and does nt give result result
 * No. But still developers write the main() method in a JUnit test case class to call a JUnit test runner to run all tests defined in this class 
 */
public class TestEmployee2 extends TestCase{
	
	@Test(timeout=0)
	public void testreverse(){
		EmpBusinessLogic empBusinessLogic = new EmpBusinessLogic();
		String str = empBusinessLogic.reverse("Manish");
		Assert.assertEquals("hsinaM", str);
		//return "true";
	}
/*
 * No. But still developers write the main() method in a 
 * JUnit test case class to call a JUnit test runner to run all tests defined in this class 	
 */
/*public static void main(String[] args) {
		
		List <Class>testclasses = new ArrayList<Class>();
		//testclasses.add(TestEmployee.class);
		testclasses.add(TestEmployee2.class);
		//testclasses.add(JUnitAnnotationDemo.class);
		//testclasses.add(TestSuiteDemo1.class);
		for(Class test: testclasses){
			runTestCases(test);
		}

	}
	public static void runTestCases(Class testCases){
		Result result = JUnitCore.runClasses(testCases);
		
		for(Failure fail:result.getFailures()){
			System.out.println(fail.toString());
		}
		System.out.println(result.wasSuccessful());
	}*/

}
