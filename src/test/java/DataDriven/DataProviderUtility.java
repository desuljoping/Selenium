package DataDriven;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class DataProviderUtility {
	public static Object[][] dwsLogin() throws EncryptedDocumentException, IOException
	{
	    
		Object[][] obj = new Object[2][2];
		FileInputStream fis = new FileInputStream("D:\\data.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet("Sheet1");
		obj[0][0]=sheet.getRow(0).getCell(0).toString();
		obj[0][1]=sheet.getRow(0).getCell(1).toString();
		obj[1][0]=sheet.getRow(1).getCell(0).toString();
		obj[1][1]=sheet.getRow(1).getCell(1).toString();
		return obj;
		
		
		
		
		
		
		
		
		
//		obj[0][0]="admin01@gmail.com";
//		obj[0][1]="admin01";
//		obj[1][0]="admin02@gmail.com";
//		obj[1][1]="Admin02";
//		return obj;
		
	}
	

}
