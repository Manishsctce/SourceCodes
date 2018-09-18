package junit;

import java.util.*;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;


public class EmployeeTestRunner {
	public static void main(String[] args) {
		
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
	}

}
