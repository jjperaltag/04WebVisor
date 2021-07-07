package com.bdd.VISOR.modoVisor.page;

import com.bdd.VISOR.Hook;
import com.bdd.VISOR.modoVisor.path.ConsultaPath;
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
import static com.bdd.VISOR.modoVisor.path.ConsultaPath.BTN_CERRAR;
import static com.bdd.VISOR.modoVisor.path.ConsultaPath.BTN_SALIR_ROOT;
import static com.bdd.VISOR.modoVisor.path.HomePath.BTN_TELEFONO_ROOT;

public class ConsultaPage {

    public static WebDriver driver;
    public static WebDriverWait wait;
    static GenerateWord generateWord = new GenerateWord();

    public ConsultaPage() {
        driver = Hook.getDriver();
        wait = new WebDriverWait(driver,30);
    }

    public WebElement expandRootElement(WebElement element) {
        WebElement ele = (WebElement) ((JavascriptExecutor)driver)
                .executeScript("return arguments[0].shadowRoot", element);
        return ele;
    }

    public void clickBotonCerrar() throws Exception {
        Thread.sleep(6000);
        wait.until(ExpectedConditions.visibilityOf(getElement(driver,"id", ConsultaPath.BTN_CERRAR)));
        getElement(driver,"id", ConsultaPath.BTN_CERRAR).click();

//        WebElement root1 = getElement(driver,"tagname",BTN_SALIR_ROOT);
//        WebElement shadowRoot1 = expandRootElement(root1);
//        wait.until(ExpectedConditions.elementToBeClickable(getElement(driver,"id",BTN_CERRAR)));
//        shadowRoot1.findElement(By.id("close-modal-message")).click();

        ExtentReportUtil.INSTANCE.stepPass(driver, "Click en el botón Cerrar.");
        generateWord.sendText("Click en el botón Cerrar.");
        generateWord.addImageToWord(driver);
    }

    public void clickBotonAveria() throws Exception {
        wait.until(ExpectedConditions.visibilityOf(getElement(driver,"id", ConsultaPath.BTN_AVERIA)));
        getElement(driver,"id", ConsultaPath.BTN_AVERIA).click();
        ExtentReportUtil.INSTANCE.stepPass(driver, "Click en el botón Averia.");
        generateWord.sendText("Click en el botón Averia.");
        generateWord.addImageToWord(driver);
    }
}
