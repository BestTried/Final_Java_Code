package home.work.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoSiteTest {

	public static void main(String[] args) throws Throwable {

		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver_win32/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("http://thedemosite.co.uk/");
		driver.manage().window().maximize();
		
		WebElement  f = driver.findElement(By.xpath("(//iframe)[1]"));
		driver.switchTo().frame(f);
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[text()='Free Online Business Software']")).click();
		
		
	}
}
