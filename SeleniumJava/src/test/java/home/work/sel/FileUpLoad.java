package home.work.sel;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileUpLoad {
	public static void main(String[] args) throws IOException, InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize(); // always write wait code after this
		//driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS); // for page load
		driver.get("https://www.w3schools.com/howto/howto_html_file_upload_button.asp"); // Testing webpage
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); // for Implicit wait

	
		Thread.sleep(7000);//input[@type='file']
		driver.findElement(By.xpath("//input[@type='file']")).sendKeys("C:\\Users\\islam\\TestData.xlsx");

		// FILE UPLOADING USING SENDKEYS ....

		System.out.println("File is Uploaded Successfully");

	}

}
