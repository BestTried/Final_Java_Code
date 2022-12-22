package home.work.sel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicDropdown {
	
	public static void main(String[] args) throws Throwable {
	
	System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
	WebDriver driver = new ChromeDriver();                                  
	driver.get("https://www.makemytrip.com/");
	driver.manage().window().maximize();
	
	String optionToSelect = "Mumbai";
	int count=0;
	//driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div[1]/div[1]/div[1]/div/div/div/input")).sendKeys("BOM");
	////label[@for='fromCity']
	driver.findElement(By.xpath("//label[@for='fromCity']")).sendKeys("BOM");
	//Thread.sleep(5000);
	
	 List<WebElement> optionList = driver.findElements(By.xpath("//p[@class='font14 appendBottom5 blackText']"));
	
	 for(WebElement ele: optionList) {
		 String currentOption= ele.getText();
		 if(currentOption.contains(optionToSelect)) {
			 ele.click();
			 count ++;
			 break;
			 
			 
		 }
	 }
	 	if(count!= 0) {
	 		System.out.println(optionToSelect + " has been selected in the dropdown");
	 	}
	 	else {
	 		System.out.println("option you want to select not available in the drop down");
	 	}
			
		}
	}
