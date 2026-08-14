package test.automation_testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class iframehandle {
public static void main(String[] args) {
	singleiframe();
}
	
	static void singleiframe()
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Frames.html");
		//using id
		//driver.switchTo().frame("singleframe");
		//or
		//using index
		//driver.switchTo().frame(1);
		//or
		//using name
		//driver.switchTo().frame("SingleFrame");
		//or
		WebElement f=driver.findElement(By.tagName("iframe"));
		driver.switchTo().frame(f);
		driver.findElement(By.tagName("input")).sendKeys("Gauri");
	}
}
