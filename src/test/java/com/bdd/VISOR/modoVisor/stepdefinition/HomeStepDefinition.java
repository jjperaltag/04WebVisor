package com.bdd.VISOR.modoVisor.stepdefinition;

import com.bdd.VISOR.modoVisor.step.HomeStep;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import static java.lang.Thread.sleep;

public class HomeStepDefinition {

    HomeStep homeStep = new HomeStep();

    public HomeStepDefinition() {

    }

    /*------------------------------------------------------------------------------------------------------*/
    @Then("^Se visualiza el ingreso correcto de la pagina modo Visor$")
    public void se_visualiza_el_ingreso_correcto_de_la_pagina_modo_Visor() throws Throwable {
        sleep(1000);
        homeStep.validarIngresoPaginaVisor();
    }


    @And("Seleccionamos la opcion Telefono e ingresamos el numero \"([^\"]*)\"$")
    public void seleccionamosLaOpcionTelefonoEIngresamosElNumero(String nroTelefono) throws Exception {
        homeStep.clickBotonTelefono();
        homeStep.escribirNroTelefono(nroTelefono);
    }

    @And("Damos click en el boton Buscar")
    public void damosClicEnElBotonBuscar() throws Exception {
        homeStep.clickBotonBuscar();
    }
}
