package stepDefinitions.API_StepDefinitions;

import baseUrl.MedunnaBaseUrl;
import io.cucumber.java.en.*;
import io.restassured.response.Response;
import org.junit.Assert;
import pojos.PhysicianPojo;
import pojos.PhysicianPojo2;
import utilities.Object_Mapper;

import static io.restassured.RestAssured.given;
import static utilities.Authentication.generateToken;

public class US018_Api_StepDef extends MedunnaBaseUrl {
    Response response;
    @Given("AdminHus endpointe gider")
    public void admin_hus_endpointe_gider() {
        //spec.pathParams("first", "api", "second", "physicians", "third", 10508);
        //response = given().spec(spec).when().get("/{first}/{second}/{third}");
        response = given().headers("Authorization", "Bearer " + generateToken()).when().get("https://www.medunna.com/api/physicians/10508");

        response.prettyPrint();
    }
    @Then("olusturulan doktorun bilgilerini dogrular")
    public void olusturulan_doktorun_bilgilerini_dogrular() {
        PhysicianPojo2 expectedData = new PhysicianPojo2(10508, "Martin", "Brown", "2638120054", "DERMATOLOGY");
        PhysicianPojo2 actualData = Object_Mapper.convertJsonToJava(response.asString(), PhysicianPojo2.class);
        Assert.assertEquals (expectedData.getId(), actualData.getId());
        Assert.assertEquals (expectedData.getFirstName(), actualData.getFirstName());
        Assert.assertEquals (expectedData.getLastName(), actualData.getLastName());
        Assert.assertEquals (expectedData.getPhone(), actualData.getPhone());
        Assert.assertEquals (expectedData.getSpeciality(), actualData.getSpeciality());
    }

    @Then("status kodunun {int} oldugunu teyit eder")
    public void statusKodununOldugunuTeyitEder(int statusCode) {
        Assert.assertEquals("status code dogrulanamadi", statusCode, response.statusCode());

    }
}
