package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver-win64\\chromedriver.exe");
		// should provide chromedriver not chrome
		WebDriver driver = new ChromeDriver();
		// opening google
		driver.get("https://www.leafground.com/radio.xhtml");

		//

		// check disabled - actual return false but it returns true
		WebElement checkEnable = driver
				.findElement(By.xpath("//*[@id=\"j_idt87:console1\"]/tbody/tr/td[1]/div/div[2]/span"));
		if (!(checkEnable.isSelected())) {
			checkEnable.click();
		}
		
		
		// checkEnable

		// bengaluru
		/*
		 * WebElement checkEnable1 = driver.findElement(By.xpath(
		 * "//*[@id=\"j_idt87:city2\"]/div/div[2]/div/div[1]"));
		 * 
		 * if(!(checkEnable1.isSelected())) { checkEnable1.click(); }
		 */

		// *[@id="j_idt87:city2"]/div/div[2]/div/div[2]/span

		// System.out.println(checkEnable1.isSelected() + "bengalur");

		// working now , note: always select xpath from input id

		
		  WebElement checkActive = driver.findElement(By.xpath("//*[@id=\"j_idt87:console2:2\"]"));
		  
		 System.out.println(checkActive.isSelected() + "safari");
		 

	}

}
