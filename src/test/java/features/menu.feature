Feature: Verificar el estado del menu de navegacion de la PG WEB

    Scenario: Verifico cada link para identificar que funcionan correctamente
        Given Verifico desde el navegador que si me encuentre en la pagina principal
        Then Me dirijo al boton history y doy click
        And Verifico la url de history, que si sea la correcta
        Then Me dirijo al boton products y doy click
        And Verifico la url de products que si sea la correcta
        Then Me dirijo al boton guarantee y doy click
        And Verifico la url de guarantee que si sea la correcta
        Then Me dirijo al boton contact y doy click
        And Verifico la url de contact que si sea la correcta
        Then Me dirijo al boton people y doy click
        And Verifico la url de people que si sea la correcta
        Then Me dirijo al boton home y doy click
        And Verifico la url de home que si sea la correcta

