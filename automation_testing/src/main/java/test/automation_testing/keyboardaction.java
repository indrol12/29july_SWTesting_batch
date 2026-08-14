package test.automation_testing;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class keyboardaction {
public static void main(String[] args) {
	
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.google.com/");
//	WebElement search=driver.findElement(By.tagName("textarea"));
//	search.sendKeys("software testing tutorial");
//	search.sendKeys(Keys.ENTER);
//	
	driver.navigate().to("https://demo.automationtesting.in/Register.html");
	
	WebElement firstname=driver.findElement(By.xpath("//input[@placeholder='First Name']"));
	firstname.sendKeys("priya");
	//select
	firstname.sendKeys(Keys.CONTROL+"A");
	//copy
	firstname.sendKeys(Keys.CONTROL+"C");
	
	WebElement lastname=driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
	lastname.sendKeys(Keys.CONTROL+"V");
	
}
}
