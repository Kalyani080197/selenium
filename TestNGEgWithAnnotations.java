package workWithTestNG;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNGEgWithAnnotations {
	
	@Test(priority=0)
	public void primarySchool() {
		System.out.println("I am primarySchool");;
	}
	
	@Test(priority=1, dependsOnMethods = "primarySchool")
	public void highSchool() {
		System.out.println("I am highSchool");
	}
	
	@Test(priority=2,dependsOnMethods = "primarySchool")
	public void higherSecondary() {
		System.out.println("I am higherSecondary");
	}
	
	@Test(priority=4)
	@Parameters({"username", "password"})
	public void getName(String username, String password) {
		System.out.println("username and password is"+ username + " " +password);
	}
	
	@Test(priority=3)
	public void college() {
		System.out.println("I am college");
	}

}


//if method is not enabled, even you dependentOn/alwaysRun however method wont execute it will skipped