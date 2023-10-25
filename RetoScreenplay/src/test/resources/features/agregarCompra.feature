#language: en

Feature: agregar un producto al carro de compras

  Background:
    Given que el usuario se encuentre en la pagina web

  @CompraExitosa
  Scenario: agregar producto al carro de compras
    When el da click en agregar producto al carro de compras
    Then el usuario visualizara un mensaje de lo que llevas en tu carro