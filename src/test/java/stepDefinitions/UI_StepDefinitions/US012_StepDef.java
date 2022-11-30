package stepDefinitions.UI_StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import pages.MedunnaPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.awt.*;
import java.awt.event.KeyEvent;

public class US012_StepDef {
    MedunnaPage locate = new MedunnaPage();
    JavascriptExecutor js = new JavascriptExecutor() {
        @Override
        public Object executeScript(String script, Object... args) {
            return null;
        }

        @Override
        public Object executeAsyncScript(String script, Object... args) {
            return null;
        }


    };

    Actions action = new Actions(Driver.getDriver());


    @Given("yaDoktor {string} adresine gider")
    public void yadoktorAdresineGider(String arg0) {
        Driver.getDriver().get(ConfigReader.getProperty("medunnaUrl"));
    }

    @Then("yaDoktor login sekmesini tiklar")
    public void yadoktorLoginSekmesiniTiklar() {
        ReusableMethods.waitFor(3);
        locate.ilkKutusu.click();
    }

    @And("yaDoktor sign in sekmesine tiklar")
    public void yadoktorSignInSekmesineTiklar() {
        locate.signButonu.click();
        ReusableMethods.waitFor(3);
    }


    @And("yaDoktor geçerli bir username girer")
    public void yadoktorGeçerliBirUsernameGirer() {
        locate.usernamey.sendKeys(ConfigReader.getProperty("usernamey"));
        ReusableMethods.waitFor(3);
    }

    @And("yaDoktor geçerli bir password girer")
    public void yadoktorGeçerliBirPasswordGirer() {
        locate.passwordy.sendKeys(ConfigReader.getProperty("passwordy"));
        ReusableMethods.waitFor(3);
        //password
    }

    @And("yaDoktor signin butonuna tiklar")
    public void yadoktorSigninButonunaTiklar() {
        locate.signikinciButonu.click();
        ReusableMethods.waitFor(3);
    }
    @Then("Doktor MY PAGES sekmesine tiklar")
    public void doktor_my_pages_sekmesine_tiklar () {
        ReusableMethods.waitFor(3);

        locate.mypages.click();
    }

    @Then("Doktor My Appointments sekmesine tiklar")
    public void doktor_my_appointments_sekmesine_tiklar () {

        locate.myappointments.click();
    }

    @Then("Doktor hastanin edit sekmesine tiklar")
    public void doktor_hastanin_edit_sekmesine_tiklar () {

        locate.editsekmesi.click();
    }

    @Then("Doktor hastanin sayfasında Request A Test sekmesine tiklar")
    public void doktor_hastanin_sayfasında_request_a_test_sekmesine_tiklar () {
        ReusableMethods.waitFor(2);
        locate.requesttext.click();
        ReusableMethods.waitFor(2);


    }
    @And("Doctor Test item yazisini görür")
    public void doctorTestItemYazisiniGörür() {

        locate.testitemyazisi.isDisplayed();
    }
    @Then("sayfa belirlenen ölcüde kücülür")
    public void sayfaBelirlenenÖlcüdeKücülür () throws AWTException {

        Robot robot = new Robot();
        for (int i = 0; i < 4; i++) {
            robot.keyPress(KeyEvent.VK_CONTROL); //CTRL ye tiklandi
            robot.keyPress(KeyEvent.VK_SUBTRACT); // - ye tiklandi

            ReusableMethods.waitFor(1);
            robot.keyRelease(KeyEvent.VK_SUBTRACT); // CTRL yi birakti
            robot.keyRelease(KeyEvent.VK_CONTROL); //- yi birakti
            ReusableMethods.waitFor(1);
            robot.keyRelease(KeyEvent.VK_SUBTRACT); // CTRL yi birakti
            robot.keyRelease(KeyEvent.VK_CONTROL); //- yi birakti
            ReusableMethods.waitFor(1);
            robot.keyRelease(KeyEvent.VK_SUBTRACT); // CTRL yi birakti
            robot.keyRelease(KeyEvent.VK_CONTROL); //- yi birakti
            // CTRL (-) ye basılarak ekran belirlenen miktarda küçültülmüş oldu.

        }
    }
    @And("Doktor Glucose,Urea,Creatinine, Sodium Potassium,Total protein, Albumin, Hemoglobin testi secer")
    public void doktorGlucoseUreaCreatinineSodiumPotassiumTotalProteinAlbuminHemoglobinTestiSecer() {



        js.executeScript("arguments[0].click();",locate.testsUrea);
        js.executeScript("arguments[0].click();",locate.testsAlbumin);
        js.executeScript("arguments[0].click();",locate.testsHemoglobin);
        js.executeScript("arguments[0].click();",locate.testsGlucose);
        js.executeScript("arguments[0].click();",locate.testsCreatine);
        js.executeScript("arguments[0].click();",locate.testsPotassium);
        js.executeScript("arguments[0].click();",locate.testsTotalProtein);
        js.executeScript("arguments[0].click();",locate.testsSodium);
        js.executeScript("arguments[0].click();",locate.testsSaveButton);
    }

    @Then("Doktor Testlerin kaydedildigi kontrol edilir")
    public void doktor_testlerin_kaydedildigi_kontrol_edilir () {
        Assert.assertTrue(locate.alertButton.isDisplayed());

    }
    @Then("Doktor Kullanici sayfayi kapatir")
    public void doktor_kullanici_sayfayi_kapatir () {
        Driver.closeDriver();
    }


}
