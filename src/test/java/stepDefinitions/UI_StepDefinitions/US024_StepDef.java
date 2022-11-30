package stepDefinitions.UI_StepDefinitions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.MedunnaPage;
import utilities.Driver;
import utilities.ReusableMethods;
public class US024_StepDef {
    MedunnaPage page = new MedunnaPage();
    Actions actions = new Actions(Driver.getDriver());
    @Given("Kullanici acilan sayfada Username bolumune gecerli bir kullanıcı adı {string} girer")
    public void kullaniciAcilanSayfadaUsernameBolumuneGecerliBirKullanıcıAdıGirer(String username) {
        page.username.click();
        actions.sendKeys(username, Keys.TAB).perform();
    }
    @And("Kullanici acilan sayfada Password bolumune gecerli bir sifre {string} girer")
    public void kullaniciAcilanSayfadaPasswordBolumuneGecerliBirSifreGirer(String password) {
        actions.sendKeys(password, Keys.TAB, Keys.SPACE, Keys.TAB, Keys.TAB, Keys.TAB, Keys.ENTER).perform();
    }
    @And("Kullanici my appointments iconuna tiklar")
    public void kullaniciMyAppointmentsIconunaTiklar() {
        ReusableMethods.jsclick(page.myAppointment);
    }
    @Then("Kullanici my appointments sayfasina geldigini dogrular")
    public void kullaniciMyAppointmentsSayfasinaGeldiginiDogrular() {
        String expectedUrl = "https://medunna.com/patient-appointment";
        String actualUrl = Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(expectedUrl, actualUrl);
    }
    @And("Kullanici my appointments sayfasinda show test butonuna tiklar")
    public void kullaniciMyAppointmentsSayfasindaShowTestButonunaTiklar() {
        ReusableMethods.waitForVisibility(page.showTests,5);
        page.showTests.click();
    }
    @And("Kullanici test sayfasinda wiev result butonuna tiklar")
    public void kullaniciTestSayfasindaWievResultButonunaTiklar() {
        ReusableMethods.waitForVisibility(page.viewTest,2);
        page.viewTest.click();
    }
    @Then("Kullanici test result sayfasinda test sonuclari sayfasinda bolumleri gordugunu dogrular")
    public void kullaniciTestResultSayfasindaTestSonuclariSayfasindaBolumleriGordugunuDogrular() {
        Assert.assertTrue(page.testResult.isDisplayed());
    }
    @And("Kullanici cikis yapar")
    public void kullaniciCikisYapar() {
        ReusableMethods.jsclick(page.hastaPage);
        page.signOut.click();
    }
    @Given("Kullanici my appointments sayfasinda show invonce butonuna tiklar")
    public void kullaniciMyAppointmentsSayfasindaShowInvonceButonunaTiklar() {
        ReusableMethods.waitForVisibility(page.showinvoice,5);
        page.showinvoice.click();
    }
    @Then("Kullanici invonce sayfasina girdigini dogrular")
    public void kullaniciInvonceSayfasinaGirdiginiDogrular() {
//        String expectedData="https://medunna.com/patient-invoice-show/348056";
        Assert.assertTrue(page.invoice.isDisplayed());
    }
    @Then("Kullanici faturasinin {int} $ oldugunu dogrular")
    public void kullaniciFaturasinin$OldugunuDogrular(int arg0) {
        Assert.assertTrue(page.fatura.isDisplayed());
    }
}
