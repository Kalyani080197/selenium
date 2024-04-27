package workWithTestNG;

import java.io.FileInputStream;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

import java.io.File;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.ss.usermodel.*;


import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDrivenFrameworkEg {
	
	WebDriver driver;
	
	public String[][] data;
	
	@BeforeSuite
	public void setupDriver() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver-win64\\chromedriver.exe");
		 driver = new ChromeDriver();
	}
	
	
	
	 @DataProvider(name ="loginData") 
	 public String[][] getData() throws
	 BiffException, IOException{ 
		 data= getExcelData(); 
		 return data; }
	 
	
	public String[][]  getExcelData() throws BiffException, IOException {
		String[][] datanew= new String [1][1];
		FileInputStream file = new FileInputStream("C:\\Users\\HP\\Desktop\\Sample-Spreadsheet.xls");
		Workbook workbook = Workbook.getWorkbook(file);
		Sheet sheet = workbook.getSheet(0);
		System.out.println(sheet + "kalyani");
		
		 int rowCount = sheet.getRows(); 
		 int columCount = sheet.getColumns();
		 String testData [][] = new String [rowCount-1][columCount];
		  
		for (int i=1; i< rowCount; i++) { 
			for(int j=0;i<columCount; j++) 
			{
		testData[i-1][ j] = sheet.getCell(j,i).getContents(); 
		} 
		} 
		return testData;
		 
	}
	
	
	@Test(dataProvider = "loginData")
	public void getTest(String uname, String pwrd) throws BiffException, IOException {
		driver.get("www.google.co.in");
		driver.get("https://accounts.lambdatest.com/login?_gl=1*1rmztg4*_gcl_au*MTA0OTA2MjIzNS4xNzExMjg0MTQx");
		
		 WebElement email = driver.findElement(By.id("email")); WebElement password =
		driver.findElement(By.id("password")); email.sendKeys(uname);
		 password.sendKeys(pwrd); WebElement login =
		 driver.findElement(By.id("login-button")); login.click();
		 
	}
}


//code not working but this is the code



