package com.bdd.VISOR.modoVisor.page;

import com.bdd.VISOR.BaseClass;
import com.bdd.VISOR.Hook;
import com.bdd.VISOR.modoVisor.path.AveriasPath;
import com.bdd.VISOR.modoVisor.path.ConsultaPath;
import com.bdd.VISOR.modoVisor.path.HomePath;
import com.bdd.VISOR.utility.ExtentReportUtil;
import com.bdd.VISOR.utility.GenerateWord;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Objects;

import static com.bdd.VISOR.BaseClass.*;
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
        sleep(8000);
        wait.until(ExpectedConditions.visibilityOf(getElement(driver,"xpath",LBL_MENSAJE_USUARIO)));
        String mensajeUI = getElement(driver,"xpath",LBL_MENSAJE_USUARIO).getText();
        if (mensaje.equals(mensajeUI)){
            return true;
        } else {
            return false;
        }
    }

    ///Gleidy

    public void clickBotonProblemasDatos() throws Exception {
        getElement(driver,"xpath", AveriasPath.BTN_PROBLEMAS_CON_DATOS).click();
        ExtentReportUtil.INSTANCE.stepPass(driver, "Click en el botón Problemas con Datos");
        generateWord.sendText("Click en el botón Problemas con Datos");
        generateWord.addImageToWord(driver);
    }

    public void clickCerrarPopupUltimosDiagnosticos() throws Exception {
        getElement(driver,"xpath", BTN_CERRAR_POPUP_ULTIMOS_DIAGNOSTICOS).click();
        ExtentReportUtil.INSTANCE.stepPass(driver, "Click cerrar popup de últimos diagnósticos");
        generateWord.sendText("Click cerrar popup de últimos diagnósticos");
        generateWord.addImageToWord(driver);
    }

    public void clickGuardarInfoContacto() throws Exception {
        WebElement element = getElementoFromJavaScript(driver,ROOT_NOMBRES_CONTACTO, NOMBRES_CONTACTO);
        element.click();
        element.clear();
        element.sendKeys("Cliente Prueba");
        sleep(1000);
        element = getElementoFromJavaScript(driver,BTN_GUARDAR_INFO_CONTACTO_ROOT, BTN_GUARDAR_INFO_CONTACTO);
        element.click();
        ExtentReportUtil.INSTANCE.stepPass(driver, "Click botón guardar información del contacto");
        generateWord.sendText("Click botón guardar información del contacto");
        generateWord.addImageToWord(driver);
    }

    public void clickCerrarSesion() throws Exception {
        sleep(2000);
        getElement(driver,"xpath", HomePath.BTN_PERFIL).click();
        ExtentReportUtil.INSTANCE.stepPass(driver, "Click botón perfil de usuario");
        generateWord.sendText("Click botón perfil de usuario");
        generateWord.addImageToWord(driver);
        getElement(driver,"xpath", HomePath.BTN_CERRAR_SESION).click();
        ExtentReportUtil.INSTANCE.stepPass(driver, "Click botón Cerrar Sesión");
        generateWord.sendText("Click botón Cerrar Sesión");
        generateWord.addImageToWord(driver);
    }

    public void clickBotonProblemasVoz() throws Exception {
        getElement(driver,"xpath", BTN_PROBLEMAS_CON_VOZ).click();
        ExtentReportUtil.INSTANCE.stepPass(driver, "Click en el botón Problemas con Voz");
        generateWord.sendText("Click en el botón Problemas con Voz");
        generateWord.addImageToWord(driver);
    }

    public void validaAccionesUltimoDiagnostico(String perfil) throws Exception {
        String escenario="";
        String accion="";
        int r=1;
        WebElement table = driver.findElement(By.xpath(INFO_ULTIMOS_DIAGNOSTICOS));
        // Obtener todas las filas de la tabla
        List<WebElement> allRows = table.findElements(By.tagName("tdp-st-table-body-row"));
        for (WebElement row : allRows) {
            List<WebElement> cells = row.findElements(By.tagName("tdp-st-table-body-col"));
            sleep(1000);
            escenario=driver.findElement(By.xpath("//*[@id=\"contenedor\"]/tdp-st-table/div/div/tdp-st-table-body/tdp-st-table-body-row["+r+"]/tdp-st-table-body-col[4]")).getText();
            accion=driver.findElement(By.xpath("//*[@id=\"contenedor\"]/tdp-st-table/div/div/tdp-st-table-body/tdp-st-table-body-row["+r+"]/tdp-st-table-body-col[5]")).getText();
            validarAccionesXEscenariosUltimoDiagnostico(escenario,accion,perfil);
            r++;
        }
        ExtentReportUtil.INSTANCE.stepPass(driver, "Validar Acciones en últimos diagnósticos");
        generateWord.sendText("La acciones presentadas son correctas" );
        generateWord.addImageToWord(driver);
    }

    public void validarAccionesXEscenariosUltimoDiagnostico(String escenario, String accion, String perfil) throws Exception {
        switch (escenario){
            case "FCR no recuperó info de cliente":
                if (!accion.equals("Ir al árbol")){
                 generateWord.sendText("La acción "+ accion + "presentada para el escenario: "+ escenario + "es incorrecto" );
                 driver.close();
                }
                break;
            case "Línea suspendida":
                if (!accion.equals("")){
                    generateWord.sendText("La acción "+ accion + "presentada para el escenario: "+ escenario + "es incorrecto" );
                    driver.close();
                }
                break;
            case "Corte APC":
                if (!accion.equals("")){
                    generateWord.sendText("La acción "+ accion + "presentada para el escenario: "+ escenario + "es incorrecto" );
                    driver.close();
                }
                break;
            case "Corte por Robo":
                if (!accion.equals("")){
                    generateWord.sendText("La acción "+ accion + "presentada para el escenario: "+ escenario + "es incorrecto" );
                    driver.close();
                }
                break;
            case "Cliente con deuda":
                if (!accion.equals("")){
                    generateWord.sendText("La acción "+ accion + "presentada para el escenario: "+ escenario + "es incorrecto" );
                    driver.close();
                }
                break;
            case "Cliente lista negra":
                if (!accion.equals("")){
                    generateWord.sendText("La acción "+ accion + "presentada para el escenario: "+ escenario + "es incorrecto" );
                    driver.close();
                }
                break;
            case "Reconexión fallida":
                if (!accion.equals("Ir al árbol")){
                    generateWord.sendText("La acción "+ accion + "presentada para el escenario: "+ escenario + "es incorrecto" );
                    driver.close();
                }
                break;
            case "Reconexión exitosa":
                if (!accion.equals("")){
                    generateWord.sendText("La acción "+ accion + "presentada para el escenario: "+ escenario + "es incorrecto" );
                    driver.close();
                }
                break;
            case "Reconexión en proceso":
                if (!accion.equals("")){
                    generateWord.sendText("La acción "+ accion + "presentada para el escenario: "+ escenario + "es incorrecto" );
                    driver.close();
                }
                break;
            case "Problema en HLR/PCRF":
                if (!accion.equals("Ir al árbol")){
                    generateWord.sendText("La acción "+ accion + "presentada para el escenario: "+ escenario + "es incorrecto" );
                    driver.close();
                }
                break;
            case "Reset datos pendiente":
                if (!accion.equals("Ir al árbol")){
                    generateWord.sendText("La acción "+ accion + "presentada para el escenario: "+ escenario + "es incorrecto" );
                    driver.close();
                }
                break;
            case "Reset datos fallido":
                if (!accion.equals("Ir al árbol")){
                    generateWord.sendText("La acción "+ accion + "presentada para el escenario: "+ escenario + "es incorrecto" );
                    driver.close();
                }
                break;
            case "Problemas con bonos":
                if (!accion.equals("Validar")){
                    generateWord.sendText("La acción "+ accion + "presentada para el escenario: "+ escenario + "es incorrecto" );
                    driver.close();
                }
                break;
            case "Problemas Saldo y/o Recargas":
                if (!accion.equals("Validar")){
                    generateWord.sendText("La acción "+ accion + "presentada para el escenario: "+ escenario + "es incorrecto" );
                    driver.close();
                }
                break;
            case "Cliente sin saldo":
                if (!accion.equals("")){
                    generateWord.sendText("La acción "+ accion + "presentada para el escenario: "+ escenario + "es incorrecto" );
                    driver.close();
                }
                break;
            case "Error de recargas":
                if (!accion.equals("Validar")){
                    generateWord.sendText("La acción "+ accion + "presentada para el escenario: "+ escenario + "es incorrecto" );
                    driver.close();
                }
                break;
            case "Problemas con APN":
                if (!accion.equals("Ir al árbol")){
                    generateWord.sendText("La acción "+ accion + "presentada para el escenario: "+ escenario + "es incorrecto" );
                    driver.close();
                }
                break;
            case "APN regularizado":
                if (!accion.equals("Verificar")){
                    generateWord.sendText("La acción "+ accion + "presentada para el escenario: "+ escenario + "es incorrecto" );
                    driver.close();
                }
                break;
            case "Problema con modo red":
                if (!accion.equals("Ir al árbol")){
                    generateWord.sendText("La acción "+ accion + "presentada para el escenario: "+ escenario + "es incorrecto" );
                    driver.close();
                }
                break;
            case "Problemas con IMSI":
                if (!accion.equals("Ir al árbol")){
                    generateWord.sendText("La acción "+ accion + "presentada para el escenario: "+ escenario + "es incorrecto" );
                    driver.close();
                }
                break;
            case "IMSI regularizado":
                if (!accion.equals("Verificar")){
                    generateWord.sendText("La acción "+ accion + "presentada para el escenario: "+ escenario + "es incorrecto" );
                    driver.close();
                }
                break;
            case "Reset total fallido":
               if (perfil.equals("1ra Linea")) {
                   if (!accion.equals("Transferir")) {
                       generateWord.sendText("La acción " + accion + "presentada para el escenario: " + escenario + "es incorrecto");
                       driver.close();
                   }
               }
               else {
                   //2da Línea
                   if (!accion.equals("Realizar reset")) {
                       generateWord.sendText("La acción " + accion + "presentada para el escenario: " + escenario + "es incorrecto");
                       driver.close();
                   }
               }
                break;
            case "Reset total exitoso":
                if (!accion.equals("Verificar")){
                    generateWord.sendText("La acción "+ accion + "presentada para el escenario: "+ escenario + "es incorrecto" );
                    driver.close();
                }
                break;
            case "Problema componentes datos":
                if (!accion.equals("Ir al árbol")){
                    generateWord.sendText("La acción "+ accion + "presentada para el escenario: "+ escenario + "es incorrecto" );
                    driver.close();
                }
                break;
            case "Cliente sin datos":
                if (perfil.equals("1ra Linea")) {
                    if (!accion.equals("Transferir")) {
                        generateWord.sendText("La acción " + accion + "presentada para el escenario: " + escenario + "es incorrecto");
                        driver.close();
                    }
                }
                else {
                    //2da Línea
                    if (!accion.equals("Genera doit")) {
                        generateWord.sendText("La acción " + accion + "presentada para el escenario: " + escenario + "es incorrecto");
                        driver.close();
                    }
                }
                break;
            case "Caso registrado":
                if (!accion.equals("")){
                    generateWord.sendText("La acción "+ accion + "presentada para el escenario: "+ escenario + "es incorrecto" );
                    driver.close();
                }
                break;
            case "Componentes voz inactivos":
                if (perfil.equals("1ra Linea")) {
                    if (!accion.equals("Transferir")) {
                        generateWord.sendText("La acción " + accion + "presentada para el escenario: " + escenario + "es incorrecto");
                        driver.close();
                    }
                }
                else {
                    //2da Línea
                    if (!accion.equals("Genera doit")) {
                        generateWord.sendText("La acción " + accion + "presentada para el escenario: " + escenario + "es incorrecto");
                        driver.close();
                    }
                }
                break;
            case "Serv. Camel activado":
                if (!accion.equals("Verificar")){
                    generateWord.sendText("La acción "+ accion + "presentada para el escenario: "+ escenario + "es incorrecto" );
                    driver.close();
                }
                break;
            case "Serv. Camel inactivo":
                if (perfil.equals("1ra Linea")) {
                    if (!accion.equals("Transferir")) {
                        generateWord.sendText("La acción " + accion + "presentada para el escenario: " + escenario + "es incorrecto");
                        driver.close();
                    }
                }
                else {
                    //2da Línea
                    if (!accion.equals("Genera doit")) {
                        generateWord.sendText("La acción " + accion + "presentada para el escenario: " + escenario + "es incorrecto");
                        driver.close();
                    }
                }
                break;
            case "Corrección exitosa":
                if (!accion.equals("Verificar")){
                    generateWord.sendText("La acción "+ accion + "presentada para el escenario: "+ escenario + "es incorrecto" );
                    driver.close();
                }
                break;
            case "Corrección fallida":
                if (perfil.equals("1ra Linea")) {
                    if (!accion.equals("Transferir")) {
                        generateWord.sendText("La acción " + accion + "presentada para el escenario: " + escenario + "es incorrecto");
                        driver.close();
                    }
                }
                else {
                    //2da Línea
                    if (!accion.equals("Realizar reset total")) {
                        generateWord.sendText("La acción " + accion + "presentada para el escenario: " + escenario + "es incorrecto");
                        driver.close();
                    }
                }
                break;
            case "Desactivación exitosa":
                if (!accion.equals("Verificar")){
                    generateWord.sendText("La acción "+ accion + "presentada para el escenario: "+ escenario + "es incorrecto" );
                    driver.close();
                }
                break;
            case "Desactivación fallida":
                if (perfil.equals("1ra Linea")) {
                    if (!accion.equals("Transferir")) {
                        generateWord.sendText("La acción " + accion + "presentada para el escenario: " + escenario + "es incorrecto");
                        driver.close();
                    }
                }
                else {
                    //2da Línea
                    if (!accion.equals("Realizar reset total")) {
                        generateWord.sendText("La acción " + accion + "presentada para el escenario: " + escenario + "es incorrecto");
                        driver.close();
                    }
                }
                break;
            case "No Disponible":
                if (!accion.equals("")){
                    generateWord.sendText("La acción "+ accion + "presentada para el escenario: "+ escenario + "es incorrecto" );
                    driver.close();
                }
                break;
            default:
                generateWord.sendText("La acción "+ accion + "presentada para el escenario: "+ escenario + "no se ubicó en las opciones definidas" );
                System.out.println("Se fue por default >>>>  " +escenario);
                break;
        }

    }

    public void validaNoestePresenteBtnSMS() throws Exception {
        WebElement element = getElementoFromJavaScript(driver,ROOT_BTN_SMS, BTN_SMS);
        ExtentReportUtil.INSTANCE.stepPass(driver, "Validar que no se presente el botón SMS en la pantalla de diagnóstico de problemas de Voz");

        if(element.isDisplayed()){
            generateWord.sendText("Se visualiza el botón de SMS en la pantalla de Diagnóstico de problemas de voz");
            generateWord.addImageToWord(driver);
            driver.close();
        }
        else{
            generateWord.sendText("No se visualiza el botón de SMS en la pantalla de Diagnóstico de problemas de voz");
            generateWord.addImageToWord(driver);
            clickCerrarSesion();
        }
    }
    public void validaCambiosStep3DiagnosticosProblemasDatos(String escenario, String perfil) throws Exception {
        sleep(1000);
        getElement(driver,"xpath", BTN_NO_NAVEGA).click();
        generateWord.sendText("Click botón No Navega");
        generateWord.addImageToWord(driver);
        sleep(1000);
        WebElement element = getElementoFromJavaScript(driver,BTN_NO_STEP_2_MASIVAS_ROOT, BTN_NO_STEP_2_MASIVAS);
        element.click();
        generateWord.sendText("Click botón No en ¿Hay incidencias masivas?");
        generateWord.addImageToWord(driver);
        element = getElementoFromJavaScript(driver,BTN_NO_STEP_2_PREVIO_ROOT, BTN_NO_STEP_2_PREVIO);
        element.click();
        generateWord.sendText("Click botón No en ¿Tiene casos previos registrados?");
        generateWord.addImageToWord(driver);
        element = getElementoFromJavaScript(driver,BTN_NO_STEP_2_ESCENARIO_ROOT, BTN_NO_STEP_2_ESCENARIO);
        element.click();
        generateWord.sendText("Click botón No en ¿El cliente tiene alguno de los escenarios?");
        generateWord.addImageToWord(driver);
        wait.until(ExpectedConditions.invisibilityOf(driver.findElement(By.xpath(TIMER_CONSULTA_STEP_2))));

        ///Obtener valor del texto del botón de accion del escenario
        sleep(2000);
        String accion= driver.findElement(By.xpath(BTN_CAMBIO_STEP3)).getText();

        ///Validar los botones de acción según escenario y perfil
        validarBtnCambiosStep3DiagnosticosProblemasDatosVoz(escenario,accion,perfil);
        ///
        ExtentReportUtil.INSTANCE.stepPass(driver, "Validar cambios en el botón de acción del Step 3 diagnósticos de problemas con Datos");
        generateWord.sendText("El botón de acción presentado para el escenario:  "+ escenario +" es correcto" );
        generateWord.addImageToWord(driver);
    }

    public void validaCambiosStep3DiagnosticosProblemasVoz(String escenario, String perfil) throws Exception {
        sleep(1000);
        WebElement element = getElementoFromJavaScript(driver,BTN_NO_RECIBE_NI_LLAMA_ROOT, BTN_NO_RECIBE_NI_LLAMA);
        element.click();
        generateWord.sendText("Click botón Ni recibe ni llama");
        generateWord.addImageToWord(driver);
        sleep(1000);
        element = getElementoFromJavaScript(driver,BTN_NO_STEP_2_MASIVAS_ROOT, BTN_NO_STEP_2_MASIVAS);
        element.click();
        generateWord.sendText("Click botón No en ¿Hay incidencias masivas?");
        generateWord.addImageToWord(driver);
        element = getElementoFromJavaScript(driver,BTN_NO_STEP_2_PREVIO_ROOT, BTN_NO_STEP_2_PREVIO);
        element.click();
        generateWord.sendText("Click botón No en ¿Tiene casos previos registrados?");
        generateWord.addImageToWord(driver);
        element = getElementoFromJavaScript(driver,BTN_NO_STEP_2_ESCENARIO_ROOT, BTN_NO_STEP_2_ESCENARIO);
        element.click();
        generateWord.sendText("Click botón No en ¿El cliente tiene alguno de los escenarios?");
        generateWord.addImageToWord(driver);
        wait.until(ExpectedConditions.invisibilityOf(driver.findElement(By.xpath(TIMER_CONSULTA_STEP_2))));

        ///Obtener valor del texto del botón de accion del escenario
        sleep(2000);
        String accion= driver.findElement(By.xpath(BTN_CAMBIO_STEP3)).getText();

        ///Validar los botones de acción según escenario y perfil
        validarBtnCambiosStep3DiagnosticosProblemasDatosVoz(escenario,accion,perfil);
        ///
        ExtentReportUtil.INSTANCE.stepPass(driver, "Validar cambios en el botón de acción del Step 3 diagnósticos de problemas con Voz");
        generateWord.sendText("El botón de acción presentado para el escenario:  "+ escenario +" es correcto" );
        generateWord.addImageToWord(driver);
    }

    public void validarBtnCambiosStep3DiagnosticosProblemasDatosVoz(String escenario, String accion, String perfil) throws Exception {
        switch (escenario){
            case "FCR no recuperó info de cliente":
                if (!accion.equals("Ir a descartes manuales")){
                    generateWord.sendText("La acción "+ accion + "presentada para el escenario: "+ escenario + "es incorrecto" );
                    driver.close();
                }
                break;
            case "Línea suspendida":
                if (!accion.equals("Verificar en +Simple")){
                    generateWord.sendText("La acción "+ accion + "presentada para el escenario: "+ escenario + "es incorrecto" );
                    driver.close();
                }
                break;
            case "Corte APC":
                if (!accion.equals("Continuar")){
                    generateWord.sendText("La acción "+ accion + "presentada para el escenario: "+ escenario + "es incorrecto" );
                    driver.close();
                }
                break;
            case "Corte por Robo":
                if (!accion.equals("Continuar")){
                    generateWord.sendText("La acción "+ accion + "presentada para el escenario: "+ escenario + "es incorrecto" );
                    driver.close();
                }
                break;
            case "Cliente con deuda":
                if (!accion.equals("Continuar")){
                    generateWord.sendText("La acción "+ accion + "presentada para el escenario: "+ escenario + "es incorrecto" );
                    driver.close();
                }
                break;
            case "Cliente lista negra":
                if (!accion.equals("Continuar")){
                    generateWord.sendText("La acción "+ accion + "presentada para el escenario: "+ escenario + "es incorrecto" );
                    driver.close();
                }
                break;
            case "Reconexión fallida":
                if (!accion.equals("Ir a descartes manuales")){
                    generateWord.sendText("La acción "+ accion + "presentada para el escenario: "+ escenario + "es incorrecto" );
                    driver.close();
                }
                break;
            case "Reconexión exitosa":
                if (!accion.equals("Continuar")){
                    generateWord.sendText("La acción "+ accion + "presentada para el escenario: "+ escenario + "es incorrecto" );
                    driver.close();
                }
                break;
            case "Reconexión en proceso":
                if (!accion.equals("Continuar")){
                    generateWord.sendText("La acción "+ accion + "presentada para el escenario: "+ escenario + "es incorrecto" );
                    driver.close();
                }
                break;
            case "Problema en HLR/PCRF":
                if (!accion.equals("Ir a descartes manuales")){
                    generateWord.sendText("La acción "+ accion + "presentada para el escenario: "+ escenario + "es incorrecto" );
                    driver.close();
                }
                break;
            case "Reset datos pendiente":
                if (!accion.equals("Ir a descartes manuales")){
                    generateWord.sendText("La acción "+ accion + "presentada para el escenario: "+ escenario + "es incorrecto" );
                    driver.close();
                }
                break;
            case "Reset datos fallido":
                if (!accion.equals("Ir a descartes manuales")){
                    generateWord.sendText("La acción "+ accion + "presentada para el escenario: "+ escenario + "es incorrecto" );
                    driver.close();
                }
                break;
            case "Problemas con bonos":
                if (!accion.equals("Validar con acreditaciones")){
                    generateWord.sendText("La acción "+ accion + "presentada para el escenario: "+ escenario + "es incorrecto" );
                    driver.close();
                }
                break;
            case "Problemas Saldo y/o Recargas":
                if (!accion.equals("Validar con acreditaciones")){
                    generateWord.sendText("La acción "+ accion + "presentada para el escenario: "+ escenario + "es incorrecto" );
                    driver.close();
                }
                break;
            case "Cliente sin saldo":
                if (!accion.equals("Continuar")){
                    generateWord.sendText("La acción "+ accion + "presentada para el escenario: "+ escenario + "es incorrecto" );
                    driver.close();
                }
                break;
            case "Error de recargas":
                if (!accion.equals("Validar con acreditaciones")){
                    generateWord.sendText("La acción "+ accion + "presentada para el escenario: "+ escenario + "es incorrecto" );
                    driver.close();
                }
                break;
            case "Problemas con APN":
                if (!accion.equals("Ir a descartes manuales")){
                    generateWord.sendText("La acción "+ accion + "presentada para el escenario: "+ escenario + "es incorrecto" );
                    driver.close();
                }
                break;
            case "APN regularizado":///OJO creo que son 2 botones
                if (!accion.equals("Si se soluciono/ No se soluciono")){
                    generateWord.sendText("La acción "+ accion + "presentada para el escenario: "+ escenario + "es incorrecto" );
                    driver.close();
                }
                break;
            case "Problema con modo red":
                if (!accion.equals("Ir a descartes manuales")){
                    generateWord.sendText("La acción "+ accion + "presentada para el escenario: "+ escenario + "es incorrecto" );
                    driver.close();
                }
                break;
            case "Problemas con IMSI":
                if (!accion.equals("Ir a descartes manuales")){
                    generateWord.sendText("La acción "+ accion + "presentada para el escenario: "+ escenario + "es incorrecto" );
                    driver.close();
                }
                break;
            case "IMSI regularizado":///OJO creo que son 2 botones
                if (!accion.equals("Si se soluciono/ No se soluciono")){
                    generateWord.sendText("La acción "+ accion + "presentada para el escenario: "+ escenario + "es incorrecto" );
                    driver.close();
                }
                break;
            case "Reset total fallido":
                if (perfil.equals("1ra Linea")) {
                    if (!accion.equals("Transferir")) {
                        generateWord.sendText("La acción " + accion + "presentada para el escenario: " + escenario + "es incorrecto");
                        driver.close();
                    }
                }
                else {
                    //2da Línea
                    if (!accion.equals("Realizar reset")) {
                        generateWord.sendText("La acción " + accion + "presentada para el escenario: " + escenario + "es incorrecto");
                        driver.close();
                    }
                }
                break;
            case "Reset total exitoso":
                if (!accion.equals("Continuar")){
                    generateWord.sendText("La acción "+ accion + "presentada para el escenario: "+ escenario + "es incorrecto" );
                    driver.close();
                }
                break;
            case "Problema componentes datos":
                if (!accion.equals("Ir a descartes manuales")){
                    generateWord.sendText("La acción "+ accion + "presentada para el escenario: "+ escenario + "es incorrecto" );
                    driver.close();
                }
                break;
            case "Cliente sin datos":
                if (perfil.equals("1ra Linea")) {
                    if (!accion.equals("Transferir")) {
                        generateWord.sendText("La acción " + accion + "presentada para el escenario: " + escenario + "es incorrecto");
                        driver.close();
                    }
                }
                else {
                    //2da Línea
                    if (!accion.equals("Genera doit")) {
                        generateWord.sendText("La acción " + accion + "presentada para el escenario: " + escenario + "es incorrecto");
                        driver.close();
                    }
                }
                break;
            case "Caso registrado":
                if (!accion.equals("Continuar")){
                    generateWord.sendText("La acción "+ accion + "presentada para el escenario: "+ escenario + "es incorrecto" );
                    driver.close();
                }
                break;
            case "Componentes voz inactivos":
                if (perfil.equals("1ra Linea")) {
                    if (!accion.equals("Transferir")) {
                        generateWord.sendText("La acción " + accion + "presentada para el escenario: " + escenario + "es incorrecto");
                        driver.close();
                    }
                }
                else {
                    //2da Línea
                    if (!accion.equals("Genera doit")) {
                        generateWord.sendText("La acción " + accion + "presentada para el escenario: " + escenario + "es incorrecto");
                        driver.close();
                    }
                }
                break;
            case "Serv. Camel activado":
                if (!accion.equals("Continuar")){
                    generateWord.sendText("La acción "+ accion + "presentada para el escenario: "+ escenario + "es incorrecto" );
                    driver.close();
                }
                break;
            case "Serv. Camel inactivo":
                if (perfil.equals("1ra Linea")) {
                    if (!accion.equals("Transferir")) {//validar si es Transferir o Transfiere
                        generateWord.sendText("La acción " + accion + "presentada para el escenario: " + escenario + "es incorrecto");
                        driver.close();
                    }
                }
                else {
                    //2da Línea
                    if (!accion.equals("Genera doit")) {
                        generateWord.sendText("La acción " + accion + "presentada para el escenario: " + escenario + "es incorrecto");
                        driver.close();
                    }
                }
                break;
            case "Corrección exitosa":
                if (!accion.equals("Continuar")){
                    generateWord.sendText("La acción "+ accion + "presentada para el escenario: "+ escenario + "es incorrecto" );
                    driver.close();
                }
                break;
            case "Corrección fallida":
                if (perfil.equals("1ra Linea")) {
                    if (!accion.equals("Transferir")) {
                        generateWord.sendText("La acción " + accion + "presentada para el escenario: " + escenario + "es incorrecto");
                        driver.close();
                    }
                }
                else {
                    //2da Línea
                    if (!accion.equals("Realizar reset")) {
                        generateWord.sendText("La acción " + accion + "presentada para el escenario: " + escenario + "es incorrecto");
                        driver.close();
                    }
                }
                break;
            case "Desactivación exitosa":
                if (!accion.equals("Continuar")){
                    generateWord.sendText("La acción "+ accion + "presentada para el escenario: "+ escenario + "es incorrecto" );
                    driver.close();
                }
                break;
            case "Desactivación fallida":
                if (perfil.equals("1ra Linea")) {
                    if (!accion.equals("Transferir")) {//validar si es Transferir o Transfiere
                        generateWord.sendText("La acción " + accion + "presentada para el escenario: " + escenario + "es incorrecto");
                        driver.close();
                    }
                }
                else {
                    //2da Línea
                    if (!accion.equals("Realizar reset total")) {
                        generateWord.sendText("La acción " + accion + "presentada para el escenario: " + escenario + "es incorrecto");
                        driver.close();
                    }
                }
                break;
            case "No Disponible":
                if (!accion.equals("")){
                    generateWord.sendText("La acción "+ accion + "presentada para el escenario: "+ escenario + "es incorrecto" );
                    driver.close();
                }
                break;
            default:
                generateWord.sendText("La acción "+ accion + "presentada para el escenario: "+ escenario + "no se ubicó en las opciones definidas" );
                System.out.println("Se fue por default >>>>  " +escenario);
                break;
        }

    }
    
}
