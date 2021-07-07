package com.bdd.VISOR;

import com.bdd.VISOR.exceptions.FrontEndException;
import com.bdd.VISOR.utility.ExcelReader;
import com.bdd.VISOR.utility.ExtentReportUtil;
import com.bdd.VISOR.utility.GenerateWord;
import com.bdd.VISOR.utility.Sleeper;
//import com.sun.istack.internal.NotNull;

import java.awt.image.BufferedImage;
import java.awt.image.DataBuffer;
import java.io.File;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import javax.imageio.ImageIO;
import java.util.*;

public class BaseClass {

    private static final String EXCEL_WEB = "excel/DATA_VISOR_MOVISTAR.xlsx";
    private static final String EXCEL_SHEET = "Login";

    public static List<HashMap<String, String>> getData() throws Throwable {
        return ExcelReader.data(EXCEL_WEB, EXCEL_SHEET);
    }

    static GenerateWord generateWord = new GenerateWord();

    private static final long MAX_WAIT_TIME_SECONDS = 90;
    private static final long NEXT_TRY_TIME_MILISECONDS = 200;

    private String documentQuerySelector = "return document.querySelector(";

    /********************************************* SECTION WEBELEMENT ****************************************/

    public static void tiempoDeEsperaLocatorVisible(WebDriver driver, String locator){
        WebDriverWait wait = new WebDriverWait(driver, 60);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(locator)));
    }
    public static boolean compararTexto(WebDriver driver, String locator, String mensajeTitulo, String mensajePersonalisado,Boolean continueTest) throws Throwable{
        try {
            Boolean isPresent = driver.findElements(By.xpath(locator)).size() > 0;
            if (isPresent.equals(true)){
                String TituloPantalla = driver.findElement(By.xpath(locator)).getText();
                if (TituloPantalla.contains(mensajeTitulo)){
                    generateWord.sendText(mensajePersonalisado);
                    generateWord.addImageToWord(driver);
                }//else {
                // generateWord.sendText("No se encontro: "+mensajePersonalisado);
                //generateWord.addImageToWord(driver);
                //driver.close();
                //}
            }else   {
                String msgContinuesTest = "";
                if(continueTest){msgContinuesTest = " .....Se continua con el Test";}
            }
        }catch (Exception t){
            generateWord.sendText("No se encontró el elemento");
            generateWord.addImageToWord(driver);
            driver.close();
            throw t;
        }
        return false;
    }

    public static boolean compararImagen(File fileA, File fileB) {
        try {
            // take buffer data from botm image files //
            BufferedImage biA = ImageIO.read(fileA);
            DataBuffer dbA = biA.getData().getDataBuffer();
            int sizeA = dbA.getSize();
            BufferedImage biB = ImageIO.read(fileB);
            DataBuffer dbB = biB.getData().getDataBuffer();
            int sizeB = dbB.getSize();
            // compare data-buffer objects //
            if(sizeA == sizeB) {
                for(int i=0; i<sizeA; i++) {
                    if(dbA.getElem(i) != dbB.getElem(i)) {
                        return false;
                    }
                }
                return true;
            }
            else {
                return false;
            }
        }
        catch (Exception e) {
            System.out.println("Failed to compare image files ...");
            return  false;
        }
    }

    public static WebElement getElement(WebDriver driver, String key, String locator) {
        try{
            WebElement webElement;
            switch (key.toLowerCase()) {
                case "id":
                    webElement = driver.findElement(By.id(locator));
                    break;
                case "name":
                    webElement = driver.findElement(By.name(locator));
                    break;
                case "css":
                    webElement = driver.findElement(By.cssSelector(locator));
                    break;
                case "linktext":
                    webElement = driver.findElement(By.linkText(locator));
                    break;
                case "xpath":
                    webElement = driver.findElement(By.xpath(locator));
                    break;
                case "tagname":
                    webElement = driver.findElement(By.tagName(locator));
                    break;
                default:
                    webElement = null;
            }

//            if (webElement == null) {
//                logger(BaseClass.class).log(Level.INFO, "Elemento no encontrado. Key: {0} - Locator: {1}", new String[]{key,locator});
//                Assert.fail("No se pudo obtener el elemento indicado. Key: " + key + " - Locator: " + locator);
//            } else {
//                logger(BaseClass.class).log(Level.INFO, "Elemento encontrado. Key: {0} - Locator: {1}", new String[]{key,locator});
//            }

            return webElement;

        }catch (Exception e){
            Assert.fail("Error al intentar obtener elemento. Key: " + key + " - Locator: " + locator);
            return null;
        }
    }

    public static List<WebElement> getElements(WebDriver driver, String key, String locator) {
        List<WebElement> webElement = null;
        switch (key.toLowerCase()) {
            case "id":
                webElement = driver.findElements(By.id(locator));
                break;
            case "name":
                webElement = driver.findElements(By.name(locator));
                break;
            case "css":
                webElement = driver.findElements(By.cssSelector(locator));
                break;
            case "linktext":
                webElement = driver.findElements(By.linkText(locator));
                break;
            case "xpath":
                webElement = driver.findElements(By.xpath(locator));
                break;
        }

//        if (webElement == null) {
//            logger(BaseClass.class).log(Level.INFO, "Elemento no encontrado");
//        } else {
//            logger(BaseClass.class).log(Level.INFO, "Elemento encontrado");
//        }

        return webElement;
    }

    public WebElement getElemento(WebDriver driver, String pathCss) {
        JavascriptExecutor ex = (JavascriptExecutor)driver;
        String query = this.documentQuerySelector + "\"" + pathCss + "\")";
        WebElement element = (WebElement)ex.executeScript(query, new Object[0]);
//        if (element == null) {
//            logger(BaseClass.class).log(Level.INFO, "Elemento no encontrado");
//        } else {
//            logger(BaseClass.class).log(Level.INFO, "Elemento encontrado");
//        }

        return element;
    }

    public List<WebElement> getElementos(WebDriver driver,String pathCss) {
        JavascriptExecutor ex = (JavascriptExecutor)driver;
        String query = "return document.querySelectorAll(\"" + pathCss + "\")";
        return (List)ex.executeScript(query, new Object[0]);
    }

    /*********************************************************************************************************/

    /********************************************* SECTION VOID **********************************************/
    
    // actions
    public static void selectByVisibleText(WebDriver driver, String locator, String value) throws Throwable {
        String found = value;
        Select select = new Select(driver.findElement(By.id(locator)));
        List<WebElement> options = select.getOptions();
        if (CollectionUtils.isNotEmpty(options)) {
            for (WebElement option : options) {
                if (StringUtils.equalsIgnoreCase(option.getText(), locator)) {
                    found = option.getText();
                    break;
                }
            }
        }

        if (found == null) {
            handleError(driver, "", "No se encontro el elemento : " + locator);
            generateWord.sendText("No se encontró el elemento : " + locator);
            generateWord.addImageToWord(driver);
        }
        select.selectByVisibleText(found);
    }

    public static void clicWaitVisibleElement (WebDriver driver, String locator) {
        if (!driver.findElements(By.xpath(locator)).isEmpty()) {
            WebDriverWait wait = new WebDriverWait(driver, 60);
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(locator)));
            driver.findElement(By.xpath(locator)).click();
        }
    }

    public static void clickUntilNotExists(WebDriver driver, String locator) {
        while (!driver.findElements(By.xpath(locator)).isEmpty()) {
            WebDriverWait wait = new WebDriverWait(driver, 60);
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(locator)));
            driver.findElement(By.xpath(locator)).click();
        }
    }

    public static void writeHowHuman(WebDriver driver, String locator, String text) {
        Random r = new Random();
        WebElement webElement = driver.findElement(By.id(locator));
        for (int i = 0; i < text.length(); i++) {
            try {
                Thread.sleep((int) (r.nextGaussian() * 12 + 110));
            } catch (InterruptedException ignored) { }
            String s = new StringBuilder().append(text.charAt(i)).toString();
            webElement.sendKeys(s);
        }
    }

    public static void click(WebDriver driver, String key, String locator) throws Throwable {
        try {

            switch (key.toLowerCase()) {

                case "id":
                    new WebDriverWait(driver, 40, 80).until(ExpectedConditions.presenceOfElementLocated(By.id(locator))).click();
                    break;

                case "name":
                    new WebDriverWait(driver, 40, 80).until(ExpectedConditions.presenceOfElementLocated(By.name(locator))).click();
                    break;

                case "css":
                    new WebDriverWait(driver, 40, 80).until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(locator))).click();
                    break;

                case "linktext":
                    new WebDriverWait(driver, 40, 80).until(ExpectedConditions.presenceOfElementLocated(By.linkText(locator))).click();
                    break;

                case "xpath":
                    new WebDriverWait(driver, 40, 80).until(ExpectedConditions.presenceOfElementLocated(By.xpath(locator))).click();
                    break;
            }

        } catch (Throwable t) {

            generateWord.sendText("Error : No se encontró el elemento : " + locator);

            generateWord.addImageToWord(driver);

            handleError(driver, "", "No se encontro el elemento : " + locator);

            driver.close();

            throw t;
        }
    }

    public static void selectByValue(WebDriver driver, String key, String locator, String value) throws Throwable {
        Select select = null;
        try {
            switch (key.toLowerCase()) {
                case "id":
                    select = new Select(driver.findElement(By.id(locator)));
                    break;
                case "name":
                    select = new Select(driver.findElement(By.name(locator)));
                    break;
                case "css":
                    select = new Select(driver.findElement(By.cssSelector(locator)));
                    break;
                case "linktext":
                    select = new Select(driver.findElement(By.linkText(locator)));
                    break;
                case "xpath":
                    select = new Select(driver.findElement(By.xpath(locator)));
                    break;
                default:
                    select = null;
            }
        } catch (Exception e) {
            stepWarning(driver, "No encontró el elemento " + locator);
        }
        select.selectByValue(value);
    }

    public static void scrollBar(WebDriver driver, int size) {
        JavascriptExecutor ev = (JavascriptExecutor) driver;
        ev.executeScript("window.scrollBy(0, " + size + ")");
    }

    public static void scrollBarElement(WebDriver driver, String idElement, int size) {
        JavascriptExecutor ev = (JavascriptExecutor) driver;
        System.out.println("document.getElementById('" + idElement + "').scrollBy(0, " + size + ")");
        ev.executeScript("document.getElementById('" + idElement + "').scrollBy(0, " + size + ")");
    }

    public static void sendTextJS(WebDriver driver, String elementId, String msg) {
        JavascriptExecutor ev = (JavascriptExecutor) driver;
        ev.executeScript("document.getElementById('" + elementId + "').setAttribute('value', '" + msg + "');");
    }

    // waits
    public static void waitElementPresenceOfElementLocated(WebDriver driver, String key, String locator){
        try {
            switch (key.toLowerCase()) {
                case "id":
                    new WebDriverWait(driver, 40, 80).until(ExpectedConditions.presenceOfElementLocated(By.id(locator)));
                    break;
                case "name":
                    new WebDriverWait(driver, 40, 80).until(ExpectedConditions.presenceOfElementLocated(By.name(locator)));
                    break;
                case "css":
                    new WebDriverWait(driver, 40, 80).until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(locator)));
                    break;
                case "linktext":
                    new WebDriverWait(driver, 40, 80).until(ExpectedConditions.presenceOfElementLocated(By.linkText(locator)));
                    break;
                case "xpath":
                    new WebDriverWait(driver, 40, 80).until(ExpectedConditions.presenceOfElementLocated(By.xpath(locator)));
                    break;
            }
        } catch (Exception e) {
            Assert.fail("No se pudo obtener el elemento indicado. Key: " + key + " - Locator: " + locator);
        }
    }

    public static void waitElementVisible(WebDriver driver, String key, String locator){
        if ((driver == null) || (locator == null) || locator.isEmpty()) {
            Assert.fail("[Error : Mal uso del metodo waitForElementNotVisible()]");
        }
        try {
            switch (key.toLowerCase()) {
                case "id":
                    new WebDriverWait(driver, MAX_WAIT_TIME_SECONDS, NEXT_TRY_TIME_MILISECONDS).until(ExpectedConditions.visibilityOfElementLocated(By.id(locator)));
                    break;
                case "name":
                    new WebDriverWait(driver, MAX_WAIT_TIME_SECONDS, NEXT_TRY_TIME_MILISECONDS).until(ExpectedConditions.visibilityOfElementLocated(By.name(locator)));
                    break;
                case "css":
                    new WebDriverWait(driver, MAX_WAIT_TIME_SECONDS, NEXT_TRY_TIME_MILISECONDS).until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(locator)));
                    break;
                case "linktext":
                    new WebDriverWait(driver, MAX_WAIT_TIME_SECONDS, NEXT_TRY_TIME_MILISECONDS).until(ExpectedConditions.visibilityOfElementLocated(By.linkText(locator)));
                    break;
                case "xpath":
                    new WebDriverWait(driver, MAX_WAIT_TIME_SECONDS, NEXT_TRY_TIME_MILISECONDS).until(ExpectedConditions.visibilityOfElementLocated(By.xpath(locator)));
                    break;
            }
        } catch (Exception e) {
            Assert.fail("No se pudo obtener el elemento indicado. Key: " + key + " - Locator: " + locator);
        }
    }

    public static void waitElementInvisible(WebDriver driver, String key, String locator){
        if ((driver == null) || (locator == null) || locator.isEmpty()) {
            Assert.fail("[Error : Mal uso del metodo waitForElementNotVisible()]");
        }
        try {
            switch (key.toLowerCase()) {
                case "id":
                    new WebDriverWait(driver, MAX_WAIT_TIME_SECONDS, NEXT_TRY_TIME_MILISECONDS).until(ExpectedConditions.invisibilityOfElementLocated(By.id(locator)));
                    break;
                case "name":
                    new WebDriverWait(driver, MAX_WAIT_TIME_SECONDS, NEXT_TRY_TIME_MILISECONDS).until(ExpectedConditions.invisibilityOfElementLocated(By.name(locator)));
                    break;
                case "css":
                    new WebDriverWait(driver, MAX_WAIT_TIME_SECONDS, NEXT_TRY_TIME_MILISECONDS).until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector(locator)));
                    break;
                case "linktext":
                    new WebDriverWait(driver, MAX_WAIT_TIME_SECONDS, NEXT_TRY_TIME_MILISECONDS).until(ExpectedConditions.invisibilityOfElementLocated(By.linkText(locator)));
                    break;
                case "xpath":
                    new WebDriverWait(driver, MAX_WAIT_TIME_SECONDS, NEXT_TRY_TIME_MILISECONDS).until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(locator)));
                    break;
            }
        } catch (Exception e) {
            Assert.fail("No se pudo obtener el elemento indicado. Key: " + key + " - Locator: " + locator);
        }
    }

    public static void sleep(int milisegundos) {
        Sleeper.Sleep(milisegundos);
    }

    public static void wait(int milliSeconds) {
        try {
            Thread.sleep(milliSeconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void pause(int minutes) {
        try {
            int tiempoEspera = minutes * 60 * 1000;
            Thread.sleep(tiempoEspera);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    // steps
    public static void stepPass(WebDriver driver, String descripcion) throws Throwable {
        try {
            ExtentReportUtil.INSTANCE.stepPass(driver, descripcion);
        } catch (Throwable t) {
            System.out.println(t.getStackTrace());
            throw t;
        }
    }

    public static void stepWarning(WebDriver driver, String descripcion) throws Throwable {
        try {
            ExtentReportUtil.INSTANCE.stepWarning(driver, descripcion);
        } catch (Throwable t) {
            System.out.println(t.getStackTrace());
            throw t;
        }
    }

    public static void stepFailNoShoot(String descripcion) throws Throwable {
        try {
            ExtentReportUtil.INSTANCE.stepFailNoShoot(descripcion);
        } catch (Throwable t) {
            System.out.println(Arrays.toString(t.getStackTrace()));
            throw t;
        }
    }

    public static void stepWarningNoShoot(String descripcion) throws Throwable {
        try {
            //ExtentReportUtil.INSTANCE.stepWarningNoShoot(descripcion);
        } catch (Throwable t) {
            System.out.println(t.getStackTrace());
            throw t;
        }
    }

    public static void stepFailNoShoot2(String descripcion) throws Throwable {
        try {
            ExtentReportUtil.INSTANCE.stepFailNoShoot(descripcion);
        } catch (Throwable t) {
            System.out.println(t.getStackTrace());
            throw t;
        }
    }

    public static void stepFail(WebDriver driver, String descripcion) throws Throwable {
        try {
            ExtentReportUtil.INSTANCE.stepFail(driver, descripcion);
        } catch (Throwable t) {
            System.out.println(t.getStackTrace());
            throw t;
        }
    }

    public static void stepError(WebDriver driver, String descripcion) throws Throwable {
        try {
            ExtentReportUtil.INSTANCE.stepError(driver, descripcion);
        } catch (Throwable t) {
            System.out.println(t.getStackTrace());
            throw t;
        }
    }

    public static void stepInfo(WebDriver driver, String descripcion) throws Throwable {
        try {
            ExtentReportUtil.INSTANCE.stepInfo(driver, descripcion);
        } catch (Throwable t) {
            System.out.println(t.getStackTrace());
            throw t;
        }
    }

//    public static void stepInfo(String descripcion) throws Throwable {
//        try {
//            ExtentReportUtil.INSTANCE.stepInfo(descripcion);
//        } catch (Throwable t) {
//            System.out.println(t.getStackTrace());
//            throw t;
//        }
//    }

    // exception
    public static void exceptionErrorNotExpected(WebDriver driver, String locator, String mensaje) {
        if (!driver.findElements(By.xpath(locator)).isEmpty()) {
            WebDriverWait wait = new WebDriverWait(driver, 60);
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(locator)));
            wait(2000);
            System.out.println("Errores que se repiten en varios CP - Close");
            mensajeImprimirWord(driver, mensaje);
            driver.close();
        }
    }

//    public static void exceptionErrorJustOnce(WebDriver driver, String locator, String equals) throws Throwable {
//        if (!driver.findElements(By.xpath(locator)).isEmpty()) {
//            System.out.println("objeto si existe en la pantalla");
//            WebDriverWait wait = new WebDriverWait(driver, 60);
//            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(locator)));
//            if (getCadElement(driver, "xpath", locator).contains(equals)) {
//                System.out.println("Errores que solo suceden en este CP - Close");
//                mensajeImprimirWord(driver, "Los servicios no estan cargando correctamente");
//                driver.close();
//            }
//        }
//    }


    /*********************************************************************************************************/

    /********************************************* SECTION BOOLEAN *******************************************/

    public static Boolean isEnabled(WebDriver driver, String key, String locator) {
        WebElement element = getElement(driver,key,locator);
        return element != null && element.isEnabled();
    }

    public static Boolean isDisplayed(WebDriver driver, String key, String locator) {
        WebElement element = getElement(driver,key,locator);
        return element != null && element.isDisplayed();
    }

    public static Boolean isSelected(WebDriver driver, String key, String locator) {
        WebElement element = getElement(driver,key,locator);
        return element != null && element.isSelected();
    }

    public static Boolean compareText(WebDriver driver, String key, String locator, String text) {
        WebElement element = getElement(driver,key,locator);
        if (element != null) {
            String textElement = StringUtils.stripAccents(element.getText());
            return textElement.equalsIgnoreCase(text);
        } else {
            return false;
        }
    }

    public static Boolean existElementWaitVisible (WebDriver driver, String locator) {
        if (!driver.findElements(By.xpath(locator)).isEmpty()) {
            WebDriverWait wait = new WebDriverWait(driver, 60);
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(locator)));
            return true;
        } else {
            return false;
        }
    }

    /*********************************************************************************************************/

    public static void mensajeImprimirWord(WebDriver driver, String mensajePersonalisado) {
        try {
            generateWord.sendText(mensajePersonalisado);
            generateWord.addImageToWord(driver);
        } catch (Exception t) {
            generateWord.sendText("Error al imprimir en el word");
            generateWord.addImageToWord(driver);
            driver.close();
            throw t;
        }
    }

    public static Exception handleError(WebDriver driver, String codigo, String msg) throws Throwable {
        stepWarning(driver, msg);
        System.out.println(msg);
        return new FrontEndException(StringUtils.trimToEmpty(codigo), msg);
    }

//    public static Logger logger(@NotNull Class clase) {
//        return Logger.getLogger(clase.getName());
//    }


    private static String shadowRootQuerySelector(String elementBase, String pathCss) {
        return "return document.querySelector(" + "\"" + elementBase + "\").shadowRoot.querySelector(\"" + pathCss + "\")";
    }

    public static WebElement getElementoFromJavaScript(WebDriver driver, String appBase, String pathCss) {
        JavascriptExecutor ex = (JavascriptExecutor)driver;
        String query = shadowRootQuerySelector(appBase, pathCss);
        WebElement element = (WebElement)ex.executeScript(query, new Object[0]);
        if (element == null) {
            System.out.println("No se ubico elemento.");

        } else {
            System.out.println("Se ubico elemento.");
        }
        return element;
    }
}