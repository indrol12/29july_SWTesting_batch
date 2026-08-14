package test.automation_testing;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.support.ui.Select;
public class dropdownhandle {
public static void main(String[] args) {
	
	dropdownhandle o=new dropdownhandle();
	o.testdropdown();
}
void testdropdown()
{
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://testautomationpractice.blogspot.com/");
	WebElement country=driver.findElement(By.id("country"));
	
	//to handle dropdowm
	Select s=new Select(country);
	s.selectByValue("canada");
}

void mousehover()
{
	
}
}
