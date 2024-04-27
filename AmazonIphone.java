package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonIphone {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver-win64\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://www.amazon.in/?&tag=googhydrabk1-21&ref=pd_sl_7hz2t19t5c_e&adgrpid=155259815513&hvpone=&hvptwo=&hvadid=678802104188&hvpos=&hvnetw=g&hvrand=7010455783773562666&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=1007810&hvtargid=kwd-10573980&hydadcr=14453_2371562&gad_source=1");
		 
		 WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
		 searchBox.sendKeys("Fridge" + Keys.ENTER);
		 Thread.sleep(3000);
		 
		 List<WebElement> webElemList = driver.findElements(By.cssSelector(".s-result-item .a-text-normal")); // css selector
		 for (WebElement ele : webElemList) {
			 System.out.println(ele.getText());
		 }
}
	
	//

}
