package test.automation_testing;

import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

import java.io.File;
import java.io.IOException;
import java.util.logging.FileHandler;

import org.openqa.selenium.*;
public class screenshort_capture {
	static ChromeDriver driver;
public static void main(String[] args) throws IOException, InterruptedException {
	fullss();
	partial_ss();
}
	static void fullss() throws IOException, InterruptedException
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/");
		Thread.sleep(2000);
		TakesScreenshot ts=driver;
		
		File src=ts.getScreenshotAs(OutputType.FILE);
		
		File dest=new File("C:\\Users\\Admin\\29julytesting\\automation_testing\\M_homepage.png");
		
		Files.copy(src,dest);
		System.out.println("full Screenshot captured!!");
	}
	static void partial_ss() throws IOException
	{
		driver.navigate().to("https://www.fortunecloudindia.com/");
		WebElement fctlogo=driver.findElement(By.xpath("//img[@alt='FCT Logo - Fortune Cloud Technologies']"));
		
		File source=fctlogo.getScreenshotAs(OutputType.FILE);
		
		File Destination=new File("C:\\Users\\Admin\\29julytesting\\automation_testing\\fctlogo.png");
		
		Files.copy(source, Destination);
		System.out.println("Partial Screenshot captured!!");
	}
}
