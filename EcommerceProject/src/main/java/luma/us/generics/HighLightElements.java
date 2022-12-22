package luma.us.generics;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import luma.us.basepage.BasePage;

public class HighLightElements extends BasePage{

	public static void drawBorder(WebElement ele) {
		JavascriptExecutor jse =(JavascriptExecutor)driver;
		jse.executeScript("arguments [0].style.border='3px solid blue'", ele);
		
	}
	
}
 