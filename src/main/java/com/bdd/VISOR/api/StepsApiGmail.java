package com.bdd.VISOR.api;

import cucumber.api.java.en.And;

public class StepsApiGmail {

    GmailAPI gmailAPI;

    @And("^El cliente ingresa codigo$")
    public void cliente_inrgesa_comentario_valoracion() throws Throwable {
        gmailAPI.getBodyEmail();
        wait(5000);
    }
}
