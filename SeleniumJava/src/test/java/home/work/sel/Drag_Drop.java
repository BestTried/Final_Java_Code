package home.work.sel;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Drag_Drop {
	
	
public static void main(String[] args) throws InterruptedException {
		
		
		
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();                       
	driver.get("https://dhtmlx.com/docs/products/dhtmlxTree/");
	driver.manage().window().maximize();
	
	Thread.sleep(5000);
	Actions act = new Actions(driver);
	
	
		//driver.get("http://www.ericbieller.com");
		WebElement src = driver.findElement(By.xpath("//span[text()='Lawrence Block']"));
		WebElement dest =driver.findElement(By.xpath("//li[text()='Zend Framework in Action']"));
		act.clickAndHold(src);
		act.pause(Duration.ofSeconds(2));
		act.moveToElement(dest);
		act.pause(Duration.ofSeconds(2));
		act.release();
		act.build();
		act.perform();
		
		
		

	}

}
