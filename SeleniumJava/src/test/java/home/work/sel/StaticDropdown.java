package home.work.sel;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class StaticDropdown {
	
	public static void main(String[] args) throws Throwable {
		
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();   
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		
		driver.get("https://trytestingthis.netlify.app");
		//driver.manage().window().maximize();
		WebElement dropdown = driver.findElement(By.id("option")); 
		Select selObj = new Select(dropdown);
		  
		
		  selObj.selectByIndex(1); 
		  System.out.println("Select By Index");
		  
		  Thread.sleep(2000);
		  selObj.selectByValue("option 2"); 
		  System.out.println("Select By. value");
		  
		  Thread.sleep(2000);
		  selObj.selectByVisibleText("Option 3");
		  System.out.println("Select by visible text");
		 driver.quit();
		 System.out.println("Its over");
		  
		 Thread.sleep(2000);
		  //driver.quit();
		  System.out.println("It is done");
		 
		
		

	
	}
}
