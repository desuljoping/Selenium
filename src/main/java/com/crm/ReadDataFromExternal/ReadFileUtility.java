package com.crm.ReadDataFromExternal;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import com.crm.ListnersCode.BaseClassDws;

public class ReadFileUtility  extends BaseClassDws{
	
	public static String property(String key) throws IOException {
		
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream("./config/DwsFile.properties");
		prop.load(fis);
		String data = prop.getProperty(key);
		return data;
		
		
	}
	
	public static String excel(String s,int row,int cell) throws EncryptedDocumentException, IOException {
		File path = new File("C:\\Users\\Admin\\Documents\\listner.xlsx");
		FileInputStream fis = new FileInputStream(path);//for doing connection between script and external file
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet("Sheet1");
		 String data=sheet.getRow(row).getCell(cell).toString();
		
//		String data = sheet.getRow(0).getCell(0).getStringCellValue();
//		String data1 = sheet.getRow(1).getCell(0).getStringCellValue();
//		String sname = sheet.getRow(2).getCell(0).toString();
//		String semail = sheet.getRow(3).getCell(0).toString();
//		String input = sheet.getRow(4).getCell(0).toString();
		return data;
		
	}


}
