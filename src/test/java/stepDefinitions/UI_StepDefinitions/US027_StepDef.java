package stepDefinitions.UI_StepDefinitions;

import com.google.j2objc.annotations.ReflectionSupport;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.MedunnaPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US027_StepDef {

    MedunnaPage page=new MedunnaPage();
    Actions actions= new Actions(Driver.getDriver());

    @Given("Medunna anasayfasina gidilir")
    public void medunnaAnasayfasinaGidilir() {
        Driver.getDriver().get(ConfigReader.getProperty("medunnaURL"));
    }


    @Then("fgAccount menu butonu tiklanir")
    public void fgaccountMenuButonuTiklanir() {
        ReusableMethods.jsclick(page.accountGirisButton27);
    }

    @And("fgSign in butonuna tiklar")
    public void fgsignInButonunaTiklar() {
        ReusableMethods.jsclick(page.accountSignInGirisButton27);
    }

    @And("fgKullanici acilan sayfada Username bolumune gecerli bir kullanıcı adı girer")
    public void fgkullaniciAcilanSayfadaUsernameBolumuneGecerliBirKullanıcıAdıGirer() {
        ReusableMethods.jsclick(page.accountUserNameBox27);
        actions.sendKeys("team11", Keys.TAB).perform();

    }

    @And("fgKullanici acilan sayfada Password bolumune gecerli bir sifre girer")
    public void fgkullaniciAcilanSayfadaPasswordBolumuneGecerliBirSifreGirer() {
        ReusableMethods.jsclick(page.accountPasswordBox27);
        actions.sendKeys("Pl123456789", Keys.TAB).perform();
    }

    @And("fgSign in butonuna")
    public void fgsignInButonuna() {
        ReusableMethods.jsclick(page.account2SignInButton27);

    }

    @And("fgItems Titles butonuna tiklar")
    public void fgıtemsTitlesButonunaTiklar() {

        ReusableMethods.jsclick(page.ItemTitleButton27);

    }

    @Given("fgAcilan menuden message bolumune tiklar")
    public void fgacilanMenudenMessageBolumuneTiklar() {
        ReusableMethods.jsclick(page.messageButton27);

    }

    @And("fgYazilan mesajlarin gorundugunu dogrular")
    public void fgyazilanMesajlarinGorundugunuDogrular() {
        ReusableMethods.jsclick(page.messageGor);
        Assert.assertTrue(page.messageGor.isDisplayed());

    }

    @And("fgMesajlari gonderenkerin isimlerinin gorundugunu dogrular")
    public void fgmesajlariGonderenkerinIsimlerininGorundugunuDogrular() {
        ReusableMethods.jsclick(page.messageNameGor);
        Assert.assertTrue(page.messageNameGor.isDisplayed());

    }

    @And("fgMesajlari gonderenlerin e-postalarinin gorundugunu dogrular")
    public void fgmesajlariGonderenlerinEPostalarininGorundugunuDogrular() {
        ReusableMethods.jsclick(page.messageEmailGor);
        Assert.assertTrue(page.messageEmailGor.isDisplayed());

    }

    @Then("fgCreate a new message butonuna tiklar")
    public void fgcreateANewMessageButonunaTiklar() {
        ReusableMethods.jsclick(page.createMessageButton);

    }

    @And("fgAcilan sayfada   Name, Email, Subject, Message bölümlerine gerekli bilgileri girer")
    public void fgacilanSayfadaNameEmailSubjectMessageBölümlerineGerekliBilgileriGirer() {
        ReusableMethods.jsclick(page.createMessageNameBox);
        actions.sendKeys("olacakmi acaba").perform();

        ReusableMethods.jsclick(page.createMessageEmailBox);
        actions.sendKeys("a5@gmail.com").perform();

        ReusableMethods.jsclick(page.createMessageSubjectBox);
        actions.sendKeys("olacakmi acaba22").perform();

        ReusableMethods.jsclick(page.createMessageBox);
        actions.sendKeys("olacakmi acaba").perform();

        ReusableMethods.jsclick(page.createMessageSaveButton);
        actions.sendKeys("saveeee").perform();
    }

    @And("fgSave butonuna tiklar")
    public void fgsaveButonunaTiklar() {
        ReusableMethods.jsclick(page.messageEditSaveButton);

    }

    @And("fgOnceden olusturulan bir mesaji Edit butonunu kullanarak gunceller")
    public void fgoncedenOlusturulanBirMesajiEditButonunuKullanarakGunceller() {
        ReusableMethods.jsclick(page.messageEditButton);

    }

    @And("fgEdit ile guncellenen mesaji Save yaptigi zaman gelen onay mesajini gorur")
    public void fgeditIleGuncellenenMesajiSaveYaptigiZamanGelenOnayMesajiniGorur() {
        Assert.assertTrue(page.messageEditSaveOk.isDisplayed());

    }

    @And("fgDelete butonu ile olusturulan bir mesaji siler")
    public void fgdeleteButonuIleOlusturulanBirMesajiSiler() {
        ReusableMethods.jsclick(page.messageDeleteButton);

    }

    @And("fgSilinen mesajin onay mesajinin geldigini dogrular")
    public void fgsilinenMesajinOnayMesajininGeldiginiDogrular() {
        Assert.assertTrue(page.messageDeleteOk.isDisplayed());
    }
}
