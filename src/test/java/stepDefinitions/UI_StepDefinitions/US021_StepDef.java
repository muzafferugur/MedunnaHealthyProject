package stepDefinitions.UI_StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import pages.MedunnaPage;
import utilities.ReusableMethods;

import java.util.List;

public class US021_StepDef {
    MedunnaPage us21 = new MedunnaPage();
    List<WebElement> patientList;

    @Then("Patients tablosunun ve hasta bilgilerinin gorunur oldugunu test eder")
    public void patients_tablosunun_ve_hasta_bilgilerinin_gorunur_oldugunu_test_eder() {
        for (WebElement w : us21.patientsList) {
            w.isDisplayed();
        }

    }

    @Then("Randevu bilgilerinde degisiklik yapilip SAVE yapilir")
    public void randevu_bilgilerinde_degisiklik_yapilip_save_yapilir() {
        us21.anamnesisTextBox.sendKeys("hastass");
        ReusableMethods.waitFor(5);
        ReusableMethods.jsclick(us21.saveButtons);
        //   us21.saveButtons.click();


    }

    @Then("Randevu bilgilerinde degisikliklerin oldugu gorulur")
    public void randevu_bilgilerinde_degisikliklerin_oldugu_gorulur() {
        us21.guncellendiYazisi2.isDisplayed();

    }


    @And("Status seceneginin UNAPPROVED oldugu gorulmelidir")
    public void statusSecenegininUNAPPROVEDOlduguGorulmelidir() {
        us21.statusTextBox.isDisplayed();
    }

    @And("Status seceneginin PENDİNG  secilmelidir ve  doktor ataması yapilip SAVE yapilmalidir.Status seceneginin PENDİNG oldugu gorulmelidir")
    public void statusSecenegininPENDİNGSecilmelidirVeDoktorAtamasıYapilipSAVEYapilmalidirStatusSecenegininPENDİNGOlduguGorulmelidir() {
        us21.statusTextBox.sendKeys("P", Keys.ENTER);
        ReusableMethods.waitFor(5);
        ReusableMethods.jsclick(us21.saveButtons);
        us21.statusTextBox.isDisplayed();
    }

    @And("Status seceneginin COMPLETED  secilmemelidir ve SAVE yapilmalidir.Status seceneginin COMPLETED olmadigi gorulmelidir")
    public void statusSecenegininCOMPLETEDSecilmemelidirVeSAVEYapilmalidirStatusSecenegininCOMPLETEDOlmadigiGorulmelidir() {
    }

    @And("Status seceneginin CANCELLED  secilmelidir ve SAVE yapilmalidir.Status seceneginin CANCELLED oldugu gorulmelidir")
    public void statusSecenegininCANCELLEDSecilmelidirVeSAVEYapilmalidirStatusSecenegininCANCELLEDOlduguGorulmelidir() {
        us21.ssnSearchBox.sendKeys("145-58-5806");
        us21.showAppointmentsButton.click();
        us21.editClick.click();
        us21.statusTextBox.sendKeys("C",Keys.ENTER);
        ReusableMethods.waitFor(5);
        ReusableMethods.jsclick(us21.saveButtons);
        us21.statusTextBox.isDisplayed();
    }

    @And("Anamnesis,Treatment,Diagnosis kisimlarina bilgi girilip,{string}yapilmalidir.")
    public void anamnesisTreatmentDiagnosisKisimlarinaBilgiGirilipYapilmalidir(String arg0) {
        us21.anamnesisTextBox.sendKeys("deneme");
        us21.treatmentTextBox.sendKeys("deneme");
        us21.diagnosisTextBox.sendKeys("deneme");
        us21.saveButtons.click();
    }

    @And("Anamnesis,Treatment,Diagnosis kisimlarina bilgi girilmedigi gorulmelidir")
    public void anamnesisTreatmentDiagnosisKisimlarinaBilgiGirilmedigiGorulmelidir() {
    }

    @And("{string} kismindan doktor secilmelidir ve {string} yapilmalidir")
    public void kismindanDoktorSecilmelidirVeYapilmalidir(String arg0, String arg1) {
    }

    @And("Randevunun olustugu  gorulmelidir")
    public void randevununOlustuguGorulmelidir() {
    }
}
