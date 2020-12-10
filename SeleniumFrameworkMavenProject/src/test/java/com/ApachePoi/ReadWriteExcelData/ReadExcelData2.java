package com.ApachePoi.ReadWriteExcelData;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

//Read a set of data i.e total row count
public class ReadExcelData2 {

	public static void main(String[] args) throws Exception {
		
	    File src = new File("C:\\Users\\ADMIN\\workspace\\SeleniumMavenProject\\MavenProject\\Excel\\Demo9099.xlsx");
		
		FileInputStream fis = new FileInputStream(src);
		
		XSSFWorkbook wb  = new XSSFWorkbook(fis);
		
        XSSFSheet sheet = wb.getSheetAt(0);
        
        int rowCount = sheet.getLastRowNum();
        
        System.out.println(rowCount);
        
        for (int i = 0; i < rowCount ; i++) {
        	
        	String data = sheet.getRow(i).getCell(0).getStringCellValue();
        	
        	//System.out.println(data);
        	System.out.println(i);
			
		}
		}
			

	}


