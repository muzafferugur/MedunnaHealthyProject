package stepDefinitions.API_StepDefinitions;
import baseUrl.MedunnaBaseUrl;
import com.github.javafaker.App;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Assert;
import pojos.AppointmentPojo;
import pojos.PhysicianPojo;
import pojos.PostAppointment;
import utilities.Object_Mapper;

import static baseUrl.MedunnaBaseUrl.spec;
import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;
import static utilities.Authentication.generateToken;


public class US005_Api_StepDef extends MedunnaBaseUrl {

    Response response;

    @Given("kullanici get request yapar")
    public void kullanici_get_request_yapar() {
        response = given().headers("Authorization", "Bearer " + generateToken()).when().get("https://www.medunna.com/api/appointments/348056");
        response.prettyPrint();
    }

    @When("status kodunun {int} oldugunu dogrular")
    public void status_kodunun_oldugunu_dogrular(int statusCode) {
        Assert.assertEquals(200, response.statusCode());

    }

    @Then("gelen bilgilerin dogrulugunu test eder")
    public void gelen_bilgilerin_dogrulugunu_test_eder() {
        PhysicianPojo phyPojo = new PhysicianPojo(304941, "1903", "yasemin", "5456598585");
        AppointmentPojo expectedData = new AppointmentPojo(348056, "COMPLETED", phyPojo);

        AppointmentPojo actualData = Object_Mapper.convertJsonToJava(response.asString(), AppointmentPojo.class);
        System.out.println("actualData=" + actualData);

        Assert.assertEquals(expectedData.getId(), actualData.getId());
        Assert.assertEquals(expectedData.getStatus(), actualData.getStatus());
        Assert.assertEquals(phyPojo.getphone(), actualData.getPhysician().getphone());

    }

    @Given("Kullanici ia url adresine gider")
    public void kullaniciIaUrlAdresineGider() {

        //spec.pathParams("first","api","second","appointments","third","request");
        String endPoint="https://medunna.com/api/appointments/request";
        PostAppointment expectedData= new PostAppointment("Neurology","iay2@hotmail.com","onur3","ay3","male","333-333-4444","19","736-22-4786");

        response = given().contentType(ContentType.JSON).headers("Authorization", "Bearer " + generateToken()).body(expectedData).when().post(endPoint);
        response.prettyPrint();
    }
    @Given("Kullanici ia token alir")
    public void kullanici_ia_token_alir() {

    }
    @Then("Post islemi yaparak Appointment olusturur")
    public void post_islemi_yaparak_appointment_olusturur() {


    }
}
