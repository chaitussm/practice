package com.FileOperations.IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadDatainExcel_old {
	
	
	public static Map<String, String> getMapData() throws IOException{
		
		
		Map<String,String> testData = new HashMap<String,String>();
		
		try {
			
			FileInputStream fis = new FileInputStream("C:\\Users\\chait\\OneDrive\\Desktop\\TestData.xlsx");
			
			XSSFWorkbook wb = new XSSFWorkbook(fis);
			
			XSSFSheet sheet = wb.getSheetAt(0);
			
			int rownum = sheet.getLastRowNum();
			
			for(int i =0; i <= rownum; i++) {
				
				Row row = sheet.getRow(i);
				
				Cell keycell = row.getCell(1);
				
				String key = keycell.getStringCellValue().trim();
				
				Cell valueCell = row.getCell(2);
				
				String value = valueCell.getStringCellValue().trim();
				
				//String value = valueCell.getRichStringCellValue().getString();
				
				testData.put(key, value);
				
				
			Set<Map.Entry<String, String>> entrySet = testData.entrySet();
			
			for(Entry<String,String> entry : entrySet) {
				
				System.out.println(entry.getKey()+ "==========" + entry.getValue());
			}
			}
		}
		
		catch(FileNotFoundException e ) {
			
			e.printStackTrace();
		}
		
		 
		return testData;
		
		
	}

	public static void main(String[] args) {

		
		try {
			ReadDatainExcel_old.getMapData();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
