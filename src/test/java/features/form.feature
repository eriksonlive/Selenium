Feature: Verificar el funcionamiento del formulario

    Scenario: Validar el correcto funcionamiento del funcionamieto del formulario
        Given Ingresar el nombre en el campo del name del formulario
        Then Ingresar el correo en el campo Email
        When Ingresar un menssage en el campo del mensaje
        Then Seleccionar una de las opciones de select
        When Seleccionar una de las occiones de los radio button 
        Then Seleccionar el checkbox
        When Hacer click en enviar