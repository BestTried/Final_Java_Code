package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Descendant {
	
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver_win32/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.zoho.com/crm/signup.html");
		driver.manage().window().maximize();
		
		//driver.findElement(By.xpath("//div[@class='testdrivetext']//descendant::input[1]")).sendKeys("hamid_002@yah.com");
		driver.findElement(By.xpath("//div[@class='za-password-container sgfrm']//descendant-or-self::input")).sendKeys("DemoPassword");
		Thread.sleep(5000);
		//driver.findElement(By.xpath("//input[@class='sgnpaswrd']//preceding-sibling::lable")).sendKeys("Hello, I got preceding");
		
		
		//driver.findElement(By.xpath("//div[@class='passWord labelIcon field-error']//following-sibling::div[1]")).sendKeys("Hello, I got preceding");

	}
}