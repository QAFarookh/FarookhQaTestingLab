package com.ApachePoi.ReadWriteExcelData;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelData {

	public static void main(String[] args) throws Exception {
		
		File src = new File("‪C:\\Users\\ADMIN\\Desktop\\DDT1.xlsx");
		System.out.println("Specify the location");
		
		FileInputStream fis = new FileInputStream(src);
		System.out.println("Excel loaded");
		
		XSSFWorkbook wb  = new XSSFWorkbook(fis);
		System.out.println("Workbook loaded");
		
		
        XSSFSheet sheet = wb.getSheetAt(0);
        System.out.println("Get the sheet you want to read");
        
        String data = sheet.getRow(1).getCell(1).getStringCellValue();
        String data1 = sheet.getRow(2).getCell(1).getStringCellValue();
        String data2 = sheet.getRow(1).getCell(0).getStringCellValue();
        
        System.out.println(data);
        System.out.println(data1);
        System.out.println(data2);
        
        wb.close();   //Its good practise to close the workbook wb to avoid Memory leakage.
	}



}
