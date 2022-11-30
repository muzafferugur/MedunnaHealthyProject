package stepDefinitions.UI_StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.MedunnaPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US013_StepDef {
    MedunnaPage locate = new MedunnaPage();

    @Given("yDoktor {string} adresine gidebilir")
    public void ydoktorAdresineGidebilir(String arg0) {
        Driver.getDriver().get(ConfigReader.getProperty("medunnaUrl"));
    }


    @Then("yDoktor signin sekmesini tıklar")
    public void ydoktorSigninSekmesiniTıklar() {
        ReusableMethods.waitFor(3);
        locate.ilkKutusu.click();
        locate.signButonu.click();

    }

    @Then("yDoktor geçerli bir username girer")
    public void ydoktorGeçerliBirUsernameGirer() {

        locate.usernamey.sendKeys(ConfigReader.getProperty("usernamey"));
    }

    @And("yDoktor geçerli bir password girer")
    public void ydoktorGeçerliBirPasswordGirer() {
        locate.passwordy.sendKeys(ConfigReader.getProperty("passwordy"));

    }

    @Then("Sign in butonuna tıklar")
    public void sign_in_butonuna_tıklar() {

        locate.signikinciButonu.click();
    }

    @And("MY PAGES  sekmesine tıklar")
    public void myPAGESSekmesineTıklar() {
        ReusableMethods.waitFor(3);
        locate.mypages.click();
        //pages
    }

    @And("My Appointments sekmesine tıklar")
    public void myAppointmentsSekmesineTıklar() {

        locate.myappointments.click();
    }

    @Then("Doctor hastanın edit sekmesine tıklar")
    public void doctor_hastanın_edit_sekmesine_tıklar() {

        locate.editsekmesi.click();
        ReusableMethods.waitFor(4);
    }

    @Then("Doctor show Test Result sekmesine tıklar")
    public void doctor_show_test_result_sekmesine_tıklar() {
        locate.showtest.click();
        ReusableMethods.waitFor(10);

    }

    @Then("Doctor view results diyerek test sonuclarını görüntüler")
    public void doctor_view_results_diyerek_test_sonuclarını_görüntüler() {
        locate.viewresult.click();
        ReusableMethods.waitFor(10);
    }
    @And("Doctor hastadan istenen sonucların {string}")
    public void doctorHastadanIstenenSonucların(String test) {

        ReusableMethods.liste();
    }

        /*
            @And("Doctor Request Inpatient sekmesine tıklar")
            public void doctorRequestInpatientSekmesineTıklar() {
                locate.bastarih.sendKeys("28/11/2022");
                ResuableMethods.waitFor(2);
                locate.bastarih.sendKeys("09/12/2022");
                ResuableMethods.waitFor(2);

                locate.Requestonpaint.click();
                ResuableMethods.waitFor(4);

            }



            @And("Doctor basarılı yazısını görünteler")
            public void doctorBasarılıYazısınıGörünteler() {



            }

         */

    @And("Doctor hastaya yatıs verdigini kontrol eder")
    public void doctorHastayaYatısVerdiginiKontrolEder() {
        locate.mypages.click();
        ReusableMethods.waitFor(1);
        locate.myinpatients.click();
        ReusableMethods.waitFor(2);
        Assert.assertTrue(locate.hastaid.isDisplayed());
    }

    @And("Doctor hesapadının üstüne  clik yapar")
    public void doctorHesapadınınÜstüneClikYapar() {
        locate.hesap.click();
        ReusableMethods.waitFor(3);
    }

    @And("signout yaparak cikis yapar")
    public void signoutYaparakCikisYapar() {

        locate.signout.click();
        Driver.closeDriver();
    }
}
