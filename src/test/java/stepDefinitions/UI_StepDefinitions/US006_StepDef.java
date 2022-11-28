package stepdefinitions.UI_stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import pages.MedunnaPage;
import utilities.Driver;
import utilities.ReusableMethods;

public class US006_StepDef {
    JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
    MedunnaPage us06 = new MedunnaPage();




    @And("Kullanici pozisyonuna gore username {string} girer")
    public void kullaniciPozisyonunaGoreUsernameGirer(String username) {
        us06.usernameTextBox.sendKeys(username);


    }

    @And("Kullanici pozisyonuna gore password {string} girer")
    public void kullaniciPozisyonunaGorePasswordGirer(String password) {
        us06.passwordTextBox.sendKeys(password);
        ReusableMethods.waitFor(3);

    }


    @Then("Kullanici settings'e tiklar")
    public void kullanici_settings_e_tiklar() {
        ReusableMethods.waitFor(3);
        //js.executeScript("arguments[0].click();", us06.settingsButton2);
        us06.settingsButton2.click();
        us06.settingsButton.click();
        ReusableMethods.waitFor(3);

        Assert.assertTrue(ReusableMethods.waitForVisibility(us06.userSettingsForText, 3).isDisplayed());
    }

    @Then("Kullanici girerken doldurulan kullanıcı bilgilerini gorur\\(firstname, lastname, email )")
    public void kullanici_girerken_doldurulan_kullanıcı_bilgilerini_gorur_firstname_lastname_email() {
        Assert.assertTrue(us06.firstnameTextBox.isDisplayed());
        Assert.assertTrue(us06.lastnameTextBox.isDisplayed());
        Assert.assertTrue(us06.emailTextBox.isDisplayed());


    }

    @And("Kullanici sing out yaparak oturumu kapatir")
    public void kullaniciSingOutYaparakOturumuKapatir() {
        us06.signOutButton2.click();
        ReusableMethods.waitFor(3);
        us06.signOutButton.click();
    }


    @Then("Kullanici username olarak {string} girer")
    public void kullanici_username_olarak_girer(String username) {
        ReusableMethods.waitFor(3);
        us06.usernameTextBox.sendKeys(username);

    }

    @And("Kullanici password olarak {string} girer")
    public void kullaniciPasswordOlarakGirer(String password) {
        ReusableMethods.waitFor(3);
        us06.passwordTextBox.sendKeys(password);
    }

    @Then("Kullanici firstname kutusunu {string} yazisi ile gunceller.")
    public void kullanici_firstname_kutusunu_yazisi_ile_gunceller(String firstname) {
        ReusableMethods.waitFor(3);
        us06.firstnameTextBox.clear();
        us06.firstnameTextBox.sendKeys(firstname);
        us06.saveButton.click();
        String expectedFirstNameValue = us06.firstnameTextBox.getAttribute("value");
        System.out.println("expectedFirstNameValue = " + expectedFirstNameValue);
        Assert.assertEquals(firstname, expectedFirstNameValue);


    }

    @Then("Kullanici Save butonuna tiklar ve firstname kutusundaki yazinin guncellendigini gorur.")
    public void kullanici_save_butonuna_tiklar_ve_firstname_kutusundaki_yazinin_guncellendigini_gorur() {

        us06.saveButton.click();
        ReusableMethods.waitFor(3);
        Assert.assertTrue(us06.firstnameTextBox.isDisplayed());
    }


    @Then("Kullanici lastname  kutusunu {string} yazisi ile gunceller.")
    public void kullanici_lastname_kutusunu_yazisi_ile_gunceller(String lastname) {
        ReusableMethods.waitFor(3);
        us06.lastnameTextBox.clear();
        us06.lastnameTextBox.sendKeys(lastname);
        us06.saveButton.click();
        String expectedLastNameValue = us06.lastnameTextBox.getAttribute("value");
        System.out.println("expectedLastNameValue = " + expectedLastNameValue);
        Assert.assertEquals(lastname, expectedLastNameValue);

    }


    @And("Kullanici Save butonuna tiklar ve lastname kutusundaki yazinin guncellendigini gorur.")
    public void kullaniciSaveButonunaTiklarVeLastnameKutusundakiYazininGuncellendiginiGorur() {

        us06.saveButton.click();
        ReusableMethods.waitFor(3);
        Assert.assertTrue(us06.lastnameTextBox.isDisplayed());
    }


    @Then("Kullanici email  kutusunu {string} yazisi ile gunceller.")
    public void kullanici_email_kutusunu_yazisi_ile_gunceller(String email) {
        ReusableMethods.waitFor(3);
        us06.emailTextBox.clear();
        us06.emailTextBox.sendKeys(email);

        String expectedEmailValue = us06.emailTextBox.getAttribute("value");
        System.out.println("expectedEmailValue = " + expectedEmailValue);
        Assert.assertEquals(email, expectedEmailValue);

    }

    @And("Kullanici Save butonuna tiklar ve email kutusundaki yazinin guncellendigini gorur.")
    public void kullaniciSaveButonunaTiklarVeEmailKutusundakiYazininGuncellendiginiGorur() {
        us06.saveButton.click();
        ReusableMethods.waitFor(3);
        Assert.assertTrue(us06.emailTextBox.isDisplayed());
    }


    @Then("Kullanici Sign In butonuna tiklar")
    public void kullaniciSignInButonunaTiklar() {
        us06.accountMenu3.click();
        us06.signInButton1.click();
        ReusableMethods.waitFor(5);
    }

    @And("Signin butonuna tiklar")
    public void signinButonunaTiklar() throws InterruptedException{
            us06.signInButton2.click();
            Thread.sleep(2000);
        }
    }


