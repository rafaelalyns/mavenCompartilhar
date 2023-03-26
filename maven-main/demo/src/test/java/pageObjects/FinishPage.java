package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FinishPage {
	private WebDriver driver;
	
	public FinishPage(WebDriver driver) {
		this.driver = driver;
	
	}
	public WebElement getLogoText() {
		return driver.findElement(By.xpath("//div[@id = 'header_container']/div[@class='header_secondary_container']/span"));
	}
	public WebElement getProdutoLabel () {
        return driver.findElement(By.className("inventory_item_name"));
    }
	public WebElement getFinishButton() {
		return driver.findElement(By.id("finish"));
	}
	
}
