package stepDefinitions.UI_StepDefinitions;

import io.cucumber.java.en.And;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;
import pages.MedunnaPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US019_StepDef {
    MedunnaPage medPage =new MedunnaPage();
    SoftAssert softAssert=new SoftAssert();
    JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();

    Actions actions = new Actions(Driver.getDriver());
    Select select;
    @And("AdminHus Staff seçeneğine tıklar")
    public void adminhusStaffSeçeneğineTıklar() {
        ReusableMethods.waitFor(2);
        js.executeScript("arguments[0].click();",medPage.staffButton);
    }
    @And("AdminHus Create a new Staff 'a tiklar")
    public void adminhusCreateANewStaffATiklar() {
        ReusableMethods.waitFor(2);
        medPage.createStaff.click();

    }
    @And("AdminHus Use Search tiklar")
    public void adminhusUseSearchTiklar() {
        ReusableMethods.waitFor(2);
        medPage.useSearch.click();
    }

    @And("AdminHus SSN girer")
    public void adminhusSSNGirer() {
        medPage.useSearchBox.sendKeys(ConfigReader.getProperty("doctor01SSN"));

    }

    @And("AdminHus Search User checkbox'a tıklar")
    public void adminhusSearchUserCheckboxATıklar() {
        medPage.searchUserButton.click();
    }

    @And("AdminHus açılan sayfada {string} mesajının göründüğünü doğrular")
    public void adminhusAçılanSayfadaMesajınınGöründüğünüDoğrular(String alertMessage) {
        ReusableMethods.waitFor(3);
        System.out.println(medPage.ssnAlertMessage.getText());
        System.out.println(alertMessage);
        Assert.assertTrue("Actual alert ve expected alert farkli",medPage.ssnAlertMessage.getText().contains(alertMessage));
    }


    @And("AdminHus açılan ekrandaki tüm alanları doldurur")
    public void adminhusAçılanEkrandakiTümAlanlarıDoldurur() {
        /*medPage.staffFirstnameBox.sendKeys("Michael");
        actions.sendKeys(Keys.TAB).sendKeys("Scofield")
       .sendKeys(Keys.TAB).sendKeys("01.01.1970").sendKeys(Keys.TAB).sendKeys("20:23").
                sendKeys(Keys.TAB).sendKeys("2858521470")
                        .sendKeys(Keys.TAB).sendKeys("MALE").sendKeys(Keys.TAB)
                        .sendKeys("O+").
        sendKeys(Keys.TAB).sendKeys("Fox River Prison, İllinois, USA").sendKeys(Keys.TAB).sendKeys("no more description")
                .sendKeys(Keys.TAB).sendKeys("29.11.2022").sendKeys(Keys.TAB)
                .sendKeys("20:20").sendKeys(Keys.TAB).sendKeys("lucykeeling")
        .sendKeys(Keys.TAB).sendKeys("Nicaragua").sendKeys(Keys.TAB).
        sendKeys("Arizona").sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.ENTER).perform();*/

        medPage.staffFirstnameBox.sendKeys("Michael");
        ReusableMethods.waitFor(1);
        medPage.staffLastnameBox.click();
        medPage.staffLastnameBox.sendKeys("Scofield");
        actions.sendKeys(Keys.TAB).sendKeys("01.01.1970").sendKeys(Keys.TAB).sendKeys("20:23").perform();
        ReusableMethods.waitFor(1);
        medPage.staffPhoneBox.click();
        medPage.staffPhoneBox.sendKeys("2858521470");
        ReusableMethods.waitFor(1);
        select=new Select(medPage.staffGender);
        select.selectByVisibleText("OTHER");
        ReusableMethods.waitFor(1);
        select=new Select(medPage.staffBloodGroupBox);
        select.selectByVisibleText("O+");
        medPage.staffAddressBox.sendKeys("Fox River Prison, İllinois, USA");
        actions.sendKeys(Keys.TAB).perform();
        medPage.staffDescriptionBox.sendKeys("no more description");
        actions.sendKeys(Keys.TAB).sendKeys("29.11.2022").sendKeys(Keys.TAB).sendKeys("20:20").perform();
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.waitFor(2);
        ReusableMethods.waitFor(1);
        medPage.staffUserBox.sendKeys("hru");
        actions.sendKeys(Keys.ENTER).perform();
        ReusableMethods.waitFor(2);
        select=new Select(medPage.staffCountryBox);
        select.selectByVisibleText("Nicaragua");
        ReusableMethods.waitFor(2);
        select=new Select(medPage.staffStateBox);
        select.selectByVisibleText("Arizona");
        actions.sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.ENTER).perform();
    }

    @And("AdminHus ekranda {string} mesajı göründüğünü doğrular")
    public void adminhusEkrandaMesajıGöründüğünüDoğrular(String alertMessage) {
        ReusableMethods.waitFor(3);
        System.out.println(medPage.ssnAlertMessage.getText());
        System.out.println(alertMessage);
        Assert.assertTrue("Actual alert ve expected alert farkli",medPage.ssnAlertMessage.getText().contains(alertMessage));
    }

    @And("AdminHus açılan ekranda ilk satırdaki view butonuna tıklar")
    public void adminhusAçılanEkrandaIlkSatırdakiViewButonunaTıklar() {
        medPage.staffViewButton.click();
    }

    @And("AdminHus staff bilgilerinin ekranda olduğunu doğrular")
    public void adminhusStaffBilgilerininEkrandaOlduğunuDoğrular() {
        Assert.assertTrue(medPage.staffTitle.isDisplayed());
        ReusableMethods.waitFor(1);
        Assert.assertTrue(medPage.staffId.isDisplayed());
        ReusableMethods.waitFor(1);
        Assert.assertTrue(medPage.staffSsn.isDisplayed());
        ReusableMethods.waitFor(1);
        Assert.assertTrue(medPage.staffFirstname.isDisplayed());
        ReusableMethods.waitFor(1);
        Assert.assertTrue(medPage.staffLastname.isDisplayed());
        Assert.assertTrue(medPage.staffBirthdate.isDisplayed());
        Assert.assertTrue(medPage.staffPhone.isDisplayed());
        Assert.assertTrue(medPage.staffGender2.isDisplayed());
        Assert.assertTrue(medPage.staffBlood.isDisplayed());
        Assert.assertTrue(medPage.staffAddress.isDisplayed());
        Assert.assertTrue(medPage.staffDescription.isDisplayed());
        Assert.assertTrue(medPage.staffCreatedate.isDisplayed());
        Assert.assertTrue(medPage.staffUser.isDisplayed());
        Assert.assertTrue(medPage.staffCountry.isDisplayed());
        Assert.assertTrue(medPage.staffState.isDisplayed());
    }

    @And("AdminHus ikinci sayfaya tiklar ve daha once olusturdugu staffin satırındaki edit butonuna tıklar")
    public void adminhusIkinciSayfayaTiklarVeDahaOnceOlusturduguStaffinSatırındakiEditButonunaTıklar() {

        ReusableMethods.waitFor(3);
        js.executeScript("arguments[0].click();", medPage.staffPage2);
        ReusableMethods.waitFor(3);
        medPage.staffEditButton.click();

    }

    @And("AdminHus zorunlu alanlarda güncelleme yapar")
    public void adminhusZorunluAlanlardaGüncellemeYapar() {
        ReusableMethods.waitFor(1);
        medPage.staffFirstNameBox.clear();
        ReusableMethods.waitFor(1);
        medPage.staffFirstnameBox.sendKeys("Michael");
        medPage.staffLastNameBox.clear();
        ReusableMethods.waitFor(1);
        medPage.staffLastNameBox.sendKeys("Scofield");
        ReusableMethods.waitFor(1);
        medPage.staffPhoneBox.clear();
        medPage.staffPhoneBox.sendKeys("1010101010");
        ReusableMethods.waitFor(1);
        select=new Select(medPage.staffGender);
        select.selectByVisibleText("OTHER");
        ReusableMethods.waitFor(1);
        select=new Select(medPage.staffBloodGroupBox);
        select.selectByVisibleText("O+");
        medPage.staffAddressBox.sendKeys("Fox River Prison, İllinois, USA");
        ReusableMethods.waitFor(1);

        medPage.staffDescriptionBox.clear();
        medPage.staffDescriptionBox.sendKeys("no more description");
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.waitFor(2);

        ReusableMethods.waitFor(1);
        medPage.staffUserBox.sendKeys("doktorruveyda");
        actions.sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys("Nicaragua").sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.ENTER).perform();

        //ReusableMethods.waitFor(2);
        //select=new Select(medPage.staffCountryBox);
        //select.selectByVisibleText("Nicaragua");
        //ReusableMethods.waitFor(2);
        //select=new Select(medPage.staffStateBox);
        //select.selectByVisibleText("Arizona");

    }
    @And("AdminHus save buttonuna tıklar")
    public void adminhusSaveButtonunaTıklar() {
        actions.sendKeys(Keys.TAB, Keys.TAB).perform();
        actions.sendKeys(Keys.ENTER).perform();

    }
    @And("AdminHus ekranda {string}mesajının göründüğünü doğrular")
    public void adminhusEkrandaMesajınınGöründüğünüDoğrular(String alertMessage) {
        ReusableMethods.waitFor(3);
        System.out.println(medPage.ssnAlertMessage.getText());
        System.out.println(alertMessage);
        Assert.assertTrue("Actual alert ve expected alert farkli",medPage.ssnAlertMessage.getText().contains(alertMessage));
    }

    @And("AdminHus oluşturduğu staffın satırındaki delete butonuna tıklar")
    public void adminhusOluşturduğuStaffınSatırındakiDeleteButonunaTıklar() {
        ReusableMethods.waitFor(3);
        js.executeScript("arguments[0].click();", medPage.staffPage2);
        medPage.staffDeleteButton2.click();

    }

    @And("AdminHus ekranda gorulen {string} açılır penceresinde delete butonuna tiklar")
    public void adminhusEkrandaGorulenAçılırPenceresindeDeleteButonunaTiklar(String arg0) {
        medPage.staffDeleteConfirmButton.click();

    }

    @And("AdminHus Create A new Staff secenegine tiklar")
    public void adminhusCreateANewStaffSecenegineTiklar() {
        ReusableMethods.waitFor(4);
        medPage.createStaff.click();
        ReusableMethods.waitFor(1);
        medPage.staffSSNBox.click();
        medPage.staffSSNBox.sendKeys("222-22-4796");
        actions.sendKeys(Keys.TAB).sendKeys(Keys.ENTER).perform();

    }




    @And("AdminHus ekranda {string}mesajinin göründüğünü doğrular")
    public void adminhusEkrandaMesajininGöründüğünüDoğrular(String deleteMessage) {
        ReusableMethods.waitFor(3);
        System.out.println(medPage.ssnAlertMessage.getText());
        System.out.println(deleteMessage);
        Assert.assertTrue("Actual alert ve expected alert farkli",medPage.ssnAlertMessage.getText().contains(deleteMessage));
    }
}
