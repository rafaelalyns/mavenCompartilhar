package Validations;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;

import pageObjects.GenericPage;

public class GenericValidation {
    private WebDriver driver;
    private GenericPage genericPage;
    
    public GenericValidation(WebDriver driver) {
     this.driver = driver;
     genericPage = new GenericPage(this.driver);
      
    }
    //exemplo metodo unico para validacao de cada pagina 
    public void validationPageProducts() {
        String label = genericPage.getHomeTextSpan().getText();
        Assertions.assertEquals("Products", label);
        
    }
    
    //exemplo de metodo dinamico para validacao das paginas onde ira receber por parametro 
    // qual o texto esperado para comparacao 
    public void validationPages(String texto) {
        
        String label = genericPage.getHomeTextSpan().getText();
        Assertions.assertEquals(texto, label);
    }
 public void validationProduto() {
        
     Assertions.assertTrue(genericPage.getProdutoLabel().isDisplayed());
    
}}
