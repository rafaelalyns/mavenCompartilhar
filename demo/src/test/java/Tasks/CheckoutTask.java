package Tasks;

import org.openqa.selenium.WebDriver;

import Framework.Utils.FakersGeneration;
import Validations.CheckoutValidation;
import Validations.GenericValidation;
import pageObjects.CheckoutPage;



public class CheckoutTask {
    private CheckoutPage checkoutPage;
    private CheckoutValidation checkoutValidation;
    private WebDriver driver;
    public FakersGeneration fakers;
    public GenericValidation genericValidation;
    
    
    public CheckoutTask(WebDriver driver) {
        this.driver = driver;
        checkoutPage = new CheckoutPage(this.driver);
        genericValidation = new GenericValidation(this.driver);
        fakers = new FakersGeneration();
        checkoutValidation = new CheckoutValidation(this.driver);
        
}
    public void preencherForm() {
        genericValidation.validationPages("Checkout: Your Information");
        checkoutPage.getFirstnameInput().sendKeys(fakers.getFirstName());
        checkoutPage.getLastnameInput().sendKeys(fakers.getLastName());
        checkoutPage.getPostalCodeInput().sendKeys(fakers.getZipCode());
        checkoutValidation.validationForm();
        checkoutPage.getContinueButton().click();
        genericValidation.validationPages("Checkout: Overview");
        genericValidation.validationProduto();
        checkoutPage.getFinishButton().click();
}
}