package com.datadrivenframework.DEC2020;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DDT1 {

	WebDriver driver;
	FileInputStream fis;
	XSSFWorkbook workbook;
	XSSFSheet sheet;
	//FileOutputStream fos;

	@BeforeTest

	public void setUp(){

		//WebDriverManager.chromedriver().setup();
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://opensource-demo.orangehrmlive.com/");
	}

	@Test

	public void operation() throws IOException, InterruptedException{

		
		fis = new FileInputStream("‪C:\\Users\\ADMIN\\Desktop\\Testing\\Excel\\Farookh.xlsx");
		workbook = new XSSFWorkbook(fis);
		sheet    = workbook.getSheet("Sheet1");

		int rowCount = sheet.getLastRowNum();

	
		
		for (int i = 1; i < rowCount; i++) {

			String user = sheet.getRow(i).getCell(0).getStringCellValue();
			String pass = sheet.getRow(i).getCell(1).getStringCellValue();

			Thread.sleep(3000);
			driver.findElement(By.id("txtUsername")).clear();
			driver.findElement(By.id("txtUsername")).sendKeys(user);
			Thread.sleep(4000);
			driver.findElement(By.id("txtPassword")).clear();
			driver.findElement(By.id("txtPassword")).sendKeys(pass);
			Thread.sleep(4000);
			driver.findElement(By.id("btnLogin")).click();
			Thread.sleep(3000);

			driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		}



		FileOutputStream fos=new FileOutputStream("C:\\Users\\ADMIN\\Desktop\\Testing\\Excel\\Farookh.xlsx");

		workbook.write(fos);



	}




}
