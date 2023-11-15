package home.work.sel;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import io.github.bonigarcia.wdm.WebDriverManager;

public class WikiTeacherHealp {

	public static void main(String[] args) throws Throwable {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.wikipedia.org/");
		
		Select fruits = new Select(driver.findElement(By.id("searchLanguage")));
		fruits.selectByVisibleText("বাংলা");
		Thread.sleep(300);
/*
		List<WebElement> suggestionResults = driver.findElements(By.xpath("//*[@id='searchLanguage']/option"));
		for (WebElement result : suggestionResults) {
			System.out.println("Total number of language  : " + suggestionResults.size());
			if (result.getText().equalsIgnoreCase("বাংলা") || result.getText().contains("বাংলা")) {
				System.out.println("Selected Languag name is  : " + result.getText());
				Thread.sleep(300);
				result.click();
				break;
			}
		}
		*/
	}

}
