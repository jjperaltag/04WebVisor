@Login
Feature: Como usuario deseo ingresar a la pagina principal de Visor
  Para poder ingresar mi usuario y contraseña y acceder a la pagina modo Visor

  @LoginExitoso
  Scenario Outline: Ingreso exitoso a la pagina Visor
    Given El usuario se encuentra en la pantalla de principal de visor
    When El usuario da click en el boton ingresar de la pantalla principal de visor
    And Selecciona el tipo de usuario en la pantalla de login "<tipoUsuario>"
    When Ingresa su usuario "<usuario>" y password "<password>" en la pantalla de login en el caso de prueba "<sTest>"
    And Da click en el botón continuar
    Then Se visualiza el ingreso correcto de la pagina modo Visor
    Examples:
      | sTest | tipoUsuario     | usuario     | password     |
      | 1     | usuario externo | rdelatorreg | $t3l3f0n1c4$ |