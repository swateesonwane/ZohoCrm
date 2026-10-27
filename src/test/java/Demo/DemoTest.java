package Demo;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DemoTest {
	
	@Test(groups = "smoke")
	public void add()
	{
		Reporter.log("add");
		Reporter.log("sub");
	}
	

}
