package com.bdd.VISOR.modoVisor.step;

import com.bdd.VISOR.modoVisor.page.AveriasPage;
import org.testng.Assert;

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
}
