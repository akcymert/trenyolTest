package eCommerce01.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.By;

public class ShoppingPage {

	private WebDriver driver;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"search-app\"]/div/div[1]/div[2]/div[2]/div/div[2]/div[1]/a/div[1]/div/img")
	private WebElement product;
	
	public ShoppingPage(WebDriver driver) {
		
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
	}
	
	public void selectProduct() {
		
		product.click();
		
	}
	
	
} 
