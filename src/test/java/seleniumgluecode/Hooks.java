package seleniumgluecode;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {

    private static int numberOfCase = 0;
    private static ChromeDriver driver;
    private ChromeOptions opciones = new ChromeOptions();

    @Before
    public void setUp(){
        numberOfCase++;
        System.out.println("Se esta ejecutando el Scenario #" + numberOfCase);
        System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver/chromedriver.exe");
        opciones.addArguments("--headless");
        driver = new ChromeDriver();
        driver.get("http://localhost:9080/");
        driver.manage().window().maximize();
    }

    @After
    public void tearDown(){
        System.out.println("El Scenario #" + numberOfCase + " Se ejecuto correctamente");
        driver.quit();
    }

    public static ChromeDriver getDriver(){
        return driver;
    }
    
}
