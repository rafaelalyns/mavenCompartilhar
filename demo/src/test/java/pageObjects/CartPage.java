package pageObjects;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Tasks.LoginTask;

public class CartPage {
    private WebDriver driver;
  public CartPage(WebDriver driver) {
      this.driver = driver;
  }
  
  public WebElement getCheckoutButton() {
      return driver.findElement(By.id("checkout"));
  }
  public WebElement getProdutoLabel () {
      return driver.findElement(By.className("inventory_item_name"));
  }
  public WebElement getHomeTextSpan () {
      return driver.findElement(By.xpath("//div[@id = 'header_container']/div[@class='header_secondary_container']/span"));
  }
 
  
  
  
  
  
}
