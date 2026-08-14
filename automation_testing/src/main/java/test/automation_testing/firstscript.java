package test.automation_testing;
import org.openqa.selenium.*;
import org.openqa.selenium.edge.EdgeDriver;
public class firstscript {
	
	
	public static void main(String[] args) throws InterruptedException {
		
		//configuration of webdriver
		//System.setProperty("webdriver.edge.driver", "C:\\Users\\Admin\\29julytesting\\automation_testing\\driverresources\\msedgedriver.exe");
	
		//browser launch /intialize the edgedriver
		EdgeDriver driver=new EdgeDriver();
		driver.manage().window().maximize();	//maximize screen
	
		driver.get("https://www.fortunecloudindia.com/");	//launch webapp
		System.out.println("Title of fct is:"+driver.getTitle());
		Thread.sleep(1000);
		
		driver.navigate().to("https://chatgpt.com/");//to navigate another website
		System.out.println("Url of chatgpt is:"+driver.getCurrentUrl());
		Thread.sleep(1000);
		driver.navigate().back();//used to navigate back
		Thread.sleep(1000);
		driver.navigate().forward();//used to navigate forward
		Thread.sleep(1000);
		driver.close();//used to close the current browser window
	}

}
