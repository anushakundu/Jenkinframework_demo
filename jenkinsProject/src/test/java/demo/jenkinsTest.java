package demo;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class jenkinsTest {
	@Test
	public void demo() {
		Reporter.log("add class added",true);
		Reporter.log("on poll scm",true);
		Reporter.log("on poll 3scm",true);
		Reporter.log("on poll 4scm",true);
		
	} 

}
