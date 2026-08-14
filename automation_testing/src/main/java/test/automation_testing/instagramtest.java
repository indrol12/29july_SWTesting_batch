package test.automation_testing;

import org.openqa.selenium.edge.EdgeDriver;

public class instagramtest {
public static void main(String[] args) {
	
	EdgeDriver driver=new EdgeDriver();
	
	driver.manage().window().maximize();
	
	driver.get("https://www.instagram.com/");
	
	String expected_title="Instagram";
	
	String Actual_title=driver.getTitle();//Instagram
	
	if(expected_title.equals(Actual_title))
	{
		System.out.println("Title is matching");
	}
	else{
		System.out.println("Title is not matching");
		}
	driver.close();
	}
}
