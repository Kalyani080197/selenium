package selenium;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;


public class IFrame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Set the path to the ChromeDriver executable
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver-win64\\chromedriver.exe");

        // Initialize ChromeDriver
        WebDriver driver = new ChromeDriver();

        // Open a webpage containing iframes
        driver.get("https://www.leafground.com/frame.xhtml;jsessionid=node0f395ivr6gwh9qxa8zqveqi3u610579.node0");

        // Switch to the iframe by its index (0-based)
        driver.switchTo().frame(0);

        // Find and interact with elements inside the iframe
        WebElement frame0 = driver.findElement(By.id("Click"));
        frame0.click();
        System.out.println("Heading inside iframe: " + frame0.getText());

        // Switch back to the main content
        driver.switchTo().defaultContent();
        
        
        driver.switchTo().frame(1);
        // Interact with elements outside the iframe
        WebElement frame1 = driver.findElement(By.id("Click"));
        System.out.println("Main Heading: " + frame1.getText());
        
        driver.switchTo().defaultContent();
        
        
        List<WebElement> frames = driver.findElements(By.tagName("iframe"));
        
       
        System.out.println(frames.get(2).getSize());

        // Close the browser

	}

}
