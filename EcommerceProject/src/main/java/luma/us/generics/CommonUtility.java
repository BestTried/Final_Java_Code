package luma.us.generics;

import java.util.List;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import luma.us.basepage.BasePage;

public class CommonUtility extends BasePage {
	
	public static void getActionClick(WebElement ele) {
		Actions click = new Actions(driver);
		click.click(ele).build().perform();
		
	}
	
	public static void getJSClick (WebElement ele) {
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", ele);
	}
	
	public static void getAssert(String expected,String actual) {
		Assert.assertEquals(expected, actual);
		System.out.println("Verifyed text "+ actual);
		
	}
	
	public static void mouseHover(WebElement ele) {
		Actions act = new Actions(driver); 
		act.moveToElement(ele).build().perform();
	}
	
	public static void getSelectValue(WebElement ele, String str) {
		Select sel  = new Select(ele);
		sel.selectByVisibleText(str);
		
	
	}
	
	public static void getSelectDropDownList(List<WebElement> ele, String text) {
		List<WebElement> option = ele;
		for(WebElement newValue:option ) {
			if(newValue.getText().contains(text)) {
				//getActionClick(newValue);
				newValue.click();
			}
		}
		
	}
	
	public static void clickUntillElementClickAble(String xpath) {
	WebElement ele =	driver.findElement(By.xpath(xpath));
	
		for (int i = 0;i<=299; i++) {
			ele.click();
			break;
		}
	}
	public static void getRadioButton(WebElement ele) {
		boolean sel=ele.isSelected();
		
		if(!sel) {
			ele.click();
		}
	}
	
	public static String getNewAlphabeticValue() {
		String data = RandomStringUtils.randomAlphabetic(5);
		System.out.println(data);
		//log.info(data);
		return data;
		}
	
public static String getNewnNumericValue() {
		String data = RandomStringUtils.randomNumeric(10);
		System.out.println(data);
		//log.info(data);
		return data;
		}
	
	
	public static void main(String[] args) {
		getNewAlphabeticValue();
		getNewnNumericValue();
	
}
	
	
	public static void pageDown() {
		
	Actions act = new Actions(driver);
	act.sendKeys(Keys.PAGE_DOWN).build().perform();
		
	}
	

}
