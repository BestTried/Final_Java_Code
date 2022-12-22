package jaket.size.color;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Jacket_Size_Color {
	
	static WebDriver driver;
	public static void main(String[] args) throws Throwable {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://magento.softwaretestingboard.com/");
		Thread.sleep(3000);
		driver.findElement(By.id("ui-id-3")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//a[text()='Jackets'])[2]")).click();
		
		//driver.findElement(By.xpath("//*[@id=\"narrow-by-list\"]/div[2]/div[1]")).click();
		driver.findElement(By.xpath("//div[text()='Size']")).click();
		
		driver.findElement(By.xpath("//div[@role='listbox']/div[text()='M']")).click();
		
		WebElement ele = driver.findElement(By.xpath("//span[text()='Add to Cart']"));
		
		Thread.sleep(5000);
		
		//driver.findElement(By.id("product-addtocart-button")).click();
		//driver.findElement(By.xpath("//span[text()='My Cart']")).click()

		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", ele);
	}
	

}
