package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AmazonLangDropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver-win64\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://www.amazon.in/?&tag=googhydrabk1-21&ref=pd_sl_7hz2t19t5c_e&adgrpid=155259815513&hvpone=&hvptwo=&hvadid=678802104188&hvpos=&hvnetw=g&hvrand=7749934414254851855&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9040209&hvtargid=kwd-10573980&hydadcr=14453_2371562&gad_source=1");
		 
		 WebElement lang = driver.findElement(By.id("icp-nav-flyout"));
		 lang.click();
		 
		 Thread.sleep(2000);
		 WebElement tamil =driver.findElement(By.xpath("//*[text() = 'ML']"));
		 tamil.click();
		 
		 
	       
		 
	
	}

}
