package pageObjectModle;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class VerifyLogInPage {
	
  
	 
      @Test 
	public void verifyLogin() throws Throwable{
		
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://wordpress.org/wp-login.php");
		
		LogInPage login = new LogInPage(driver);
		
		login.typeUserName();
		login.typePassword();
		Thread.sleep(5000);
		login.clickLogInButton();
		
	}
	
	

}
