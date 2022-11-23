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

public class US004StepDefs {
    MedunnaPage page = new MedunnaPage();
    Actions actions = new Actions(Driver.getDriver());

    @And("Sign in butonuna tiklar")
    public void signInButonunaTiklar() {
        ReusableMethods.jsclick(page.signIn);

    }

    @Given("Kullanici acilan sayfada Username bolumune gecerli bir kullanıcı adı girer")
    public void kullaniciAcilanSayfadaUsernameBolumuneGecerliBirKullaniciAdiGirer() {
        ReusableMethods.jsclick(page.username);
        actions.sendKeys("Batch81", Keys.TAB).perform();

    }

    @And("Kullanici acilan sayfada Password bolumune gecerli bir sifre girer")
    public void kullaniciAcilanSayfadaPasswordBolumuneGecerliBirSifreGirer() {
        actions.sendKeys("Batch81+", Keys.TAB, Keys.SPACE, Keys.TAB, Keys.TAB, Keys.TAB, Keys.ENTER).perform();
      // page.signOut.click();

    }

    @And("Kullanici giris yapmak için başari mesajını dogrular")
    public void kullaniciGirisYapmakIçinBaşariMesajınıDogrular() {
        Assert.assertTrue(page.girisText.isDisplayed());
    }


    @Given("Kullanıcının mevcut kimlik bilgilerini her zaman kullanabilecegi, {string} seçenegini tiklar")
    public void kullanıcınınMevcutKimlikBilgileriniHerZamanKullanabilecegiSeçeneginiTiklar(String arg0) {
     page.rememberMe.click();
     actions.sendKeys(Keys.SPACE,Keys.TAB,Keys.TAB,Keys.TAB,Keys.ENTER).perform();


    }

    @Then("Kullanıcının  {string} seçeneginin tiklandıgını dogrular")
    public void kullanıcınınSeçenegininTiklandıgınıDogrular(String arg0) {
        Assert.assertTrue(page.girisText.isDisplayed());
    }

    @Given("Kullanici acilan sayfada eger şifre unutulursa diye {string} seçenegine tiklar")
    public void kullaniciAcilanSayfadaEgerŞifreUnutulursaDiyeSeçenegineTiklar(String arg0) {
        ReusableMethods.jsclick(page.username);
        actions.sendKeys("Batch81", Keys.TAB).perform();
        page.rememberMe.click();
        page.didYouForget.click();

    }

    @Then("Kullanici acilan sayfada {string} yazisini dogrular")
    public void kullaniciAcilanSayfadaYazisiniDogrular(String arg0) {
        Assert.assertTrue(page.resetPassword.isDisplayed());
    }

    @Given("Kullanici acilan sayfada {string} seçenegi tiklar")
    public void kullaniciAcilanSayfadaSeçenegiTiklar(String arg0) {
        page.accountGo.click();
    }

    @Then("Kullanici acilan sayfada Registration sayfasina yonlendirildigini dogrular")
    public void kullaniciAcilanSayfadaRegistrationSayfasinaYonlendirildiginiDogrular() {
        String expectedUrl="https://medunna.com/account/register";
        String actualUrl=Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(expectedUrl,actualUrl);

    }

    @Given("Kullanici acilan sayfada {string} secenegine tiklar")
    public void kullaniciAcilanSayfadaSecenegineTiklar(String arg0) {
        page.cancel.click();
    }

    @Then("Kullanici {string} ana sayfasina gittigini dogrular")
    public void kullaniciAnaSayfasinaGittiginiDogrular(String arg0) {
Assert.assertTrue(page.anaSayfa.isDisplayed());
    }


    @And("Sayfayi kapatir")
    public void sayfayiKapatir() {
        Driver.closeDriver();
    }
}