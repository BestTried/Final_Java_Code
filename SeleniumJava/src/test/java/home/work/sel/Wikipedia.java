package home.work.sel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Wikipedia {

	public static void main(String[] args) throws Throwable {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.navigate().to("https://www.wikipedia.org/");
		// Findout Bangla language from dropdown
		List<WebElement> list = driver.findElements(By.xpath("//select[@id='searchLanguage']/option"));

		Thread.sleep(3000);
		// driver.findElement(By.xpath("//*[@id=\"searchLanguage\"]")).click();
		// driver.findElement(By.xpath("//option[text()='বাংলা']")).click();

		for (WebElement we : list) {

			if (we.getText().contains("বাংলা")) {
				Thread.sleep(3000);
				we.click();
				break;

			}

		}

	}
}
