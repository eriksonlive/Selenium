package seleniumgluecode;

import org.junit.Assert;
import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.Select;

//import cucumber.api.PendingException;
//import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;

public class RutesHome {

    private ChromeDriver driver = Hooks.getDriver();
    Hooks hook = new Hooks();
    String urlHome = "http://localhost:9080/";

    @Given("^Verifico desde el navegador que si me encuentre en la pagina principal$")
    public void verifico_desde_el_navegador_que_si_me_encuentre_en_la_pagina_principal() throws Throwable {
        Assert.assertEquals(urlHome , driver.getCurrentUrl().toString());
    }

    @Then("^Me dirijo al boton history y doy click$")
    public void me_dirijo_al_boton_history_y_doy_click() throws Throwable {
        WebElement linkH = driver.findElement(By.xpath("/html/body/app-root/app-home/header/app-nav/nav/div/ul/li[2]/a"));
        linkH.click();
    }

    @Then("^Verifico la url de history, que si sea la correcta$")
    public void verifico_la_url_que_si_sea_la_correcta() throws Throwable {
        String url = driver.getCurrentUrl().toString();
        Assert.assertEquals(urlHome + "#history" , url);
        System.out.println(url);
    }

    @Then("^Me dirijo al boton products y doy click$")
    public void me_dirijo_al_boton_products_y_doy_click() throws Throwable {
        WebElement linkP = driver.findElement(By.xpath("/html/body/app-root/app-home/header/app-nav/nav/div/ul/li[3]/a"));
        linkP.click();
    }

    @Then("^Verifico la url de products que si sea la correcta$")
    public void verifico_la_url_de_products_que_si_sea_la_correcta() throws Throwable {
        String url = driver.getCurrentUrl().toString();
        Assert.assertEquals(urlHome + "#products", url);
        System.out.println(url);
    }

    @Then("^Me dirijo al boton guarantee y doy click$")
    public void me_dirijo_al_boton_guarantee_y_doy_click() throws Throwable {
        WebElement linkG = driver.findElement(By.xpath("/html/body/app-root/app-home/header/app-nav/nav/div/ul/li[4]/a"));
        linkG.click();
    }

    @Then("^Verifico la url de guarantee que si sea la correcta$")
    public void verifico_la_url_de_guarantee_que_si_sea_la_correcta() throws Throwable {
        String url = driver.getCurrentUrl().toString();
        Assert.assertEquals(urlHome + "#guarantee", url);
        System.out.println(url);
    }

    @Then("^Me dirijo al boton contact y doy click$")
    public void me_dirijo_al_boton_contact_y_doy_click() throws Throwable {
        WebElement linkC = driver.findElement(By.xpath("/html/body/app-root/app-home/header/app-nav/nav/div/ul/li[5]/a"));
        linkC.click();
    }

    @Then("^Verifico la url de contact que si sea la correcta$")
    public void verifico_la_url_de_contact_que_si_sea_la_correcta() throws Throwable {
        String url = driver.getCurrentUrl().toString();
        Assert.assertEquals(urlHome + "#contact", url);
        System.out.println(url);
    }

    @Then("^Me dirijo al boton people y doy click$")
    public void me_dirijo_al_boton_people_y_doy_click() throws Throwable {
        WebElement linkC = driver.findElement(By.xpath("/html/body/app-root/app-home/header/app-nav/nav/div/ul/li[6]/a"));
        linkC.click();
    }

    @Then("^Verifico la url de people que si sea la correcta$")
    public void verifico_la_url_de_people_que_si_sea_la_correcta() throws Throwable {
        String url = driver.getCurrentUrl().toString();
        Assert.assertEquals(urlHome + "#people", url);
        System.out.println(url);
    }

    @Then("^Me dirijo al boton home y doy click$")
    public void me_dirijo_al_boton_home_y_doy_click() throws Throwable {
        WebElement linkC = driver.findElement(By.xpath("/html/body/app-root/app-home/header/app-nav/nav/div/ul/li[1]/a"));
        linkC.click();
    }

    @Then("^Verifico la url de home que si sea la correcta$")
    public void verifico_la_url_de_home_que_si_sea_la_correcta() throws Throwable {
        String url = driver.getCurrentUrl().toString();
        Assert.assertEquals(urlHome, url);
        System.out.println(url);
        hook.tearDown();
    }

    // @Given("^Start to type your Given step here$")
    // public void start_to_type_your_Given_step_here() throws Throwable {
    //     String titleHomePage = "imalittletester – Testing. With Java, Selenium, TestNG, Maven, Spring, IntelliJ and friends.";
    //     Assert.assertEquals(titleHomePage, driver.getTitle());
    // }

    // @When("^Start to type your When step here$")
    // public void start_to_type_your_When_step_here() throws Throwable{
    //     WebElement locacion = driver.findElement(By.id("menu-item-2008"));
    //     locacion.click();
    // }

    // @Then("^Start to type your Then step here$")
    // public void start_to_type_your_Then_step_here() throws Throwable{
    //     WebElement pageTitle = driver.findElement(By.xpath("/html/body/div[1]/section/div/div/div/div/header/h1"));
    //     Assert.assertTrue("No se redirecciono correctamente a la pagin de comics", pageTitle.isDisplayed());
    //     Assert.assertEquals("Category: comics", pageTitle.getText());
    //     hook.tearDown();
    // }

}
