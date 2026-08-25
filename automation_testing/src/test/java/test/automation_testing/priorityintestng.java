package test.automation_testing;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class priorityintestng {

	@Test(groups="smoketest")
	void show()
	{
	
		System.out.println("show method runs...");
	}
	@Test(groups="regressiontest")
	void display()
	{
		System.out.println("display  method runs...");
	}
	@Test(groups="smoketest")
	void add()
	{
		System.out.println("add method runs...");
	
	}
	@Test
	void fct()
	{
		System.out.println("fct...");
	
	}
}
