package stepDefinitions.UI_StepDefinitions;
import com.beust.ah.A;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.MedunnaPage;
import utilities.Driver;
import utilities.ReusableMethods;
public class US025_StepDef {
    MedunnaPage page = new MedunnaPage();
    Actions actions = new Actions(Driver.getDriver());
    @Given("Kullanici make a appointments iconuna tiklar")
    public void kullaniciMakeAAppointmentsIconunaTiklar() {
        ReusableMethods.jsclick(page.makeAnAppointment);
    }
    @Then("Kullanici make a appointments sayfasina geldigini dogrular")
    public void kullaniciMakeAAppointmentsSayfasinaGeldiginiDogrular() {
        Assert.assertTrue(page.makeAnAppointmentHead.isDisplayed());
    }
    @And("Kullanici make a appointments sayfasinda bilgileri girer")
    public void kullaniciMakeAAppointmentsSayfasindaBilgileriGirer() {
        ReusableMethods.waitForVisibility(page.phone,10);
        page.phone.sendKeys( "552-155-6216");
    }
    @And("Kullanici sent and appointments request iconuna tiklar")
    public void kullaniciSentAndAppointmentsRequestIconunaTiklar() {
        ReusableMethods.jsclick(page.sendRequest);
    }
    @Then("Kullanici appointment registration saved! Yazisini gordugunu dogrular")
    public void kullaniciAppointmentRegistrationSavedYazisiniGordugunuDogrular() {
        String expectedData="Appointment registration saved!";
        System.out.println("page.onay.getText() = " + page.onay.getText());
        Assert.assertTrue(page.onay.getText().contains(expectedData));
    }
}
