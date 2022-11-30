package stepDefinitions.UI_StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import pages.MedunnaPage;
import utilities.ConfigReader;
import utilities.Driver;

public class US005_StepDef {
    MedunnaPage us05 = new MedunnaPage();
    WebDriver driver = new ChromeDriver();
    Actions act = new Actions(driver);
    @Given("Kullanıcı {string} adresine gider")
    public void kullanıcıAdresineGider(String url) {
        Driver.getDriver().get(ConfigReader.getProperty(url));



    }
    @Given("Kullanici  {string} anasayfaya gider")
    public void kullanici_anasayfaya_gider(String medunnaUrl) {
        Driver.getDriver().get(ConfigReader.getProperty(medunnaUrl));
    }
    @Then("Make an Appointment sekmesine tiklar")
    public void make_an_appointment_sekmesine_tiklar() {
        Driver.wait(1);
        us05.makeAppointmentButton.click();
        Driver.wait(1);
    }

    @Then("isim olarak {string} girer")
    public void isim_olarak_girer(String firstName) {
        us05.firstNameBox3.sendKeys(firstName);
    }

    @Then("soy isim {string} girer")
    public void soy_isim_girer(String lastName) {
        Driver.wait(1);
        us05.lastNameBox3.sendKeys(lastName);
    }

    @Then("SSN numarasi olarak {string} girer")
    public void ssn_numarasi_olarak_girer(String ssn) {
        Driver.wait(1);
        us05.SSNBox.sendKeys(ssn);
    }

    @Then("Email adresi olarak {string} girer")
    public void email_adresi_olarak_girer(String email) {
        Driver.wait(1);
        us05.emailBox3.sendKeys(email);
    }

    @Then("Telefon numarasi olarak {string} girer")
    public void telefon_numarasi_olarak_girer(String phone) {
        Driver.wait(1);
        us05.phoneBox.sendKeys(phone);
    }

    @Then("Appointment Date olarak {string} girer")
    public void appointment_date_olarak_girer(String date) {
        Driver.wait(1);
        us05.appointmentDateBox.sendKeys(date);
        us05.sendAppointmentButton3.click();
    }

    @Then("Send an Appointment Request butonuna tiklar.")
    public void send_an_appointment_request_butonuna_tiklar() {
        Driver.wait(2);
        us05.sendAnAppointmentRequestButton.click();
    }

    @Then("{string} hata mesajini gorur.")
    public void hata_mesajini_gorur(String message) {
        String expectedText = message;
        String actualText = us05.hataMesaji.getText();
        Assert.assertEquals(expectedText, actualText);
    }



    @And("kullanici browseri kapatir")
    public void kullaniciBrowseriKapatir() {

    }

    @And("{string} onay mesajini gorur.")
    public void onayMesajiniGorur(String message) {
        Driver.wait(1);
        String expectedText = message;
        Driver.wait(1);

        String actualtext = us05.registerOnayMesaji.getText();
        System.out.println(actualtext);
        Assert.assertEquals(expectedText, actualtext);


    }


    @And("Kullanici Sign In butonuna tiklar ve kaydola tıklar")
    public void kullaniciSignInButonunaTiklarVeKaydolaTıklar() {
        us05.signIn3.click();
        us05.register3.click();
    }

    @And("Kullanici kayıt bilgilerini girer")
    public void kullaniciKayıtBilgileriniGirer() {
        us05.SSNBox.sendKeys("852-74-9641");;
        act.sendKeys(Keys.TAB).sendKeys("firstname").sendKeys(Keys.TAB).
                sendKeys("lastname").sendKeys("firstlastname").sendKeys(Keys.TAB)
                .sendKeys("hasta06@hasta06.com").sendKeys(Keys.TAB)
                .sendKeys("FirstName123+").sendKeys(Keys.TAB)
                .sendKeys("FirstName123+").perform();
        us05.register2.click();
    }

    @And("Kullanici {string} bilgilerin doldur ve giriş yapar")
    public void kullaniciBilgilerinDoldur(String arg0) {
        us05.passwordTextBox.click();
        act.sendKeys("FirstName123+").perform();
    }
}
