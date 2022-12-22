package home.work.sel;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ZooplaLoginTest {
	
	public static void main(String[] args) throws Throwable {
		//System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver_win32/chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.zoopla.co.uk/");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Sign in")).click();
		
		//driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.id("email")).sendKeys("hamid_002@yahoo.com");
		
		driver.findElement(By.id("password")).sendKeys("year2022@");
		Thread.sleep(5000);
		//driver.findElement(By.linkText("Sign in")).click();
		
		//driver.findElement(By.id("yes")).click();
		
		//Thread.sleep(5000);
		//driver.findElement(By.xpath("//button[@class='c-juxpAL c-juxpAL-ervJfA-fw-true c-juxpAL-fKTdVa-category-primary']")).click();
		//driver.findElement(By.linkText("Register")).click();
		System.out.println("My expected Result is   "  + driver.getTitle());
		
		//String actual = "Sign in to Zoopla - Zoopla";
		
		//Assert.assertEquals(actual, driver.getTitle());
		
		//driver.findElement(By.xpath("//button[@class='c-juxpAL c-juxpAL-ervJfA-fw-true c-juxpAL-fKTdVa-category-primary']")).click();
		
		//driver.findElement(By.linkText("Sign out")).click();
		Thread.sleep(5000);
		//driver.findElement(By.xpath("(//span[@class='c-dCnEbb'])[2]")).click();
		
		
		  System.out.println("Successfully logout from the Application " + driver.getTitle()); 
		 // String logout = "Search Property to Buy, Rent, House Prices, Estate Agents";
		 
		
		//Assert.assertEquals(logout, driver.getTitle());
		
		//System.out.println("Successfully logout from the Application " + driver.getTitle());

		

		//Sign out
		
	}

}
