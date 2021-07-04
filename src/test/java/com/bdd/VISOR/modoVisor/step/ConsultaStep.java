package com.bdd.VISOR.modoVisor.step;

import com.bdd.VISOR.modoVisor.page.ConsultaPage;

public class ConsultaStep {

    ConsultaPage consultaPage = new ConsultaPage();

    public void clickBotonCerrar() throws Exception {
        consultaPage.clickBotonCerrar();
    }

    public void clickBotonAveria() throws Exception {
        consultaPage.clickBotonAveria();
    }
}
