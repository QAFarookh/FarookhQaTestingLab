package com.ApachePoi.ReadWriteExcelData;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteExcelData2 {

	public static void main(String[] args) throws Exception {
		
		File src = new File("C:\\Users\\ADMIN\\workspace\\SeleniumMavenProject\\MavenProject\\Excel\\Demo9099.xlsx");
		
		FileInputStream fis = new FileInputStream(src);
		
		XSSFWorkbook wb  = new XSSFWorkbook(fis);
		
        XSSFSheet sheet = wb.getSheetAt(0);
        
       sheet.getRow(0).createCell(2).setCellValue("Result"); 
       sheet.getRow(1).createCell(2).setCellValue("pass");
       sheet.getRow(2).createCell(2).setCellValue("pass");
       sheet.getRow(3).createCell(2).setCellValue("pass");
       sheet.getRow(4).createCell(2).setCellValue("Fail");
       sheet.getRow(0).createCell(3).setCellValue("Percentage");
       sheet.getRow(1).createCell(3).setCellValue(45.89);
       sheet.getRow(2).createCell(3).setCellValue(85.89);
       sheet.getRow(3).createCell(3).setCellValue(65.80);
       sheet.getRow(4).createCell(3).setCellValue(32.34);
    
      
        FileOutputStream fos = new FileOutputStream(src); //To read data from excelfile
        wb.write(fos);   
        wb.close();   //Its good practise to close the workbook wb to avoid Memory leakage.
	}



}
