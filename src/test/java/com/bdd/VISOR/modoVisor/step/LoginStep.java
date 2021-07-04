package com.bdd.VISOR.modoVisor.step;

import com.bdd.VISOR.BaseClass;
import com.bdd.VISOR.modoVisor.page.LoginPage;
import gherkin.lexer.Th;
import org.apache.poi.ss.formula.functions.T;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginStep extends LoginPage {

public static WebDriverWait wait;
    LoginPage loginPage = new LoginPage();

    public LoginStep() {
        wait = new WebDriverWait(driver,20);
    }

    public void accederPaginaVisor() throws Throwable {
        loginPage.accederPaginaVisor();
    }

    public void validarTituloVisor() throws Throwable {
        loginPage.validarTituloVisor();
    }
    public void clickIngresar() throws Throwable {
        loginPage.clickIngresar();
    }

    public void seleccionarTipoUsuario(String sTest) throws Exception {
        loginPage.seleccionarTipoUsuario(sTest);
    }

    public void ingresarUsuario(String usuario) throws Throwable {
        loginPage.ingresarUsuario(usuario);
    }

    public void ingresarPassword(String password) throws Throwable {
        loginPage.ingresarPassword(password);
    }

    public void clickContinuar() throws Throwable {
        loginPage.clickContinuar();
    }

}
