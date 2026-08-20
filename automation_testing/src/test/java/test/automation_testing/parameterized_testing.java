package test.automation_testing;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class parameterized_testing {
   @Parameters({"num1","num2"})//10,50
	@Test
	void add(int a,int b)//a=10 b=50
	{
		System.out.println("addition is:"+(a+b));
		
	}
}
