package home.work.sel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DynamicDropdown {

	public static void main(String[] args) throws Throwable {

		WebDriverManager.chromedriver().setup();
		// System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/newtours/register.php");
		driver.manage().window().maximize();

		Thread.sleep(3000);
		// scroll down the page

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");

		// Click on Country Dropdown

		driver.findElement(By.name("country")).click();

		List<WebElement> allOptions = driver.findElements(By.xpath("//select[@name='country']//option"));
		System.out.println(allOptions.size());

		for (int i = 0; i <= allOptions.size() - 1; i++) {

			if (allOptions.get(i).getText().contains("BANGLADESH")) {
				allOptions.get(i).click();
				break;

			}
		}

	}
}
