package luma.us.pagefactory;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import luma.us.basepage.BasePage;
import luma.us.generics.CommonUtility;
import luma.us.generics.HighLightElements;
import luma.us.generics.WaitHelper;

public class PagefactoryLoginPurchase extends BasePage {
	// How to initialize PageFactory concept?

	public PagefactoryLoginPurchase() {

		PageFactory.initElements(driver, this);

	}
	
	@FindBy(xpath = "(//li[@class='authorization-link'])[1]")
	@ CacheLookup
	private WebElement clickSignInBTN;
	public WebElement getClickSignInBTN() {
		return clickSignInBTN;
		
	}
	@FindBy(xpath = "(//input[@type='email'])[1]")
	@ CacheLookup
	private WebElement enterUserName;
	public WebElement getEnterUserName() {
		return enterUserName;
	}
						////input[@name='login[password]']	
		                
		@FindBy(xpath = "(//input[@name='login[password]']")
		@ CacheLookup
		private WebElement enterPassword;
		public WebElement getEnterPassword() {
			return enterPassword;
		}
			
			@FindBy(xpath = "(//button[@type='submit'])[2]")
			@ CacheLookup
			private WebElement clickLogin;
			public WebElement getClickLogin() {
				return clickLogin;
			}
			
			
			@FindBy(xpath = "//*[text()='Welcome, Smart Tech!']")
			@ CacheLookup
			private WebElement landingPageText;
			public WebElement getVerifiedlandingPageText() {
				return landingPageText;
			}
				//============***************************=========================
	
			@FindBy(xpath = "(//span[text()='Men'])[1]")
			@ CacheLookup
			private WebElement menModule;
			public WebElement getMenModule() {
				return menModule;
			}
			
			
			@FindBy(xpath = "(//span[text()='Tops'])[2]")
			@ CacheLookup
			private WebElement selectTops;
			public WebElement getSelectTops() {
				return selectTops ;
			}
				
				
				@FindBy(xpath = "(//span[text()='Jackets'])[2]")
				@ CacheLookup
				private WebElement selectJacket;
				public WebElement getSelectJacket() {
					return selectJacket;
					
			}
			
				
				@FindBy(linkText = "Jupiter All-Weather Trainer")
						
				@ CacheLookup
				private WebElement selectJupiterJacket;
				public WebElement getSelectJupiterJacket() {
					return selectJupiterJacket;
				}
				
				@FindBy(xpath = "(//div[@class='swatch-option text'])[12]")
				@ CacheLookup
				private WebElement selectSize;
				public WebElement getSelectsize() {
					return selectSize;
				}
				
				@FindBy(xpath = "(//div[@class='swatch-option color'])[7]")
				
				@ CacheLookup
				private WebElement selectColor;
				public WebElement getSelectColor() {
					return selectColor;
				}
				//
				
				//@FindBy(xpath = "(//div[@class='swatch-option color'])[7]")
				
				//@ CacheLookup
				//private WebElement selectQuantity;
				////public WebElement getSelectQuantity() {
					//return selectQuantity;
				//}
				
				@FindBy(xpath = "(//span[text()='Add to Cart'])[3]")
				
				@ CacheLookup
				private WebElement addToCart;
				public WebElement getAddToCart() {
					return addToCart;
				}
				
				@FindBy(linkText="shopping cart")
				@ CacheLookup
				private WebElement clickOnShoppingCart;
				public WebElement getclickOnShoppingCart() {
					return clickOnShoppingCart ;
				}
				
				@FindBy(xpath="(//button[@title='Proceed to Checkout'])[2]")
				
				@ CacheLookup
				private WebElement proceedToCart;
				public WebElement getClickProceedToCart() {
					return proceedToCart ;
				}
				//--->
				@FindBy(xpath="//*[text()='New Address']")
				
				//@FindBy(xpath = "//div[@class='new-address-popup']")
				@ CacheLookup
				private WebElement addNewAddress;
				
				public WebElement getClickNewAddress() {
					return addNewAddress ;
				}
				
				//===>Adding Shipping Details from here
				
				@FindBy(xpath = "(//input[@class='input-text'])[6]")
				@ CacheLookup
				private WebElement addFirstName;
				public WebElement getAddFirstName() {
					return addFirstName ;
				}
				//-->
				@FindBy(xpath = "(//input[@class='input-text'])[7]")
				@ CacheLookup
				private WebElement addLastName;
				public WebElement getAddLastName() {
					return addLastName ;
				}
				//-->
				@FindBy(xpath = "//input[@name='company']")
				@ CacheLookup
				private WebElement addCompanyName;
				public WebElement getCompanyName() {
					return addCompanyName ;
				}
				//-->
				@FindBy(xpath = "//input[@name='street[0]']")
				@ CacheLookup
				private WebElement addStreetName;
				public WebElement getAddStreetName() {
					return addStreetName ;
				}
				//-->
				@FindBy(xpath = "//input[@name='city']")
				@ CacheLookup
				private WebElement addCityName;
				public WebElement getAddCityName() {
					return addCityName ;
				}
				//-->
				
				@FindBy(xpath = "(//select[@class='select'])[1]")
				@ CacheLookup
				private WebElement SelectStateName;
				public WebElement getSelectStateName() {
					return SelectStateName ;
				}
				
				@FindBy(xpath = "(//select[@class='select'])[1]/option")
				@ CacheLookup
				private List <WebElement> SelectDropDown;
				public List<WebElement> getSelectDropDown() {
					return SelectDropDown ;
				}
				
				//-->
				
				@FindBy(xpath = "(//input[@class='input-text'])[14]")
				@ CacheLookup
				private WebElement addZipCode;
				public WebElement getAddZipCode() {
					return addZipCode ;
				}
				//-->
				
				@FindBy(xpath = "(//select[@class='select'])[2]")
				@ CacheLookup
				private WebElement SelectCountryName;
				public WebElement getSelectCountryName() {
					return SelectCountryName ;
				}
				//--->
				@FindBy(xpath = "(//input[@class='input-text'])[15]")
				@ CacheLookup
				private WebElement addPhoneNumber;
				public WebElement getAddPhoneNUmber() {
					return addPhoneNumber ;
				}
				
				@FindBy(xpath="//*[text()='Ship here']")
				//@FindBy(xpath = "(//button[@type='button'])[13]")
				@ CacheLookup
				private WebElement clickShipHere;
				public WebElement getClickShipHere() {
					return clickShipHere ;
					
					
				}
				
				@FindBy(xpath="//*[@name='ko_unique_3']")
				@ CacheLookup
				private WebElement clickRadio;
				public WebElement getclickRadio() {
					return clickRadio ;	
					
				}
				
				@FindBy(xpath="//button[@class='button action continue primary']")
				@ CacheLookup
				private WebElement clickOnNext;
				public WebElement getClickOnNext() {
					return clickOnNext ;	
					
				}
				
				
				@FindBy(xpath="//button[@class='action primary checkout']")
				@ CacheLookup
				private WebElement clickOnPlaceOrder;
				public WebElement getClickOnPlaceOrder() {
					return clickOnPlaceOrder ;	
					
				}
				//========*==================
				
				@FindBy(xpath="//span[text()='Thank you for your purchase!']")
				@ CacheLookup
				private WebElement verifyText;
				public WebElement getVerifyText() {
					return verifyText ;	
					
				}
				
				//@FindBy(xpath="//a[@class='order-number']")
				//@ CacheLookup
				//private WebElement verifyOrderNumber;
				//public WebElement getVerifyOrderNumber() {
					//return verifyOrderNumber ;	
					
				//}
				
				
				
				
				public void addNewShippingsDetails() {
					log.info("User able to add First Name");
					getAddFirstName().clear();
					WaitHelper.seleniumWait(getAddFirstName(), 30);
					getAddFirstName().sendKeys(CommonUtility.getNewAlphabeticValue()+"@gmail.com");
					
					log.info("User able to add Last Name");
					getAddLastName().clear();
					WaitHelper.seleniumWait(getAddLastName(), 30);
					getAddLastName().sendKeys(CommonUtility.getNewAlphabeticValue());
					
					log.info("User able to add Company Name");
					getCompanyName().clear();
					WaitHelper.seleniumWait(getCompanyName(), 30);
					getCompanyName().sendKeys(CommonUtility.getNewAlphabeticValue());
					
					log.info("User able to add street name");
					getAddStreetName().clear();
					WaitHelper.seleniumWait(getAddStreetName(), 30);
					getAddStreetName().sendKeys("2837" + CommonUtility.getNewAlphabeticValue());
					
					log.info("User able to add city name");
					getAddCityName().clear();
					WaitHelper.seleniumWait(getAddCityName(), 30);
					getAddCityName().sendKeys("Bronx, NY");
					
					//=====>
					log.info("User able to Select State name");
					WaitHelper.seleniumWait(getSelectStateName(), 30);
					CommonUtility.getSelectDropDownList(getSelectDropDown(),"New York");

					//getSelectStateName().sendKeys("");
					log.info("User able to add Zip Code");
					getAddZipCode().clear();
					WaitHelper.seleniumWait(getAddZipCode(), 30);
					getAddZipCode().sendKeys("10461");
					
					log.info("User able to Select Country Name");
					WaitHelper.seleniumWait(getSelectCountryName(), 30);
					CommonUtility.getSelectValue(getSelectCountryName(), "United States");
					//getSelectCountryName().sendKeys("");
					
					log.info("User able to add Phone Number");
					getAddPhoneNUmber().clear();
					WaitHelper.seleniumWait(getAddPhoneNUmber(), 30);
					getAddPhoneNUmber().sendKeys(CommonUtility.getNewnNumericValue());
					
					log.info("User able to click ship here");
					WaitHelper.seleniumWait(getClickShipHere(), 30);
					CommonUtility.getJSClick(clickShipHere);
					
					//getClickRadio()
					log.info("User able to select Shipping Method");
					WaitHelper.seleniumWait(getclickRadio(), 30);
					//CommonUtility.pageDown();
					CommonUtility.getJSClick(getclickRadio());
					
					log.info("User able to click next");
					WaitHelper.seleniumWait(getClickOnNext(), 30);
					CommonUtility.getJSClick(getClickOnNext());
					
					
					log.info("User able to click place order");
					WaitHelper.seleniumWait(getClickOnPlaceOrder(), 30);
					CommonUtility.getJSClick(getClickOnPlaceOrder());
					
					
					
					

					//***************************========== untill plACE order/
					
				}
			public void getLogin() {
				log.info("User able to click on signin button");
				HighLightElements.drawBorder(getClickSignInBTN());
				WaitHelper.seleniumWait(getClickSignInBTN(), 30);
				CommonUtility.getActionClick(getClickSignInBTN());
				
				log.info("User able to enter UserName");
				HighLightElements.drawBorder(getEnterUserName());
				WaitHelper.seleniumWait(getEnterUserName(), 30);
				getEnterUserName().sendKeys(prop.getProperty("userName"));
				
				log.info("User able to enter Password");
				HighLightElements.drawBorder(getEnterPassword());
				WaitHelper.seleniumWait(getEnterPassword(), 30);
				getEnterPassword().sendKeys(prop.getProperty("password"));
				
				log.info("User able to click on the login button");
				HighLightElements.drawBorder(getClickLogin());
				WaitHelper.seleniumWait(getClickLogin(), 30);
				CommonUtility.getActionClick(getClickLogin());
			
				
				
			}
}
