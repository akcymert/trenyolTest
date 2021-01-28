package eCommerce01.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	private WebDriver driver; 
	
	public static String PAGE_URL = "https://www.trendyol.com/";
	
	@FindBy(how = How.CLASS_NAME, using = "search-box")
	private WebElement searchBox;
	
	@FindBy(how = How.CLASS_NAME, using = "search-icon")
	private WebElement searchIcon; //
	
	@FindBy(how = How.CLASS_NAME, using = "link-text")
	private WebElement loginIcon;
	
	@FindBy(tagName = "title")
	private WebElement pageTitle;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"account-navigation-container\"]/div/div[1]/div[1]/div/i[2]")
	private WebElement accountButton;
	
	
	public HomePage(WebDriver driver) {
		
		this.driver = driver;
		driver.get(PAGE_URL);
		
		PageFactory.initElements(driver, this);
		
	}
	
	public void clickLoginIcon() { //click login icon to navigate to the login page
		
		loginIcon.click();
		
	}
	
	public void SetSearchTextBox(String productName) { // enter product to search box
		
		searchBox.sendKeys(productName);
		//Reporter.log("Product entered in Search Box: " + productName, true);
	}
	
	public void ClickSearchButton() { // click search button
		
		searchIcon.click();
		//Reporter.log("Search Button Clicked: ", true);
	}
	
	public void SearchProduct(String arg) throws InterruptedException {
		
		SetSearchTextBox(arg);
		Thread.sleep(3000);
		ClickSearchButton();
		
		
		
	}
	
	public boolean isPageOpened() { //check main page
		
		return pageTitle.getText().toString().contains("En Trend Ürünler Türkiye'nin Online Alýþveriþ Sitesi Trendyol'da");
		
	}
	
	public boolean isLoggedIn() { // check if user logged in 
		
		return accountButton.isDisplayed();
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
