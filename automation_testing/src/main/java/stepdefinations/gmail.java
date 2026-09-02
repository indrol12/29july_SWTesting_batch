package stepdefinations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class gmail {

	@Given("user should be registered with valid credentials")
	void userregister()
	{
		System.out.println("user is registered!!");
	}
	@When("enter valid email and password also click on login button")
	void valid_cred()
	{
		System.out.println("Email:Fct@gmail.com and Pasword:Fct@123");
	}
	@Then("Gmail login should be successfull")
	void islogin()
	{
		System.out.println("Gmail login successfull");
	}
}
