package Assignment;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

public class OddAndEven {
	@Test
	public void readData() throws EncryptedDocumentException, IOException {
		File path = new File("C:\\Users\\ASUS\\Desktop\\Selenium\\Number.xlsx");
		FileInputStream fis = new FileInputStream(path);
		
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet("Sheet1");
		int row = sheet.getPhysicalNumberOfRows();
		int column = sheet.getRow(0).getPhysicalNumberOfCells();
		for(int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				String input = sheet.getRow(i).getCell(j).toString();
				int num = (int)Double.parseDouble(input);
				//System.out.println(cellValueAsInt);
				
				 if (isEven(num)) {
					 System.out.println(num + " is a even number");
					 } 
				 else {
	                    System.out.println(num + " is a odd number");
	                }

			}
		}
	}
	public  boolean isEven(int num)
	{
		if (num <= 0) 
		{
			return false;
		}
		
		else if (num%2==0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

}


