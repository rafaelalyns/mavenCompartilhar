package Validations;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;

import pageObjects.CartPage;

public class CartValidation {
    private WebDriver driver;
    private CartPage cartPage;
    
   public CartValidation(WebDriver driver) {
       this.driver = driver;
       cartPage = new CartPage(this.driver);
   }
   public void validationCartPage() {
       
       Assertions.assertTrue(cartPage.getHomeTextSpan().isDisplayed());
       
   }
}