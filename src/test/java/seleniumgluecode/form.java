package seleniumgluecode;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class form {

    private ChromeDriver driver = Hooks.getDriver();
    Hooks hook = new Hooks();
    
    @Given("^Ingresar el nombre en el campo del name del formulario$")
    public void ingresar_el_nombre_en_el_campo_del_name_del_formulario() throws Throwable {
        driver.findElement( By.name("name")).sendKeys("Carlos");
    }

    @Then("^Ingresar el correo en el campo Email$")
    public void ingresar_el_correo_en_el_campo_Email() throws Throwable {
        driver.findElement( By.name("email")).sendKeys("carlos@pruebaselenium.com");
    }

    @When("^Ingresar un menssage en el campo del mensaje$")
    public void ingresar_un_menssage_en_el_campo_del_mensaje() throws Throwable {
        driver.findElement( By.name("message")).sendKeys("Lorem Ipsum dolor sit amet");
    }

    @Then("^Seleccionar una de las opciones de select$")
    public void seleccionar_una_de_las_opciones_de_select() throws Throwable {
        Select topic = new Select( driver.findElement( By.id("topic-select-menu")) );
        topic.selectByVisibleText("Other");
    }

    @When("^Seleccionar una de las occiones de los radio button$")
    public void seleccionar_una_de_las_occiones_de_los_radio_button() throws Throwable {
        driver.findElement( By.id("no_newsletter")).click();
    }

    @Then("^Seleccionar el checkbox$")
    public void seleccionar_el_checkbox() throws Throwable {
        WebElement condiciones = driver.findElement( By.id("conditions"));
        
        if( !condiciones.isSelected() ){
            condiciones.sendKeys(Keys.SPACE);
        }
    }

    @When("^Hacer click en enviar$")
    public void hacer_click_en_enviar() throws Throwable {
        hook.tearDown();
    }
}
