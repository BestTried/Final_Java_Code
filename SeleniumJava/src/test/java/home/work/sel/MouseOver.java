package home.work.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.java.lu.a;
import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseOver {

	public static void main(String[] args) throws InterruptedException {

		//How to find the Broken Link or URL?
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.barnesandnoble.com");
		WebElement ele = driver.findElement(By.id("rhfCategoryFlyout_eBooks"));
		Actions act =new Actions(driver);
		act.moveToElement(ele).build().perform();
		
		WebElement el=driver.findElement(By.xpath("(//a[@href='https://www.barnesandnoble.com/b/ebooks-nook/_/N-1fZ8qa'])[1]"));
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", el);
		
		Thread.sleep(5000);
		driver.quit();


	
				 
	}

}
