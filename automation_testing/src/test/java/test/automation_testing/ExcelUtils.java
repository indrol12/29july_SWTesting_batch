package test.automation_testing;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

public class ExcelUtils {
	
	public static Object[][] getExcelData(String path,String sheetName) throws FileNotFoundException
	{
		FileInputStream file=new FileInputStream(path);
		
	   Workbook workbook =new Workbook(file);
		
		Sheet sheet=workbook.getSheet(sheetName);
		
		int rows=sheet.getPhysicalNumberOfRows();
		
		Object[][] data=new Object[rows-1][1];
		
		for(int i=1;i<rows;i++)
		{
			
			data[i-1][0]=sheet.getRow(i).getCell(0).toString();
		}
		
		workbook.close();
		file.close();
		
		return data;
	}
	
	
	

}
