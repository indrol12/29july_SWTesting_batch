package test.automation_testing;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class testautomation_login {

	public static void main(String[] args) {
		testautomation_login ob=new testautomation_login();
		ob.logintest();
	}
	void logintest()
	{
		ChromeDriver driver=new ChromeDriver();//launch browser
		
		driver.manage().window().maximize();
		driver.get("https://practicetestautomation.com/practice-test-login/");
		
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("student");
		
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys("Password123");
	}
}
