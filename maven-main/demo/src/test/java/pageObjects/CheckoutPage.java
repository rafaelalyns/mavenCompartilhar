package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckoutPage {
	private WebDriver driver;
	
	public CheckoutPage(WebDriver driver) {
		this.driver = driver;
		
	}
	
	public WebElement getFirstnameInput() {
		return driver.findElement(By.id("first-name"));
	}
	public WebElement getLastnameInput() {
		return driver.findElement(By.id("last-name"));
	}
	public WebElement getPostalCodeInput() {
		return driver.findElement(By.id("postal-code"));
	}
	 public WebElement getContinueButton() {
	        return driver.findElement(By.id("continue"));
	    }
	public WebElement getLogoText() {
		return driver.findElement(By.xpath("//div[@id = 'header_container']/div[@class='header_secondary_container']/span"));
	}
}
