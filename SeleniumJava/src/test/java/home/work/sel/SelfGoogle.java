package home.work.sel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelfGoogle {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		//System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();		
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		WebElement ele =driver.findElement(By.xpath("//input[@type='text']"));
		ele.click();
		ele.sendKeys("selenium");
		Thread.sleep(3000);
		
		//List <WebElement> element= driver.findElements(By.xpath("//ul[@role='listbox']/li//span/b"));
		List <WebElement> element= driver.findElements(By.xpath("//div[@class='wM6W7d WggQGd']//b"));
		//System.out.println("selenium.....");
		for(int i=0; i<element.size(); i++) { 
			if(element.get(i).getText().equalsIgnoreCase("vegan")) { 
		//after even number there are many bold characters so need to select which one we have to click on
		//so in this case we select s after even number
				//System.out.println("text......");
				Thread.sleep(5000);
				System.out.println("Holds on, I am clicking***********************");
				element.get(i).click();
				Thread.sleep(5000);
				break;
			}
		}
		//driver.quit();		

	}

}
