package com.FileOperations.IO;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelData_onebyone {

	public static void main(String[] args) throws IOException{
		
		File src = new File("C:\\Users\\chait\\OneDrive\\Desktop\\TestData.xlsx");
		
		FileInputStream fis = new FileInputStream(src);
		
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		
		XSSFSheet sheet = wb.getSheetAt(0);
		
		String  data = sheet.getRow(0).getCell(0).getStringCellValue();
		
		System.out.println("data from excel is " + data );

        XSSFSheet sheet1 = wb.getSheetAt(0);
		
		String  data1 = sheet1.getRow(1).getCell(1).getStringCellValue();
		
		System.out.println("data from excel is " + data1 );    
		
	
		
		
	}

}
