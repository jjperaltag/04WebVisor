package com.bdd.VISOR.modoVisor.stepdefinition;

import com.bdd.VISOR.modoVisor.step.AveriasStep;
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
    }

    @Then("Se espera el mensaje con el test realizado")
    public void seEsperaElMensajeConElTestRealizado() throws Exception {
        averiasStep.validarMensajeTestRealizado();
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

    ////Gleidy

    @When("Seleccionamos la opcion Problemas con datos")
    public void seleccionamosOpcionProblemasDatos() throws Exception {
        averiasStep.clickBotonProblemasDatos();
    }

    @And("Cierra popUp de ultimos diagnosticos")
    public void cierraPopupUltimosDiagnosticos() throws Exception {
        averiasStep.clickCerrarPopupUltimosDiagnosticos();
    }

    @And("Se guarda la información del contacto")
    public void guardarInfoContacto() throws Exception {
        averiasStep.clickGuardarInfoContacto();
    }

    @And("Cierra la sesion")
    public void cerrarSesion() throws Exception {
        averiasStep.clickCerrarSesion();
    }

    @When("Seleccionamos la opcion Problemas con voz")
    public void seleccionamosOpcionProblemasVoz() throws Exception {
        averiasStep.clickBotonProblemasVoz();
    }

    @Then("Valida acciones en ultimo diagnostico \"([^\"]*)\"$")
    public void validaAccionesUltimoDiagnostico(String perfil) throws Exception {
        averiasStep.validaAccionesUltimoDiagnostico(perfil);
    }

    @Then("Valida que no este presente le boton SMS")
    public void validaNoestePresenteBtnSMS() throws Exception {
        averiasStep.validaNoestePresenteBtnSMS();
    }

    @Then("Validar cambios Step 3 en el \"([^\"]*)\" diagnosticos problemas de datos con el \"([^\"]*)\"$")
    public void validaCambiosStep3DiagnosticosProblemasDatos(String escenario, String perfil) throws Exception {
        averiasStep.validaCambiosStep3DiagnosticosProblemasDatos(escenario,perfil);
    }

    @And("Damos click al boton del \"([^\"]*)\" de voz a ejecutar")
    public void seleccionaFlujoVozaEjecutar(String flujo) throws Exception {
        averiasStep.seleccionaFlujoVozaEjecutar(flujo);
    }

    @And("Damos click al boton del flujo de datos a ejecutar")
    public void seleccionaFlujoDatosaEjecutar() throws Exception {
        averiasStep.seleccionaFlujoDatosaEjecutar();
    }

    @Then("Validar cambios Step 3 en el \"([^\"]*)\" diagnosticos problemas de voz con el \"([^\"]*)\"$")
    public void validaCambiosStep3DiagnosticosProblemasVoz(String escenario, String perfil) throws Exception {
        averiasStep.validaCambiosStep3DiagnosticosProblemasVoz(escenario,perfil);
    }
}
