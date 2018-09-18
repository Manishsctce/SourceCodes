package junit;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

/* Beforeclass annotation method should be static as it run once before the test method of class
 * AfterClass Annotation method should be static  as it run once after the test method of class
 * Before annoted method run before for each test method
 * After annoted method run after each test method 
 */
public class JUnitAnnotationDemo {
	
	//execute before class
	@Before
	public void beforeClass() {
		System.out.println("in before class");
	}

	//execute after class
	@AfterClass
	public static void  afterClass() {
		System.out.println("in after class");
	}

	//execute before test
	@Before
	public void before() {
		System.out.println("in before");
	}

	//execute after test
	@After
	public  void after() {
		System.out.println("in after");
	}

	//test case
	@Test
	public void test1() {
		System.out.println("in test1 ");
	}

	@Test
	public void test2() {
		System.out.println("in test2 ");
	}

	
	//test case ignore and will not execute
	@Ignore
	public void ignoreTest() {
		System.out.println("in ignore test");
	}
}
