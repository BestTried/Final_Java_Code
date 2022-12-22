package home.work.sel;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrokenMamun {
	public static void main(String[] args) throws Throwable {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://www.google.co.in/");
		
		List <WebElement> links=driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		for(int i=0; i<links.size(); i++) {
			WebElement element =links.get(i);
			String url =element.getAttribute("href");
			URL link = new URL(url);
			
		HttpURLConnection httpConn= (HttpURLConnection)link.openConnection();
		
		Thread.sleep(2000);
		httpConn.connect();
		int recode=httpConn.getResponseCode();
		
		if(recode>=400) {
			System.out.println(url + " " + "This is valid  link" );
	     
		}else {
			System.out.println(url + " " + "This is broken link" );
	}
  }
 }

}
