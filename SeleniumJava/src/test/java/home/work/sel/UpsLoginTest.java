package home.work.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.gargoylesoftware.htmlunit.javascript.background.JavaScriptExecutor;



public class UpsLoginTest {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver_win32/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.ups.com/us/en/Home.page");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[@class='icon ups-icon-user']")).click();
		
		Thread.sleep(5000);
		driver.findElement(By.linkText("Sign Up")).click();
		System.out.println(driver.getTitle());
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//span[@class='icon ups-icon-x']")).click();
		
		driver.findElement(By.id("email")).sendKeys("hamid_002@yahoo.com");
		driver.findElement(By.id("pwd")).sendKeys("Asfeaurthy01");
		
		driver.findElement(By.id("submitBtn")).click();
		
		//driver.findElement(By.xpath("//a[@class='ups-link ups-new-window']")).click();
		
		//Thread.sleep(5000);
		
		//driver.findElement(By.xpath("icon ups-icon-close")).click();
		
		//driver.findElement(By.id("submitBtn")).click();
		
		//driver.manage().window().maximize();
		
		

	}
}