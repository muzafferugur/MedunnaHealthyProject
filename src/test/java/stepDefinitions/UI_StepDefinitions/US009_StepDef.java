package stepDefinitions.UI_StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.checkerframework.checker.units.qual.K;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import pages.MedunnaPage;

import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.List;

public class US009_StepDef {
  MedunnaPage us09 = new MedunnaPage();
    List<WebElement> patientsLists;
    Actions actions = new Actions(Driver.getDriver());

    @Given("SG kullanici {string} sayfasina gider")
    public void kullaniciSayfasinaGider(String arg0) {
        Driver.getDriver().get(ConfigReader.getProperty("medunnaUrl"));

    }

    @And("SG Sayfanin sag üst köşesinde yer alan  ikona tıklar")
    public void sayfaninSagUstKosesindeYerAlanIkonaTiklar() {
        us09.girisIkonu.click();
    }

    @Then("SG Acilan dropdown menude Sign in butonuna tıklar")
    public void acilanDropdownMenudeSignInButonunaTiklar() {
        us09.IlksignIn.click();
    }

    @And("SG Username olarak {string} girer")
    public void usernameOlarakGirer(String arg0) {
        us09.username.sendKeys(ConfigReader.getProperty("perUsername"));
    }

    @And("SG Password olarak {string} girer")
    public void passwordOlarakGirer(String arg0) {
        us09.password.sendKeys(ConfigReader.getProperty("perPassword"));
    }

    @And("SG Sign in butonuna basar")
    public void signInButonunaBasar() {
        us09.ikinciSignIn.click();
    }

    @Then("SG MYPAGES dropdown menusune tıklar")
    public void mypagesDropdownMenusuneTiklar() {
        ReusableMethods.scrollIntoView(us09.myPagesButton);
        us09.myPagesButton.click();
    }

    @And("SG Search Patient butonuna tıklar")
    public void searchPatientButonunaTiklar() {
        ReusableMethods.scrollIntoView(us09.searchPatientButton);
        us09.searchPatientButton.click();
    }

    @Then("SG Patients tablosunun ve hasta bilgilerinin gorunur oldugunu test eder")
    public void patientsTablosununVeHastaBilgilerininGorunurOldugunuTestEder() {
        for (WebElement w : us09.patientsList) {
            w.isDisplayed();

        }
    }

    @And("SG Sayfayi kapatir")
    public void sayfayiKapatir() {
        Driver.quitDriver();
    }

    @Then("SG kullanici {int} sn bekler")
    public void kullaniciSnBekler(int arg0) {
        ReusableMethods.waitFor(2);
    }

    @Then("SG Tabloda bilgilerini düzenlenmek istedigi hastanın yanındaki edit butonuna tıklar")
    public void tablodaBilgileriniDüzenlenmekIstedigiHastanınYanındakiEditButonunaTıklar() {
        us09.ssnSearchBox.sendKeys("145-58-5806");
        ReusableMethods.scrollIntoView(us09.editButton);
        us09.editButton.click();
    }


    @And("SG Hasta bilgilerinin düzenlenebilir oldugunu test eder")
    public void hastaBilgilerininDüzenlenebilirOldugunuTestEder() {
        us09.userNameEdit.sendKeys("ali");
        actions.sendKeys(Keys.TAB).sendKeys("can").sendKeys(Keys.TAB).
                sendKeys("5555555555").sendKeys(Keys.TAB).sendKeys("zhasym@hotmail.com").sendKeys(Keys.TAB).
                sendKeys("4654654654").perform();
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.waitFor(2);
        us09.genderEdit.click();
        actions.sendKeys("female").sendKeys(Keys.ENTER).perform();
        us09.bloodGroupEdit.click();
        actions.sendKeys("o").sendKeys(Keys.ENTER).sendKeys(Keys.TAB).sendKeys("Cengiz Topel Cadessi").sendKeys(Keys.TAB).
                sendKeys("abcv").sendKeys(Keys.TAB).sendKeys("kimimetz").perform();
        us09.countrySearchBox.sendKeys("malta");
        ReusableMethods.scrollIntoView(us09.saveButton);
        us09.saveButton.click();
        ReusableMethods.waitFor(5);
        us09.cikanMesaj.isDisplayed();
        Assert.assertTrue(us09.hastaBilgileriGuncellemeFirstNameTextBoxElementi.isEnabled());
        Assert.assertTrue(us09.hastaBilgileriGuncellemeLastNameTextBoxElementi.isEnabled());
        Assert.assertTrue(us09.hastaBilgileriGuncellemeBirthDateTextBoxElementi.isEnabled());
        Assert.assertTrue(us09.hastaBilgileriGuncellemeEmailTextBoxElementi.isEnabled());
        Assert.assertTrue(us09.hastaBilgileriGuncellemePhoneTextBoxElementi.isEnabled());
        Assert.assertTrue(us09.hastaBilgileriGuncellemeGenderSelectMenuElementi.isEnabled());
        Assert.assertTrue(us09.hastaBilgileriGuncellemeBloodGroupSelectMenuElementi.isEnabled());
        Assert.assertTrue(us09.hastaBilgileriGuncellemeAdressTextBoxElementi.isEnabled());
        Assert.assertTrue(us09.hastaBilgileriGuncellemeDescriptionTextBoxElementi.isEnabled());
        Assert.assertTrue(us09.hastaBilgileriGuncellemeUserSelectMenuElementi.isEnabled());
        Assert.assertTrue(us09.hastaBilgileriGuncellemeCountrySelectMenuElementi.isEnabled());
        Assert.assertTrue(us09.hastaBilgileriGuncellemeStateSelectMenuElementi.isEnabled());


    }

    @Then("SG Patient SSN kısmına hastanın SSN bilgisini girer")
    public void patientSSNKısmınaHastanınSSNBilgisiniGirer() {
        us09.ssnSearchBox.sendKeys("145-58-5806");


    }

    @And("SG Ilgili hastanın yanındaki view butonuna tıklar")
    public void ılgiliHastanınYanındakiViewButonunaTıklar() {
        us09.wiewButton.click();
        //  us09.wiewButtonUs22.click();
        ReusableMethods.scrollIntoView(us09.wiewButtonUs22);
        us09.wiewButtonUs22.click();
    }

    @And("SG kayit bilgilerinin gorunur oldugunu test eder")
    public void kayitBilgilerininGorunurOldugunuTestEder() {
        us09.wiewDetails.isDisplayed();

    }

    @And("SG kayit bilgilerini siler ve Save butonuna tıklar")
    public void kayitBilgileriniSilerVeSaveButonunaTıklar() {


    }

    @And("SG bilgilerin silinip silinmedigini test eder")
    public void bilgilerinSilinipSilinmediginiTestEder() {

    }

    @And("SG Hastanın silinmediğini doğrular")
    public void hastanınSilinmediğiniDoğrular() {
    }

    @And("SG Arama yapabildigini ve istenilen hastanın gorunur oldugunu test eder")
    public void aramaYapabildiginiVeIstenilenHastanınGorunurOldugunuTestEder() {
        us09.wiewButton.click();
        us09.wiewDetails.isDisplayed();
        us09.ssnIleAramaSonucu.isDisplayed();

    }


}

