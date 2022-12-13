package stepDefinitions.API_StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.response.Response;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;

//import static base_url_setup.MedunnaBaseUrl.spec;
import static io.restassured.RestAssured.given;
import static org.hamcrest.core.IsEqual.equalTo;
import static utilities.Authentication.generateToken;

public class US015_Api_StepDef {
    Response response;

    @Given("SG Admin hasta bilgilerini Get request ile alir")
    public void sg_admin_hasta_bilgilerini_get_request_ile_alir() {
       // spec.pathParams("first", "api", "second", "patients", "third", 309176);
    //    response = given().spec(spec).headers("Authorization", "Bearer " + generateToken()).when().get("/{first}/{second}/{third}");
        response = given().headers("Authorization", "Bearer " + generateToken()).when().get("https://medunna.com/api/patients/309176");
        response.prettyPrint();

    }

    @Then("SG Admin status kodunun {int} oldugunu dogrular")
    public void sg_admin_status_kodunun_oldugunu_dogrular(Integer int1) {
        response.then().assertThat().statusCode(200);
    }

    @Then("SG Admin hasta bilgilerini dogrular")
    public void sg_admin_hasta_bilgilerini_dogrular() {

        /*
         "createdBy": "hastasamet",
    "createdDate": "2022-11-18T13:56:32.512131Z",
    "id": 309176,
    "firstName": "Hasta",
    "lastName": "Samet",
    "birthDate": null,
    "phone": "4874984964",
    "gender": null,
    "bloodGroup": null,
    "adress": null,
    "email": "hastasamet@gmail.com",
    "description": null,
         */

        response.then().assertThat().
                body("id", equalTo(309176),
                "firstName", equalTo("Hasta"),
                "lastName", equalTo("Samet"),
                "birthDate", equalTo(null),
                "phone", equalTo("4874984964"),
                "gender", equalTo(null),
                "bloodGroup", equalTo(null),
                "adress", equalTo(null),
                "email", equalTo("hastasamet@gmail.com"),
                "description", equalTo(null));

    }


}

