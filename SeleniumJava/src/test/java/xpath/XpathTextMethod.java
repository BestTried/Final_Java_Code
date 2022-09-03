package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathTextMethod {
	
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver_win32/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("Https://login.salesforce.com");
		driver.manage().window().maximize();
		
		//driver.findElement(By.xpath("//a[text()='Forgot Your Password?']")).click();
		
		driver.findElement(By.xpath("//a[starts-with(text(),'F')]")).click();
		//driver.findElement(By.xpath("//a[contains(text(),'Your')]")).click();

	}

}
