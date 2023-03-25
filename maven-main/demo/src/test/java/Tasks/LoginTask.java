package Tasks;

import org.openqa.selenium.WebDriver;

import Validations.LoginValidation;
import pageObjects.LoginPage;

public class LoginTask {
    private LoginPage loginPage;
    private LoginValidation loginValidation;
    private WebDriver driver;
    
    public LoginTask(WebDriver driver) {
        this.driver = driver;
        loginPage = new LoginPage(this.driver);
        loginValidation = new LoginValidation(this.driver);
        
}
    public void efetuarLogin() {
        loginValidation.validationLoginPage();
        loginPage.getUsernameInput().sendKeys("standard_user");
        loginPage.getPasswordInput().sendKeys("secret_sauce");
        loginPage.getLoginButton().click();
    }
    
    
    
    
    
    
}
