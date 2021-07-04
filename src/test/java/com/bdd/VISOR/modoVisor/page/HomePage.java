package com.bdd.VISOR.modoVisor.page;

import com.bdd.VISOR.Hook;
import com.bdd.VISOR.modoVisor.model.ExcelModel;
import com.bdd.VISOR.modoVisor.path.HomePath;
import com.bdd.VISOR.BaseClass;
import com.bdd.VISOR.utility.ExtentReportUtil;
import com.bdd.VISOR.utility.GenerateWord;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.util.List;

import static com.bdd.VISOR.modoVisor.path.HomePath.BTN_TELEFONO_ROOT;
import static com.bdd.VISOR.modoVisor.path.HomePath.VISOR_HOME;

public class HomePage extends BaseClass {

    public static WebDriver driver;
    public static WebDriverWait wait;
    static GenerateWord generateWord = new GenerateWord();

    public HomePage() {
        driver = Hook.getDriver();
        wait = new WebDriverWait(driver,30);
    }

    public void validarIngresoPaginaVisor() throws Exception {
        sleep(3000);
        wait.until(ExpectedConditions.visibilityOf(getElement(driver,"xpath",VISOR_HOME)));
        Assert.assertTrue(existElementWaitVisible(driver, HomePath.VISOR_HOME));
        ExtentReportUtil.INSTANCE.stepPass(driver, "Se valida el ingreso a la pagina correctamente.");
        generateWord.sendText("Se valida el ingreso a la pagina correctamente.");
        generateWord.addImageToWord(driver);
    }

    public WebElement expandRootElement(WebElement element) {
        WebElement ele = (WebElement) ((JavascriptExecutor)driver)
                .executeScript("return arguments[0].shadowRoot", element);
        return ele;
    }

    public void clickBotonTelefono() throws Exception {
        WebElement root1 = getElement(driver,"tagname",BTN_TELEFONO_ROOT);
        WebElement shadowRoot1 = expandRootElement(root1);
        shadowRoot1.findElement(By.id("btn_TEL")).click();
        ExtentReportUtil.INSTANCE.stepPass(driver, "Click en el botón Telefono.");
        generateWord.sendText("Click en el botón Telefono.");
        generateWord.addImageToWord(driver);
    }

    public void escribirNroTelefono(String nroTelefono) throws Exception {
        wait.until(ExpectedConditions.visibilityOf(getElement(driver,"xpath",HomePath.TXT_NROTELEFONO)));
        getElement(driver,"xpath",HomePath.TXT_NROTELEFONO).sendKeys(nroTelefono);
        ExtentReportUtil.INSTANCE.stepPass(driver, "Escribe el numero de telefono para poder buscar.");
        generateWord.sendText("Escribe el numero de telefono para poder buscar.");
        generateWord.addImageToWord(driver);
    }

    public void clickBotonBuscar() throws Exception {
        wait.until(ExpectedConditions.visibilityOf(getElement(driver,"xpath",HomePath.BTN_BUSCAR)));
        getElement(driver,"xpath",HomePath.BTN_BUSCAR).click();
        ExtentReportUtil.INSTANCE.stepPass(driver, "Click en el botón Buscar.");
        generateWord.sendText("Click en el botón Buscar.");
        generateWord.addImageToWord(driver);
    }
}
