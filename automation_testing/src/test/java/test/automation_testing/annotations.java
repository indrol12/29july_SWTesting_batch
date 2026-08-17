package test.automation_testing;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class annotations {

	@Test
	void c()
	{
		System.out.println("test");
	}
	@AfterMethod
	void b()
	{
		System.out.println("after test");
	}
	@BeforeMethod
	void a()
	{
		System.out.println("before test");
	}
}
