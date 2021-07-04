package com.bdd.VISOR.modoVisor.model;

public class LoginModel {
    public static String gePASSWORD() {
        return PASSWORD;
    }

    public static void setPASSWORD(String PASSWORD) {
        LoginModel.PASSWORD = PASSWORD;
    }

    public static String PASSWORD = "";

    public static String getUSUARIO() {
        return USUARIO;
    }

    public static void setUSUARIO(String USUARIO) {
        LoginModel.USUARIO = USUARIO;
    }

    public static String USUARIO = "";

    public static String getTipoUsuario() {
        return TIPO_USUARIO;
    }

    public static void setTipoUsuario(String tipoUsuario) {
        TIPO_USUARIO = tipoUsuario;
    }

    public static String TIPO_USUARIO = "";
}
