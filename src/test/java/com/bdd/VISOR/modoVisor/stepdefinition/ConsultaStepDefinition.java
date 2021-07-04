package com.bdd.VISOR.modoVisor.stepdefinition;

import com.bdd.VISOR.modoVisor.step.ConsultaStep;
import cucumber.api.java.en.And;

public class ConsultaStepDefinition {

    ConsultaStep consultaStep = new ConsultaStep();

    @And("Cerramos el pupUp")
    public void cerramosElPupUp() throws Exception {
        consultaStep.clickBotonCerrar();
    }

    @And("Damos click en la opcion Averia")
    public void damosClickEnLaOpcionAveria() throws Exception {
        consultaStep.clickBotonAveria();
    }
}
