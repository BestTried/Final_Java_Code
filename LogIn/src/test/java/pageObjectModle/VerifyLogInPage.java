package pageObjectModle;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class VerifyLogInPage {
	
  
	 
      @Test 
	public void verifyLogin() throws Throwable{
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\islam\\Downloads\\Smart Tech\\Dev\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();

		driver.manage().window().maximize();
		driver.get("https://wordpress.org/wp-login.php");
		
		LogInPage login = new LogInPage(driver);
		
		login.typeUserName();
		login.typePassword();
		Thread.sleep(5000);
		login.clickLogInButton();
		
	}
	
	

}
