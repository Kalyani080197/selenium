package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropdownSuggestionClick {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver-win64\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://www.leafground.com/select.xhtml;jsessionid=node0ereormupm36g16mydn6zalzq5515514.node0");
		 
		 
		//*[@id="j_idt87:lang_label"]//following::li
		 
		 WebElement dropdown = driver.findElement(By.id("j_idt87:lang_label"));
		 dropdown.click();
		 
		 Thread.sleep(3000);
		 
		 List<WebElement> webElemList = driver.findElements(By.xpath("//*[@id=\"j_idt87:lang_label\"]//following::li"));
		 
		 for (WebElement ele : webElemList) {
			if(ele.getText().equals("Tamil")) {
				ele.click();
				System.out.println(ele.getText());
				break;
			}
		 }
		 
		 
		 

	}

}
