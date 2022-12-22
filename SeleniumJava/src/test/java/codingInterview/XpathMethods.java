package codingInterview;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class XpathMethods {
	
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver;
		
		//String project=System.getProperty("user.dir");
		WebDriverManager.chromedriver().setup();
		//System.out.println("project level path: "+ project);
		
		//System.setProperty("webdriver.chrome.driver", project+"/chromedriver.exe");
	    driver = new ChromeDriver(); 
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    driver.manage().window().maximize();
	    driver.get("https://pixabay.com/");
	    Thread.sleep(2000);
	    
	    WebElement videoIcon=driver.findElement
	    		(By.xpath("//div/a[@href='/videos/']/span[text()='Videos']//preceding-sibling::span"));
	    
	    WebElement vectors=driver.findElement
	    		(By.xpath("//div/a[@href='/videos/']//preceding-sibling::a[@href='/vectors/']"));
	    
	    WebElement music=driver.findElement
	    		(By.xpath("(//div/a[@href='/videos/']//following-sibling::a)[1]"));
	    
	    //videoIcon.click();
	    
	    Thread.sleep(2000);
	    
	    JavascriptExecutor js=(JavascriptExecutor)driver;
	    
	    js.executeScript("arguments[0].click()", music);
	    
	    Thread.sleep(2000);
	   
	    driver.close();

	}

}
