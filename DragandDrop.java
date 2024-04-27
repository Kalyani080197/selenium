package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver-win64\\chromedriver.exe");
		// should provide chromedriver not chrome
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/drag.xhtml;jsessionid=node0f395ivr6gwh9qxa8zqveqi3u610579.node0");

		WebElement source = driver.findElement(By.xpath("//*[@id=\"form:drag_content\"]/p"));
		WebElement target = driver.findElement(By.xpath("//*[@id=\"form:drop_content\"]/p"));

		Actions actions =  new Actions(driver);
		actions.dragAndDrop(source, target);

	}
	
	//not working see later

}
