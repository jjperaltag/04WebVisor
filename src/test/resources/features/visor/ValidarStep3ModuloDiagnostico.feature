@ValidarStep3DiagnosticoDatosVoz
Feature: Validar cambios en el Step 3 en los diagnosticos de Datos o Voz

  @VISO-3233 @ValidarStep3DiagnosticoDatos
  Scenario Outline: Validar cambios en el Step 3 en los diagnosticos de problemas con datos
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
    When  Seleccionamos la opcion Problemas con datos
    Then  Validar cambios Step 3 en el "<escenario>" diagnosticos problemas de datos con el "<perfil>"
    And   Cierra popUp de ultimos diagnosticos
    And   Se guarda la información del contacto
    And   Cierra la sesion
    Examples:
      | sTest | tipoUsuario     | usuario     | password     | nroTelefono | perfil   | escenario |
      | 1     | usuario externo | rdelatorreg | $t3l3f0n1c4$ | 920951000   | 1ra Linea| 1ra Linea |

  @VISO-3233 @ValidarStep3DiagnosticoVoz
  Scenario Outline: Validar cambios en el Step 3 en los diagnosticos de problemas con voz
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
    Then  Validar cambios Step 3 en el "<escenario>" diagnosticos problemas de voz con el "<perfil>"
    And   Cierra popUp de ultimos diagnosticos
    And   Se guarda la información del contacto
    And   Cierra la sesion
    Examples:
      | sTest | tipoUsuario     | usuario     | password     | nroTelefono | perfil   | escenario |
      | 1     | usuario externo | rdelatorreg | $t3l3f0n1c4$ | 920951000   | 1ra Linea| 1ra Linea |