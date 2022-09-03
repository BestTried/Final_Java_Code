package home.work.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class AutomationPractice {
	
	public static void main(String[] args) throws Throwable {

		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver_win32/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("http://automationpractice.com");
		driver.manage().window().maximize();
		
		
		driver.findElement(By.xpath("//a[@class='login']")).click();
		
		driver.findElement(By.id("email")).sendKeys("hamid_002@yahoo.com");
		Thread.sleep(3000);
		
		driver.findElement(By.id("passwd")).sendKeys("Swadheen71");

		
		driver.findElement(By.id("SubmitLogin")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[@class='logout']")).click();
		
		System.out.println("successfully logout from aplication"  +   driver.getTitle());
		
		
		String signout ="My Store";
		//Assert.assertEquals(signout, "My Store");
		System.out.println(signout);

		
	}


}
