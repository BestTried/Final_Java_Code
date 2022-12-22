package actionClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseOver {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
	// //*[@id="nav"]/li[2]/a
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();					
     driver.get("https://demoqa.com/menu");
     
     
   //Instantiate Action Class        
     Actions actions = new Actions(driver);
     
     Thread.sleep(3000);
     //Retrieve WebElement 'Music' to perform mouse hover 
 	WebElement menuOption = driver.findElement(By.xpath(".//*[@id=\"nav\"]/li[2]/a"));
 	//Mouse hover menuOption 'Music'
 	actions.moveToElement(menuOption).perform();
	/*
	 * System.out.println("Done Mouse hover on 'Music' from Menu");
	 * 
	 * //Now Select 'Rock' from sub menu which has got displayed on mouse hover of
	 * 'Music' WebElement subMenuOption =
	 * driver.findElement(By.xpath(".//div[contains(text(),'Rock')]")); //Mouse
	 * hover menuOption 'Rock' actions.moveToElement(subMenuOption).perform();
	 * System.out.println("Done Mouse hover on 'Rock' from Menu");
	 * 
	 * //Now , finally, it displays the desired menu list from which required option
	 * needs to be selected //Now Select 'Alternative' from sub menu which has got
	 * displayed on mouse hover of 'Rock' WebElement selectMenuOption =
	 * driver.findElement(By.xpath(".//div[contains(text(),'Alternative')]"));
	 * selectMenuOption.click();
	 * System.out.println("Selected 'Alternative' from Menu");
	 * 
	 * // Close the main window driver.close();
	 */
	      
	      driver.quit();
	   }

}
