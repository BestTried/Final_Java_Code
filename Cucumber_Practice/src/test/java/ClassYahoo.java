import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassYahoo {
	
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.yahoo.com/");
		Thread.sleep(7000);
		
		//*[@id="atomic"]/body

		//WebElement e=driver.findElement(By.xpath("//*[@id=\"footer-wrapper\"]/div[1]/div/ul/li[2]/a/svg/path"));
		
		WebElement e = driver.findElement(By.xpath("*[@id=\"atomic\"]/body"));

		//*[@id="module-horoscopePage"]/div/div/div[1]/div/div[2]/div/div[2]/div[3]/div/div/a[1]
		//*[@id="module-horoscopePage"]/div/div/div[1]/div/div[2]/div/div[2]/div[3]/div/div/a[1]
		
		//driver.get("https://mvnrepository.com/");
	    //WebElement e=driver.findElement(By.xpath("//b[text()='Top Categories']"));
		
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,750)");
	
		//JavascriptExecutor js=(JavascriptExecutor)driver;
		
		//js.executeScript("window.scrollBy(0,-350)", "");
	   
		
		//jse.executeScript("arguments[0].click();", e);
		//jse.executeScript("arguments[0].scrollIntoView(0,350);", e);
		
		
		//System.out.println(jse.executeScript("arguments[0].scrollIntoView(true);", e));
		Thread.sleep(3000);
		e.click();
		
		//Thread.sleep(7000);
		
		//driver.quit();
	}

}
