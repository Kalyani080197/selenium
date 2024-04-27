package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxes {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver-win64\\chromedriver.exe");
		// should provide chromedriver not chrome
		WebDriver driver = new ChromeDriver();
		
		   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// opening google
		driver.get("https://www.leafground.com/checkbox.xhtml;jsessionid=node01901qfa2o8u0b1hqzs17fpmelx448077.node0");
		
		
		WebElement basic = driver.findElement(By.id("j_idt87:j_idt89"));
	   WebElement basic1 = driver.findElement(By.xpath("//span[@class=\"ui-chkbox-label\"]"));
	   basic1.click();
		boolean flag = false;
		if (!(basic.isSelected())) {
			flag = true;
			//basic.click();
		}

		System.out.println(flag + "basic");

		//Thread.sleep(10000);

		
		
		/*
		 * WebElement ajax =
		 * driver.findElement(By.xpath("//*[@id=\"j_idt87:j_idt91_input\"]"));
		 * if(!(ajax.isSelected())){
		 * 
		 * ajax.click(); System.out.println("ajax"); }
		 */
		 
		  //first element working not second element dont know why have to debug for both radiobutton , check box
		//and have to learn multiselect
		
		WebElement disable = driver.findElement(By.xpath("//*[@id=\"j_idt87:j_idt102_input\"]"));
		System.out.println(disable.isEnabled() + "disabled");

		
		WebElement java = driver.findElement(By.xpath("//*[@id=\"j_idt87:basic:0\"]"));
		System.out.println(java.isSelected() + "disabled");
		
		
		WebElement python = driver.findElement(By.xpath("//*[@id=\"j_idt87:basic:1\"]"));
		
		WebElement js = driver.findElement(By.xpath("//*[@for=\"j_idt87:basic:0\"]"));
		
		if(!(js.isSelected())) {
			js.click();
			//python.click();
			//js.click();
		}
		
		
	}

}


// dont inspect dappa, inspect the actual content and just click --> checkbox,radiobutton
