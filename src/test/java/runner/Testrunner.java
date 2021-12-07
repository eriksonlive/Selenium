package runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

 @RunWith(Cucumber.class)
 @CucumberOptions( 
    features = {"src/test/java/features"},
    glue = {"seleniumgluecode" },
    //plugin = {"com.vimalselvam.cucumber.listener.ExtentCucumberFormatter:resources/cucumber-reports/report.html"}
   plugin = {"json:test/report/cucumber_report.json"}
)

public class Testrunner {

   @AfterClass
   public static void finish(){

      try {
         System.out.println("Generando Reporte");
         String[] cmd = {"cmd.exe", "/c", "npm run report"};
         Runtime.getRuntime().exec(cmd);
         System.out.println("El reporte se ha generado exitosamente");
      } catch (Exception e) {
         e.getStackTrace();
      }
   }
}
