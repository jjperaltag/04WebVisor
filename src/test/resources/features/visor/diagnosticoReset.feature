@VISOR_PILOTO
Feature: Como usuario deseo ingresar a la pagina principal de Visor
  Para poder ingresar mi usuario y contraseña y acceder a la pagina modo Visor
  Cuando solicito diagnostico de reset y validar el reset

  @ResetTotalNumeroActivo @VISO-3236
  Scenario Outline: Ingreso exitoso a la pagina Visor y realizo diagnostico reset total numero activo
    Given El usuario se encuentra en la pantalla de principal de visor
    When El usuario da click en el boton ingresar de la pantalla principal de visor
    And Selecciona el tipo de usuario en la pantalla de login "<tipoUsuario>"
    When Ingresa su usuario "<usuario>" y password "<password>" en la pantalla de login en el caso de prueba "<sTest>"
    And Da click en el botón continuar
    And Se visualiza el ingreso correcto de la pagina modo Visor
    And Seleccionamos la opcion Telefono e ingresamos el numero "<nroTelefono>"
    And Damos click en el boton Buscar
    And Cerramos el pupUp
    And Damos click en la opcion Averia
    And Seleccionamos la opcion herramientas y seleccionar el boton General
    And Seleccionamos la opcion Reset Total
    When Confirmamos dando click en el boton Realizar Test
    Then Se espera el mensaje con el test realizado

    Examples:
      | sTest | tipoUsuario     | usuario     | password       | nroTelefono |
      | 1     | usuario externo | rdelatorreg | $t3l3f0n1c4$ | 920951000   |

  @ResetTotalNumeroSuspendido @VISO-3236
  Scenario Outline: Ingreso exitoso a la pagina Visor y realizo diagnostico reset total numero suspendido
    Given El usuario se encuentra en la pantalla de principal de visor
    When El usuario da click en el boton ingresar de la pantalla principal de visor
    And Selecciona el tipo de usuario en la pantalla de login "<tipoUsuario>"
    When Ingresa su usuario "<usuario>" y password "<password>" en la pantalla de login en el caso de prueba "<sTest>"
    And Da click en el botón continuar
    And Se visualiza el ingreso correcto de la pagina modo Visor
    And Seleccionamos la opcion Telefono e ingresamos el numero "<nroTelefono>"
    And Damos click en el boton Buscar
    And Cerramos el pupUp
    And Damos click en la opcion Averia
    And Seleccionamos la opcion herramientas y seleccionar el boton General
    When Seleccionamos la opcion Reset Total
    Then Se espera el mensaje "<mensaje>" con el test realizado

    Examples:
      | sTest | tipoUsuario     | usuario     | password     | nroTelefono | mensaje                     |
      | 1     | usuario externo | rdelatorreg | $t3l3f0n1c4$ | 920959470   | Servicio cliente suspendido |

  @ResetDatosNumeroActivo @VISO-3236
  Scenario Outline: Ingreso exitoso a la pagina Visor y realizo diagnostico reset datos numero activo
    Given El usuario se encuentra en la pantalla de principal de visor
    When El usuario da click en el boton ingresar de la pantalla principal de visor
    And Selecciona el tipo de usuario en la pantalla de login "<tipoUsuario>"
    When Ingresa su usuario "<usuario>" y password "<password>" en la pantalla de login en el caso de prueba "<sTest>"
    And Da click en el botón continuar
    And Se visualiza el ingreso correcto de la pagina modo Visor
    And Seleccionamos la opcion Telefono e ingresamos el numero "<nroTelefono>"
    And Damos click en el boton Buscar
    And Cerramos el pupUp
    And Damos click en la opcion Averia
    And Seleccionamos la opcion herramientas y seleccionar el boton Datos
    When Seleccionamos la opcion Reset de Datos
    Then Se espera el mensaje "<mensaje>" con el test realizado

    Examples:
      | sTest | tipoUsuario     | usuario     | password     | nroTelefono | mensaje                |
      | 1     | usuario externo | rdelatorreg | $t3l3f0n1c4$ | 920951000   | Servicio no disponible |

  @ResetDatosNumeroSuspendido @VISO-3236
  Scenario Outline: Ingreso exitoso a la pagina Visor y realizo diagnostico reset datos numero suspendido
    Given El usuario se encuentra en la pantalla de principal de visor
    When El usuario da click en el boton ingresar de la pantalla principal de visor
    And Selecciona el tipo de usuario en la pantalla de login "<tipoUsuario>"
    When Ingresa su usuario "<usuario>" y password "<password>" en la pantalla de login en el caso de prueba "<sTest>"
    And Da click en el botón continuar
    And Se visualiza el ingreso correcto de la pagina modo Visor
    And Seleccionamos la opcion Telefono e ingresamos el numero "<nroTelefono>"
    And Damos click en el boton Buscar
    And Cerramos el pupUp
    And Damos click en la opcion Averia
    And Seleccionamos la opcion herramientas y seleccionar el boton Datos
    When Seleccionamos la opcion Reset de Datos
    Then Se espera el mensaje "<mensaje>" con el test realizado

    Examples:
      | sTest | tipoUsuario     | usuario     | password     | nroTelefono | mensaje                     |
      | 1     | usuario externo | rdelatorreg | $t3l3f0n1c4$ | 920959470   | Servicio cliente suspendido |

  @ResetVozlNumeroActivo @VISO-3236
  Scenario Outline: Ingreso exitoso a la pagina Visor y realizo diagnostico reset voz numero activo
    Given El usuario se encuentra en la pantalla de principal de visor
    When El usuario da click en el boton ingresar de la pantalla principal de visor
    And Selecciona el tipo de usuario en la pantalla de login "<tipoUsuario>"
    When Ingresa su usuario "<usuario>" y password "<password>" en la pantalla de login en el caso de prueba "<sTest>"
    And Da click en el botón continuar
    And Se visualiza el ingreso correcto de la pagina modo Visor
    And Seleccionamos la opcion Telefono e ingresamos el numero "<nroTelefono>"
    And Damos click en el boton Buscar
    And Cerramos el pupUp
    And Damos click en la opcion Averia
    And Seleccionamos la opcion herramientas y seleccionar el boton Voz
    And Seleccionamos la opcion Reset de voz
    When Confirmamos dando click en el boton Realizar Test
    Then Se espera el mensaje "<mensaje>" con el test realizado

    Examples:
      | sTest | tipoUsuario     | usuario     | password     | nroTelefono | mensaje                |
      | 1     | usuario externo | rdelatorreg | $t3l3f0n1c4$ | 920951000   | Servicio no disponible |

  @ResetVozNumeroSuspendido @VISO-3236
  Scenario Outline: Ingreso exitoso a la pagina Visor y realizo diagnostico reset voz numero suspendido
    Given El usuario se encuentra en la pantalla de principal de visor
    When El usuario da click en el boton ingresar de la pantalla principal de visor
    And Selecciona el tipo de usuario en la pantalla de login "<tipoUsuario>"
    When Ingresa su usuario "<usuario>" y password "<password>" en la pantalla de login en el caso de prueba "<sTest>"
    And Da click en el botón continuar
    And Se visualiza el ingreso correcto de la pagina modo Visor
    And Seleccionamos la opcion Telefono e ingresamos el numero "<nroTelefono>"
    And Damos click en el boton Buscar
    And Cerramos el pupUp
    And Damos click en la opcion Averia
    And Seleccionamos la opcion herramientas y seleccionar el boton Voz
    When Seleccionamos la opcion Reset de voz
    Then Se espera el mensaje "<mensaje>" con el test realizado

    Examples:
      | sTest | tipoUsuario     | usuario     | password     | nroTelefono | mensaje                     |
      | 1     | usuario externo | rdelatorreg | $t3l3f0n1c4$ | 920959470   | Servicio cliente suspendido |