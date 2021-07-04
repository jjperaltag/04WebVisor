package com.bdd.VISOR.modoVisor.page;

import com.bdd.VISOR.BaseClass;
import com.bdd.VISOR.Hook;
import com.bdd.VISOR.modoVisor.model.ExcelModel;
import com.bdd.VISOR.utility.ExtentReportUtil;
import com.bdd.VISOR.utility.GenerateWord;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import static com.bdd.VISOR.modoVisor.path.LoginPath.*;

public class LoginPage extends BaseClass {

    public static WebDriver driver;
    public static WebDriverWait wait;
    static GenerateWord generateWord = new GenerateWord();

    public LoginPage() {
        driver = Hook.getDriver();
        wait = new WebDriverWait(driver,30);
    }

    public void accederPaginaVisor() throws Throwable {
        try {
            String url = ExcelModel.URL_VISOR;
            driver.get(url);
            sleep(100);
            ExtentReportUtil.INSTANCE.stepPass(driver, "Se inició correctamente la página de Visor.");
            generateWord.sendText("Se inició correctamente la página de Visor.");
            generateWord.addImageToWord(driver);
        } catch (Exception e) {
            ExtentReportUtil.INSTANCE.stepFail(driver, "Fallo el caso de prueba : " + e.getMessage());
            generateWord.sendText("Tiempo de espera ha excedido");
            generateWord.addImageToWord(driver);
            throw e;
        }
    }

    public void validarTituloVisor() throws Throwable {
        tiempoDeEsperaLocatorVisible(driver,TITULO_VISOR);
        compararTexto(driver, TITULO_VISOR, "¡Hola!","Hola Visor",false);
    }

    public void clickIngresar() throws Throwable {
        WebElement ingresar = driver.findElement(By.xpath("//div/span"));
        wait.until(ExpectedConditions.elementToBeClickable(ingresar));
        ingresar.click();
        //getElement(driver, "xpath", LoginPath.BTN_INGRESAR).click();
        ExtentReportUtil.INSTANCE.stepPass(driver, "El Administrador da click en el botón ingresar de la página de Visor.");
        generateWord.sendText("El Administrador da click en el botón ingresar de la página de Visor.");
        generateWord.addImageToWord(driver);
    }

    public void seleccionarTipoUsuario(String tipo) throws Exception {
        //WebElement seleccionarTipo = driver.findElement(By.id("procedencia_usuario"));
        wait.until(ExpectedConditions.visibilityOf(getElement(driver,"id",TIPO_USUARIO)));
        new Select(getElement(driver,"id",TIPO_USUARIO)).selectByVisibleText(tipo);
        ExtentReportUtil.INSTANCE.stepPass(driver, "El Administrador selecciona el tipo de usuario.");
        generateWord.sendText("El Administrador selecciona el tipo de usuario.");
        generateWord.addImageToWord(driver);
    }

    public void ingresarUsuario (String sTest) throws Throwable {
        wait.until(ExpectedConditions.visibilityOf(getElement(driver, "id", USUARIO)));
        getElement(driver, "id", USUARIO).sendKeys(sTest);
        ExtentReportUtil.INSTANCE.stepPass(driver, "El Administrador ingresa su usuario.");
        generateWord.sendText("El Administrador ingresa su usuario.");
        generateWord.addImageToWord(driver);

    }

    public void ingresarPassword (String sTest) throws Throwable {
        wait.until(ExpectedConditions.visibilityOf(getElement(driver, "id", PASSWORD)));
        getElement(driver, "id", PASSWORD).sendKeys(sTest);
        ExtentReportUtil.INSTANCE.stepPass(driver, "El Administrador ingresa su password.");
        generateWord.sendText("El Administrador ingresa su password.");
        generateWord.addImageToWord(driver);
    }

    public void clickContinuar () throws Throwable {
        WebElement continuar = driver.findElement(By.id("continue"));
        wait.until(ExpectedConditions.elementToBeClickable(continuar));
        continuar.click();
//        getElement(driver, "id", LoginPath.BTN_CONTINUAR).click();
        ExtentReportUtil.INSTANCE.stepPass(driver, "El Administrador da click en el botón continuar.");
        generateWord.sendText("El Administrador da click en el botón continuar.");
        generateWord.addImageToWord(driver);
    }
//}

//        getElement(driver, "id", LoginPath.BTN_CONTINUAR).click();
//        ExtentReportUtil.INSTANCE.stepPass(driver, "El Administrador da click en el botón continuar.");
//        generateWord.sendText("El Administrador da click en el botón continuar.");
//        generateWord.addImageToWord(driver);
//    }
}
