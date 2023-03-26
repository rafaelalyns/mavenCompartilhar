package Validations;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;

import pageObjects.CheckoutPage;
import pageObjects.FinishPage;

public class FinishValidation {
	 private WebDriver driver;
	 private FinishPage finishPage;
	 
	 public FinishValidation(WebDriver driver) {
		 this.driver = driver;
		 finishPage = new FinishPage(this.driver);
	 }
	public void validationFinishPage() {
		Assertions.assertTrue(finishPage.getLogoText().isDisplayed());
	}
}
