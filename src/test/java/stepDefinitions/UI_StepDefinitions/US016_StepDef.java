package stepDefinitions.UI_StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import pages.MedunnaPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.lang.ref.Cleaner;

public class US016_StepDef {

    MedunnaPage us016Page = new MedunnaPage();
    Actions actions = new Actions(Driver.getDriver());

    @Given("HercaiAdmin belirtilen URL' e gider")
    public void hercaiadminBelirtilenURLEGider() {
        Driver.getDriver().get(ConfigReader.getProperty("medunnaUrl"));
    }

    @And("HercaiAdmin Sing in sekmesine tiklar")
    public void hercaiadminSingInSekmesineTiklar() {
        us016Page.kullaniciGirisBolumu.click();
    }

    @And("HercaiAdmin gecerli Username i girer")
    public void hercaiadminGecerliUsernameIGirer() {
        us016Page.signinGiris.click();
        us016Page.username.sendKeys("team11");
    }

    @And("HercaiAdmin gecerli Password u girer")
    public void hercaiadminGecerliPasswordUGirer() {
        us016Page.password.sendKeys("Pl123456789");
        us016Page.signinButton.click();
        ReusableMethods.waitFor(2);
    }

    @When("HercaiAdmin Sing in butonuna tiklar")
    public void hercaiadminSingInButonunaTiklar() {
        us016Page.signinButton.click();
        ReusableMethods.waitFor(2);
    }

    @And("HercaiAdmin Items&Titles sekmesine tiklar")
    public void hercaiadminItemsTitlesSekmesineTiklar() {
        us016Page.us017_ItemsTitlesButonu.click();
    }

    @Then("HercaiAdmin Room sekmesine tiklar")
    public void hercaiadminRoomSekmesineTiklar() {
        us016Page.us016_RoomButonu.click();
    }

    @Given("HercaiAdmin Create a new Room butonu oldugunu dogrular")
    public void hercaiadminCreateANewRoomButonuOldugunuDogrular() {
        Assert.assertTrue(us016Page.us016_CreateANewRoom.isDisplayed());
    }

    @Given("HercaiAdmin Create a new Room butonuna tiklar")
    public void hercaiadminCreateANewRoomButonunaTiklar() {
        us016Page.us016_CreateANewRoom.click();
    }

    @And("HercaiAdmin Room Number yazisini gordugunu dogrular")
    public void hercaiadminRoomNumberYazisiniGordugunuDogrular() {
        Assert.assertTrue(us016Page.us016_RoomNumberYazisi.isDisplayed());
    }

    @Then("HercaiAdmin Room Type da TWIN, DELUXE, PREMIUM_DELUXE, SUIT ve DAYCARE seceneklerinin oldugunu dogrular")
    public void hercaiadminRoomTypeDaTWINDELUXEPREMIUM_DELUXESUITVeDAYCARESeceneklerininOldugunuDogrular() {
        ReusableMethods.waitForVisibility(us016Page.us016_RoomTypeButonu, 2);
        Assert.assertTrue(us016Page.us016_RoomTypeButonu.isDisplayed());
    }

    @And("HercaiAdmin Status seceneginin tiklandigini dogrular")
    public void hercaiadminStatusSecenegininTiklandiginiDogrular() {
        Assert.assertTrue(us016Page.us016_StatusYazisi.isDisplayed());
    }

    @And("HercaiAdmin Price box in oldugunu dogrular")
    public void hercaiadminPriceBoxInOldugunuDogrular() {
        Assert.assertTrue(us016Page.us016_PriceYazisi.isDisplayed());
    }

    @When("HercaiAdmin Price box ine bir veri girmeden Save butonuna basar")
    public void hercaiadminPriceBoxIneBirVeriGirmedenSaveButonunaBasar() {
        us016Page.us016_SaveButonu.click();
    }

    @Then("HercaiAdmin This field is required. yazisinin ciktigini dogrular")
    public void hercaiadminThisFieldIsRequiredYazisininCiktiginiDogrular() {
        ReusableMethods.waitFor(2);
        Assert.assertTrue(us016Page.us016_UyariMesaji.isDisplayed());
    }

    @And("HercaiAdmin Room Number kutucuguna gecerli bir sayi girer")
    public void hercaiadminRoomNumberKutucugunaGecerliBirSayiGirer() {
        us016Page.us016_RoomNumberBox.sendKeys("27");
    }

    @And("HercaiAdmin Price Kutucugunu doldurur")
    public void hercaiadminPriceKutucugunuDoldurur() {
        us016Page.us016_PriceBox.sendKeys("100");

    }

    @When("HercaiAdmin Description kutucugunun oldugunu dogrular ve icine bir veri girmez")
    public void hercaiadminDescriptionKutucugununOldugunuDogrularVeIcineBirVeriGirmez() {
        Assert.assertTrue(us016Page.us016_DescriptionYazisi.isDisplayed());
    }

    @And("HercaiAdmin Save butonuna tiklar")
    public void hercaiadminSaveButonunaTiklar() {
        us016Page.us016_SaveButonu.click();
    }

    @Then("HercaiAdmin olusturdugu odanin oldugunu dogrular")
    public void hercaiadminOlusturduguOdaninOldugunuDogrular() {
        Assert.assertTrue(us016Page.us016_ViewButonu.isDisplayed());
    }

    @Given("HercaiAdmin Room Type sekmesine basilabildigini dogrular")
    public void hercaiadminRoomTypeSekmesineBasilabildiginiDogrular() {
        ReusableMethods.waitFor(2);
        us016Page.us016_IlkSayfadakiRoomTypeYazisi.click();
        Assert.assertTrue(us016Page.us016_IlkSayfadakiRoomTypeYazisi.isDisplayed());
    }


    @Given("HercaiAdmin Edit butonuna tiklar")
    public void hercaiadminEditButonunaTiklar() {
        us016Page.us016_EditButonu.click();

    }

    @And("HercaiAdmin Price i degistirir")
    public void hercaiadminPriceIDegistirir() {
        ReusableMethods.waitFor(1);
        us016Page.us016_PriceBox.sendKeys(Keys.CLEAR);
        us016Page.us016_PriceBox.sendKeys("27000");
    }

    @When("HercaiAdmin editdeki Save butonuna tiklar")
    public void hercaiadminEditdekiSaveButonunaTiklar() {
        us016Page.us016_SaveButonu.click();
    }

    @Then("HercaiAdmin Price in degistigini dogrular")
    public void hercaiadminPriceInDegistiginiDogrular() {
        us016Page.us016_ViewButonu.click();
        Assert.assertTrue(us016Page.us016_PriceYazisi.isDisplayed());
    }


    @Given("HercaiAdmin daha once olusturdugu ve guncelledigi odaya gider Delete butonuna basar")
    public void hercaiadminDahaOnceOlusturduguVeGuncelledigiOdayaGiderDeleteButonunaBasar() {
        us016Page.us016_BirinciDeleteButonu.click();
    }

    @And("HercaiAdmin ikinci Delete butonununun oldugunu dogrular")
    public void hercaiadminIkinciDeleteButonunununOldugunuDogrular() {
        Assert.assertTrue(us016Page.us016_IkinciDeleteButonu.isDisplayed());
    }
}
