package test.automation_testing;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class fblogininvalid {

	public static void main(String[] args) {
		
		fblogininvalid o=new fblogininvalid();
		o.invalidtest();
	}
	void invalidtest()
	{
		EdgeDriver driver=new EdgeDriver();
		driver.get("https://secure.facebook.com/");
		//id
		driver.findElement(By.id("email")).sendKeys("om@gmail.com");
		//name
		driver.findElement(By.name("pass")).sendKeys("om@123");
		//tagname
		driver.findElement(By.tagName("button")).click();
		//Linktext
		driver.findElement(By.linkText("Forgotten password?")).click();
		//navigate to back
		driver.navigate().back();
		//partiallinktext
		driver.findElement(By.partialLinkText("Forgotten")).click();
		//navigate to back
	    driver.navigate().back();
		//classname
	    driver.findElement(By.className("_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy")).click();
	}
	
}
