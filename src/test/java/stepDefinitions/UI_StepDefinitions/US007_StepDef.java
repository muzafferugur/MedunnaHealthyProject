package stepdefinitions.UI_stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import pages.MedunnaPage;
import utilities.Driver;
import utilities.ReusableMethods;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class US007_StepDef {

    JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();

    MedunnaPage us07 = new MedunnaPage();



    @Then("Kullanici hastaUsername ve hastaPassword ile siteye giris yapar")
    public void kullanici_hasta_username_ve_hasta_password_ile_siteye_giris_yapar() {
        us07.accountMenu.click();
        us07.signInButton1.click();
        us07.usernameTextBox.sendKeys("hastayasemin");
        us07.passwordTextBox.sendKeys("Ankara06");
        us07.signInButton2.click();

    }
    @Then("Kullanici Make An Appointment butonuna tiklar")
    public void kullanici_make_an_appointment_butonuna_tiklar() {
        ReusableMethods.waitFor(2);
        us07.myPagesButton.click();
        ReusableMethods.waitFor(2);
        us07.makeanAppointmentButton.click();

        ReusableMethods.waitFor(2);
    }
    @Then("Kullanici Make An Appointment bolumunun gorunurlugunu test eder")
    public void kullanici_make_an_appointment_bolumunun_gorunurlugunu_test_eder() {
        Assert.assertTrue(us07.makeanAppointmenttext.isDisplayed());
    }
    @Then("Kullanici {string} bilgilerin doldurur")
    public void kullanici_bilgilerin_doldurur(String phone) {
        us07.phone07.sendKeys(phone);

    }
    @Then("Kullanici guncel bir tarih secer")
    public void kullanici_guncel_bir_tarih_secer() {
        ReusableMethods.waitFor(3);
        LocalDateTime istenilenTarih = LocalDateTime.now();
        DateTimeFormatter tarihFormati = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        String guncelTarih = istenilenTarih.format(tarihFormati);
        //System.out.println("guncelTarih = " + guncelTarih);
        us07.appointmentDateTime.sendKeys(guncelTarih);

    }
    @Then("Kullanici Send an AppointmentRequest butonunu tiklar")
    public void kullanici_send_an_appointment_request_butonunu_tiklar() {
        ReusableMethods.waitFor(2);
        js.executeScript("arguments[0].click();", us07.sendAppointmentButton);
        // us07.sendAppointmentButton.click();
    }
    @Then("Kullanici gecerli bir tarih girdigini cikan pop ile dogrular")
    public void kullanici_gecerli_bir_tarih_girdigini_cikan_pop_ile_dogrular() {
        us07.sendAppointmentButton2.click();
        Assert.assertTrue(us07.successMessageToastContainer.isDisplayed());
    }


    @And("Kullanici gecmis bir tarih secer")
    public void kullaniciGecmisBirTarihSecer() {
        LocalDateTime istenilenTarih = LocalDateTime.now().minusDays(2);
        DateTimeFormatter tarihFormati = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        String gecmisTarih = istenilenTarih.format(tarihFormati);
        System.out.println("gecmisTarih = " + gecmisTarih);
        us07.appointmentDateTime.sendKeys(gecmisTarih);
        ReusableMethods.waitFor(2);
    }

    @And("Kullanici gecersiz bir tarih girdigini cikan pop ile dogrular")
    public void kullaniciGecersizBirTarihGirdiginiCikanPopIleDogrular() {
        Assert.assertTrue(us07.sendAppointmentButton.isDisplayed());
    }

    @And("Kullanici gelecek bir tarih secer")
    public void kullaniciGelecekBirTarihSecer() {
        LocalDateTime istenilenTarih = LocalDateTime.now().plusDays(2);
        DateTimeFormatter tarihFormati = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        String gelecekTarih = istenilenTarih.format(tarihFormati);
        System.out.println("gelecekTarih = " + gelecekTarih);
        us07.appointmentDateTime.sendKeys(gelecekTarih);
    }

    @And("Kullanici {string} secer ve tarih sirasinin formata uygun seklinde oldugunu test eder")
    public void kullaniciSecerVeTarihSirasininFormataUygunSeklindeOldugunuTestEder(String date) {
        us07.appointmentDateTime.sendKeys(date);
        date = ReusableMethods.stringDateFormat(date);
        System.out.println("date = " + date);
        String medunnaFormat = us07.appointmentDateTime.getAttribute("value");
        System.out.println(us07.appointmentDateTime.getAttribute("value"));

        Assert.assertEquals(medunnaFormat, date);
    }
}
