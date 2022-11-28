package stepDefinitions.UI_StepDefinitions;
import io.cucumber.java.en.*;
import org.junit.Assert;

import pages.MedunnaPage;
import utilities.*;

public class US010_StepDef {

        MedunnaPage page=new MedunnaPage();
        @Given("Dr.Url adresine gider")
        public void dr_url_adresine_gider() {
            Driver.getDriver().get(ConfigReader.getProperty("medunnaUrl"));

        }
        @Then("Dr. Kullanici bilgi sekmesini tiklar")
        public void dr_kullanici_bilgi_sekmesini_tiklar() {
            page.ilkButon.click();

        }
        @Then("Dr. Login islemini gerceklestirir")
        public void dr_login_islemini_gerceklestirir() {
            page.signinGiris.click();
            ReusableMethods.waitFor(2);
            page.username.sendKeys(ConfigReader.getProperty("Drusername"));
            page.password.sendKeys(ConfigReader.getProperty("Drpassword"));
            ReusableMethods.waitFor(2);
            page.signinButtonKayit.click();
        }
        @Then("Dr. MY PAGES sekmesini tiklar")
        public void dr_my_pages_sekmesini_tiklar() {
            ReusableMethods.waitFor(1);
            page.myPages.click();

        }
        @Then("Dr. My Appointments sekmesine tiklar")
        public void dr_my_appointments_sekmesine_tiklar() {
            ReusableMethods.waitFor(1);
            page.myAppointments.click();
        }
        @Then("Dr. Hasta randevu listesini goruntuler")
        public void dr_hasta_randevu_listesini_goruntuler() {
            ReusableMethods.waitFor(1);
            Assert.assertTrue(page.hastaListesi.isDisplayed());
        }

        @And("Dr.kendi hastalarinin listesini gorur")
        public void drKendiHastalarininListesiniGorur() {
            ReusableMethods.waitFor(1);
            Assert.assertTrue(page.hastaListesi.isDisplayed());
        }

        @And("Dr. Kendine tanimlanan zaman dilimlerini gorur")
        public void drKendineTanimlananZamanDilimleriniGorur() {
            ReusableMethods.waitFor(1);
            Assert.assertTrue(page.zamanFrom.isDisplayed());
            Assert.assertTrue(page.zamanTo.isDisplayed());
        }

        @And("Dr.sayfayi kapatir")
        public void drSayfayiKapatir() {
            Driver.quitDriver();
        }

        @And("Dr. patient id, start date, end date, status bilgilerini goruntuler")
        public void drPatientIdStartDateEndDateStatusBilgileriniGoruntuler() {
            Assert.assertTrue(page.id.isDisplayed());
            ReusableMethods.waitFor(1);
            Assert.assertTrue(page.patient.isDisplayed());
            ReusableMethods.waitFor(1);
            Assert.assertTrue(page.startDateTime.isDisplayed());
            ReusableMethods.waitFor(1);
            Assert.assertTrue(page.endDateTime.isDisplayed());
            ReusableMethods.waitFor(1);
            Assert.assertTrue(page.status.isDisplayed());

        }
    }

