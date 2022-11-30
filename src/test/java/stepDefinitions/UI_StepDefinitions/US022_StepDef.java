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

public class US022_StepDef {
    MedunnaPage us22 = new MedunnaPage();
    Actions actions=new Actions(Driver.getDriver());

    @Given("kullanici {string} sayfasina gider")
    public void kullanici_sayfasina_gider(String string) {
        Driver.getDriver().get(ConfigReader.getProperty("medunnaUrl"));

    }

    @Then("Sayfanin sag üst köşesinde yer alan  ikona tıklar")
    public void sayfanin_sag_üst_köşesinde_yer_alan_ikona_tıklar() {
        us22.girisIkonu.click();

    }

    @Then("Acilan dropdown menude Sign in butonuna tıklar")
    public void acilan_dropdown_menude_sign_in_butonuna_tıklar() {
        us22.IlksignIn.click();

    }

    @Then("Username olarak {string} girer")
    public void username_olarak_girer(String string) {
        us22.username22.sendKeys(ConfigReader.getProperty("perUsername"));

    }

    @Then("Password olarak {string} girer")
    public void password_olarak_girer(String string) {
        us22.password22.sendKeys(ConfigReader.getProperty("perPassword"));
    }

    @Then("Sign in butonuna basar")
    public void sign_in_butonuna_basar() {
        us22.ikinciSignIn.click();

    }

    @Then("MYPAGES dropdown menusune tıklar")
    public void mypages_dropdown_menusune_tıklar() {
        ReusableMethods.scrollIntoView(us22.myPagesButton);
        us22.myPagesButton.click();
    }

    @Then("Search Patient butonuna tıklar")
    public void search_patient_butonuna_tıklar() {
        ReusableMethods.scrollIntoView(us22.searchPatientButton);
        us22.searchPatientButton.click();

    }

    @Then("Patient SSN kısmına hastanın SSN bilgisini girer")
    public void patient_ssn_kısmına_hastanın_ssn_bilgisini_girer() {
        us22.ssnSearchBox.sendKeys("145-58-5806");

    }

    @Then("Ilgili hastanın yanındaki view butonuna tıklar")
    public void ılgili_hastanın_yanındaki_view_butonuna_tıklar() {
        ReusableMethods.scrollIntoView(us22.wiewButtonUs22);
        us22.wiewButtonUs22.click();

    }

    @Then("kayit bilgilerinin gorunur oldugunu test eder")
    public void kayit_bilgilerinin_gorunur_oldugunu_test_eder() {
        us22.hastaBilgileri.isDisplayed();

    }

    @Then("Sayfayi kapatir")
    public void sayfayi_kapatir() {
        Driver.quitDriver();


    }
    @And("show appoinments box'i tiklar")
    public void showAppoinmentsBoxITiklar() {
        us22.showAppointmentsButton.click();
    }

    @And("Show Tests box'i tiklar")
    public void showTestsBoxITiklar() {
        us22.showTestsButton.click();
        ReusableMethods.waitFor(5);
    }

    @And("Staff View results butonuna tiklar")
    public void staffViewResultsButonunaTiklar() {
        us22.wiewResultButton.click();
        ReusableMethods.waitFor(5);
    }

    @And("Test sonuclarinin görünür olduğunu doğrular")
    public void testSonuclarininGörünürOlduğunuDoğrular() {
        us22.testList.isDisplayed();
    }

    @And("Kullanici Edit butonuna tiklar")
    public void kullaniciEditButonunaTiklar() {
        us22.editButton.click();
    }

    @And("Kullanici ID ,Date, CreateDateyi ,Testitem,Test,gorunur oldugunu dogrular")
    public void kullaniciIDDateCreateDateyiTestitemTestGorunurOldugunuDogrular() {
        us22.idSearchBox.isDisplayed();
        us22.dateCreatedSearchBox.isDisplayed();
        us22.testSearchBox.isDisplayed();
        us22.dateSearchBox.isDisplayed();
    }

    @And("Kullanici Result gunceller")
    public void kullaniciResultGunceller() {
        us22.resultSearchBox.sendKeys("sadasdasd");
    }

    @And("Kullanici description gunceller")
    public void kullaniciDescriptionGunceller() {
        us22.descriptionSearchBox.sendKeys("aasdasdas");
        actions.sendKeys(Keys.PAGE_DOWN);

    }

    @And("Kullanici save butonuna tiklar")
    public void kullaniciSaveButonunaTiklar() {
        ReusableMethods.waitFor(5);
        ReusableMethods.jsclick(us22.saveButton22);
        //  ReusableMethods.scrollIntoView(us22.saveButton);
        //   us22.saveButton.click();
    }

    @And("Güncellendiğini dogrular")
    public void güncellendiğiniDogrular() {
        us22.guncellendiYazisi.isDisplayed();
    }
}
