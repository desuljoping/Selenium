package Assignment;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

public class primeNumber {
	public class ReadData1 {
		@Test
		public void primeNO() throws EncryptedDocumentException, IOException {
			
			File path = new File("D:\\\\prime.xlsx");
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
					
					 if (isPrime(num)) {
						 System.out.println(num + " is a prime number");
						 } 
					 else {
		                    System.out.println(num + " is not a prime number");
		                }

				}
			}
		}
		public boolean isPrime(int num)
		{
			if (num <= 1) 
			{
				return false;
			}
			
			int dem=2 ;
			while (num>dem)
			{
				if (num%dem==0)
				{
					return false;
				}
				dem++;
			}
			
			return true ;
		}


	}
}