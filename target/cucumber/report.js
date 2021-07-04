$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("visor/diagnosticoReset.feature");
formatter.feature({
  "line": 2,
  "name": "Como usuario deseo ingresar a la pagina principal de Visor",
  "description": "Para poder ingresar mi usuario y contraseña y acceder a la pagina modo Visor\r\nCuando solicito diagnostico de reset y validar el reset",
  "id": "como-usuario-deseo-ingresar-a-la-pagina-principal-de-visor",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@DiagnosticoReset"
    }
  ]
});
formatter.scenarioOutline({
  "line": 7,
  "name": "Ingreso exitoso a la pagina Visor y realizo diagnostico reset total numero activo",
  "description": "",
  "id": "como-usuario-deseo-ingresar-a-la-pagina-principal-de-visor;ingreso-exitoso-a-la-pagina-visor-y-realizo-diagnostico-reset-total-numero-activo",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 6,
      "name": "@ResetTotalNumeroActivo"
    },
    {
      "line": 6,
      "name": "@VISO-3236"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "El usuario se encuentra en la pantalla de principal de visor",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "El usuario da click en el boton ingresar de la pantalla principal de visor",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "Selecciona el tipo de usuario en la pantalla de login \"\u003ctipoUsuario\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "Ingresa su usuario \"\u003cusuario\u003e\" y password \"\u003cpassword\u003e\" en la pantalla de login en el caso de prueba \"\u003csTest\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "Da click en el botón continuar",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "Se visualiza el ingreso correcto de la pagina modo Visor",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "Seleccionamos la opcion Telefono e ingresamos el numero \"\u003cnroTelefono\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "Damos click en el boton Buscar",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "Cerramos el pupUp",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "Damos click en la opcion Averia",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "Seleccionamos la opcion herramientas y seleccionar el boton General",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "Seleccionamos la opcion Reset Total",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "Confirmamos dando click en el boton Realizar Test",
  "keyword": "When "
});
formatter.step({
  "line": 21,
  "name": "Se espera el mensaje con el test realizado",
  "keyword": "Then "
});
formatter.examples({
  "line": 23,
  "name": "",
  "description": "",
  "id": "como-usuario-deseo-ingresar-a-la-pagina-principal-de-visor;ingreso-exitoso-a-la-pagina-visor-y-realizo-diagnostico-reset-total-numero-activo;",
  "rows": [
    {
      "cells": [
        "sTest",
        "tipoUsuario",
        "usuario",
        "password",
        "nroTelefono"
      ],
      "line": 24,
      "id": "como-usuario-deseo-ingresar-a-la-pagina-principal-de-visor;ingreso-exitoso-a-la-pagina-visor-y-realizo-diagnostico-reset-total-numero-activo;;1"
    },
    {
      "cells": [
        "1",
        "usuario externo",
        "rdelatorreg",
        "$t3l3f0n1c4$",
        "920951000"
      ],
      "line": 25,
      "id": "como-usuario-deseo-ingresar-a-la-pagina-principal-de-visor;ingreso-exitoso-a-la-pagina-visor-y-realizo-diagnostico-reset-total-numero-activo;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 1880286400,
  "status": "passed"
});
formatter.before({
  "duration": 89500300,
  "status": "passed"
});
formatter.scenario({
  "line": 25,
  "name": "Ingreso exitoso a la pagina Visor y realizo diagnostico reset total numero activo",
  "description": "",
  "id": "como-usuario-deseo-ingresar-a-la-pagina-principal-de-visor;ingreso-exitoso-a-la-pagina-visor-y-realizo-diagnostico-reset-total-numero-activo;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@DiagnosticoReset"
    },
    {
      "line": 6,
      "name": "@VISO-3236"
    },
    {
      "line": 6,
      "name": "@ResetTotalNumeroActivo"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "El usuario se encuentra en la pantalla de principal de visor",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "El usuario da click en el boton ingresar de la pantalla principal de visor",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "Selecciona el tipo de usuario en la pantalla de login \"usuario externo\"",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "Ingresa su usuario \"rdelatorreg\" y password \"$t3l3f0n1c4$\" en la pantalla de login en el caso de prueba \"1\"",
  "matchedColumns": [
    0,
    2,
    3
  ],
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "Da click en el botón continuar",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "Se visualiza el ingreso correcto de la pagina modo Visor",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "Seleccionamos la opcion Telefono e ingresamos el numero \"920951000\"",
  "matchedColumns": [
    4
  ],
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "Damos click en el boton Buscar",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "Cerramos el pupUp",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "Damos click en la opcion Averia",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "Seleccionamos la opcion herramientas y seleccionar el boton General",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "Seleccionamos la opcion Reset Total",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "Confirmamos dando click en el boton Realizar Test",
  "keyword": "When "
});
formatter.step({
  "line": 21,
  "name": "Se espera el mensaje con el test realizado",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDefinition.el_usuario_se_encuentra_en_la_pantalla_de_principal_de_visor()"
});
formatter.result({
  "duration": 3190665300,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.el_usuario_da_click_en_el_boton_ingresar_de_la_pantalla_principal_de_visor()"
});
formatter.result({
  "duration": 2231138600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "usuario externo",
      "offset": 55
    }
  ],
  "location": "LoginStepDefinition.selecciona_el_tipo_de_usuario_en_la_pantalla_de_login(String)"
});
formatter.result({
  "duration": 2944705200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "rdelatorreg",
      "offset": 20
    },
    {
      "val": "$t3l3f0n1c4$",
      "offset": 45
    },
    {
      "val": "1",
      "offset": 105
    }
  ],
  "location": "LoginStepDefinition.ingresa_su_usuario_y_password_en_la_pantalla_de_login_en_el_caso_de_prueba(String,String,String)"
});
formatter.result({
  "duration": 414414900,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.da_clic_en_el_botón_continuar()"
});
formatter.result({
  "duration": 483536100,
  "status": "passed"
});
formatter.match({
  "location": "HomeStepDefinition.se_visualiza_el_ingreso_correcto_de_la_pagina_modo_Visor()"
});
formatter.result({
  "duration": 7424317000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "920951000",
      "offset": 57
    }
  ],
  "location": "HomeStepDefinition.seleccionamosLaOpcionTelefonoEIngresamosElNumero(String)"
});
formatter.result({
  "duration": 747948200,
  "status": "passed"
});
formatter.match({
  "location": "HomeStepDefinition.damosClicEnElBotonBuscar()"
});
formatter.result({
  "duration": 335636900,
  "status": "passed"
});
formatter.match({
  "location": "ConsultaStepDefinition.cerramosElPupUp()"
});
formatter.result({
  "duration": 7695250400,
  "status": "passed"
});
formatter.match({
  "location": "ConsultaStepDefinition.damosClickEnLaOpcionAveria()"
});
formatter.result({
  "duration": 808328000,
  "status": "passed"
});
formatter.match({
  "location": "AveriasStepDefinition.seleccionamosLaOpcionHerramientasyBotonGeneral()"
});
formatter.result({
  "duration": 618745400,
  "status": "passed"
});
formatter.match({
  "location": "AveriasStepDefinition.seleccionamosLaOpcionResetTotal()"
});
formatter.result({
  "duration": 260283400,
  "status": "passed"
});
formatter.match({
  "location": "AveriasStepDefinition.confirmamosDandoClickEnElBotonRealizarTest()"
});
formatter.result({
  "duration": 333917500,
  "status": "passed"
});
formatter.match({
  "location": "AveriasStepDefinition.seEsperaElMensajeConElTestRealizado()"
});
formatter.result({
  "duration": 5256731400,
  "status": "passed"
});
formatter.after({
  "duration": 372339200,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 28,
  "name": "Ingreso exitoso a la pagina Visor y realizo diagnostico reset total numero suspendido",
  "description": "",
  "id": "como-usuario-deseo-ingresar-a-la-pagina-principal-de-visor;ingreso-exitoso-a-la-pagina-visor-y-realizo-diagnostico-reset-total-numero-suspendido",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 27,
      "name": "@ResetTotalNumeroSuspendido"
    },
    {
      "line": 27,
      "name": "@VISO-3236"
    }
  ]
});
formatter.step({
  "line": 29,
  "name": "El usuario se encuentra en la pantalla de principal de visor",
  "keyword": "Given "
});
formatter.step({
  "line": 30,
  "name": "El usuario da click en el boton ingresar de la pantalla principal de visor",
  "keyword": "When "
});
formatter.step({
  "line": 31,
  "name": "Selecciona el tipo de usuario en la pantalla de login \"\u003ctipoUsuario\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 32,
  "name": "Ingresa su usuario \"\u003cusuario\u003e\" y password \"\u003cpassword\u003e\" en la pantalla de login en el caso de prueba \"\u003csTest\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 33,
  "name": "Da click en el botón continuar",
  "keyword": "And "
});
formatter.step({
  "line": 34,
  "name": "Se visualiza el ingreso correcto de la pagina modo Visor",
  "keyword": "And "
});
formatter.step({
  "line": 35,
  "name": "Seleccionamos la opcion Telefono e ingresamos el numero \"\u003cnroTelefono\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 36,
  "name": "Damos click en el boton Buscar",
  "keyword": "And "
});
formatter.step({
  "line": 37,
  "name": "Cerramos el pupUp",
  "keyword": "And "
});
formatter.step({
  "line": 38,
  "name": "Damos click en la opcion Averia",
  "keyword": "And "
});
formatter.step({
  "line": 39,
  "name": "Seleccionamos la opcion herramientas y seleccionar el boton General",
  "keyword": "And "
});
formatter.step({
  "line": 40,
  "name": "Seleccionamos la opcion Reset Total",
  "keyword": "When "
});
formatter.step({
  "line": 41,
  "name": "Se espera el mensaje \"\u003cmensaje\u003e\" con el test realizado",
  "keyword": "Then "
});
formatter.examples({
  "line": 43,
  "name": "",
  "description": "",
  "id": "como-usuario-deseo-ingresar-a-la-pagina-principal-de-visor;ingreso-exitoso-a-la-pagina-visor-y-realizo-diagnostico-reset-total-numero-suspendido;",
  "rows": [
    {
      "cells": [
        "sTest",
        "tipoUsuario",
        "usuario",
        "password",
        "nroTelefono",
        "mensaje"
      ],
      "line": 44,
      "id": "como-usuario-deseo-ingresar-a-la-pagina-principal-de-visor;ingreso-exitoso-a-la-pagina-visor-y-realizo-diagnostico-reset-total-numero-suspendido;;1"
    },
    {
      "cells": [
        "1",
        "usuario externo",
        "rdelatorreg",
        "$t3l3f0n1c4$",
        "920959470",
        "Servicio cliente suspendido"
      ],
      "line": 45,
      "id": "como-usuario-deseo-ingresar-a-la-pagina-principal-de-visor;ingreso-exitoso-a-la-pagina-visor-y-realizo-diagnostico-reset-total-numero-suspendido;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 1191364400,
  "status": "passed"
});
formatter.before({
  "duration": 220200,
  "status": "passed"
});
formatter.scenario({
  "line": 45,
  "name": "Ingreso exitoso a la pagina Visor y realizo diagnostico reset total numero suspendido",
  "description": "",
  "id": "como-usuario-deseo-ingresar-a-la-pagina-principal-de-visor;ingreso-exitoso-a-la-pagina-visor-y-realizo-diagnostico-reset-total-numero-suspendido;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@DiagnosticoReset"
    },
    {
      "line": 27,
      "name": "@ResetTotalNumeroSuspendido"
    },
    {
      "line": 27,
      "name": "@VISO-3236"
    }
  ]
});
formatter.step({
  "line": 29,
  "name": "El usuario se encuentra en la pantalla de principal de visor",
  "keyword": "Given "
});
formatter.step({
  "line": 30,
  "name": "El usuario da click en el boton ingresar de la pantalla principal de visor",
  "keyword": "When "
});
formatter.step({
  "line": 31,
  "name": "Selecciona el tipo de usuario en la pantalla de login \"usuario externo\"",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 32,
  "name": "Ingresa su usuario \"rdelatorreg\" y password \"$t3l3f0n1c4$\" en la pantalla de login en el caso de prueba \"1\"",
  "matchedColumns": [
    0,
    2,
    3
  ],
  "keyword": "When "
});
formatter.step({
  "line": 33,
  "name": "Da click en el botón continuar",
  "keyword": "And "
});
formatter.step({
  "line": 34,
  "name": "Se visualiza el ingreso correcto de la pagina modo Visor",
  "keyword": "And "
});
formatter.step({
  "line": 35,
  "name": "Seleccionamos la opcion Telefono e ingresamos el numero \"920959470\"",
  "matchedColumns": [
    4
  ],
  "keyword": "And "
});
formatter.step({
  "line": 36,
  "name": "Damos click en el boton Buscar",
  "keyword": "And "
});
formatter.step({
  "line": 37,
  "name": "Cerramos el pupUp",
  "keyword": "And "
});
formatter.step({
  "line": 38,
  "name": "Damos click en la opcion Averia",
  "keyword": "And "
});
formatter.step({
  "line": 39,
  "name": "Seleccionamos la opcion herramientas y seleccionar el boton General",
  "keyword": "And "
});
formatter.step({
  "line": 40,
  "name": "Seleccionamos la opcion Reset Total",
  "keyword": "When "
});
formatter.step({
  "line": 41,
  "name": "Se espera el mensaje \"Servicio cliente suspendido\" con el test realizado",
  "matchedColumns": [
    5
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDefinition.el_usuario_se_encuentra_en_la_pantalla_de_principal_de_visor()"
});
formatter.result({
  "duration": 5177880300,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.el_usuario_da_click_en_el_boton_ingresar_de_la_pantalla_principal_de_visor()"
});
formatter.result({
  "duration": 2184729100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "usuario externo",
      "offset": 55
    }
  ],
  "location": "LoginStepDefinition.selecciona_el_tipo_de_usuario_en_la_pantalla_de_login(String)"
});
formatter.result({
  "duration": 2711985900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "rdelatorreg",
      "offset": 20
    },
    {
      "val": "$t3l3f0n1c4$",
      "offset": 45
    },
    {
      "val": "1",
      "offset": 105
    }
  ],
  "location": "LoginStepDefinition.ingresa_su_usuario_y_password_en_la_pantalla_de_login_en_el_caso_de_prueba(String,String,String)"
});
formatter.result({
  "duration": 419985600,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.da_clic_en_el_botón_continuar()"
});
formatter.result({
  "duration": 515600700,
  "status": "passed"
});
formatter.match({
  "location": "HomeStepDefinition.se_visualiza_el_ingreso_correcto_de_la_pagina_modo_Visor()"
});
formatter.result({
  "duration": 5688834000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "920959470",
      "offset": 57
    }
  ],
  "location": "HomeStepDefinition.seleccionamosLaOpcionTelefonoEIngresamosElNumero(String)"
});
formatter.result({
  "duration": 715416700,
  "status": "passed"
});
formatter.match({
  "location": "HomeStepDefinition.damosClicEnElBotonBuscar()"
});
formatter.result({
  "duration": 334474300,
  "status": "passed"
});
formatter.match({
  "location": "ConsultaStepDefinition.cerramosElPupUp()"
});
formatter.result({
  "duration": 7617908600,
  "status": "passed"
});
formatter.match({
  "location": "ConsultaStepDefinition.damosClickEnLaOpcionAveria()"
});
formatter.result({
  "duration": 739928500,
  "status": "passed"
});
formatter.match({
  "location": "AveriasStepDefinition.seleccionamosLaOpcionHerramientasyBotonGeneral()"
});
formatter.result({
  "duration": 608662100,
  "status": "passed"
});
formatter.match({
  "location": "AveriasStepDefinition.seleccionamosLaOpcionResetTotal()"
});
formatter.result({
  "duration": 233236800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Servicio cliente suspendido",
      "offset": 22
    }
  ],
  "location": "AveriasStepDefinition.seEsperaElMensajeConElTestRealizado(String)"
});
formatter.result({
  "duration": 12033400800,
  "status": "passed"
});
formatter.after({
  "duration": 122914200,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 48,
  "name": "Ingreso exitoso a la pagina Visor y realizo diagnostico reset datos numero activo",
  "description": "",
  "id": "como-usuario-deseo-ingresar-a-la-pagina-principal-de-visor;ingreso-exitoso-a-la-pagina-visor-y-realizo-diagnostico-reset-datos-numero-activo",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 47,
      "name": "@ResetDatosNumeroActivo"
    },
    {
      "line": 47,
      "name": "@VISO-3236"
    }
  ]
});
formatter.step({
  "line": 49,
  "name": "El usuario se encuentra en la pantalla de principal de visor",
  "keyword": "Given "
});
formatter.step({
  "line": 50,
  "name": "El usuario da click en el boton ingresar de la pantalla principal de visor",
  "keyword": "When "
});
formatter.step({
  "line": 51,
  "name": "Selecciona el tipo de usuario en la pantalla de login \"\u003ctipoUsuario\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 52,
  "name": "Ingresa su usuario \"\u003cusuario\u003e\" y password \"\u003cpassword\u003e\" en la pantalla de login en el caso de prueba \"\u003csTest\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 53,
  "name": "Da click en el botón continuar",
  "keyword": "And "
});
formatter.step({
  "line": 54,
  "name": "Se visualiza el ingreso correcto de la pagina modo Visor",
  "keyword": "And "
});
formatter.step({
  "line": 55,
  "name": "Seleccionamos la opcion Telefono e ingresamos el numero \"\u003cnroTelefono\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 56,
  "name": "Damos click en el boton Buscar",
  "keyword": "And "
});
formatter.step({
  "line": 57,
  "name": "Cerramos el pupUp",
  "keyword": "And "
});
formatter.step({
  "line": 58,
  "name": "Damos click en la opcion Averia",
  "keyword": "And "
});
formatter.step({
  "line": 59,
  "name": "Seleccionamos la opcion herramientas y seleccionar el boton Datos",
  "keyword": "And "
});
formatter.step({
  "line": 60,
  "name": "Seleccionamos la opcion Reset de Datos",
  "keyword": "When "
});
formatter.step({
  "line": 61,
  "name": "Se espera el mensaje \"\u003cmensaje\u003e\" con el test realizado",
  "keyword": "Then "
});
formatter.examples({
  "line": 63,
  "name": "",
  "description": "",
  "id": "como-usuario-deseo-ingresar-a-la-pagina-principal-de-visor;ingreso-exitoso-a-la-pagina-visor-y-realizo-diagnostico-reset-datos-numero-activo;",
  "rows": [
    {
      "cells": [
        "sTest",
        "tipoUsuario",
        "usuario",
        "password",
        "nroTelefono",
        "mensaje"
      ],
      "line": 64,
      "id": "como-usuario-deseo-ingresar-a-la-pagina-principal-de-visor;ingreso-exitoso-a-la-pagina-visor-y-realizo-diagnostico-reset-datos-numero-activo;;1"
    },
    {
      "cells": [
        "1",
        "usuario externo",
        "rdelatorreg",
        "$t3l3f0n1c4$",
        "920951000",
        "Servicio no disponible"
      ],
      "line": 65,
      "id": "como-usuario-deseo-ingresar-a-la-pagina-principal-de-visor;ingreso-exitoso-a-la-pagina-visor-y-realizo-diagnostico-reset-datos-numero-activo;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 1204741900,
  "status": "passed"
});
formatter.before({
  "duration": 213600,
  "status": "passed"
});
formatter.scenario({
  "line": 65,
  "name": "Ingreso exitoso a la pagina Visor y realizo diagnostico reset datos numero activo",
  "description": "",
  "id": "como-usuario-deseo-ingresar-a-la-pagina-principal-de-visor;ingreso-exitoso-a-la-pagina-visor-y-realizo-diagnostico-reset-datos-numero-activo;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@DiagnosticoReset"
    },
    {
      "line": 47,
      "name": "@ResetDatosNumeroActivo"
    },
    {
      "line": 47,
      "name": "@VISO-3236"
    }
  ]
});
formatter.step({
  "line": 49,
  "name": "El usuario se encuentra en la pantalla de principal de visor",
  "keyword": "Given "
});
formatter.step({
  "line": 50,
  "name": "El usuario da click en el boton ingresar de la pantalla principal de visor",
  "keyword": "When "
});
formatter.step({
  "line": 51,
  "name": "Selecciona el tipo de usuario en la pantalla de login \"usuario externo\"",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 52,
  "name": "Ingresa su usuario \"rdelatorreg\" y password \"$t3l3f0n1c4$\" en la pantalla de login en el caso de prueba \"1\"",
  "matchedColumns": [
    0,
    2,
    3
  ],
  "keyword": "When "
});
formatter.step({
  "line": 53,
  "name": "Da click en el botón continuar",
  "keyword": "And "
});
formatter.step({
  "line": 54,
  "name": "Se visualiza el ingreso correcto de la pagina modo Visor",
  "keyword": "And "
});
formatter.step({
  "line": 55,
  "name": "Seleccionamos la opcion Telefono e ingresamos el numero \"920951000\"",
  "matchedColumns": [
    4
  ],
  "keyword": "And "
});
formatter.step({
  "line": 56,
  "name": "Damos click en el boton Buscar",
  "keyword": "And "
});
formatter.step({
  "line": 57,
  "name": "Cerramos el pupUp",
  "keyword": "And "
});
formatter.step({
  "line": 58,
  "name": "Damos click en la opcion Averia",
  "keyword": "And "
});
formatter.step({
  "line": 59,
  "name": "Seleccionamos la opcion herramientas y seleccionar el boton Datos",
  "keyword": "And "
});
formatter.step({
  "line": 60,
  "name": "Seleccionamos la opcion Reset de Datos",
  "keyword": "When "
});
formatter.step({
  "line": 61,
  "name": "Se espera el mensaje \"Servicio no disponible\" con el test realizado",
  "matchedColumns": [
    5
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDefinition.el_usuario_se_encuentra_en_la_pantalla_de_principal_de_visor()"
});
formatter.result({
  "duration": 2241875400,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.el_usuario_da_click_en_el_boton_ingresar_de_la_pantalla_principal_de_visor()"
});
formatter.result({
  "duration": 2198265000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "usuario externo",
      "offset": 55
    }
  ],
  "location": "LoginStepDefinition.selecciona_el_tipo_de_usuario_en_la_pantalla_de_login(String)"
});
formatter.result({
  "duration": 1946877700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "rdelatorreg",
      "offset": 20
    },
    {
      "val": "$t3l3f0n1c4$",
      "offset": 45
    },
    {
      "val": "1",
      "offset": 105
    }
  ],
  "location": "LoginStepDefinition.ingresa_su_usuario_y_password_en_la_pantalla_de_login_en_el_caso_de_prueba(String,String,String)"
});
formatter.result({
  "duration": 435180400,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.da_clic_en_el_botón_continuar()"
});
formatter.result({
  "duration": 465187200,
  "status": "passed"
});
formatter.match({
  "location": "HomeStepDefinition.se_visualiza_el_ingreso_correcto_de_la_pagina_modo_Visor()"
});
formatter.result({
  "duration": 5689906300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "920951000",
      "offset": 57
    }
  ],
  "location": "HomeStepDefinition.seleccionamosLaOpcionTelefonoEIngresamosElNumero(String)"
});
formatter.result({
  "duration": 698742700,
  "status": "passed"
});
formatter.match({
  "location": "HomeStepDefinition.damosClicEnElBotonBuscar()"
});
formatter.result({
  "duration": 337681700,
  "status": "passed"
});
formatter.match({
  "location": "ConsultaStepDefinition.cerramosElPupUp()"
});
formatter.result({
  "duration": 7450157800,
  "status": "passed"
});
formatter.match({
  "location": "ConsultaStepDefinition.damosClickEnLaOpcionAveria()"
});
formatter.result({
  "duration": 749958600,
  "status": "passed"
});
formatter.match({
  "location": "AveriasStepDefinition.seleccionamosLaOpcionHerramientasyBotonDatos()"
});
formatter.result({
  "duration": 461272600,
  "status": "passed"
});
formatter.match({
  "location": "AveriasStepDefinition.confirmamosDandoClickEnElBotonRealizarDatos()"
});
formatter.result({
  "duration": 64072100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Servicio no disponible",
      "offset": 22
    }
  ],
  "location": "AveriasStepDefinition.seEsperaElMensajeConElTestRealizado(String)"
});
formatter.result({
  "duration": 22077960800,
  "error_message": "java.lang.AssertionError: Error al intentar obtener elemento. Key: xpath - Locator: /html/body/modal-container/div/div/ng-component/div/h3\r\n\tat org.testng.Assert.fail(Assert.java:94)\r\n\tat com.bdd.VISOR.BaseClass.getElement(BaseClass.java:139)\r\n\tat com.bdd.VISOR.modoVisor.page.AveriasPage.validarMensajeUsuario(AveriasPage.java:96)\r\n\tat com.bdd.VISOR.modoVisor.step.AveriasStep.validarMensajeUsuario(AveriasStep.java:47)\r\n\tat com.bdd.VISOR.modoVisor.stepdefinition.AveriasStepDefinition.seEsperaElMensajeConElTestRealizado(AveriasStepDefinition.java:46)\r\n\tat ✽.Then Se espera el mensaje \"Servicio no disponible\" con el test realizado(visor/diagnosticoReset.feature:61)\r\n",
  "status": "failed"
});
formatter.after({
  "duration": 124843600,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 68,
  "name": "Ingreso exitoso a la pagina Visor y realizo diagnostico reset datos numero suspendido",
  "description": "",
  "id": "como-usuario-deseo-ingresar-a-la-pagina-principal-de-visor;ingreso-exitoso-a-la-pagina-visor-y-realizo-diagnostico-reset-datos-numero-suspendido",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 67,
      "name": "@ResetDatosNumeroSuspendido"
    },
    {
      "line": 67,
      "name": "@VISO-3236"
    }
  ]
});
formatter.step({
  "line": 69,
  "name": "El usuario se encuentra en la pantalla de principal de visor",
  "keyword": "Given "
});
formatter.step({
  "line": 70,
  "name": "El usuario da click en el boton ingresar de la pantalla principal de visor",
  "keyword": "When "
});
formatter.step({
  "line": 71,
  "name": "Selecciona el tipo de usuario en la pantalla de login \"\u003ctipoUsuario\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 72,
  "name": "Ingresa su usuario \"\u003cusuario\u003e\" y password \"\u003cpassword\u003e\" en la pantalla de login en el caso de prueba \"\u003csTest\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 73,
  "name": "Da click en el botón continuar",
  "keyword": "And "
});
formatter.step({
  "line": 74,
  "name": "Se visualiza el ingreso correcto de la pagina modo Visor",
  "keyword": "And "
});
formatter.step({
  "line": 75,
  "name": "Seleccionamos la opcion Telefono e ingresamos el numero \"\u003cnroTelefono\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 76,
  "name": "Damos click en el boton Buscar",
  "keyword": "And "
});
formatter.step({
  "line": 77,
  "name": "Cerramos el pupUp",
  "keyword": "And "
});
formatter.step({
  "line": 78,
  "name": "Damos click en la opcion Averia",
  "keyword": "And "
});
formatter.step({
  "line": 79,
  "name": "Seleccionamos la opcion herramientas y seleccionar el boton Datos",
  "keyword": "And "
});
formatter.step({
  "line": 80,
  "name": "Seleccionamos la opcion Reset de Datos",
  "keyword": "When "
});
formatter.step({
  "line": 81,
  "name": "Se espera el mensaje \"\u003cmensaje\u003e\" con el test realizado",
  "keyword": "Then "
});
formatter.examples({
  "line": 83,
  "name": "",
  "description": "",
  "id": "como-usuario-deseo-ingresar-a-la-pagina-principal-de-visor;ingreso-exitoso-a-la-pagina-visor-y-realizo-diagnostico-reset-datos-numero-suspendido;",
  "rows": [
    {
      "cells": [
        "sTest",
        "tipoUsuario",
        "usuario",
        "password",
        "nroTelefono",
        "mensaje"
      ],
      "line": 84,
      "id": "como-usuario-deseo-ingresar-a-la-pagina-principal-de-visor;ingreso-exitoso-a-la-pagina-visor-y-realizo-diagnostico-reset-datos-numero-suspendido;;1"
    },
    {
      "cells": [
        "1",
        "usuario externo",
        "rdelatorreg",
        "$t3l3f0n1c4$",
        "920959470",
        "Servicio cliente suspendido"
      ],
      "line": 85,
      "id": "como-usuario-deseo-ingresar-a-la-pagina-principal-de-visor;ingreso-exitoso-a-la-pagina-visor-y-realizo-diagnostico-reset-datos-numero-suspendido;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 1218314200,
  "status": "passed"
});
formatter.before({
  "duration": 226700,
  "status": "passed"
});
formatter.scenario({
  "line": 85,
  "name": "Ingreso exitoso a la pagina Visor y realizo diagnostico reset datos numero suspendido",
  "description": "",
  "id": "como-usuario-deseo-ingresar-a-la-pagina-principal-de-visor;ingreso-exitoso-a-la-pagina-visor-y-realizo-diagnostico-reset-datos-numero-suspendido;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 67,
      "name": "@ResetDatosNumeroSuspendido"
    },
    {
      "line": 1,
      "name": "@DiagnosticoReset"
    },
    {
      "line": 67,
      "name": "@VISO-3236"
    }
  ]
});
formatter.step({
  "line": 69,
  "name": "El usuario se encuentra en la pantalla de principal de visor",
  "keyword": "Given "
});
formatter.step({
  "line": 70,
  "name": "El usuario da click en el boton ingresar de la pantalla principal de visor",
  "keyword": "When "
});
formatter.step({
  "line": 71,
  "name": "Selecciona el tipo de usuario en la pantalla de login \"usuario externo\"",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 72,
  "name": "Ingresa su usuario \"rdelatorreg\" y password \"$t3l3f0n1c4$\" en la pantalla de login en el caso de prueba \"1\"",
  "matchedColumns": [
    0,
    2,
    3
  ],
  "keyword": "When "
});
formatter.step({
  "line": 73,
  "name": "Da click en el botón continuar",
  "keyword": "And "
});
formatter.step({
  "line": 74,
  "name": "Se visualiza el ingreso correcto de la pagina modo Visor",
  "keyword": "And "
});
formatter.step({
  "line": 75,
  "name": "Seleccionamos la opcion Telefono e ingresamos el numero \"920959470\"",
  "matchedColumns": [
    4
  ],
  "keyword": "And "
});
formatter.step({
  "line": 76,
  "name": "Damos click en el boton Buscar",
  "keyword": "And "
});
formatter.step({
  "line": 77,
  "name": "Cerramos el pupUp",
  "keyword": "And "
});
formatter.step({
  "line": 78,
  "name": "Damos click en la opcion Averia",
  "keyword": "And "
});
formatter.step({
  "line": 79,
  "name": "Seleccionamos la opcion herramientas y seleccionar el boton Datos",
  "keyword": "And "
});
formatter.step({
  "line": 80,
  "name": "Seleccionamos la opcion Reset de Datos",
  "keyword": "When "
});
formatter.step({
  "line": 81,
  "name": "Se espera el mensaje \"Servicio cliente suspendido\" con el test realizado",
  "matchedColumns": [
    5
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDefinition.el_usuario_se_encuentra_en_la_pantalla_de_principal_de_visor()"
});
formatter.result({
  "duration": 4937523700,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.el_usuario_da_click_en_el_boton_ingresar_de_la_pantalla_principal_de_visor()"
});
formatter.result({
  "duration": 2182545300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "usuario externo",
      "offset": 55
    }
  ],
  "location": "LoginStepDefinition.selecciona_el_tipo_de_usuario_en_la_pantalla_de_login(String)"
});
formatter.result({
  "duration": 2599317700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "rdelatorreg",
      "offset": 20
    },
    {
      "val": "$t3l3f0n1c4$",
      "offset": 45
    },
    {
      "val": "1",
      "offset": 105
    }
  ],
  "location": "LoginStepDefinition.ingresa_su_usuario_y_password_en_la_pantalla_de_login_en_el_caso_de_prueba(String,String,String)"
});
formatter.result({
  "duration": 414580800,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.da_clic_en_el_botón_continuar()"
});
formatter.result({
  "duration": 566363700,
  "status": "passed"
});
formatter.match({
  "location": "HomeStepDefinition.se_visualiza_el_ingreso_correcto_de_la_pagina_modo_Visor()"
});
formatter.result({
  "duration": 5690500500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "920959470",
      "offset": 57
    }
  ],
  "location": "HomeStepDefinition.seleccionamosLaOpcionTelefonoEIngresamosElNumero(String)"
});
formatter.result({
  "duration": 799638200,
  "status": "passed"
});
formatter.match({
  "location": "HomeStepDefinition.damosClicEnElBotonBuscar()"
});
formatter.result({
  "duration": 317215500,
  "status": "passed"
});
formatter.match({
  "location": "ConsultaStepDefinition.cerramosElPupUp()"
});
formatter.result({
  "duration": 7871273000,
  "status": "passed"
});
formatter.match({
  "location": "ConsultaStepDefinition.damosClickEnLaOpcionAveria()"
});
formatter.result({
  "duration": 763167000,
  "status": "passed"
});
formatter.match({
  "location": "AveriasStepDefinition.seleccionamosLaOpcionHerramientasyBotonDatos()"
});
formatter.result({
  "duration": 428513400,
  "status": "passed"
});
formatter.match({
  "location": "AveriasStepDefinition.confirmamosDandoClickEnElBotonRealizarDatos()"
});
formatter.result({
  "duration": 87030800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Servicio cliente suspendido",
      "offset": 22
    }
  ],
  "location": "AveriasStepDefinition.seEsperaElMensajeConElTestRealizado(String)"
});
formatter.result({
  "duration": 12030480700,
  "status": "passed"
});
formatter.after({
  "duration": 97657200,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 88,
  "name": "Ingreso exitoso a la pagina Visor y realizo diagnostico reset voz numero activo",
  "description": "",
  "id": "como-usuario-deseo-ingresar-a-la-pagina-principal-de-visor;ingreso-exitoso-a-la-pagina-visor-y-realizo-diagnostico-reset-voz-numero-activo",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 87,
      "name": "@ResetVozlNumeroActivo"
    },
    {
      "line": 87,
      "name": "@VISO-3236"
    }
  ]
});
formatter.step({
  "line": 89,
  "name": "El usuario se encuentra en la pantalla de principal de visor",
  "keyword": "Given "
});
formatter.step({
  "line": 90,
  "name": "El usuario da click en el boton ingresar de la pantalla principal de visor",
  "keyword": "When "
});
formatter.step({
  "line": 91,
  "name": "Selecciona el tipo de usuario en la pantalla de login \"\u003ctipoUsuario\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 92,
  "name": "Ingresa su usuario \"\u003cusuario\u003e\" y password \"\u003cpassword\u003e\" en la pantalla de login en el caso de prueba \"\u003csTest\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 93,
  "name": "Da click en el botón continuar",
  "keyword": "And "
});
formatter.step({
  "line": 94,
  "name": "Se visualiza el ingreso correcto de la pagina modo Visor",
  "keyword": "And "
});
formatter.step({
  "line": 95,
  "name": "Seleccionamos la opcion Telefono e ingresamos el numero \"\u003cnroTelefono\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 96,
  "name": "Damos click en el boton Buscar",
  "keyword": "And "
});
formatter.step({
  "line": 97,
  "name": "Cerramos el pupUp",
  "keyword": "And "
});
formatter.step({
  "line": 98,
  "name": "Damos click en la opcion Averia",
  "keyword": "And "
});
formatter.step({
  "line": 99,
  "name": "Seleccionamos la opcion herramientas y seleccionar el boton Voz",
  "keyword": "And "
});
formatter.step({
  "line": 100,
  "name": "Seleccionamos la opcion Reset de voz",
  "keyword": "And "
});
formatter.step({
  "line": 101,
  "name": "Confirmamos dando click en el boton Realizar Test",
  "keyword": "When "
});
formatter.step({
  "line": 102,
  "name": "Se espera el mensaje \"\u003cmensaje\u003e\" con el test realizado",
  "keyword": "Then "
});
formatter.examples({
  "line": 104,
  "name": "",
  "description": "",
  "id": "como-usuario-deseo-ingresar-a-la-pagina-principal-de-visor;ingreso-exitoso-a-la-pagina-visor-y-realizo-diagnostico-reset-voz-numero-activo;",
  "rows": [
    {
      "cells": [
        "sTest",
        "tipoUsuario",
        "usuario",
        "password",
        "nroTelefono",
        "mensaje"
      ],
      "line": 105,
      "id": "como-usuario-deseo-ingresar-a-la-pagina-principal-de-visor;ingreso-exitoso-a-la-pagina-visor-y-realizo-diagnostico-reset-voz-numero-activo;;1"
    },
    {
      "cells": [
        "1",
        "usuario externo",
        "rdelatorreg",
        "$t3l3f0n1c4$",
        "920951000",
        "Servicio no disponible"
      ],
      "line": 106,
      "id": "como-usuario-deseo-ingresar-a-la-pagina-principal-de-visor;ingreso-exitoso-a-la-pagina-visor-y-realizo-diagnostico-reset-voz-numero-activo;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 1197449600,
  "status": "passed"
});
formatter.before({
  "duration": 399500,
  "status": "passed"
});
formatter.scenario({
  "line": 106,
  "name": "Ingreso exitoso a la pagina Visor y realizo diagnostico reset voz numero activo",
  "description": "",
  "id": "como-usuario-deseo-ingresar-a-la-pagina-principal-de-visor;ingreso-exitoso-a-la-pagina-visor-y-realizo-diagnostico-reset-voz-numero-activo;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@DiagnosticoReset"
    },
    {
      "line": 87,
      "name": "@VISO-3236"
    },
    {
      "line": 87,
      "name": "@ResetVozlNumeroActivo"
    }
  ]
});
formatter.step({
  "line": 89,
  "name": "El usuario se encuentra en la pantalla de principal de visor",
  "keyword": "Given "
});
formatter.step({
  "line": 90,
  "name": "El usuario da click en el boton ingresar de la pantalla principal de visor",
  "keyword": "When "
});
formatter.step({
  "line": 91,
  "name": "Selecciona el tipo de usuario en la pantalla de login \"usuario externo\"",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 92,
  "name": "Ingresa su usuario \"rdelatorreg\" y password \"$t3l3f0n1c4$\" en la pantalla de login en el caso de prueba \"1\"",
  "matchedColumns": [
    0,
    2,
    3
  ],
  "keyword": "When "
});
formatter.step({
  "line": 93,
  "name": "Da click en el botón continuar",
  "keyword": "And "
});
formatter.step({
  "line": 94,
  "name": "Se visualiza el ingreso correcto de la pagina modo Visor",
  "keyword": "And "
});
formatter.step({
  "line": 95,
  "name": "Seleccionamos la opcion Telefono e ingresamos el numero \"920951000\"",
  "matchedColumns": [
    4
  ],
  "keyword": "And "
});
formatter.step({
  "line": 96,
  "name": "Damos click en el boton Buscar",
  "keyword": "And "
});
formatter.step({
  "line": 97,
  "name": "Cerramos el pupUp",
  "keyword": "And "
});
formatter.step({
  "line": 98,
  "name": "Damos click en la opcion Averia",
  "keyword": "And "
});
formatter.step({
  "line": 99,
  "name": "Seleccionamos la opcion herramientas y seleccionar el boton Voz",
  "keyword": "And "
});
formatter.step({
  "line": 100,
  "name": "Seleccionamos la opcion Reset de voz",
  "keyword": "And "
});
formatter.step({
  "line": 101,
  "name": "Confirmamos dando click en el boton Realizar Test",
  "keyword": "When "
});
formatter.step({
  "line": 102,
  "name": "Se espera el mensaje \"Servicio no disponible\" con el test realizado",
  "matchedColumns": [
    5
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDefinition.el_usuario_se_encuentra_en_la_pantalla_de_principal_de_visor()"
});
formatter.result({
  "duration": 2663314200,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.el_usuario_da_click_en_el_boton_ingresar_de_la_pantalla_principal_de_visor()"
});
formatter.result({
  "duration": 2198084400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "usuario externo",
      "offset": 55
    }
  ],
  "location": "LoginStepDefinition.selecciona_el_tipo_de_usuario_en_la_pantalla_de_login(String)"
});
formatter.result({
  "duration": 3264233100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "rdelatorreg",
      "offset": 20
    },
    {
      "val": "$t3l3f0n1c4$",
      "offset": 45
    },
    {
      "val": "1",
      "offset": 105
    }
  ],
  "location": "LoginStepDefinition.ingresa_su_usuario_y_password_en_la_pantalla_de_login_en_el_caso_de_prueba(String,String,String)"
});
formatter.result({
  "duration": 415885600,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.da_clic_en_el_botón_continuar()"
});
formatter.result({
  "duration": 535330400,
  "status": "passed"
});
formatter.match({
  "location": "HomeStepDefinition.se_visualiza_el_ingreso_correcto_de_la_pagina_modo_Visor()"
});
formatter.result({
  "duration": 5687997400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "920951000",
      "offset": 57
    }
  ],
  "location": "HomeStepDefinition.seleccionamosLaOpcionTelefonoEIngresamosElNumero(String)"
});
formatter.result({
  "duration": 716442800,
  "status": "passed"
});
formatter.match({
  "location": "HomeStepDefinition.damosClicEnElBotonBuscar()"
});
formatter.result({
  "duration": 349829900,
  "status": "passed"
});
formatter.match({
  "location": "ConsultaStepDefinition.cerramosElPupUp()"
});
formatter.result({
  "duration": 9433812500,
  "status": "passed"
});
formatter.match({
  "location": "ConsultaStepDefinition.damosClickEnLaOpcionAveria()"
});
formatter.result({
  "duration": 810482300,
  "status": "passed"
});
formatter.match({
  "location": "AveriasStepDefinition.seleccionamosLaOpcionHerramientasYSeleccionarElBotonVoz()"
});
formatter.result({
  "duration": 420505600,
  "status": "passed"
});
formatter.match({
  "location": "AveriasStepDefinition.seleccionamosLaOpcionResetDeVoz()"
});
formatter.result({
  "duration": 68184600,
  "status": "passed"
});
formatter.match({
  "location": "AveriasStepDefinition.confirmamosDandoClickEnElBotonRealizarTest()"
});
formatter.result({
  "duration": 804614500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Servicio no disponible",
      "offset": 22
    }
  ],
  "location": "AveriasStepDefinition.seEsperaElMensajeConElTestRealizado(String)"
});
formatter.result({
  "duration": 22062306700,
  "error_message": "java.lang.AssertionError: Error al intentar obtener elemento. Key: xpath - Locator: /html/body/modal-container/div/div/ng-component/div/h3\r\n\tat org.testng.Assert.fail(Assert.java:94)\r\n\tat com.bdd.VISOR.BaseClass.getElement(BaseClass.java:139)\r\n\tat com.bdd.VISOR.modoVisor.page.AveriasPage.validarMensajeUsuario(AveriasPage.java:96)\r\n\tat com.bdd.VISOR.modoVisor.step.AveriasStep.validarMensajeUsuario(AveriasStep.java:47)\r\n\tat com.bdd.VISOR.modoVisor.stepdefinition.AveriasStepDefinition.seEsperaElMensajeConElTestRealizado(AveriasStepDefinition.java:46)\r\n\tat ✽.Then Se espera el mensaje \"Servicio no disponible\" con el test realizado(visor/diagnosticoReset.feature:102)\r\n",
  "status": "failed"
});
formatter.after({
  "duration": 108505500,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 109,
  "name": "Ingreso exitoso a la pagina Visor y realizo diagnostico reset voz numero suspendido",
  "description": "",
  "id": "como-usuario-deseo-ingresar-a-la-pagina-principal-de-visor;ingreso-exitoso-a-la-pagina-visor-y-realizo-diagnostico-reset-voz-numero-suspendido",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 108,
      "name": "@ResetVozNumeroSuspendido"
    },
    {
      "line": 108,
      "name": "@VISO-3236"
    }
  ]
});
formatter.step({
  "line": 110,
  "name": "El usuario se encuentra en la pantalla de principal de visor",
  "keyword": "Given "
});
formatter.step({
  "line": 111,
  "name": "El usuario da click en el boton ingresar de la pantalla principal de visor",
  "keyword": "When "
});
formatter.step({
  "line": 112,
  "name": "Selecciona el tipo de usuario en la pantalla de login \"\u003ctipoUsuario\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 113,
  "name": "Ingresa su usuario \"\u003cusuario\u003e\" y password \"\u003cpassword\u003e\" en la pantalla de login en el caso de prueba \"\u003csTest\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 114,
  "name": "Da click en el botón continuar",
  "keyword": "And "
});
formatter.step({
  "line": 115,
  "name": "Se visualiza el ingreso correcto de la pagina modo Visor",
  "keyword": "And "
});
formatter.step({
  "line": 116,
  "name": "Seleccionamos la opcion Telefono e ingresamos el numero \"\u003cnroTelefono\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 117,
  "name": "Damos click en el boton Buscar",
  "keyword": "And "
});
formatter.step({
  "line": 118,
  "name": "Cerramos el pupUp",
  "keyword": "And "
});
formatter.step({
  "line": 119,
  "name": "Damos click en la opcion Averia",
  "keyword": "And "
});
formatter.step({
  "line": 120,
  "name": "Seleccionamos la opcion herramientas y seleccionar el boton Voz",
  "keyword": "And "
});
formatter.step({
  "line": 121,
  "name": "Seleccionamos la opcion Reset de voz",
  "keyword": "When "
});
formatter.step({
  "line": 122,
  "name": "Se espera el mensaje \"\u003cmensaje\u003e\" con el test realizado",
  "keyword": "Then "
});
formatter.examples({
  "line": 124,
  "name": "",
  "description": "",
  "id": "como-usuario-deseo-ingresar-a-la-pagina-principal-de-visor;ingreso-exitoso-a-la-pagina-visor-y-realizo-diagnostico-reset-voz-numero-suspendido;",
  "rows": [
    {
      "cells": [
        "sTest",
        "tipoUsuario",
        "usuario",
        "password",
        "nroTelefono",
        "mensaje"
      ],
      "line": 125,
      "id": "como-usuario-deseo-ingresar-a-la-pagina-principal-de-visor;ingreso-exitoso-a-la-pagina-visor-y-realizo-diagnostico-reset-voz-numero-suspendido;;1"
    },
    {
      "cells": [
        "1",
        "usuario externo",
        "rdelatorreg",
        "$t3l3f0n1c4$",
        "920959470",
        "Servicio cliente suspendido"
      ],
      "line": 126,
      "id": "como-usuario-deseo-ingresar-a-la-pagina-principal-de-visor;ingreso-exitoso-a-la-pagina-visor-y-realizo-diagnostico-reset-voz-numero-suspendido;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 1209097100,
  "status": "passed"
});
formatter.before({
  "duration": 180800,
  "status": "passed"
});
formatter.scenario({
  "line": 126,
  "name": "Ingreso exitoso a la pagina Visor y realizo diagnostico reset voz numero suspendido",
  "description": "",
  "id": "como-usuario-deseo-ingresar-a-la-pagina-principal-de-visor;ingreso-exitoso-a-la-pagina-visor-y-realizo-diagnostico-reset-voz-numero-suspendido;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@DiagnosticoReset"
    },
    {
      "line": 108,
      "name": "@ResetVozNumeroSuspendido"
    },
    {
      "line": 108,
      "name": "@VISO-3236"
    }
  ]
});
formatter.step({
  "line": 110,
  "name": "El usuario se encuentra en la pantalla de principal de visor",
  "keyword": "Given "
});
formatter.step({
  "line": 111,
  "name": "El usuario da click en el boton ingresar de la pantalla principal de visor",
  "keyword": "When "
});
formatter.step({
  "line": 112,
  "name": "Selecciona el tipo de usuario en la pantalla de login \"usuario externo\"",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 113,
  "name": "Ingresa su usuario \"rdelatorreg\" y password \"$t3l3f0n1c4$\" en la pantalla de login en el caso de prueba \"1\"",
  "matchedColumns": [
    0,
    2,
    3
  ],
  "keyword": "When "
});
formatter.step({
  "line": 114,
  "name": "Da click en el botón continuar",
  "keyword": "And "
});
formatter.step({
  "line": 115,
  "name": "Se visualiza el ingreso correcto de la pagina modo Visor",
  "keyword": "And "
});
formatter.step({
  "line": 116,
  "name": "Seleccionamos la opcion Telefono e ingresamos el numero \"920959470\"",
  "matchedColumns": [
    4
  ],
  "keyword": "And "
});
formatter.step({
  "line": 117,
  "name": "Damos click en el boton Buscar",
  "keyword": "And "
});
formatter.step({
  "line": 118,
  "name": "Cerramos el pupUp",
  "keyword": "And "
});
formatter.step({
  "line": 119,
  "name": "Damos click en la opcion Averia",
  "keyword": "And "
});
formatter.step({
  "line": 120,
  "name": "Seleccionamos la opcion herramientas y seleccionar el boton Voz",
  "keyword": "And "
});
formatter.step({
  "line": 121,
  "name": "Seleccionamos la opcion Reset de voz",
  "keyword": "When "
});
formatter.step({
  "line": 122,
  "name": "Se espera el mensaje \"Servicio cliente suspendido\" con el test realizado",
  "matchedColumns": [
    5
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDefinition.el_usuario_se_encuentra_en_la_pantalla_de_principal_de_visor()"
});
formatter.result({
  "duration": 2742605800,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.el_usuario_da_click_en_el_boton_ingresar_de_la_pantalla_principal_de_visor()"
});
formatter.result({
  "duration": 2196039700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "usuario externo",
      "offset": 55
    }
  ],
  "location": "LoginStepDefinition.selecciona_el_tipo_de_usuario_en_la_pantalla_de_login(String)"
});
formatter.result({
  "duration": 2462235100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "rdelatorreg",
      "offset": 20
    },
    {
      "val": "$t3l3f0n1c4$",
      "offset": 45
    },
    {
      "val": "1",
      "offset": 105
    }
  ],
  "location": "LoginStepDefinition.ingresa_su_usuario_y_password_en_la_pantalla_de_login_en_el_caso_de_prueba(String,String,String)"
});
formatter.result({
  "duration": 417124500,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.da_clic_en_el_botón_continuar()"
});
formatter.result({
  "duration": 533600200,
  "status": "passed"
});
formatter.match({
  "location": "HomeStepDefinition.se_visualiza_el_ingreso_correcto_de_la_pagina_modo_Visor()"
});
formatter.result({
  "duration": 5729895700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "920959470",
      "offset": 57
    }
  ],
  "location": "HomeStepDefinition.seleccionamosLaOpcionTelefonoEIngresamosElNumero(String)"
});
formatter.result({
  "duration": 745486800,
  "status": "passed"
});
formatter.match({
  "location": "HomeStepDefinition.damosClicEnElBotonBuscar()"
});
formatter.result({
  "duration": 351012900,
  "status": "passed"
});
formatter.match({
  "location": "ConsultaStepDefinition.cerramosElPupUp()"
});
formatter.result({
  "duration": 7654670500,
  "status": "passed"
});
formatter.match({
  "location": "ConsultaStepDefinition.damosClickEnLaOpcionAveria()"
});
formatter.result({
  "duration": 803438200,
  "status": "passed"
});
formatter.match({
  "location": "AveriasStepDefinition.seleccionamosLaOpcionHerramientasYSeleccionarElBotonVoz()"
});
formatter.result({
  "duration": 422635000,
  "status": "passed"
});
formatter.match({
  "location": "AveriasStepDefinition.seleccionamosLaOpcionResetDeVoz()"
});
formatter.result({
  "duration": 74252200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Servicio cliente suspendido",
      "offset": 22
    }
  ],
  "location": "AveriasStepDefinition.seEsperaElMensajeConElTestRealizado(String)"
});
formatter.result({
  "duration": 12032343900,
  "status": "passed"
});
formatter.after({
  "duration": 104347200,
  "status": "passed"
});
});