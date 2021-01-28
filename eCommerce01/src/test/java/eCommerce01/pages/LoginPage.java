package eCommerce01.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	private WebDriver driver;
	
	
	@FindBy(how = How.ID, using = "login-email")
	private WebElement emailBox;
	
	@FindBy(how = How.ID, using = "login-password-input")
	private WebElement passwordBox; 
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"login-register\"]/div[3]/div[1]/form/button")
	private WebElement loginButton;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"error-box-wrapper\"]/span[2]")
	private WebElement loginErrorBox;
	
	public LoginPage(WebDriver driver) {
		
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
		
	}
	
	public void setUser_email(String email) {
		
		emailBox.clear();
		emailBox.sendKeys(email);
		
	}
	
	public void setUser_password(String password) {
		
		passwordBox.clear();
		passwordBox.sendKeys(password);
		
	}
	
	public void clickLoginButton() {
		
		loginButton.click();
		
	}
	
	public boolean isLoginFailed() {
		
		return loginErrorBox.isDisplayed();
	}
	
	public void userLogin(String email, String password) {
		
		setUser_email(email);
		setUser_password(password);
		clickLoginButton();
		
	}

}
