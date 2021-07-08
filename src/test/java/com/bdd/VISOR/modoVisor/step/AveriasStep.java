package com.bdd.VISOR.modoVisor.step;

import com.bdd.VISOR.modoVisor.page.AveriasPage;

public class AveriasStep {

    AveriasPage averiasPage = new AveriasPage();

    public void clickBotonHerramientas() throws Exception {
        averiasPage.clickBotonHerramientas();
    }

    public void clickBotonGeneral() throws Exception {
        averiasPage.clickBotonGeneral();
    }

    public void clickBotonDatos(){
        averiasPage.clickBotonDatos();
    }

    public void clickBotonVoz(){
        averiasPage.clickBotonVoz();
    }

    public void clickBotonResetDeDatos(){
        averiasPage.clickBotonResetDeDatos();
    }

    public void clickBotonResetDeVoz(){
        averiasPage.clickBotonResetDeVoz();
    }

    public void clickBotonResetTotal() throws Exception {
        averiasPage.clickBotonResetTotal();
    }

    public void clickBotonRealizarReset() throws Exception {
        averiasPage.clickRealizarReset();
    }

    public void validarMensajeTestRealizado() throws Exception {
        averiasPage.validarMensajeTest();
    }

    public void validarMensajeUsuario(String mensaje){
        if (averiasPage.validarMensajeUsuario(mensaje)==true){
            System.out.println("El mensaje mostrado en FE esta OK");
        } else {
            System.out.println("El mensaje esperado es: "+mensaje);
        }
    }

///Gleidy
    public void clickBotonProblemasDatos() throws Exception {
        averiasPage.clickBotonProblemasDatos();
    }

    public void clickCerrarPopupUltimosDiagnosticos() throws Exception {
        averiasPage.clickCerrarPopupUltimosDiagnosticos();
    }

    public void clickGuardarInfoContacto() throws Exception {
        averiasPage.clickGuardarInfoContacto();
    }

    public void clickCerrarSesion() throws Exception {
        averiasPage.clickCerrarSesion();
    }

    public void clickBotonProblemasVoz() throws Exception {
        averiasPage.clickBotonProblemasVoz();
    }

    public void validaAccionesUltimoDiagnostico(String perfil) throws Exception {
        averiasPage.validaAccionesUltimoDiagnostico(perfil);
    }

    public void validaNoestePresenteBtnSMS() throws Exception {
        averiasPage.validaNoestePresenteBtnSMS();
    }

    public void validaCambiosStep3DiagnosticosProblemasDatos(String escenario, String perfil) throws Exception {
        averiasPage.validaCambiosStep3DiagnosticosProblemasDatos(escenario,perfil);
    }
    public void validaCambiosStep3DiagnosticosProblemasVoz(String escenario, String perfil) throws Exception {
        averiasPage.validaCambiosStep3DiagnosticosProblemasVoz(escenario,perfil);
    }

    public void seleccionaFlujoDatosaEjecutar() throws Exception {
        averiasPage.seleccionaFlujoDatosaEjecutar();
    }

    public void seleccionaFlujoVozaEjecutar(String flujo) throws Exception {
        averiasPage.seleccionaFlujoVozaEjecutar(flujo);
    }

}
