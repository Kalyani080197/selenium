package selenium;

import java.awt.Desktop.Action;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AlertEg {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver-win64\\chromedriver.exe");
		//should provide chromedriver not chrome
	 WebDriver driver = new ChromeDriver();
	 //opening google
	 driver.get("https://www.leafground.com/alert.xhtml");
	 
	 //1. simple alert
	 WebElement simpleDialog = driver.findElement(By.id("j_idt88:j_idt91"));
	 simpleDialog.click();
	 Alert alert = driver.switchTo().alert();
	 alert.accept();
	 
	 //2. confirmation alert
	 WebElement confirmDialog = driver.findElement(By.id("j_idt88:j_idt93"));
	 confirmDialog.click();
	 Alert alert1 = driver.switchTo().alert();
	 alert1.accept();
	 confirmDialog.click();
	 Alert alert2= driver.switchTo().alert();
	 alert2.dismiss();
	 
	//3. sweet alert
		 WebElement sweetDialog = driver.findElement(By.id("j_idt88:j_idt95"));
		 sweetDialog.click();
		 WebElement sweetDialog1 = driver.findElement(By.name("j_idt88:j_idt98"));
		System.out.println(sweetDialog1.getText());
		sweetDialog1.click();
		
		//https://stackoverflow.com/questions/74877995/selenium-handling-modal-dialog-box
		
		Thread.sleep(1000);
		//4. modal dialogbox to close - not working
		WebElement modelDialog = driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt100\"]/span[2]"));
		modelDialog.click();
		//driver.switchTo().alert();
Actions actions = new Actions(driver);
		WebElement close = driver.findElement(By.xpath("/html/body/div[1]/div[5]/div[2]/form/div/div[1]/div[4]/div/div[1]/a"));
		actions.moveToElement(close).click();

		//close.click();
		
		//WebElement modelScreen =  driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[5]/div[2]/form[1]/div[1]/div[1]/div[4]/div[1]/div[1]/a[1]/span[1]"));

		WebElement modelScreen = driver.findElement(By.xpath("/html/body/div[1]/div[5]/div[2]/form/div/div[1]/div[4]/div/div[1]/a"));
		//modelScreen.click();
		
		//5. send keys and alert
				WebElement sweetDialogConf = driver.findElement(By.id("j_idt88:j_idt104"));
				//sweetDialogConf.click();
				//Alert alert4 = driver.switchTo().alert();
				//Thread.sleep(10000);
				//alert3.sendKeys("kalyani"); 
				//Thread.sleep(10000);
				//alert3.accept();
				
				
		//modal dialog close, sweet alert confirmation, minimize and maximise
				
	 
	 }

}
