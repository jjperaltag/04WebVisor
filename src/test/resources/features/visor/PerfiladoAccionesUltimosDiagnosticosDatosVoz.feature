@VISOR_PILOTO
Feature: Validar que un número activo pueda realizar visualizar los últimos diagnósticos de datos

  @VISO-3232 @PerfiladoAccionesUltimoDiagnosticoDatos
  Scenario Outline: Ingreso exitoso a la pagina Visor y valida el perfilado de acciones en ultimos diagnósticos para problemas con Datos
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
    Then  Valida acciones en ultimo diagnostico "<perfil>"
    And   Cierra popUp de ultimos diagnosticos
    And   Se guarda la información del contacto
    And   Cierra la sesion
    Examples:
      | sTest | tipoUsuario     | usuario     | password     | nroTelefono | perfil   |
      | 1     | usuario externo | rdelatorreg | $t3l3f0n1c4$ | 920959048   | 1ra Linea|
      | 2     | usuario externo | rdelatorreg | $t3l3f0n1c4$ | 920959335   | 1ra Linea|
      | 3     | usuario externo | rdelatorreg | $t3l3f0n1c4$ | 920959331   | 1ra Linea|
      | 4     | usuario externo | rdelatorreg | $t3l3f0n1c4$ | 920959154   | 1ra Linea|
      | 5     | usuario externo | rdelatorreg | $t3l3f0n1c4$ | 920951728   | 1ra Linea|
      | 6     | usuario externo | rdelatorreg | $t3l3f0n1c4$ | 650006465   | 1ra Linea|
      | 7     | usuario externo | rdelatorreg | $t3l3f0n1c4$ | 920951000   | 1ra Linea|

  @VISO-3232 @PerfiladoAccionesUltimoDiagnosticoVoz
  Scenario Outline: Ingreso exitoso a la pagina Visor y valida el perfilado de acciones en ultimos diagnósticos para problemas con voz
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
    Then  Valida acciones en ultimo diagnostico "<perfil>"
    And   Cierra popUp de ultimos diagnosticos
    And   Se guarda la información del contacto
    And   Cierra la sesion
    Examples:
      | sTest | tipoUsuario     | usuario     | password     | nroTelefono | perfil   |
      | 1     | usuario externo | rdelatorreg | $t3l3f0n1c4$ | 920959048   | 1ra Linea|
      | 2     | usuario externo | rdelatorreg | $t3l3f0n1c4$ | 920959335   | 1ra Linea|
      | 3     | usuario externo | rdelatorreg | $t3l3f0n1c4$ | 920959331   | 1ra Linea|
      | 4     | usuario externo | rdelatorreg | $t3l3f0n1c4$ | 920959154   | 1ra Linea|
      | 5     | usuario externo | rdelatorreg | $t3l3f0n1c4$ | 920951728   | 1ra Linea|
      | 6     | usuario externo | rdelatorreg | $t3l3f0n1c4$ | 650006465   | 1ra Linea|
      | 7     | usuario externo | rdelatorreg | $t3l3f0n1c4$ | 920951000   | 1ra Linea|
