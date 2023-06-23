package com.FileOperations.IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadDatainExcel {

	public static void main(String[] args) throws IOException{
       
		
		FileInputStream fis = new FileInputStream("C:\\Users\\chait\\OneDrive\\Desktop\\TestData.xlsx");
		
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		
		XSSFSheet sheet = wb.getSheet("Employee Data");
		
		int rows = sheet.getLastRowNum();
		
		Map<String, String> data = new HashMap<String, String>();
		
		for(int i =0; i<=rows; i++) {
			
			
			String key = sheet.getRow(i).getCell(1).getStringCellValue();
			
			String value  = sheet.getRow(i).getCell(2).getStringCellValue();
			
			data.put(key, value);
			
		}
		
	//	Set<Map.Entry<String,String>> entrySet = data.entrySet();
		
		for(Map.Entry entry :  data.entrySet()) {
			
			System.out.println(entry.getKey() + ": " + entry.getValue());
		}
		
		
	}

}
