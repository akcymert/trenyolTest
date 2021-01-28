package eCommerce01.tests;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import eCommerce01.pages.HomePage;
import eCommerce01.pages.LoginPage;
import eCommerce01.pages.ProductPage;
import eCommerce01.pages.ShoppingCartPage;
import eCommerce01.pages.ShoppingPage;

public class ShoppingTest {

	WebDriver driver;
	
	@Before
	public void setup() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\pc\\Downloads\\Installer\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
	}
	
	@Test
	public void shoppingTest() throws InterruptedException {
		
		HomePage home = new HomePage(driver);
		Assert.assertTrue(home.isPageOpened());
		Thread.sleep(3000);
		home.clickLoginIcon();
		
		LoginPage login = new LoginPage(driver);
		String email = "trendyol_bot_accout123@outlook.com";
		String password = "parola123";
		login.userLogin(email, password);
		Assert.assertTrue(login.isLoginFailed());
		
		Thread.sleep(3000);
		String productName = "bilgisayar";
		home.SearchProduct(productName);
		Thread.sleep(3000);
		
		ShoppingPage shop = new ShoppingPage(driver);
		shop.selectProduct();
		Thread.sleep(3000);
		
		ProductPage product = new ProductPage(driver);
		Thread.sleep(3000);
		product.addCart();
		Thread.sleep(3000);
		product.goShoppingCart();
		
		ShoppingCartPage cart = new ShoppingCartPage(driver);
		Assert.assertEquals(product.getPrice(), cart.getBasketPrice());
		cart.incrementProductCount();
		cart.removeProduct();

		
	}
	

	@After  
	public void close() {
		
		driver.close();
		
	}
	
	
	
	
	
	
	
	
	
}
