package test_dataprovider;

import org.testng.annotations.Test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.DataProvider;

public class saucedemo_login_logouttest {
	
  @Test(dataProvider = "data")
  public void test(String username, String password) throws InterruptedException {
	  
	  EdgeDriver driver=new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.id("user-name")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		Thread.sleep(1000);
		driver.findElement(By.id("login-button")).click();
		
		driver.findElement(By.id("react-burger-menu-btn")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("logout_sidebar_link")).click();
		driver.close();	
  }

  @DataProvider
  public Object[][] data() {
    return new Object[][] {
      new Object[] { "standard_user", "secret_sauce" },
      new Object[] { "problem_user", "secret_sauce" },
      new Object[] { "performance_glitch_user", "secret_sauce" },
      new Object[] { "error_user", "secret_sauce" },
      new Object[] { "visual_user", "secret_sauce" },
    
    };
  }
}
