package cross_browser_testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class edge_b extends chrome_b{
	
void Test_case2()
{
	EdgeDriver driver=new EdgeDriver();
	driver.get("https://practicetestautomation.com/practice-test-login/");
	driver.manage().window().maximize();
	//1.negative username login test
	driver.findElement(By.id("username")).sendKeys("incorrectUser");
	driver.findElement(By.id("password")).sendKeys("Password123");
	driver.findElement(By.id("submit")).click();
	
	WebElement errormsg=driver.findElement(By.id("error"));
	
	String Expected_error_msg="Your username is invalid!";
	String Actual_error_msg=errormsg.getText();
	if(Expected_error_msg.equals(Actual_error_msg))
	{
		System.out.println("Negative Username Test case passed!!");
	}
	else {
		System.out.println("Negative Username Test case failed!!");
	}
	
}
}
