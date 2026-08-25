package test.automation_testing;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class external_filereading {

	@Test
	void testfilered() throws IOException
	{
		FileReader fr=new FileReader("C:\\Users\\Admin\\git\\repository2\\automation_testing\\base.properties");
	
		Properties pr=new Properties();
		pr.load(fr);
		EdgeDriver driver=new EdgeDriver();
		driver.get(pr.getProperty("orangehrm"));
	}
}
