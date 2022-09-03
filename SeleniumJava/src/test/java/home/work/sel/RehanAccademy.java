package home.work.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RehanAccademy {
	
	public static void main(String[] args) {
		WebDriver driver;
		WebElement w;
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver_win32/chromedriver.exe");
		 driver= new ChromeDriver();
 		 
         // Launch the application
     	 driver.get("https://www.nopcommerce.com/en/register?returnUrl=%2Fen%2Fbranding");
     	 
     	 driver.findElement(By.xpath("//input[contains(@id,'name')]")).sendKeys("hamid_002@yahoo.com");

     	// driver.findElement(By.xpath("//input[contains(@id,'name')]")).sendKeys("hamid_002@yahoo.com");
	}
}
