package stepDefinitions.API_StepDefinitions;

import io.cucumber.java.en.*;
import io.restassured.response.*;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
import static utilities.Authentication.*;

public class US019_Api_StepDef {
    Response response;

    @Given("AdminSevval User Medunna")
    public void adminsevvalUserMedunna() {
        response = given().headers("Authorization", "Bearer " + generateToken()).when().get("https://medunna.com/api/staff/320148");
    }

    @When("AdminSevval User send Get request")
    public void adminsevvalUserSendGetRequest() {
        response.prettyPrint();
    }

    @Then("AdminSevval Status code is {int} oldugunu dogrular")
    public void adminsevvalStatusCodeIsOldugunuDogrular(int statusCode02) {
        response.then().statusCode(statusCode02);
    }

    @And("AdminSevval Verify expected data equals to actual data")
    public void adminsevvalVerifyExpectedDataEqualsToActualData() {
        response.then().body("firstName",equalTo("Jay"),"lastName",equalTo("Lehner"),
                "phone",equalTo("542-312-4243"),"gender",equalTo("MALE"),
                "bloodGroup",equalTo("Apositive"),
                "adress",equalTo("073 Runte Lights, Labadiechester, AZ 09652"));










    }
}
