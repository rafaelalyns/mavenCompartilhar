package TestCases;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

import Framework.TestBase;
import Tasks.CheckoutTask;
import Tasks.FinishTask;
import Tasks.LoginTask;
import Tasks.ProdutoTask;

public class RealizarCompraComSucessoTest extends TestBase {
     
    private WebDriver driver = getDriverManager();
LoginTask loginTask = new LoginTask(driver);
ProdutoTask produtoTask = new ProdutoTask(driver);
CheckoutTask checkoutTask = new CheckoutTask(driver);
FinishTask finishTask = new FinishTask(driver);

@Test
public void realizarCompra() {
    loginTask.efetuarLogin();
    produtoTask.selecionarProduto();
    checkoutTask.preencherForm();
    finishTask.finalizarCompra();
    
    
}

}
