package stepDefinitions.API_StepDefinitions;
import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import pojos.*;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;

public class US_002_API_StepDefinition {
    Response response;
    US002RegisterPojo pojo;
    @Given("Kullanici register islemi icin POST Request gonderir")
    public void kullanici_register_islemi_icin_post_request_gonderir() {
        Faker faker=new Faker();
        String email=faker.internet().emailAddress();
        String firstName=faker.name().firstName();
        String lastName=faker.name().lastName();
        String userName=faker.name().username();
        String password=faker.internet().password();
        String ssn=faker.idNumber().ssnValid();

        pojo = new US002RegisterPojo( email,firstName,lastName,userName,password,ssn);
        response=given().contentType(ContentType.JSON).body(pojo).when().post("https://medunna.com/api/register");
        response.prettyPrint();
    }
    @Then("Kullanici Status Code {int} oldugunu kontrol eder")
    public void kullanici_status_code_oldugunu_kontrol_eder(int statusCode) {
        assertEquals(statusCode,response.getStatusCode());
    }
    @Then("Kullanici username ve email ile bilgileri dogrular")
    public void kullanici_username_ve_email_ile_bilgileri_dogrular() {
        US002RegisterPojo actualData = response.as(US002RegisterPojo.class);
        assertEquals(pojo.getEmail(),actualData.getEmail());
        assertEquals(pojo.getLogin(),actualData.getLogin());
    }


}
