package home.work.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRMTest {

	public static void main(String[] args) throws Throwable {

		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver_win32/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		Thread.sleep(5000);
		//driver.findElement(By.id("passwd")).sendKeys("admin123");
		driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("admin123");
		Thread.sleep(5000);
		
		driver.findElement(By.id("btnLogin")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("welcome")).click();
		//driver.findElement(By.id("welcome")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.partialLinkText("Logout")).click();
		System.out.println("Page Title is :  " +  driver.getTitle());
	}

}
