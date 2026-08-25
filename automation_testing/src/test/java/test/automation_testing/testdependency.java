package test.automation_testing;

import org.testng.annotations.Test;

public class testdependency {

	@Test
	void launch()
	{
		System.out.println("launch_fct website");
	}
	@Test(dependsOnMethods="launch")
	void dashboard()
	{
		System.out.println("dashboard of fct website");
	}
}
