package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathFollowingSibling {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver_win32/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("Https://zoho.com/crm/signup.html");
		driver.manage().window().maximize();
		
		//driver.findElement(By.xpath("//input[@class='sgnpaswrd']//preceding-sibling::lable"));//preceding-Sibling
		
		driver.findElement(By.xpath("//input[@class='sgnpaswrd']//following-sibling"));//following-Sibling

		

	}

}
