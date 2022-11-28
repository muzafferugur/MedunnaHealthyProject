package hook;



import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utilities.*;

    public class Hooks {
// Cucumber'da feature ve stepdefinitions eslesmesi class seviyesinde degil
        // package seviyesindedir
        // dolayisiyla @Before ve @After stepdefinitions packagesi altinda herhangibir yerde olabilir
        // ancak uygulamada genellikle Hooks isminde bir class olusturup onun icinde konulur

        @Before
        public void setUp(){
        }
        @After
        public void tearDown(Scenario scenario){
            final byte[] screenshot=((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            if (scenario.isFailed()) {
                scenario.attach(screenshot, "image/png","screenshots");
            }
            //Driver.closeDriver();

        }
    }
