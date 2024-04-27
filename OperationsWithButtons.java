package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OperationsWithButtons {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver-win64\\chromedriver.exe");
		//should provide chromedriver not chrome
	 WebDriver driver = new ChromeDriver();
	 //opening google
	 driver.get("https://www.leafground.com/button.xhtml;jsessionid=node01gvew3aca4vpcgpzh3ziw2n09440265.node0");
	 
	 //click
	 //WebElement clickME = driver.findElement(By.id("j_idt88:j_idt90"));
	 //clickME.click();	- if you click here u cant perform following without redirecting
	 
	 //check disabled 
	 WebElement checkDisable = driver.findElement(By.id("j_idt88:j_idt92"));
	 System.out.println(checkDisable.isEnabled());	
	 
	 
	 //find position
	 WebElement findPosition = driver.findElement(By.id("j_idt88:j_idt94"));
	Point point = findPosition.getLocation();
	int xValue = point.getX();
	int yValue = point.getY();
	System.out.println(xValue  + " " + yValue  );
	
	//find colour of button
	WebElement findColour = driver.findElement(By.id("j_idt88:j_idt96"));
	System.out.println(findColour.getCssValue("background-color"));
	 
	//find height and width 
	WebElement findheightWidth = driver.findElement(By.id("j_idt88:j_idt98"));
	int height = findheightWidth.getSize().getHeight();
	int width = findheightWidth.getSize().getWidth();
	System.out.println(height + " "  + width);
	
	//mouse over and confirm colour changed, click on image and click on hidden button,  count number of buttons - to br written
	}

}
