package home.work.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HotWireTest {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver_win32/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.hotwire.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("(//button[@type='button'])[2]")).click();
		
		driver.findElement(By.id("email")).sendKeys("smartTech@yahoo.com");
		driver.findElement(By.id("password")).sendKeys("Password2022");
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//button[@type='submit'])[1]")).click();
		//driver.findElement(By.linkText("Sign in")).click();
	}

}
