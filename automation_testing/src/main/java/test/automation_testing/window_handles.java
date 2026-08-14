package test.automation_testing;

import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class window_handles {
	ChromeDriver driver;
public static void main(String[] args) throws InterruptedException {
	window_handles wh=new window_handles();
	wh.launch();
	Thread.sleep(1000);
	wh.tab();
	Thread.sleep(1000);
	wh.window();
	Thread.sleep(1000);
	wh.close();
}
void launch()
{
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.flipkart.com/");
}
void tab()
{
	driver.switchTo().newWindow(WindowType.TAB);
	driver.get("https://www.goibibo.com/");
}
void window()
{
	driver.switchTo().newWindow(WindowType.WINDOW);
	driver.get("https://www.facebook.com/");
}
void close()
{
driver.quit();
}
}
