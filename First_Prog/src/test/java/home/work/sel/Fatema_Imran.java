package home.work.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fatema_Imran {
	WebDriver driver;
	public static void main(String[] args) throws Throwable {
		
	
	
	//https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F
	System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver_win32/chromedriver.exe");

	WebDriver driver = new ChromeDriver();
	driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
	driver.manage().window().maximize();
	
	driver.findElement(By.id("RememberMe")).click();
	Thread.sleep(3000);
	
	driver.findElement(By.xpath("//button[@type='submit']")).click();

}
}
