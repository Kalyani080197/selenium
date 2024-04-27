package tests;

import io.cucumber.java.en.*;

public class Login {
	
	@Given("user navigates to login page")
	public void user_navigates_to_login_page() {
	   System.out.println("given"); 
	}

	@When("user enters email address {string}")
	public void user_enters_email_address(String string) {
		   System.out.println("when1"); 

	}

	@When("enters valid password {string}")
	public void enters_valid_password(String string) {
		   System.out.println("when2"); 

	}

	@When("clicks on login button")
	public void clicks_on_login_button() {
		   System.out.println("when3"); 

	}

	@Then("user should successfully login")
	public void user_should_successfully_login() {
		   System.out.println("then1"); 

	}

	@Then("user should get proper warning message")
	public void user_should_get_proper_warning_message() {
		   System.out.println("then2"); 

	}

}
