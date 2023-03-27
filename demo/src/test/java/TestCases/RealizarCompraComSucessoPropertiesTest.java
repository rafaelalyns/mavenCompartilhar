package TestCases;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

import Framework.TestBase;
import Framework.Utils.FileOperation;
import Tasks.CheckoutTask;
import Tasks.FinishTask;
import Tasks.LoginTask;
import Tasks.ProdutoTask;

public class RealizarCompraComSucessoPropertiesTest extends TestBase {
     
    private WebDriver driver = getDriverManager();
LoginTask loginTask = new LoginTask(driver);
ProdutoTask produtoTask = new ProdutoTask(driver);
CheckoutTask checkoutTask = new CheckoutTask(driver);
FinishTask finishTask = new FinishTask(driver);

@Test
public void realizarCompra() {
    //o primeiro user � o documento
   // String user = FileOperation.getProperties("user").getProperty("user");
   // String password = FileOperation.getProperties("user").getProperty("password");
   // loginTask.efetuarLoginParametrizado(user, password);
    loginTask.efetuarLoginProperties();
    produtoTask.selecionarProduto();
    checkoutTask.preencherForm();
    finishTask.finalizarCompra();
    
    
}

}
