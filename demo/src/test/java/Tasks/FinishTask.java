package Tasks;

import org.openqa.selenium.WebDriver;

import Framework.Browser.Waits;
import Validations.FinishValidation;
import Validations.GenericValidation;
import Validations.LoginValidation;
import pageObjects.FinishPage;
import pageObjects.LoginPage;


public class FinishTask {
    private FinishPage finishPage;
    private WebDriver driver;
    private FinishValidation finishValidation;
    private LoginValidation loginValidation;
    private Waits wait;
    private LoginPage loginPage;
    
    public FinishTask(WebDriver driver) {
        this.driver = driver;
        finishPage = new FinishPage(this.driver);
        finishValidation = new FinishValidation(this.driver);
        wait = new Waits(this.driver);
        loginValidation = new LoginValidation(this.driver);
        loginPage = new LoginPage(this.driver);
    }
    public void finalizarCompra() {
        finishValidation.validationMessageCompra();
        finishPage.getMenuLogoutButton().click();
        //wait.loadElement(finishPage.getLogoutLink());
        finishPage.getLogoutLink().click();
        wait.loadElement(loginPage.getLogoText());
        loginValidation.validationLoginPage();
    }
    
    
}
