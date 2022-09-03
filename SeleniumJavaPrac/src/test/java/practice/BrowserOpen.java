package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserOpen {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".C:\\Users\\islam\\Downloads\\Driver\\chromedriver.exe");
		//C:\Users\islam\Downloads\Driver
		WebDriver driver = new ChromeDriver(); // Up Casting
		driver.get("https://www.zoopla.co.uk/");
		driver.manage().window().maximize();

		//driver.quit();

	}

}
