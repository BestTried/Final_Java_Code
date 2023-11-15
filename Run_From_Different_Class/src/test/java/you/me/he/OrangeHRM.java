package you.me.he;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OrangeHRM {
	WebDriver driver;
	
	@Test
	public void LaunchApp() {
		WebDriverManager.chromiumdriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://opensource-demo.orangehrmlive.com/");
	}

	
	
	@Test
	public void enterLoginDetails() {
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}
	@Test
	public void navigateToMyInfo() {
	driver.findElement(By.xpath("//span[text()='My Info']")).click();
	}
	
	@Test
	public void verifyMyInfo() {
		System.out.println(driver.findElement(By.xpath("//span[text()='My Info']")).isDisplayed());
	}
	
	@Test
	public void verifyLogin() {
		WebElement element = driver.findElement(By.xpath("//span[text()='Dashboard']"));
		System.out.println(element.isDisplayed());
		System.out.println(element.getText());
	}
}

