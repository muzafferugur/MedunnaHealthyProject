package stepDefinitions.UI_StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import pages.MedunnaPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US017_StepDef {
    MedunnaPage us017Page = new MedunnaPage();
    Actions actions = new Actions(Driver.getDriver());

    @Given("AdminHercai belirtilen URL' e gider")
    public void adminhercaiBelirtilenURLEGider() {
        Driver.getDriver().get(ConfigReader.getProperty("medunnaUrl"));
    }

    @And("AdminHercai sign in sekmesine tiklar")
    public void adminhercaiSignInSekmesineTiklar() {
        us017Page.kullaniciGirisBolumu.click();

    }

    @And("AdminHercai gecerli Username i girer")
    public void adminhercaiGecerliUsernameIGirer() {
        us017Page.signinGiris.click();
        us017Page.username.sendKeys("team11");


    }

    @When("AdminHercai gecerli Password u girer")
    public void adminhercaiGecerliPasswordUGirer() {
        us017Page.password.sendKeys("Pl123456789");
        us017Page.signinButton.click();
        ReusableMethods.waitFor(2);
    }

    @And("AdminHercai sign in butonuna tiklar")
    public void adminhercaiSignInButonunaTiklar() {
        us017Page.signinButton.click();
        ReusableMethods.waitFor(2);
    }

    @And("AdminHercai Items&Titles sekmesine tiklar")
    public void adminhercaiItemsTitlesSekmesineTiklar() {
        us017Page.us017_ItemsTitlesButonu.click();
    }

    @Then("AdminHercai Test Items sekmesine tiklar")
    public void adminhercaiTestItemsSekmesineTiklar() {
        us017Page.us017_TestItemButonu.click();
    }


    @Given("AdminHercai Create a New  Test Item butonunun oldugunu dogrular")
    public void adminhercaiCreateANewTestItemButonununOldugunuDogrular() {
        ReusableMethods.waitFor(2);
        Assert.assertTrue(us017Page.us017_CreateANewTestItemButonu.isDisplayed());

    }

    @Given("AdminHercai ilk View butonuna tiklar")
    public void adminhercaiIlkViewButonunaTiklar() {
        us017Page.us017_ViewButonu.click();
    }

    @And("AdminHercai Name, Description, Price, Default Min. Value, Default Max. Value ve Created Date yazilarinin gozuktugunu dogrular")
    public void adminhercaiNameDescriptionPriceDefaultMinValueDefaultMaxValueVeCreatedDateYazilarininGozuktugunuDogrular() {
        ReusableMethods.waitFor(2);
        Assert.assertTrue(us017Page.us017_Name.isDisplayed());
        Assert.assertTrue(us017Page.us017_Description.isDisplayed());
        Assert.assertTrue(us017Page.us017_Price.isDisplayed());
        Assert.assertTrue(us017Page.us017_DefaultMinValue.isDisplayed());
        Assert.assertTrue(us017Page.us017_DefaultMaxValue.isDisplayed());
        Assert.assertTrue(us017Page.us017_CreatedDate.isDisplayed());

    }

    @Given("AdminHercai kendi olusturdugu Test Item a gider")
    public void adminhercaiKendiOlusturduguTestItemAGider() {
        ReusableMethods.waitFor(1);
        us017Page.us017_IlkDeleteButonu.click();
    }

    @Then("AdminHercai Delete butonuna basar")
    public void adminhercaiDeleteButonunaBasar() {
        Assert.assertTrue(us017Page.us017_IkınciDeleteButonu.isDisplayed());
    }
}
