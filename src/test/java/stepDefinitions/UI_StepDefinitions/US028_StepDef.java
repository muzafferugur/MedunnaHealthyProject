package stepDefinitions.UI_StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import pages.MedunnaPage;

import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US028_StepDef {
    MedunnaPage us28 = new MedunnaPage();
    Actions actions = new Actions(Driver.getDriver());

    @Given("sayfanin sag ust kosesinde yeralan insan ikonuna tıklar")
    public void sayfanin_sag_ust_kosesinde_yeralan_insan_ikonuna_tıklar() {
        us28.girisIkonu.click();

    }

    @Then("acilan dropdown menude Sign in butonuna tıklar")
    public void acilan_dropdown_menude_sign_in_butonuna_tıklar() {
        us28.IlksignIn.click();

    }

    @Then("Admin username olarak {string} girer")
    public void admin_username_olarak_girer(String string) {
        us28.username09.sendKeys(ConfigReader.getProperty("adminUserName"));


    }

    @Then("Admin password olarak {string} girer")
    public void admin_password_olarak_girer(String string) {
        us28.password.sendKeys(ConfigReader.getProperty("adminPassword"));

    }

    @Then("Items&Titles dropdown menusune tıklar")
    public void ıtems_titles_dropdown_menusune_tıklar() {
        us28.itemTitelsButton.click();

    }

    @Then("Acilan menude Country secenegine tiklar")
    public void acilan_menude_country_secenegine_tiklar() {
        us28.countryButton.click();

    }

    @Then("Create a new Country butonuna tıklar")
    public void create_a_new_country_butonuna_tıklar() {
        us28.createNewCountry.click();

    }

    @Then("Eklemek istedigi ülke ismini girer")
    public void eklemek_istedigi_ülke_ismini_girer() {
        us28.nameTextBox.sendKeys("Samoli");
        ReusableMethods.waitFor(2);
        actions.sendKeys(Keys.TAB);

    }

    @Then("Tarihi girer")
    public void tarihi_girer() {
        us28.createdDateTextBox.sendKeys("28112022", Keys.TAB, "1456");

    }

    @Then("Save butonuna basar")
    public void save_butonuna_basar() {
        us28.countrySaveButton.click();

    }

    @Then("Ulke olusturulup olusturulmadıgını kontrol eder")
    public void ulke_olusturulup_olusturulmadıgını_kontrol_eder() {
        us28.countryIsCreated.isDisplayed();

    }

    @Then("sayfayi kapatir")
    public void sayfayi_kapatir() {
        Driver.quitDriver();
    }


    @And("Silmek istedigi Ulkenin yanindaki DELETE butonuna basar")
    public void         silmekIstedigiUlkeninYanindakiDELETEButonunaBasar() {
        // ReusableMethods.scrollIntoView(us28.countryName);
        //  ReusableMethods.jsclick(us28.countryName);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.waitFor(3);
        ReusableMethods.jsclick(us28.deleteButton);
        // us28.samoliClick.click();
        //   us28.samoliClick.click();
        //  ReusableMethods.waitFor(3);
        // actions.sendKeys(Keys.TAB,Keys.TAB,Keys.TAB,Keys.ENTER).perform();

    }

    @And("Silme istegini onaylar")
    public void silmeIsteginiOnaylar() {
        us28.deleteClick.click();
    }

    @And("silme isleminin gerceklestiğini doğrular")
    public void silmeIslemininGerceklestiğiniDoğrular() {
        us28.basariliIleSilindi.isDisplayed();

    }
}
