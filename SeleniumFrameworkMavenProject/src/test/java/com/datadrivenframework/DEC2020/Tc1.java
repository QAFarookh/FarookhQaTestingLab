package com.datadrivenframework.DEC2020;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Tc1 {

	WebDriver driver;
	//FileInputStream inputStream;
	//XSSFWorkbook Workbook;
	//XSSFSheet   sheet;

	@BeforeTest
	public void loginOperation(){

		driver = new FirefoxDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
	}

	@Test

	public void login() throws IOException, InterruptedException{

		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		Thread.sleep(4000);

		FileInputStream	inputStream = new FileInputStream("‪C:\\Users\\ADMIN\\Desktop\\Excel Test\\DDT1.xlsx");
		XSSFWorkbook	Workbook    = new XSSFWorkbook(inputStream);
		XSSFSheet 	    sheet       = Workbook.getSheet("Sheet1");

		int rowCount =	sheet.getLastRowNum();

		for (int i = 1; i <= rowCount; i++) { 

			String userName = sheet.getRow(i).getCell(0).getStringCellValue();
			String password = sheet.getRow(i).getCell(1).getStringCellValue();

			Thread.sleep(3000);
			driver.findElement(By.id("txtUsername")).clear();
			driver.findElement(By.id("txtUsername")).sendKeys(userName);
			Thread.sleep(4000);
			driver.findElement(By.id("txtPassword")).clear();
			driver.findElement(By.id("txtPassword")).sendKeys(password);
			Thread.sleep(4000);
			driver.findElement(By.id("btnLogin")).click();
			Thread.sleep(3000);

			driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		}



		FileOutputStream fo=new FileOutputStream("C:\\Users\\ADMIN\\Desktop\\Excel Test\\DDT1.xlsx");

		Workbook.write(fo);











	}




}
