package test.automation_testing;

import org.testng.annotations.Test;

public class grouping_testcase {
	
	@Test(groups="smoketest")
	public void first()
	{
		System.out.println("First test case");
	}
	@Test(groups="regressiontest")
	public void second()
	{
		System.out.println("second test case");
	}
	@Test(groups="regressiontest")
	public void third()
	{
		System.out.println("third test case");
	}
}
