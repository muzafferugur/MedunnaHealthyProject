package stepDefinitions.UI_StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;
import pages.MedunnaPage;
import utilities.Driver;
import utilities.ReusableMethods;

public class US020_StepDef {
    MedunnaPage medPage =new MedunnaPage();
    SoftAssert softAssert=new SoftAssert();
    JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();

    Actions actions = new Actions(Driver.getDriver());
    Select select;
    @And("AdminHus AdminHus Administration butonuna tıklar")
    public void adminhusAdminHusAdministrationButonunaTıklar() {
        ReusableMethods.waitFor(1);
        medPage.administrationButton.click();
    }

    @And("AdminHus User Management butonunu tiklar")
    public void adminhusUserManagementButonunuTiklar() {
        ReusableMethods.waitFor(1);
        medPage.userManagementButton.click();
    }


    @And("AdminHus ikinci kullaniciyi secer ve view butonunu tiklar")
    public void adminhusIkinciKullaniciyiSecerVeViewButonunuTiklar() {
        medPage.userViewButton.click();
    }

    @And("AdminHus firstname, lastname,email bilgilerinin gorunur oldugunu dogrular")
    public void adminhusFirstnameLastnameEmailBilgilerininGorunurOldugunuDogrular() {
        Assert.assertTrue(medPage.userFirstNameElement.isDisplayed());
        Assert.assertTrue(medPage.userLastNameElement.isDisplayed());
        Assert.assertTrue(medPage.userEmailElement.isDisplayed());
    }

    @And("AdminHus ilk kullaniciyi secer ve view butonunu tiklar")
    public void adminhusIlkKullaniciyiSecerVeViewButonunuTiklar() {
        medPage.userViewButton.click();
    }

    @And("AdminHus kendi olusturdugu kullaniciya ait edit butonunu tiklar")
    public void adminhusKendiOlusturduguKullaniciyaAitEditButonunuTiklar() {
        ReusableMethods.waitFor(2);
        medPage.userEditButton.click();
    }

    @And("AdminHus activated box i tiklayarak kullanici aktive edebilir veya iptal edebilir")
    public void adminhusActivatedBoxITiklayarakKullaniciAktiveEdebilirVeyaIptalEdebilir() {

        ReusableMethods.waitFor(1);
        js.executeScript("arguments[0].click();", medPage.activatedCheckBox);
        medPage.activatedCheckBox.click();
    }


    @And("AdminHus profiles seceneginden Role-Admin atayabildigini test eder")
    public void adminhusProfilesSecenegindenRoleAdminAtayabildiginiTestEder() {
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        medPage.profilesRoleAdmin.click();

    }

    @And("AdminHus profiles seceneginden Role-User atayabildigini test eder")
    public void adminhusProfilesSecenegindenRoleUserAtayabildiginiTestEder() {
        medPage.profilesRoleUser.click();

    }

    @And("AdminHus profiles seceneginden Role-Patient atayabildigini test eder")
    public void adminhusProfilesSecenegindenRolePatientAtayabildiginiTestEder() {
        medPage.profilesRolePatient.click();

    }

    @And("AdminHus profiles seceneginden Role-Staff atayabildigini test eder")
    public void adminhusProfilesSecenegindenRoleStaffAtayabildiginiTestEder() {
        medPage.profilesRoleStaff.click();

    }

    @And("AdminHus profiles seceneginden Role-Physician atayabildigini test eder")
    public void adminhusProfilesSecenegindenRolePhysicianAtayabildiginiTestEder() {
        medPage.profilesRolePhysician.click();

    }

    @And("AdminHus ilk satırda bulunan delete butonunu tıklar")
    public void adminhusIlkSatırdaBulunanDeleteButonunuTıklar() {
        medPage.userDeleteButton.click();
    }

}
