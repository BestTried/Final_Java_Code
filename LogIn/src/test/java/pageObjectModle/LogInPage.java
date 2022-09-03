package pageObjectModle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LogInPage {
	
	WebDriver driver;
	
	By username = By.id("user_login");
	By password = By.name("pwd");
	By logInButton = By.xpath("//input[@type='submit']");
	
	public LogInPage(WebDriver driver) {
		this.driver=driver;
	}
	
	

	public void typeUserName() {
		driver.findElement(username).sendKeys("admin");
		
	}
	
	public void typePassword() {
		driver.findElement(password).sendKeys("demo123");
		
	}
	
	public void clickLogInButton() {
		driver.findElement(logInButton).click();
		
	}
	
	

}
