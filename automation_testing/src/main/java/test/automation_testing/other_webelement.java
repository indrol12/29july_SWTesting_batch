package test.automation_testing;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class other_webelement {
	ChromeDriver driver;
	
	void setup()
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
	}
	void dynamicbutton()
	{
		driver.findElement(By.name("start")).click();
	}
	void search()
	{
		WebElement se=driver.findElement(By.id("Wikipedia1_wikipedia-search-input"));
		se.sendKeys("Mobile");
		se.sendKeys(Keys.ENTER);
	}
	void newtab()
	{
		driver.findElement(By.xpath("//button[text()='New Tab']")).click();
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://testautomationpractice.blogspot.com/");
	}
	void popupwindow()
	{
		driver.findElement(By.id("PopUp")).click();	
	}
	
	void doubleclick()
	{
		WebElement dblclk=driver.findElement(By.xpath("//button[contains(text(),'Copy Text')]"));
	
		Actions ac=new Actions(driver);
		ac.doubleClick(dblclk).perform();
	}
	
	void close()
	{
		driver.close();
	}
	public static void main(String[] args) {
		other_webelement o=new other_webelement();
		o.setup();
		o.dynamicbutton();
		o.search();
		o.newtab();
		o.doubleclick();
		//o.popupwindow();
		//o.close();
	}
}
