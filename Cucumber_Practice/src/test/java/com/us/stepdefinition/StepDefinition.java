package com.us.stepdefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class StepDefinition {
 WebDriver driver;
@Given("^User able to open any Browser$")
public void user_able_to_open_any_Browser()  {
 System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
  driver = new ChromeDriver();
    
   
}

@Given("^User able to enter the URL \"([^\"]*)\"$")
public void user_able_to_enter_the_URL(String URL)  {
	driver.get(URL);

	
    
    
}

@When("^User able to able click in the signin button$")
public void user_able_to_able_click_in_the_signin_button()  {
    
    
}

@When("^User able to enter the useName$")
public void user_able_to_enter_the_useName()  {
    
    
}

@When("^User able to enter the password$")
public void user_able_to_enter_the_password()  {
    
    
}

@Then("^User able to verify the user information$")
public void user_able_to_verify_the_user_information()  {
    
    
}
	
	

}
