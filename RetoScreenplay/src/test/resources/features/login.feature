#language: en

  Feature: Login de usuario

    Background:
    Given que el usuario se encuentre en la pagina web


      @LoginExitoso
    Scenario: Login de usuario exitoso
      When Ingrese el usuario con la clave
      Then el usuario visualizara un hola y su nombre en el boton cuenta

      @LoginFallido
    Scenario: Login de usuario fallido
      When Ingrese con las credenciales incorrectas
      Then el usuario visualizara un mensaje de credenciales incorrectas


