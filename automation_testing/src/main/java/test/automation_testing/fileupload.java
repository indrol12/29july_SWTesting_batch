package test.automation_testing;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class fileupload {
public static void main(String[] args) {
	
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demo.automationtesting.in/Register.html");
	//C:\Users\Admin\Pictures\Screenshots\inflowinventory.png
	driver.findElement(By.id("imagesrc")).sendKeys("C:\\Users\\Admin\\Pictures\\Screenshots\\inflowinventory.png");
	
}
}
