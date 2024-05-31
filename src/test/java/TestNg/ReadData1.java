package TestNg;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

public class ReadData1 {
	@Test
	public void data() throws EncryptedDocumentException, IOException {
		File path = new File("D:\\Book1.xlsx");
		FileInputStream fis = new FileInputStream(path);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet("Sheet1");
		int row=sheet.getPhysicalNumberOfRows(); //row=3,coloumn=1;
		 int coloumn= sheet.getRow(0).getPhysicalNumberOfCells();
		for(int i= 0;i<row;i++) {
			for(int j=0;j<coloumn;j++) {
				String s = sheet.getRow(i).getCell(j).toString();
				System.out.println(s);
			}
		}
//		 String s1=sheet.getRow(0).getCell(0).toString();
//		 String s2=sheet.getRow(1).getCell(0).toString();
//		 String s3=sheet.getRow(2).getCell(0).toString();
//		 System.out.println(s1);
//		 System.out.println(s2);
//		 System.out.println(s3);
		
	}

}
