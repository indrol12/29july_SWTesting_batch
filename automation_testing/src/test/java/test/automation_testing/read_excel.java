package test.automation_testing;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class read_excel {
	
	@DataProvider(name="testData")
	public Object[][] testData() throws IOException
	{
		
		String path="C:\\Users\\Admin\\Desktop\\script.xlsx";
		
		return ExcelUtils.getExcelData(path, "sheet1");
	}
	
	@Test(dataProvider="testData")
	public void test1(String name)
	{
		
		System.out.println("Name= " +name);
	}

}
