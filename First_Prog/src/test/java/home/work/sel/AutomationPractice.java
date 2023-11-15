package home.work.sel;



public class AutomationPractice {
	
	public static void main(String[] args) throws Throwable {

		System.setProperty("webdriver.geckodriver.driver", "/Drivers/geckodriver.exe");

		WebDriver driver = new FirefoxDriver();
		driver.get("http://automationpractice.com");
		driver.manage().window().maximize();
		
		
		driver.findElement(By.xpath("//a[@class='login']")).click();
		
		driver.findElement(By.id("email")).sendKeys("hamid_002@yahoo.com");
		Thread.sleep(3000);
		
		driver.findElement(By.id("passwd")).sendKeys("Swadheen71");

		
		driver.findElement(By.id("SubmitLogin")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[@class='logout']")).click();
		
		System.out.println("successfully logout from aplication"  +   driver.getTitle());
		
		
		String signout ="My Store";
		//Assert.assertEquals(signout, "My Store");
		System.out.println(signout);

		
	}


}
