package junit;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
	TestEmployee.class,
	TestEmployee2.class
})
public class TestSuiteDemo1 {
}
