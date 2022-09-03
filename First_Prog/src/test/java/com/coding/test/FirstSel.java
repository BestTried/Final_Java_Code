

public class FirstSel {
	
	//C:\Users\islam\Downloads\chromedriver_win32	
	
	public static void main(String[] args) throws Throwable {
		
		
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver_win32/chromedriver.exe");
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\islam\\Downloads\\Smart Tech\\Dev\\chromedriver_win32\\chromedriver.exe");
		//System.setProperty("webdriver.gecko.driver", "C:\\Users\\islam\\Downloads\\Smart Tech\\Dev\\geckodriver.exe");
		WebDriver driver = new ChromeDriver(); // Up Casting
		//WebDriver driver = new FirefoxDriver();
		//WebDriver driver = new ChromeDriver();
		driver.get("https://www.zoopla.co.uk/");
		//driver.manage().window().maximize();
		//"C:\Users\islam\Downloads\Smart Tech\Dev\geckodriver.exe"
		
        //"C:\Users\islam\Downloads\Smart Tech\Dev\geckodriver.exe"
		Thread.sleep(9000);
		driver.quit();

	}
}