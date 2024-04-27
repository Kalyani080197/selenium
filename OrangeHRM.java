package workWithTestNG;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OrangeHRM {
	
	public static void main(String[] args) throws InterruptedException {
        // Set the path to the ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver-win64\\chromedriver.exe");

        // Create a new instance of the ChromeDriver
        WebDriver driver = new ChromeDriver();

        // Navigate to the webpage
        driver.get("https://www.orangehrm.com/en/book-a-free-demo/");
        
        Thread.sleep(1000);
        
        WebElement webele = driver.findElement(By.xpath("//*[@id=\"rc-anchor-container\"]/div[3]/div[1]/div/div"));
        webele.click();
        // Find and click the "I'm not a robot" checkbox
		/*
		 * WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		 * WebElement checkbox =
		 * wait.until(ExpectedConditions.elementToBeClickable(By.xpath(
		 * "//*[@id=\"recaptcha-anchor\"]/div[4]"))); checkbox.click();
		 */

        // Close the browser
        driver.quit();
    }
	
	
	
	//do it later,, find solution to inspect i am not robot checkbox

}
