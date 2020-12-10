package com.farookh.MavenProject;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {
	
	public static void main(String[] args) throws Exception {
		
		File src = new File("C:\\Users\\ADMIN\\Desktop\\Excel\\EbayTestData.xlsx");
		
		FileInputStream fis = new FileInputStream(src);
		
		XSSFWorkbook wb =new XSSFWorkbook(fis);
		
		XSSFSheet sheet1 = wb.getSheetAt(0);
		
		String data1 = sheet1.getRow(0).getCell(1).getStringCellValue();
		
		String data2 = sheet1.getRow(1).getCell(0).getStringCellValue();
		
		String data3 = sheet1.getRow(1).getCell(1).getStringCellValue();
		
		System.out.println("Data from excel is : "+ data1);
		System.out.println("Data from excel is : "+ data2);
		System.out.println("Data from excel id is : "+ data3);

	}

}
