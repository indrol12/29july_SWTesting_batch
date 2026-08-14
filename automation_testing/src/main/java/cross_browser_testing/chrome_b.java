package cross_browser_testing;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class chrome_b {

	void Test_Case1()
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://practicetestautomation.com/practice-test-login/");
		driver.manage().window().maximize();
		//1.positive login test
		driver.findElement(By.id("username")).sendKeys("student");
		driver.findElement(By.id("password")).sendKeys("Password123");
		driver.findElement(By.id("submit")).click();
		
		String Expected_url="https://practicetestautomation.com/logged-in-successfully/";
		String Actual_url=driver.getCurrentUrl();
		if(Expected_url.equals(Actual_url))
		{
			System.out.println("Positive Test case Passed!!");
		}
		else {
			System.out.println("Positive Test case Failed!!");
		}
	}
}
