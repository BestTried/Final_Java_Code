package com.ny.steps;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import com.ny.base.SuperClass;

import io.cucumber.java.en.*;

public class StepsDefinition extends SuperClass{
	
	@Given("User able to open any Browser")
	public void user_able_to_open_any_browser() {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		driver= new ChromeDriver();
	    
	   
	}
	@Given("User able to enter the URL")
	public void user_able_to_enter_the_url() {
	    driver.get("https://www.Zoopla.co.uk");
	    driver.manage().window().maximize();
	}
	@When("User able to  click in the signin button")
	public void user_able_to_click_in_the_signin_button() {
		
		//driver.findElement(By.linkText("Sign in")).click();
		driver.findElement(By.xpath("(//span[@class='c-PJLV c-PJLV-ieaSTiH-css'])[3]")).click();

	    
	   
	}
	@When("User able to enter the userName")
	public void user_able_to_enter_the_user_name() {
		driver.findElement(By.id("email")).sendKeys("hamid_002@yahoo.com");

	   
	}
	@When("User able to enter the password")
	public void user_able_to_enter_the_password() {
		driver.findElement(By.id("password")).sendKeys("year2022@");
	    
	
	}
	@Then("User able to verify the user information")
	public void user_able_to_verify_the_user_information() {
		
		driver.findElement(By.xpath("//button[@data-testid='signin-button']")).click();
		
		
	    
	   
	}


}
