package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultipleCheckBoxSelect {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver-win64\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://www.leafground.com/checkbox.xhtml");
		 
		 WebElement country = driver.findElement(By.id("j_idt87:multiple"));
		 country.click();
		 
		Thread.sleep(3000);
		
		/*
		 * List<WebElement> list = driver.findElements(By.xpath(
		 * "//*[@id=\"j_idt87:multiple_panel\"]//following::*")); for(WebElement we :
		 * list) { if(we.getText().equals("London") || we.getText().equals("Paris") ||
		 * we.getText().equals("Berlin")) { we.click(); break; } }
		 */
			 
		 
			
			WebElement london = driver.findElement(By.xpath("//*[contains(text(),'London')]"));
			london.click();
			 
		 

	}
	
	//ask mosquito later

}
