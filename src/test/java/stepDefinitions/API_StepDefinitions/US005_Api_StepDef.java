package stepDefinitions.API_StepDefinitions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import static io.restassured.RestAssured.given;
import static utilities.Authentication.generateToken;


public class US005_Api_StepDef {

    Response response;

    @Given("kullanici get request yapar")
    public void kullanici_get_request_yapar() {
       response = given().headers("Authorization", "Bearer " + generateToken()).when().get("https://www.medunna.com/api/appointments/348056");
       response.prettyPrint();
    }

    @When("status kodunun {int} oldugunu dogrular")
    public void status_kodunun_oldugunu_dogrular(Integer int1) {


    }

    @Then("gelen bilgilerin dogrulugunu test eder")
    public void gelen_bilgilerin_dogrulugunu_test_eder() {


    }
}
