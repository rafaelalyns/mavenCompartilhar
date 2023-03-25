package Tasks;

import org.openqa.selenium.WebDriver;

import Validations.CheckoutValidation;
import pageObjects.CheckoutPage;

public class CheckoutTask {
	private CheckoutPage checkoutPage;
	private CheckoutValidation checkoutValidation;
	private WebDriver driver;
	
	public CheckoutTask(WebDriver driver) {
		this.driver = driver;
		checkoutPage = new CheckoutPage(this.driver);
		checkoutValidation = new CheckoutValidation(this.driver);
}
	public void efetuarLogin() {
        checkoutValidation.validationCheckoutPage();
        checkoutPage.getFirstnameInput().sendKeys("rafaela");
        checkoutPage.getLastnameInput().sendKeys("lyns");
        checkoutPage.getPostalCodeInput().sendKeys("12312312");
        checkoutPage.getContinueButton().click();
}
}