package home.work.sel;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrokenLinkFinalUpdate {

	public static void main(String[] args) throws IOException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://www.deadlinkcity.com/");
		//driver.get("http://www.facebook.com");
		

		List<WebElement> links = driver.findElements(By.tagName("a"));
		int brokenLinks = 0;

		for (WebElement element : links) {
			String url = element.getAttribute("href");

			if (url == null || url.isEmpty()) {
				System.out.println("URL is empty");
				continue;
			}
			URL link = new URL(url);
			try {
				HttpURLConnection httpconn = (HttpURLConnection) link.openConnection();
				httpconn.connect();
				if (httpconn.getResponseCode() >= 400) {
					System.out.println(httpconn.getResponseCode() + url + "  is " + " Broken link");
					brokenLinks++;
				} else {
					System.out.println(httpconn.getResponseCode() + url + " is" + " Valid Link");
				}

			} catch (Exception e) {

			}

		}
		
		System.out.println("Number of broken link" + " "  + brokenLinks);
		//driver.quit();

	}

}
