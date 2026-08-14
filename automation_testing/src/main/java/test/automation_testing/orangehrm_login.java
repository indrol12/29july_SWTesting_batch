package test.automation_testing;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class orangehrm_login {

	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		//implicit wait in selenium
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		//driver.findElement(By.name("username")).sendKeys("Admin");
		
		//driver.findElement(By.xpath("//input[@placeholder='username']")).sendKeys("Admin");
			
		//explicit wait	
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));		
		WebElement uname=wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("username")));		
		uname.sendKeys("Admin");
		
		driver.findElement(By.name("password")).sendKeys("admin123");
		
	}
	
}
