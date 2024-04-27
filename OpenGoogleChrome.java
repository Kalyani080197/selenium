package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenGoogleChrome {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver-win64\\chromedriver.exe");
		//should provide chromedriver not chrome
	 WebDriver driver = new ChromeDriver();
	 //opening google
	 driver.get("https://www.google.co.in");
	 //identify searchbox
	WebElement element=driver.findElement(By.name("q"));
	//send key as kajukatli and enter
	element.sendKeys("kajukatli"+Keys.ENTER);
	Thread.sleep(10000);
	//System.out.print(element + "here it is");
	//link text not working because of spacing beter to prefer partial link text to redirect
	driver.findElement(By.partialLinkText("Haldiram's Nagpur Kaju Katli (500 gm)")).click();
	}

}
