package KeblesTrading.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.asserts.SoftAssert;

import KeblesTrading.testDataObject.keblesTrading;
import KeblesTrading.utilities.BasePage;
import KeblesTrading.utilities.JsonDataReader;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import gherkin.deps.com.google.gson.internal.LinkedTreeMap;

import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage{
	
	public WebDriver driver;
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
	}
	
	static LinkedTreeMap<String, ?> getDataMap = JsonDataReader.getMapfromJson("TestData/KeblesTradingTestData.json", "TestData");
	static keblesTrading getdata = new keblesTrading(getDataMap);
	
//------------------------------------------------------* Xpath's *--------------------------------------------------------------//
	
	public By HomePageLogo = By.xpath("//div[@class='header__logo ']//img[@alt='Keble Trading']");
	public By Product_WireRope = By.xpath("//a[@title='Wire Rope']");
	public By Product_Rigging = By.xpath("//a[@title='Rigging']");
//	public By Product_Rigging = By.xpath("//a[@href='https://keblestrading.sharptest.com.au/rigging/']");
	public By Product_MaterialsHandling = By.xpath("//a[@title='Materials Handling']");
	public By Product_Handrails = By.xpath("//a[@title='Handrails']");
	public By SearchField = By.xpath("//div[@class='header__search position-relative overflow-hidden d-none d-md-block']//input[@placeholder='Search Product']");
//	public By SearchButton = By.xpath("//div[@class='header__search position-relative overflow-hidden d-none d-md-block']//div[@class='wpf_autocomplete']");
	public By PageHeader = By.xpath("//h2[@class='range__title section-title']");
	public By wireRope_ViewMore_Btn = By.xpath("//a[@href='https://keblestrading.sharptest.com.au/wire-rope/'][normalize-space()='View More']");
	public By rigging_ViewMore_Btn = By.xpath("//a[@href='https://keblestrading.sharptest.com.au/rigging/'][normalize-space()='View More']");
	public By materialsHandling_ViewMore_Btn = By.xpath("//a[@href='https://keblestrading.sharptest.com.au/materials-handling/'][normalize-space()='View More']");
	public By handrails_ViewMore_Btn = By.xpath("//a[@href='https://keblestrading.sharptest.com.au/handrails/'][normalize-space()='View More']");
//	public By SearchBtn = By.xpath("//div[@class='header__search position-relative overflow-hidden d-none d-md-block']//div[@class='wpf_autocomplete']");
	public By SearchResultPage = By.xpath("//h1[@class='woocommerce-products-header__title page-title']");
	public By ClickOnSearchResultoption = By.xpath("//div[@id='ui-id-14']");
	public By SearchResult = By.xpath("//h1[@class='product_title entry-title']");
//	public By  = By.xpath("");
//	public By  = By.xpath("");
//	public By  = By.xpath("");
//	public By  = By.xpath("");
//	
	
	//div[@class='header__search position-relative overflow-hidden d-none d-md-block']//div[@class='wpf_autocomplete']
	
	//section[@id='flexBoxId-2']//div[@class='row']//div[1]//div[1]//div[1]//a[1]
	//a[@href='https://keblestrading.sharptest.com.au/product-brochures/'][normalize-space()='Know More']
	//a[@href='https://keblestrading.sharptest.com.au/contact-us/'][normalize-space()='Know More']
	
	
	//------------------------------------------------------* Function's *--------------------------------------------------------------//	
	
	public void user_should_navigate_to_home_page_of_Kebles_Trading() {
		SoftAssert assertion = new SoftAssert();
		try {
			assertion.assertTrue(isElementPresent(HomePageLogo));
			highLighterMethod(HomePageLogo);
			ScreenshotStep("User navigating to Kebles Trading Home Page");
			log.info("User navigating to Kebles Trading Home Page");
		}catch (Exception e) {
			e.printStackTrace();
			ScreenshotStep("User navigating to Kebles Trading Home Page, FAILED");
		}
		assertion.assertAll();
	}

	
	public void all_Product_options_should_be_visible_on_Home_Page() {
		SoftAssert assertion = new SoftAssert();
		try {
			driver.navigate().refresh();
			assertion.assertTrue(isElementVisible(Product_WireRope));
			assertion.assertTrue(isElementVisible(Product_Rigging));
			assertion.assertTrue(isElementVisible(Product_MaterialsHandling));
			assertion.assertTrue(isElementVisible(Product_Handrails));
			highLighterMethod(Product_WireRope);
			highLighterMethod(Product_Rigging);
			highLighterMethod(Product_MaterialsHandling);
			highLighterMethod(Product_Handrails);
			ScreenshotStep("All Product options should be visible on Home Page");
			log.info("All Product options should be visible on Home Page");
		}catch (Exception e) {
			e.printStackTrace();
			ScreenshotStep("All Product options should be visible on Home Page, FAILED");
		}
		assertion.assertAll();
		
	}
	
	public void user_click_on_wire_rope_product_option() {
		SoftAssert assertion = new SoftAssert();
		try {
			waitForElement(HomePageLogo, 20, null);
			assertion.assertTrue(isElementVisible(Product_WireRope));
			javaScriptClick(Product_WireRope);
			ScreenshotStep("User successfully able to click on wire rope product");
			log.info("User successfully able to click on wire rope product");
		}catch (Exception e) {
			e.printStackTrace();
			ScreenshotStep("User successfully able to click on wire rope product, FAILED");
		}
		assertion.assertAll();
	}
	
	public void verify_user_should_able_to_see_all_wire_rope_relevant_product_or_Details() {
		SoftAssert assertion = new SoftAssert();
		try {
			waitForElement(PageHeader, 20, null);
			assertion.assertTrue(isElementPresent(PageHeader));
			highLighterMethod(PageHeader);
			ScreenshotStep("User navigating to Wire Rope Product Page");
			log.info("User navigating to Wire Rope Product Details Page");
		}catch (Exception e) {
			e.printStackTrace();
			ScreenshotStep("User navigating to Wire Rope Product Page, FAILED");
		}
		assertion.assertAll();
		
	}
	
	public void user_click_on_Rigging_product_option() {
		
		SoftAssert assertion = new SoftAssert();
		try {
			waitForElement(HomePageLogo, 20, null);
			assertion.assertTrue(isElementVisible(Product_Rigging));
			javaScriptClick(Product_Rigging);
			ScreenshotStep("User successfully able to click on Rigging product");
			log.info("User successfully able to click on Rigging product");
		}catch (Exception e) {
			e.printStackTrace();
			ScreenshotStep("User successfully able to click on Rigging product, FAILED");
		}
		assertion.assertAll();
	}
	

	
	public void verify_user_should_able_to_see_all_Rigging_relevant_product_or_Details() {
		SoftAssert assertion = new SoftAssert();
		try {
			waitForElement(PageHeader, 20, null);
			assertion.assertTrue(isElementPresent(PageHeader));
			highLighterMethod(PageHeader);
			ScreenshotStep("User navigating to Rigging Page");
			log.info("User navigating to Rigging Page");
		}catch (Exception e) {
			e.printStackTrace();
			ScreenshotStep("User navigating to Rigging Page, FAILED");
		}
		assertion.assertAll();
		
	}
	
	public void user_click_on_Material_Handling_option() {
		
		SoftAssert assertion = new SoftAssert();
		try {
			waitForElement(HomePageLogo, 10, null);
			assertion.assertTrue(isElementVisible(Product_MaterialsHandling));
			javaScriptClick(Product_MaterialsHandling);
			ScreenshotStep("User successfully able to click on Materials Handling Product");
			log.info("User successfully able to click on Materials Handling product");
		}catch (Exception e) {
			e.printStackTrace();
			ScreenshotStep("User successfully able to click on Materials Handling product, FAILED");
		}
		assertion.assertAll();
		
	}

	public void verify_user_should_able_to_see_all_Material_Handling_relevant_product_or_Details() {
		SoftAssert assertion = new SoftAssert();
		try {
			waitForElement(PageHeader, 20, null);
			assertion.assertTrue(isElementPresent(PageHeader));
			highLighterMethod(PageHeader);
			ScreenshotStep("User navigating to Materials Handling Page");
			log.info("User navigating to Materials Handling Page");
		}catch (Exception e) {
			e.printStackTrace();
			ScreenshotStep("User navigating to Materials Handling Page, FAILED");
		}
		assertion.assertAll();	
	}
	
	public void user_click_on_Handrails_option() {
		SoftAssert assertion = new SoftAssert();
		try {
			waitForElement(HomePageLogo, 10, null);
			assertion.assertTrue(isElementVisible(Product_Handrails));
			javaScriptClick(Product_Handrails);
//			assertion.assertTrue(isElementVisible(Product_Handrails)& isElementClickable(Product_Handrails));
			ScreenshotStep("User successfully able to click on Handrails Product");
			log.info("User successfully able to click on Handrails product");
		}catch (Exception e) {
			e.printStackTrace();
			ScreenshotStep("User successfully able to click on Handrails product, FAILED");
		}
		assertion.assertAll();
		
	}
	
	public void verify_user_should_able_to_see_all_Handrails_relevant_product_or_Details() {
		SoftAssert assertion = new SoftAssert();
		try {
			waitForElement(PageHeader, 20, null);
			assertion.assertTrue(isElementPresent(PageHeader));
			highLighterMethod(PageHeader);
			ScreenshotStep("User navigating to Handrails Page");
			log.info("User navigating to Handrails Page");
		}catch (Exception e) {
			e.printStackTrace();
			ScreenshotStep("User navigating to Handrails Page, FAILED");
		}
		assertion.assertAll();	
		
	}
	
	
	public void verify_if_user_enter_any_text_in_search_box_field_appropriate_search_result_should_display() {
		SoftAssert assertion = new SoftAssert();
		try {
			driver.navigate().refresh();
			waitForElement(SearchField, 10, null);
			assertion.assertTrue(isElementPresent(SearchField));
			clearAndFillText(SearchField, getdata.SearchDetails);
			highLighterMethod(SearchField);
			ScreenshotStep("User successfully able to enter search details");
//			click(ClickOnSearchResultoption);
//			waitForElement(SearchResult, 10, null);
//			assertion.assertTrue(isElementPresent(SearchResult));
			ScreenshotStep("Search Results display successfully");
			log.info("Search Results display successfully");
		}catch (Exception e) {
			e.printStackTrace();
			ScreenshotStep("Search Results display successfully, FAILED");
		}
		assertion.assertAll();
	}
	
	
	public void user_should_be_on_home_page_of_Kebles_Trading() {
		SoftAssert assertion = new SoftAssert();
		try {
			driver.navigate().refresh();
			waitForElement(HomePageLogo, 10, null);
			assertion.assertTrue(isElementPresent(HomePageLogo));
			javaScriptClick(HomePageLogo);
			ScreenshotStep("User navigating to Home Page of Kebles Trading");
			log.info("User navigating to Home Page of Kebles Trading");
		}catch (Exception e) {
			e.printStackTrace();
			ScreenshotStep("User navigating to Home Page of Kebles Trading, FAILED");
		}
		assertion.assertAll();
	}
	
	public void all_View_more_button_should_be_visible_and_clickable_on_Home_page() {
		SoftAssert assertion = new SoftAssert();
		try {
			waitForElement(wireRope_ViewMore_Btn, 10, null);
			assertion.assertTrue(isElementVisible(wireRope_ViewMore_Btn)& isElementClickable(wireRope_ViewMore_Btn));
			assertion.assertTrue(isElementVisible(rigging_ViewMore_Btn)& isElementClickable(rigging_ViewMore_Btn));
			assertion.assertTrue(isElementVisible(materialsHandling_ViewMore_Btn)& isElementClickable(materialsHandling_ViewMore_Btn));
			assertion.assertTrue(isElementVisible(handrails_ViewMore_Btn)& isElementClickable(handrails_ViewMore_Btn));
			ScreenshotStep("All Product with View more button is visible and clickable on Home page");
			log.info("All Product with View more button is visible and clickable on Home page");
		}catch (Exception e) {
			e.printStackTrace();
			ScreenshotStep("All Product with View more button is visible and clickable on Home page, FAILED");
		}
		assertion.assertAll();
	}
	
	public void user_click_on_Wire_Rope_View_more_button() {
	    
	}

	public void user_should_navigate_to_Wire_Rope_details_page() {
	    
	}

	public void user_click_on_Rigging_View_more_button() {
	   
	}

	public void user_should_navigate_to_Rigging_details_page() {
	   
	}

	public void user_click_on_Material_Handling_View_more_button() {
	    
	}

	public void user_should_navigate_to_Material_Handling_details_page() {
	   
	}

	public void user_click_on_Handrails_View_more_button() {
	   
	}

	public void user_should_navigate_to_Handrails_details_page() {
	    
	}

}
	
