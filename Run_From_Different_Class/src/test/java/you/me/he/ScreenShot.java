package you.me.he;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScreenShot {
	WebDriver driver;
	@Test
	public void testScreenShot() throws IOException {
		
		WebDriverManager.chromiumdriver().setup();
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com");
		
		File f = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	     FileUtils.copyFile(f, new File("C:\\Users\\islam\\OneDrive\\Desktop\\Screenshots\\screenshot01.png"));
	 
	      //screenshot copied from buffer is saved at the mentioned path.
	 
	     System.out.println("The Screenshot is captured.");
		
		
	}
	

}
