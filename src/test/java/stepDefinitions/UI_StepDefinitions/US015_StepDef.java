package stepDefinitions.UI_StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.MedunnaPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US015_StepDef {
    MedunnaPage us015Page = new MedunnaPage();
    Actions actions = new Actions(Driver.getDriver());

    @Given("AdminSevval belirtilen URL' e gider")
    public void adminsevvalBelirtilenURLEGider() {
        Driver.getDriver().get(ConfigReader.getProperty("medunnaUrl"));
    }

    @And("AdminSevval Sing in sekmesine tiklar")
    public void adminsevvalSingInSekmesineTiklar() {
        us015Page.kullaniciGirisBolumu.click();
    }

    @And("AdminSevval gecerli Username i girer")
    public void adminsevvalGecerliUsernameIGirer() {
        us015Page.signinGiris.click();
        us015Page.username.sendKeys("team11");
    }

    @And("AdminSevval gecerli Password u girer")
    public void adminsevvalGecerliPasswordUGirer() {
        us015Page.password.sendKeys("Pl123456789");
        us015Page.signinButton.click();
        ReusableMethods.waitFor(2);
    }

    @And("AdminSevval Sing in butonuna tiklar")
    public void adminsevvalSingInButonunaTiklar() {
        us015Page.signinButton.click();
        ReusableMethods.waitFor(1);
    }

    @When("AdminSevval Items&Titles sekmesine tiklar")
    public void adminsevvalItemsTitlesSekmesineTiklar() {
        us015Page.us017_ItemsTitlesButonu.click();
    }

    @Then("AdminSevval Patient Butonuna tiklar")
    public void adminsevvalPatientButonunaTiklar() {
        us015Page.us015_PatientButonu.click();
    }

    @Given("AdminSevval Create a new Patient butonuna tiklar")
    public void adminsevvalCreateANewPatientButonunaTiklar() {
        us015Page.us015_CreateANewPatientButonu.click();
    }

    @And("AdminSevval First Name kutusuna gecerli ismi girer")
    public void adminsevvalFirstNameKutusunaGecerliIsmiGirer() {
        ReusableMethods.waitFor(1);
        us015Page.us015_FirstNameKutusu.sendKeys("Damla Su");
    }

    @And("AdminSevval Last Name kutusuna gecerli ismi girer")
    public void adminsevvalLastNameKutusunaGecerliIsmiGirer() {
        actions.sendKeys(Keys.ENTER).sendKeys("Daglar").perform();
    }

    @And("AdminSevval Email kutusuna gecerli bir email girer")
    public void adminsevvalEmailKutusunaGecerliBirEmailGirer() {
        us015Page.us015_EmailKutusu.sendKeys("DamlaSu@gmail.com");
    }

    @And("AdminSevval Phone kutusuna gecerli bir numara girer")
    public void adminsevvalPhoneKutusunaGecerliBirNumaraGirer() {
        actions.sendKeys(Keys.TAB).sendKeys("0555 555 55 55");
    }

    @When("AdminSevval Save butonuna tiklar")
    public void adminsevvalSaveButonunaTiklar() {
        us015Page.us015_SaveButonu.click();
    }

    @When("AdminSevval Save butonunun oldugunu dogrular")
    public void adminsevvalSaveButonununOldugunuDogrular() {
        Assert.assertTrue(us015Page.us015_SaveButonu.isDisplayed());
    }
}

