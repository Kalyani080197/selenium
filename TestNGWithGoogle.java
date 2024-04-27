package workWithTestNG;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class TestNGWithGoogle {
	
	WebDriver driver;
	long startTime;
	long endTime;
	
	@BeforeSuite
	public void initialiseDriver() {
		startTime = System.currentTimeMillis();
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver-win64\\chromedriver.exe");
	 driver = new ChromeDriver();
	}
	
	@Test
	public void openGoogle() {
		driver.get("https://www.google.co.in");
		WebElement offered = driver.findElement(By.xpath("//*[@class=\"RNmpXc\"]"));
		System.out.println(offered.getAttribute("value")); // I am feeling lucky
		//System.out.println(offered + "offer me");
	}
	
	/*
	 * @Test public void openYahoo() { driver.get("https://www.yahoo.co.in"); }
	 */
	
	@AfterSuite
	public void closeDriver() {
		endTime = System.currentTimeMillis();
		driver.quit();
		System.out.println(endTime-startTime);
	
	
	}
	

}
