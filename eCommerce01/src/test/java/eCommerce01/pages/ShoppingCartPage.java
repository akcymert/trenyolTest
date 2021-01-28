package eCommerce01.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class ShoppingCartPage {  
	
	private WebDriver driver;
	 
	@FindBy(how = How.CLASS_NAME, using = "pb-basket-item-price")
	private WebElement basketPrice; 
	
	@FindBy(how = How.CLASS_NAME, using = "i-trash")
	private WebElement removeProduct; 
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"partial-basket\"]/div/div[2]/div[2]/div[3]/div[1]/div/button[2]")
	private WebElement incrementButton; 
	
	public ShoppingCartPage(WebDriver driver) {
		
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
	}
	
	
	
	
	
	public WebElement getBasketPrice()
	{
		basketPrice.getText();
		return basketPrice;
		
	}
	
	public void incrementProductCount()
	{
		incrementButton.click();
		
	}
	
	public void removeProduct()
	{
		removeProduct.click();
		
	}
	
	

}
