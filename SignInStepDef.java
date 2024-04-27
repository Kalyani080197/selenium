package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class SignInStepDef {
	
	WebDriver driver;
	
	@Given("User navigates to signin page")
	public void user_navigates_to_signin_page() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver-win64\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://guneet.pythonanywhere.com/");
	   
	}
	
	@When("User enters mailId {string}")
	public void user_enters_mail_id(String uname) {
		WebElement username = driver.findElement(By.id("username"));
		 username.sendKeys(uname);
	}

	
   @When("User enters password")
	public void user_enters_password() {
		 WebElement password =   driver.findElement(By.id("password"));
		 password.sendKeys("12345"+ Keys.ENTER);

	}

	@Then("User should be able to signed in")
	public void user_should_be_able_to_signed_in() {
		 WebElement submit =   driver.findElement(By.xpath("//*[@type=\"submit\"]"));
		 submit.click();

	}
	
	@Then("User login")
	public void user_should_be_able_to_signed_in1() {
		 WebElement login =   driver.findElement(By.xpath("//a[@href=\"/register\"]"));
		 login.click();

	}

}
