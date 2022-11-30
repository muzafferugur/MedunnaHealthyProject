package stepDefinitions.UI_StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import pages.MedunnaPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US026_StepDef {

    MedunnaPage page=new MedunnaPage();
    Actions actions= new Actions(Driver.getDriver());

    @Given("Medunna anasayfasina gidilir")
    public void medunnaAnasayfasinaGidilir() {
        Driver.getDriver().get(ConfigReader.getProperty("medunnaURL"));
    }


    @Given("Contact butonuna tiklanir")
    public void contactButonunaTiklanir() {
        ReusableMethods.jsclick(page.contactButton);

    }

    @Then("Sayfanin sonuna inilir")
    public void sayfaninSonunaInilir() {

    }

    @And("Mesaj gonderilebilecek alanin oldugu dogrulanir")
    public void mesajGonderilebilecekAlaninOlduguDogrulanir() {
        ReusableMethods.jsclick(page.contactEmailBox);
        Assert.assertTrue(page.contactMessageBox.isDisplayed());

    }

    @Then("Sayfanin sonuna gidilir")
    public void sayfaninSonunaGidilir() {

    }

    @And("Name yazan bolume bir isim girer")
    public void nameYazanBolumeBirIsimGirer() {
        ReusableMethods.jsclick(page.contactNameBox);
        page.contactNameBox.sendKeys("Ahmet");
    }

    @And("Email yazan bolume email girer")
    public void emailYazanBolumeEmailGirer() {
        ReusableMethods.jsclick(page.contactEmailBox);
        page.contactEmailBox.sendKeys("Ahmet@gmail.com");

    }

    @And("Subject yazan yere konu girer")
    public void subjectYazanYereKonuGirer() {
        ReusableMethods.jsclick(page.contactSubject);
        page.contactSubject.sendKeys("Hastalıklar hakkında bilgi istiyorum");
    }


    @And("Message yazan yere mesaj girer")
    public void messageYazanYereMesajGirer() {
        ReusableMethods.jsclick(page.contactMessageBox);
        page.contactMessageBox.sendKeys("Erkan mejazını aldım bende ivit diyorum");
    }

    @And("Send butonuna tiklar")
    public void sendButonunaTiklar() {
        ReusableMethods.jsclick(page.contactSendButton);
    }

    @And("Your message has been received mesajinin gorundugunu dogrular")
    public void yourMessageHasBeenReceivedMesajininGorundugunuDogrular() {
        Assert.assertTrue(page.contactSendButton.isDisplayed());

    }
}
