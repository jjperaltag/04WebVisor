package com.bdd.VISOR.modoVisor.step;

import com.bdd.VISOR.modoVisor.page.HomePage;

public class HomeStep extends HomePage {

    HomePage homePage = new HomePage();

    public void validarIngresoPaginaVisor() throws Exception {
        homePage.validarIngresoPaginaVisor();
    }

    public void clickBotonTelefono() throws Exception {
        homePage.clickBotonTelefono();
    }

    public void escribirNroTelefono(String nroTelefono) throws Exception {
        homePage.escribirNroTelefono(nroTelefono);
    }

    public void clickBotonBuscar() throws Exception {
        homePage.clickBotonBuscar();
    }

}
