package selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver-win64\\chromedriver.exe");
		// should provide chromedriver not chrome
		WebDriver driver = new ChromeDriver();
		

		// opening google
		driver.get("https://www.leafground.com/select.xhtml;jsessionid=node01901qfa2o8u0b1hqzs17fpmelx448077.node0");
		
		WebElement dropdown = driver.findElement(By.xpath("//*[@id=\"j_idt87\"]/div/div[1]/div[1]/div/div/select"));
		Select select = new Select(dropdown);
		//select.selectByIndex(1);
		select.selectByValue("//*[@id=\"j_idt87\"]/div/div[1]/div[1]/div/div/select"); // not working
		//select.selectByVisibleText("Playwright");
		
		List<WebElement> webElementList = select.getOptions();
		System.out.println(webElementList.size());
		
		

		//multiselect
		
		//select.selectByIndex(1);
		
		//not working
		WebElement country = driver.findElement(By.xpath("/html/body/div[1]/div[5]/div[2]/form/div/div[1]/div[2]/div/div/div/div[2]/select"));
		Select select2 = new Select(country);
		select2.selectByVisibleText("India");
		
		
		//not working
		WebElement city = driver.findElement(By.xpath("//*[@id=\"j_idt87:city_input\"]"));
		Select select1 = new Select(city);
		select1.selectByIndex(1);
		select1.selectByIndex(2);
		select1.selectByIndex(3);


		
	}

}

