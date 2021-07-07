@VISORPILOTO
Feature: Validar que se oculte el botón de SMS en los diagnósticos de problemas con voz

  @VISO-3229
  Scenario Outline: Validar que se oculte el botón de SMS en los diagnósticos de problemas con voz
    Given El usuario se encuentra en la pantalla de principal de visor
    When  El usuario da click en el boton ingresar de la pantalla principal de visor
    And   Selecciona el tipo de usuario en la pantalla de login "<tipoUsuario>"
    When  Ingresa su usuario "<usuario>" y password "<password>" en la pantalla de login en el caso de prueba "<sTest>"
    And   Da click en el botón continuar
    And   Se visualiza el ingreso correcto de la pagina modo Visor
    And   Seleccionamos la opcion Telefono e ingresamos el numero "<nroTelefono>"
    And   Damos click en el boton Buscar
    And   Cerramos el pupUp
    And   Damos click en la opcion Averia
    When  Seleccionamos la opcion Problemas con voz
    And   Cierra popUp de ultimos diagnosticos
    And   Se guarda la información del contacto
    Then  Valida que no este presente le boton SMS
    Examples:
      | sTest | tipoUsuario     | usuario     | password     | nroTelefono |
      | 1     | usuario externo | rdelatorreg | $t3l3f0n1c4$ | 920951000   |