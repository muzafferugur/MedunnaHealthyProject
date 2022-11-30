package stepDefinitions.UI_StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.MedunnaPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US014_StepDef {
    MedunnaPage locate = new MedunnaPage();
    @Given("ydoctor {string} adresine gider.")
    public void kullanıcıAdresineGider(String arg0) {
        Driver.getDriver().get(ConfigReader.getProperty("medunnaUrl"));
    }

    @Then("ydoctor signin sekmesini tıklar")
    public void kullanıcı_signin_sekmesini_tıklar() {
        ReusableMethods.waitFor(3);
        locate.ilkKutusu.click();
        locate.signButonu.click();
    }

    @Then("ydoctor geçerli bir username girer")
    public void kullanıcı_geçerli_bir_username_girer() {
        locate.usernamey.sendKeys(ConfigReader.getProperty("usernamey"));
        //usurname
    }

    @Then("ydoctor geçerli bir password girer")
    public void kullanıcı_geçerli_bir_password_girer() {
        locate.passwordy.sendKeys(ConfigReader.getProperty("passwordy"));
    }

    @Then("ydoctor Signin butonuna tıklar")
    public void signin_butonuna_tıklar() {
        locate.signikinciButonu.click();
    }

    @Then("{string} sekmesine tıklar")
    public void sekmesine_tıklar(String string) {
        ReusableMethods.waitFor(3);
        locate.mypages.click();
    }

    @And("My Inpatients sekmesine tıklar")
    public void myInpatientsSekmesineTıklar() {
        locate.myinpatients.click();

    }

    @And("Doktor ID, start and end dates, description, created datappointment id, status,room and  patient bilgilerini görüntüleyebilir")
    public void doktorIDStartAndEndDatesDescriptionCreatedDatappointmentIdStatusRoomAndPatientBilgileriniGörüntüleyebilir() {
        ReusableMethods.waitFor(3);
        ReusableMethods.thead();
    }

    @Then("Adının üstüne tıkladıgında acılan signout sekmesine tıklayarak cikis yapabilir")
    public void adının_üstüne_tıkladıgında_acılan_signout_sekmesine_tıklayarak_cikis_yapabilir() {
        locate.hesap.click();
        ReusableMethods.waitFor(3);
        locate.signout.click();
        Driver.closeDriver();
    }


}
