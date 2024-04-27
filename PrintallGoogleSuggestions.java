package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintallGoogleSuggestions {
	
	public static void main(String arg[]) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.co.in/");
		
		WebElement element = driver.findElement(By.name("q"));
		element.sendKeys("Agni");
		Thread.sleep(5000);
		
		   
		List<WebElement> webElemList = driver.findElements(By.xpath("//*[@name=\"q\"]//following::li"));
		
		for(WebElement we : webElemList) {
			//System.out.println(we.getText() + " ");  // To print all suggestions
			
			if(we.getText().equals("agniveer")) {
				System.out.println(we.getText() + " "); // To print specific search
				break;
			}
		}
	}

}
