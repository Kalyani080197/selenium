package workWithTestNG;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class PomExample {
	
	
	WebDriver driver;
	
	@FindBy(xpath ="//*[@id=\"recaptcha-anchor\"]/div[1]")
	public static WebElement robot;
	
	
	@BeforeSuite
	public void setupDriver() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver-win64\\chromedriver.exe");
		 driver = new ChromeDriver();
	}
	
	@Test
	public void launchBrowser() throws InterruptedException {
		driver.get("https://www.orangehrm.com/en/book-a-free-demo/");
		PageFactory.initElements(driver, CallPom.class);
		CallPom.username.sendKeys("kalyani");
		CallPom.email.sendKeys("kalyani080197@gmail.com");
		CallPom.company.sendKeys("LTIMindtree");
		CallPom.phno.sendKeys("9150539058");
		CallPom.country.sendKeys("India");
		
		/*
		 * WebElement checkbox = new WebDriverWait(driver, Duration.ofSeconds(20))
		 * .until(ExpectedConditions.elementToBeClickable(robot));
		 */
    //robot.click();
    
		
		/*
		 * WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
		 * wait.until(ExpectedConditions.elementToBeClickable(CallPom.robot));
		 */
		
		
		//CallPom.robot.click();
		CallPom.submit.submit();
		}
	
	
	
	
	

}
