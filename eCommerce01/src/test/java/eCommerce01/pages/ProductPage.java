package eCommerce01.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class ProductPage {
	
	

	private WebDriver driver;
	
	@FindBy(how = How.CLASS_NAME, using = "prc-slg")
	private WebElement productPrice;	
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"product-detail-app\"]/div/div[2]/div[2]/div[2]/div[8]/div/button")
	private WebElement addCartButton;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"account-navigation-container\"]/div/div[2]/a/p")
	private WebElement shoppingCartButton;

	
	public ProductPage(WebDriver driver) {
		
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
	}
	
    public void scrollToElement(WebElement element) {
        Actions actions = new Actions(driver);
        actions.moveToElement(element);
        actions.perform();
    }
    
	public void goShoppingCart() {
		
		shoppingCartButton.click();
	}
	
	public void addCart() throws InterruptedException {
		
		Thread.sleep(4000);
		scrollToElement(addCartButton);
		addCartButton.click();
		
	}
	
	public WebElement getPrice()
	{
		productPrice.getText();
		return productPrice;
		
	}
	

	
}
