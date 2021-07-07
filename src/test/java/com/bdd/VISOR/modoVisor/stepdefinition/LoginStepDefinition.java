package com.bdd.VISOR.modoVisor.stepdefinition;

import com.bdd.VISOR.modoVisor.step.LoginStep;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import static com.bdd.VISOR.BaseClass.sleep;

public class LoginStepDefinition {

    LoginStep loginStep = new LoginStep();

    /*------------------------------------------------------------------------------------------------------*/
    @Given("^El usuario se encuentra en la pantalla de principal de visor$")
    public void el_usuario_se_encuentra_en_la_pantalla_de_principal_de_visor() throws Throwable {
        loginStep.accederPaginaVisor();
        loginStep.validarTituloVisor();
    }

    /*------------------------------------------------------------------------------------------------------*/
    @When("^El usuario da click en el boton ingresar de la pantalla principal de visor$")
    public void el_usuario_da_click_en_el_boton_ingresar_de_la_pantalla_principal_de_visor() throws Throwable {
        Thread.sleep(2000);
        loginStep.clickIngresar();
    }

    /*------------------------------------------------------------------------------------------------------*/
    @And("^Selecciona el tipo de usuario en la pantalla de login \"([^\"]*)\"$")
    public void selecciona_el_tipo_de_usuario_en_la_pantalla_de_login(String tipoUsuario) throws Throwable {
        loginStep.seleccionarTipoUsuario(tipoUsuario);
    }

    /*------------------------------------------------------------------------------------------------------*/
    @When("^Ingresa su usuario \"([^\"]*)\" y password \"([^\"]*)\" en la pantalla de login en el caso de prueba \"([^\"]*)\"$")
    public void ingresa_su_usuario_y_password_en_la_pantalla_de_login_en_el_caso_de_prueba(String sTest,String usuario, String password) throws Throwable {
        loginStep.ingresarUsuario(sTest);
        loginStep.ingresarPassword(sTest);
    }

    /*------------------------------------------------------------------------------------------------------*/
    @And("^Da click en el botón continuar$")
    public void da_clic_en_el_botón_continuar() throws Throwable {
        loginStep.clickContinuar();
    }
}
