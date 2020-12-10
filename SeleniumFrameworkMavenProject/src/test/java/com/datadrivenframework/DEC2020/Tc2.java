package com.datadrivenframework.DEC2020;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Tc2 {

	  public static void main( String[] args ) throws IOException
	    {
	    	FileInputStream fio=new FileInputStream("C:\\Users\\ADMIN\\Desktop\\Excel Test\\Tc2.xlsx");
	    	 System.out.println("Pass 1");
	    	XSSFWorkbook wb=new XSSFWorkbook(fio);
	    	 System.out.println("Pass 2");
	    	XSSFSheet sh=wb.getSheet("Sheet1");
	    	 System.out.println("Pass 3");
	    	
	    	WebDriver d=new FirefoxDriver();
	    	 System.out.println("Drive work perfect");
	    	d.get("http://google.com/");
	    	 System.out.println("Site open successfully");
	    	
	    	String data=d.getCurrentUrl();
	    	 System.out.println("url capture successfully");
	    	System.out.println(data);
	    	sh.createRow(10).createCell(2).setCellValue("Maven work perfectly");
	    	
	    	 System.out.println("success");
	    	FileOutputStream fo=new FileOutputStream("C:\\Users\\ADMIN\\Desktop\\Excel Test\\Tc2.xlsx");
	    	wb.write(fo);
	    	System.out.println("Happy excel test");
	    }
}
