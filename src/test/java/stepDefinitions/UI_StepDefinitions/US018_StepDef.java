package stepDefinitions.UI_StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;
import pages.MedunnaPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US018_StepDef {
    MedunnaPage medPage =new MedunnaPage();
    SoftAssert softAssert=new SoftAssert();
    JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();

    Actions actions = new Actions(Driver.getDriver());
    Select select;
    @Given("AdminHus {string} gider")
    public void adminhusGider(String url) {
        Driver.getDriver().get(ConfigReader.getProperty(url));
    }

    @When("AdminHus Giris ikonuna tiklar")
    public void adminhusGirisIkonunaTiklar() {
        medPage.accountIcon.click();
    }

    @Then("AdminHus Sign in secenegine tiklar")
    public void adminhusSignInSecenegineTiklar() {
        medPage.signInButton.click();
    }

    @And("AdminHus  {string} ve {string} ile giris yapar")
    public void adminhusVeIleGirisYapar(String username, String password) {
        medPage.userNameBox.sendKeys(ConfigReader.getProperty("adminUserName"));
        medPage.passwordBox.sendKeys(ConfigReader.getProperty("adminPassword"));
    }

    @And("AdminHus Sign in butonuna tiklar")
    public void adminhusSignInButonunaTiklar() {
        medPage.signInButton22.click();
    }

    @And("AdminHus ItemsTitles butonuna tiklar")
    public void adminhusItemsTitlesButonunaTiklar() {
        ReusableMethods.waitFor(2);
        medPage.itemTitlesDropdown.click();
    }

    @And("AdminHus Physician secenegine tiklar")
    public void adminhusPhysicianSecenegineTiklar() {
        medPage.physicianOption.click();
    }

    @And("AdminHus Physicians tablosundaki butun doktorlarin bigilerinin gorunur oldugunu test eder")
    public void adminhusPhysiciansTablosundakiButunDoktorlarinBigilerininGorunurOldugunuTestEder() {
        for (WebElement w:medPage.physiciansTable
        ) {
            Assert.assertTrue(w.isDisplayed());
        }
    }
    @Then("AdminHus sayfayi kapatir")
    public void adminhusSayfayiKapatir() {
        Driver.closeDriver();
    }

    @And("AdminHus Create a new physician butonuna tiklar")
    public void adminhusCreateANewPhysicianButonunaTiklar() {
        ReusableMethods.waitFor(2);
        medPage.createANewPhysicianButton.click();
    }
    @And("AdminHus Use Search Boxı isaretler")
    public void adminhusUseSearchBoxıIsaretler()
    {
        medPage.useSearchCheckBox.click();
    }
    @And("AdminHus SSN kutusuna kayitli bir {string} numarasi girer")
    public void adminhusSSNKutusunaKayitliBirNumarasiGirer(String arg0) {
        medPage.useSearchBox.sendKeys(ConfigReader.getProperty("ssn"));
    }

    @And("AdminHus Search User butonuna tiklar")
    public void adminhusSearchUserButonunaTiklar() {
        medPage.searchUserButton.click();
    }

    @And("AdminHus alert mesajinin {string} icerdigini test eder")
    public void adminhusAlertMesajininIcerdiginiTestEder(String alertMessage) {
        ReusableMethods.waitFor(3);
        System.out.println(medPage.ssnAlertMessage.getText());
        System.out.println(alertMessage);
        Assert.assertTrue("Actual alert ve expected alert farkli",medPage.ssnAlertMessage.getText().contains(alertMessage));
    }

    @And("AdminHus ilk edit butonuna tiklar")
    public void adminhusIlkEditButonunaTiklar() {
        medPage.physicianEditButton.click();
    }
    @And("AdminHus doktor bilgilerini gunceller")
    public void adminhusDoktorBilgileriniGunceller() {
        medPage.physicianFirstnameBox.clear();
        medPage.physicianFirstnameBox.sendKeys("Michael");
        ReusableMethods.waitFor(1);
        medPage.physicianLastnameBox.clear();
        medPage.physicianLastnameBox.sendKeys("Scofield");
        ReusableMethods.waitFor(1);
        medPage.physicianBirthDateBox.clear();
        medPage.physicianBirthDateBox.sendKeys("01.01.1980");
        ReusableMethods.waitFor(1);
        medPage.physicianPhoneBox.clear();
        medPage.physicianPhoneBox.sendKeys("2858521470");
        ReusableMethods.waitFor(1);
        medPage.physicianAdressBox.clear();
        medPage.physicianAdressBox.sendKeys("Fox River Prison, İllinois, USA");
        ReusableMethods.waitFor(1);
        select=new Select(medPage.genderDdm);
        select.selectByVisibleText("OTHER");
        ReusableMethods.waitFor(1);
        select=new Select(medPage.specialityDdm);
        select.selectByVisibleText("Neurology");
        ReusableMethods.waitFor(1);
        select=new Select(medPage.physicianBloodGroupBox);
        select.selectByVisibleText("O+");
        ReusableMethods.waitFor(1);
        medPage.physicianDescriptionBox.clear();
        medPage.physicianDescriptionBox.sendKeys("no more description");
        js.executeScript("scroll(0, 900)");
        String path = System.getProperty("user.home") + "\\Desktop\\doctor.png";
        medPage.imageButton.sendKeys(path);
        medPage.examFeeBox.click();
        medPage.examFeeBox.clear();
        medPage.examFeeBox.sendKeys("1000");
        ReusableMethods.waitFor(1);
        actions.sendKeys(Keys.TAB,Keys.TAB).perform();
        medPage.userDdm.click();
        medPage.userDdm.sendKeys("doktorruveyda:234-54-6523");
        actions.sendKeys(Keys.ENTER).perform();
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.waitFor(2);
        select=new Select(medPage.physicianStateCityDdm);
        select.selectByVisibleText("California");
    }
    @And("AdminHus Save butonuna tiklar")
    public void adminhusSaveButonunaTiklar() {
        //ReusableMethods.waitFor(3);
        //medPage.saveButton.click();
    }

    @And("AdminHus ilk delete butonuna tiklar")
    public void adminhusIlkDeleteButonunaTiklar() {


        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("arguments[0].click();",medPage.deleteAlert);

        //Driver.getDriver().switchTo().alert().accept();


    }
}
