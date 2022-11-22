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
    MedunnaPage page =new MedunnaPage();
    Actions actions= new Actions(Driver.getDriver());

    @And("Sign in butonuna tiklar")
    public void signInButonunaTiklar() {
        ReusableMethods.jsclick(page.signIn);

    }

    @Given("Kullanici acilan sayfada Username bolumune gecerli bir kullanıcı adı girer")
    public void kullaniciAcilanSayfadaUsernameBolumuneGecerliBirKullaniciAdiGirer() {
       ReusableMethods.jsclick(page.username);
       actions.sendKeys("Batch81",Keys.TAB).perform();

    }
    @And("Kullanici acilan sayfada Password bolumune gecerli bir sifre girer")
    public void kullaniciAcilanSayfadaPasswordBolumuneGecerliBirSifreGirer() {
        actions.sendKeys("Batch81+",Keys.TAB,Keys.SPACE,Keys.TAB,Keys.TAB,Keys.TAB,Keys.ENTER).perform();

    }

    @And("Kullanici giris yapmak için başari mesajını dogrular")
    public void kullaniciGirisYapmakIçinBaşariMesajınıDogrular() {
      Assert.assertTrue(page.girisText.isDisplayed());
    }


    @And("Kullanıcının mevcut kimlik bilgilerini her zaman kullanabilecegi, {string} seçenegini tiklar")
    public void kullanıcınınMevcutKimlikBilgileriniHerZamanKullanabilecegiSeçeneginiTiklar(String arg0) {

        
    }

    @Then("Kullanıcının  {string} seçeneginin tiklandıgını dogrular")
    public void kullanıcınınSeçenegininTiklandıgınıDogrular(String arg0) {
    }
}
