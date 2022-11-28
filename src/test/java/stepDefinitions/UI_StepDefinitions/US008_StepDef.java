package stepDefinitions.UI_StepDefinitions;

import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.MedunnaPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US008_StepDef {
    MedunnaPage us08_pages=new MedunnaPage();
    Actions actions= new Actions(Driver.getDriver());
    @Given("Dr.Url adresine gider.")
    public void dr_url_adresine_gider() {
        Driver.getDriver().get(ConfigReader.getProperty("medunnaUrl"));

    }
    @Then("Dr. Kullanici bilgi sekmesini tiklar.")
    public void dr_kullanici_bilgi_sekmesini_tiklar() {
        us08_pages.kullaniciGirisBolumu.click();
    }
    @Then("Dr. Login islemini gerceklestirir.")
    public void dr_login_islemini_gerceklestirir() {

        us08_pages.signinGiris.click();
        us08_pages.username.sendKeys("staffkbr");
        us08_pages.password.sendKeys("stafkbr1*");
        us08_pages.signinButton.click();
        ReusableMethods.waitFor(2);
    }
    @Then("kullanici Password butonunu tiklar")
    public void kullanici_password_butonunu_tiklar() {
        us08_pages.accountMenu.click();
        us08_pages.passwordButonu.click();
    }
    @Then("kullanici Current password secenegini tiklar")
    public void kullanici_current_password_secenegini_tiklar() {
        us08_pages.currentPassword.sendKeys(ConfigReader.getProperty("password"));
        ReusableMethods.waitFor(2);
    }
    @Then("kullanici New password secenegini tiklar")
    public void kullanici_new_password_secenegini_tiklar() {
        us08_pages.newPassword.click();
        ReusableMethods.waitFor(2);
    }
    @Then("kullanici New password secenegine en az alti  karakter ve bir kucuk harf girer.")
    public void kullanici_new_password_secenegine_en_az_alti_karakter_ve_bir_kucuk_harf_girer() {
        us08_pages.newPassword.sendKeys("a123456");
        ReusableMethods.waitFor(1);

    }
    @Then("kullanici Password strength ikinci seviyesinin degistigini gorur.")
    public void kullanici_password_strength_ikinci_seviyesinin_degistigini_gorur() {
        ReusableMethods.waitFor(2);
        Assert.assertTrue(us08_pages.ikinciBar.isDisplayed());

    }@And("kullanici sayfayi yeniler")
    public void kullanici_sayfayi_yeniler() {
        ReusableMethods.waitFor(2);
        us08_pages.newPassword.clear();

    }
    @And("kullanici New password secenegine en az alti  karakter ve bir buyuk harf girer.")
    public void kullanici_new_password_secenegine_en_az_alti_karakter_ve_bir_buyuk_harf_girer() {
        ReusableMethods.waitFor(2);
        us08_pages.newPassword.sendKeys("A123456a");



    }  @And("kullanici Password strength dorduncu seviyesinin degistigini gorur.")
    public void kullanici_password_strength_dorduncu_seviyesinin_degistigini_gorur() {
        ReusableMethods.waitFor(2);
        Assert.assertTrue(us08_pages.dorduncuBar.isDisplayed());

    }
    @And("kullanici New password secenegine en az alti  karakter ve bir ozel harf girer.")
    public void kullanici_new_password_secenegine_en_az_alti_karakter_ve_bir_ozel_harf_girer() {

        ReusableMethods.waitFor(2);
        us08_pages.newPassword.clear();
        ReusableMethods.waitFor(1);
        us08_pages.newPassword.sendKeys("A123456a*");
    }

    @And("kullanici en az yedi karakter girer")
    public void kullanici_en_az_yedi_karakter_girer() {
        ReusableMethods.waitFor(2);
        us08_pages.newPassword.clear();
        ReusableMethods.waitFor(2);
        us08_pages.newPassword.sendKeys("A123456a*.");

    }
    @And("kullanici Password strength besinci seviyesinin degistigini gorur.")
    public void kullanici_password_strength_besinci_seviyesinin_degistigini_gorur() {
        ReusableMethods.waitFor(2);
        Assert.assertTrue(us08_pages.besinciBar.isDisplayed());
    }
    @And ("kullanici sayfayi kapatir")
    public void kullanici_sayfayi_kapatir() {
        Driver.quitDriver();


    }




}
