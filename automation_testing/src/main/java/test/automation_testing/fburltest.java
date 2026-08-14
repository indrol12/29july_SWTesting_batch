package test.automation_testing;

import org.openqa.selenium.edge.EdgeDriver;

public class fburltest {
public static void main(String[] args) {
	
	
	EdgeDriver driver=new EdgeDriver();
	
	driver.get("https://secure.facebook.com/");
	
	String expectedurl="www.facebook.com";
	
	String Actualurl=driver.getCurrentUrl();
	
	if(expectedurl.equals(Actualurl))
	{
		System.out.println("Fb login page url is matching");
	}
	else {
		System.out.println("Fb login page url is not  matching");
	}
	driver.close();
}
}
