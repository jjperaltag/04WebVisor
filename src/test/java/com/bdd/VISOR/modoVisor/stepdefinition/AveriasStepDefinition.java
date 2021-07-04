package com.bdd.VISOR.modoVisor.stepdefinition;

import com.bdd.VISOR.modoVisor.step.AveriasStep;
import com.bdd.VISOR.modoVisor.step.ConsultaStep;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static java.lang.Thread.sleep;

public class AveriasStepDefinition {

    AveriasStep averiasStep = new AveriasStep();

    @And("Seleccionamos la opcion herramientas y seleccionar el boton General")
    public void seleccionamosLaOpcionHerramientasyBotonGeneral() throws Exception {
        averiasStep.clickBotonHerramientas();
        averiasStep.clickBotonGeneral();
    }

    @And("Seleccionamos la opcion herramientas y seleccionar el boton Datos")
    public void seleccionamosLaOpcionHerramientasyBotonDatos() throws Exception {
        averiasStep.clickBotonHerramientas();
        averiasStep.clickBotonDatos();
    }

    @And("Seleccionamos la opcion Reset Total")
    public void seleccionamosLaOpcionResetTotal() throws Exception {
        averiasStep.clickBotonResetTotal();
    }

    @When("Confirmamos dando click en el boton Realizar Test")
    public void confirmamosDandoClickEnElBotonRealizarTest() throws Exception {
        averiasStep.clickBotonRealizarReset();
        //sleep(5000);
    }

    @Then("Se espera el mensaje con el test realizado")
    public void seEsperaElMensajeConElTestRealizado() throws Exception {
        averiasStep.validarMensajeTestRealizado();
        sleep(5000);
    }

    @Then("Se espera el mensaje \"([^\"]*)\" con el test realizado")
    public void seEsperaElMensajeConElTestRealizado(String mensaje) {
        averiasStep.validarMensajeUsuario(mensaje);
    }

    @When("Seleccionamos la opcion Reset de Datos")
    public void confirmamosDandoClickEnElBotonRealizarDatos() {
        averiasStep.clickBotonResetDeDatos();
    }

    @And("Seleccionamos la opcion herramientas y seleccionar el boton Voz")
    public void seleccionamosLaOpcionHerramientasYSeleccionarElBotonVoz() throws Exception {
        averiasStep.clickBotonHerramientas();
        averiasStep.clickBotonVoz();
    }

    @When("Seleccionamos la opcion Reset de voz")
    public void seleccionamosLaOpcionResetDeVoz() {
        averiasStep.clickBotonResetDeVoz();
    }
}
