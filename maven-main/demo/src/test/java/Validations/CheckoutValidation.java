package Validations;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;

import pageObjects.CheckoutPage;

public class CheckoutValidation {
	 private WebDriver driver;
	 private CheckoutPage checkoutPage;
	 
	 public CheckoutValidation(WebDriver driver) {
		 this.driver = driver;
		 checkoutPage = new CheckoutPage(this.driver);
	 }
	 public void validationCheckoutPage() {
         
	        Assertions.assertTrue(checkoutPage.getLogoText().isDisplayed());
	        
	    }
}
