package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsScroll {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver-win64\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.co.in/");
	
		
		WebElement searchbox = driver.findElement(By.name("q"));
		searchbox.sendKeys("Agni"+Keys.ENTER);
		
		//maximize
		driver.manage().window().maximize();
				
		
		Thread.sleep(1000);
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		//scroll down - values should be positive
		js.executeScript("window.scrollBy(0,500)");
		
		Thread.sleep(2000);
		
		//scroll down - values should be negative
		js.executeScript("window.scrollBy(0,-500)");
		
		Thread.sleep(2000);
		
		//minimize
		driver.manage().window().minimize();
	}

}
