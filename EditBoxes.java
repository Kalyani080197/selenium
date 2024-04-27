package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditBoxes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver-win64\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://www.leafground.com/input.xhtml");
		 
		 //type your name
		 WebElement name = driver.findElement(By.id("j_idt88:name"));
		 name.sendKeys("kalyani");
		 
		 //email
		WebElement email = driver.findElement(By.name("j_idt88:j_idt99"));
		email.sendKeys("kalyani080197@gmail.com");
		
		//append
		WebElement append = driver.findElement(By.name("j_idt88:j_idt91"));
		append.sendKeys("city");
		
		//clear text
		WebElement clearme = driver.findElement(By.name("j_idt88:j_idt95"));
		clearme.clear();
		
		//retrieve text value
		WebElement retrieve = driver.findElement(By.id("j_idt88:j_idt97"));
		System.out.println(retrieve.getAttribute("value"));
		
		//isEnabled
		WebElement checkEnabled = driver.findElement(By.name("j_idt88:j_idt93"));
		System.out.println(checkEnabled.isEnabled());
		
		//Enter error msg
		WebElement errorMSG = driver.findElement(By.name("j_idt106:thisform:age"));
		errorMSG.sendKeys("Invalid request");
		
		//calendar, keyboard, choose random number - have to write
	}

}
