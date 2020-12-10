package com.ApachePoi.ReadWriteExcelData;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteExcelData {

	public static void main(String[] args) throws Exception {
		
		File src = new File("C:\\Users\\ADMIN\\workspace\\SeleniumMavenProject\\MavenProject\\Excel\\Demo9099.xlsx");
		
		FileInputStream fis = new FileInputStream(src);
		
		XSSFWorkbook wb  = new XSSFWorkbook(fis);
		
        XSSFSheet sheet = wb.getSheetAt(0);
        
       sheet.getRow(0).createCell(2).setCellValue("Result"); 
       sheet.getRow(1).createCell(2).setCellValue("pass");
       sheet.getRow(2).createCell(2).setCellValue("pass");
       sheet.getRow(3).createCell(2).setCellValue("pass");
       sheet.getRow(4).createCell(2).setCellValue(99.99);
       
        FileOutputStream fos = new FileOutputStream(src);
        wb.write(fos);   
        wb.close();   //Its good practise to close the workbook wb to avoid Memory leakage.
	}



}
