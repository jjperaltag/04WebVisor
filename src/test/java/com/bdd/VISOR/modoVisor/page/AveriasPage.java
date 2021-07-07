package com.bdd.VISOR.modoVisor.page;

import com.bdd.VISOR.Hook;
import com.bdd.VISOR.modoVisor.path.AveriasPath;
import com.bdd.VISOR.utility.ExtentReportUtil;
import com.bdd.VISOR.utility.GenerateWord;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import static com.bdd.VISOR.BaseClass.existElementWaitVisible;
import static com.bdd.VISOR.BaseClass.getElement;
import static com.bdd.VISOR.modoVisor.path.AveriasPath.*;

public class AveriasPage {

    public static WebDriver driver;
    public static WebDriverWait wait;
    static GenerateWord generateWord = new GenerateWord();

    public AveriasPage() {
        driver = Hook.getDriver();
        wait = new WebDriverWait(driver,30);
    }

    public void clickBotonHerramientas() throws Exception {
        wait.until(ExpectedConditions.visibilityOf(getElement(driver,"id", AveriasPath.BTN_HERRAMIENTAS)));
        getElement(driver,"id", AveriasPath.BTN_HERRAMIENTAS).click();
        ExtentReportUtil.INSTANCE.stepPass(driver, "Click en el botón Herramientas.");
        generateWord.sendText("Click en el botón Herramientas.");
        generateWord.addImageToWord(driver);
    }

    public WebElement expandRootElement(WebElement element) {
        WebElement ele = (WebElement) ((JavascriptExecutor)driver)
                .executeScript("return arguments[0].shadowRoot", element);
        return ele;
    }

    public void clickBotonGeneral() throws Exception {
        wait.until(ExpectedConditions.elementToBeClickable(getElement(driver,"xpath", BTN_GENERAL)));
        getElement(driver,"xpath", BTN_GENERAL).click();
        ExtentReportUtil.INSTANCE.stepPass(driver, "Click en el botón General.");
        generateWord.sendText("Click en el botón General.");
        generateWord.addImageToWord(driver);
    }

    public void clickBotonDatos(){
        wait.until(ExpectedConditions.elementToBeClickable(getElement(driver,"xpath", BTN_DATOS)));
        getElement(driver,"xpath", BTN_DATOS).click();
    }

    public void clickBotonVoz(){
        wait.until(ExpectedConditions.elementToBeClickable(getElement(driver,"xpath", BTN_VOZ)));
        getElement(driver,"xpath", BTN_VOZ).click();
    }

    public void clickBotonResetDeDatos(){
        wait.until(ExpectedConditions.elementToBeClickable(getElement(driver,"xpath", BTN_RESET_DE_DATOS)));
        getElement(driver,"xpath", BTN_RESET_DE_DATOS).click();
    }

    public void clickBotonResetDeVoz(){
        wait.until(ExpectedConditions.elementToBeClickable(getElement(driver,"xpath", BTN_RESET_DE_VOZ)));
        getElement(driver,"xpath", BTN_RESET_DE_VOZ).click();
    }

    public void clickBotonResetTotal() throws Exception {
        wait.until(ExpectedConditions.visibilityOf(getElement(driver,"id", AveriasPath.BTN_RESET_TOTAL)));
        getElement(driver,"id", AveriasPath.BTN_RESET_TOTAL).click();
        ExtentReportUtil.INSTANCE.stepPass(driver, "Click en el botón Reset Total.");
        generateWord.sendText("Click en el botón Reset Total.");
        generateWord.addImageToWord(driver);
    }

    public void clickRealizarReset() throws Exception {
        wait.until(ExpectedConditions.visibilityOf(getElement(driver,"xpath", AveriasPath.BTN_REALIZAR_RESET)));
        getElement(driver,"xpath", AveriasPath.BTN_REALIZAR_RESET).click();
        ExtentReportUtil.INSTANCE.stepPass(driver, "Click en el botón Realizar Reset.");
        generateWord.sendText("Click en el botón Realizar Reset.");
        generateWord.addImageToWord(driver);
    }

    public void validarMensajeTest() throws Exception {
        Assert.assertTrue(existElementWaitVisible(driver, AveriasPath.LBL_MENSAJE_TEST));
        ExtentReportUtil.INSTANCE.stepPass(driver, "Validar mensaje de Reset.");
        generateWord.sendText("Validar mensaje de Reset.");
        generateWord.addImageToWord(driver);
    }

    public boolean validarMensajeUsuario(String mensaje){
        wait.until(ExpectedConditions.visibilityOf(getElement(driver,"xpath",LBL_MENSAJE_USUARIO)));
        String mensajeUI = getElement(driver,"xpath",LBL_MENSAJE_USUARIO).getText();
        if (mensaje.equals(mensajeUI)){
            return true;
        } else {
            return false;
        }
    }
    
}
