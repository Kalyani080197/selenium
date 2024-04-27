package selenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver-win64\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.co.in/");

        // Get the current window handle (main window)
        String mainWindowHandle = driver.getWindowHandle();
        
        WebElement search = driver.findElement(By.name("q"));
        search.sendKeys("amazon"+Keys.ENTER);

        

        // Find and click the button to open a new window
        WebElement newWindowButton = driver.findElement(By.partialLinkText("Shop online at Amazon India"));
        newWindowButton.click();

        // Get all window handles
        Set<String> allWindowHandles = driver.getWindowHandles();

        // Iterate over all handles
        for (String handle : allWindowHandles) {
            // Switch to the new window
            if (!handle.equals(mainWindowHandle)) {
                driver.switchTo().window(handle);
                break;
                
            }
            driver.close();
        }

        // Perform operations on the new window
        //System.out.println("New window title: " + driver.getTitle());

        // Close the new window
       

        // Switch back to the main window
        driver.switchTo().window(mainWindowHandle);

        // Perform operations on the main window
        System.out.println("Main window title: " + driver.getTitle());

	}

}
