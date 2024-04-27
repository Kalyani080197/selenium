package workWithTestNG;

import java.awt.Checkbox;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CallPom {

		// TODO Auto-generated method stub
		
		@FindBy(id="Form_getForm_FullName")
		public static WebElement username;
		
		@FindBy(name="Email")
		public static WebElement email;
		
		@FindBy(name="CompanyName")
		public static WebElement company;
		
		@FindBy(name="Contact")
		public static WebElement phno;
		
		@FindBy(name="Country")
		public static WebElement country;
		
		@FindBy(xpath ="//*[@id='recaptcha-anchor-label']")
		public static WebElement robot;
		
		@FindBy(id="Form_getForm_action_submitForm")
		public static WebElement submit;
		

	

}
