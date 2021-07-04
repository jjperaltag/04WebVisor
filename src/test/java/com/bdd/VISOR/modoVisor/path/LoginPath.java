package com.bdd.VISOR.modoVisor.path;

public class LoginPath {

    public static String TITULO_VISOR            = "//h1[contains(.,'¡Hola!')]";
    public static String BTN_INGRESAR           = "//div[@id='contenedor-botones']/div/span";
    public static String SELECT_TIPO_USUARIO    = "//div[@id='attributeList']/ul/li/div/select";
    public static String TIPO_USUARIO_EXTERNO   = "//option[@value='usuario_externo']";
    public static String TIPO_USUARIO_INTERNO   = "//option[@value='usuario_interno']";
    public static String TIPO_USUARIO = "procedencia_usuario";
    public static String USUARIO                = "signInName";
    public static String PASSWORD               = "password";
    public static String BTN_CONTINUAR          = "continue";


}
