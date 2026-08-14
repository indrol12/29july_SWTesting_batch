package test.automation_testing;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class alert_box {
	ChromeDriver driver;//declaration of chromedriver
	Alert al;
public static void main(String[] args) throws InterruptedException {
	alert_box a=new alert_box();
	a.launch_setup();
	System.out.println("---------Chrome Browser launch and website opened!!-----------");
	a.simplealert();
	System.out.println("---------simple alert handled!!!!-----------");
	a.confirmalert();
	System.out.println("---------confirm  alert handled!!!!-----------");
	a.promptalert();
	System.out.println("---------prompt alert handled!!!!-----------");
}
void launch_setup()
{
	driver=new ChromeDriver();
	driver.get("https://testautomationpractice.blogspot.com/");
	driver.manage().window().maximize();
}
void promptalert()
{
	driver.findElement(By.id("promptBtn")).click();
	al=driver.switchTo().alert();
	System.out.println("prompt ok:"+al.getText());
	al.sendKeys("Pratiksha");
	al.accept();
}
void simplealert() throws InterruptedException
{
	driver.findElement(By.id("alertBtn")).click();
	al=driver.switchTo().alert();//alert interface used to handle alert box
	System.out.println(al.getText());//get the text of alert box
	Thread.sleep(1000);
	al.accept();
}
void confirmalert()
{//cancel button
	driver.findElement(By.id("confirmBtn")).click();
	al=driver.switchTo().alert();
	System.out.println("cancel:"+al.getText());
	al.dismiss();	
	//ok button 
	driver.findElement(By.id("confirmBtn")).click();
	al=driver.switchTo().alert();
	System.out.println("ok"+al.getText());
	al.accept();
}

}
