package zoopla.uk.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import zoopla.uk.basepage.BasePage;
import zoopla.uk.elementspage.LoginElementsPage;
import zoopla.uk.generic.CommonUtility;
import zoopla.uk.generic.WaitHelper;

public class LoginTest extends BasePage{
	LoginElementsPage pf;

	@Given("User able to open a any browser")
	public void user_able_to_open_a_any_browser() {
	  
		initializations();
		pf = new LoginElementsPage();
		
	}

	@Given("^User able to enter \"([^\"]*)\" url$")
	public void user_able_to_enter_url(String url) {
		//logger.info("User able to enter the url  ");
		driver.get(url);
	}
	@When("User able to click on sign-in button")
	public void user_able_to_click_on_sign_in_button() {
		    pf.getClickOnSignButton().click();
		  
	}
	@When("User able to enter valid userName & password")
	public void user_able_to_enter_valid_user_name_password() {
		//pf.getEnterUserName().sendKeys(prop.getProperty("userName"));
		//pf.getEnterPwd().sendKeys(prop.getProperty("pwd"));
		pf.getUserNameAndPwd(prop.getProperty("userName"), prop.getProperty("pwd"));
		
	  
	    
	}
	@When("User able to click on login button")
	public void user_able_to_click_on_login_button() {
		pf.getSignBTN().click();
	  
	    
	}
	@Then("User can verify the user information {string} on the grid")
	public void user_can_verify_the_user_information_on_the_grid(String string) {
	  
	    
	}

}
