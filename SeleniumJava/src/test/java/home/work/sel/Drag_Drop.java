package home.work.sel;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_Drop {
	
	
public static void main(String[] args) {
		
		
		
	System.setProperty("webdriver.gecko.driver","./Drivers/geckodriver.exe");
	WebDriver driver = new FirefoxDriver();                                  
	driver.get("http://www.ericbieller.com");
	driver.manage().window().maximize();
	
	Actions a = new Actions(driver);
	driver.manage().timeouts().implicitlyWait(3,TimeUnit.MINUTES);
	
		//driver.get("http://www.ericbieller.com");
		WebElement img=driver.findElement(By.xpath(".//*[@id='post-103923208092']/div/div[3]/p[3]/img"));
		WebElement e=driver.findElement(By.xpath(".//*[@id='mce-EMAIL']"));
		a.dragAndDrop(img, e).perform();
		
		

	}

}
