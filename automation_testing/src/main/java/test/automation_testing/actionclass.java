package test.automation_testing;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class actionclass {
	ChromeDriver driver;
	Actions ac;
	public static void main(String[] args) {
		actionclass ob=new actionclass();
		ob.mousehover();
		ob.draganddrop();
		//ob.slider();
		ob.task();
	}
	void mousehover()
	{
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://testautomationpractice.blogspot.com/");
			WebElement pointme=driver.findElement(By.xpath("//button[text()='Point Me']"));
			
			//Action class-->use for mouse and keyboard action
			ac=new Actions(driver);
			ac.moveToElement(pointme).build().perform();
			
	}
	void draganddrop()
	{
		WebElement drag=driver.findElement(By.id("draggable"));
		
		WebElement drop=driver.findElement(By.id("droppable"));
		ac.dragAndDrop(drag, drop).build().perform();
	}
	void slider()
	{
		WebElement left_slider=driver.findElement(By.cssSelector("span[style='left: 0%;']"));
		ac.dragAndDropBy(left_slider, 100, 0).build().perform();
	}
	void task()
	{
		driver.navigate().to("https://demo.automationtesting.in/Slider.html");
		WebElement sl=driver.findElement(By.id("slider"));
		
		ac.dragAndDropBy(sl, 0, 70).build().perform();
		ac.dragAndDropBy(sl, -50, 0).build().perform();
	}
}
