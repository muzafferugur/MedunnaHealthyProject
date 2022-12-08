package stepDefinitions.API_StepDefinitions;

import io.cucumber.java.en.*;
import io.restassured.http.*;
import io.restassured.response.*;
import org.junit.*;
import pojos.*;
import utilities.*;
import static io.restassured.RestAssured.*;
import static org.testng.AssertJUnit.*;
import static utilities.Authentication.*;

public class US017_Api_StepDef {
    Response response;

    @Given("AdminHercai User Medunna")
    public void adminhercaiUserMedunna() {
        // String medunnaUrl= "https://medunna.com/api/c-test-items/376845";

        response = given().headers("Authorization", "Bearer " + generateToken()).when().get("https://medunna.com/api/c-test-items/376845");


    }

    @When("AdminHercai User send Get request")
    public void adminhercaiUserSendGetRequest() {
        response.prettyPrint();

    }

    TestItemsPojo expectedData;

    @Then("AdminHercai Status code is {int} oldugunu dogrular")
    public void adminhercaiStatusCodeIsOldugunuDogrular(int statusCode) {

        response.then().statusCode(statusCode);
    }

    @And("AdminHercai Verify expected data equals to actual data")
    public void adminhercaiVerifyExpectedDataEqualsToActualData() {
        expectedData = new TestItemsPojo("Ayse Nazli", "Ates", 310.00, "270", "400");
        //  System.out.println("expectedData = " + expectedData);
        TestItemsPojo actualData = Object_Mapper.convertJsonToJava(response.asString(), TestItemsPojo.class);
        //  System.out.println("actualData = " + actualData);

        Assert.assertEquals(expectedData.getName(), actualData.getName());
        assertEquals(expectedData.getDescription(), actualData.getDescription());
        assertEquals(expectedData.getPrice(), actualData.getPrice());
        assertEquals(expectedData.getDefaultValMin(), actualData.getDefaultValMin());
        assertEquals(expectedData.getDefaultValMax(), actualData.getDefaultValMax());

/*
  SoftAssert softAssert=new SoftAssert();
    softAssert.assertEquals(actualData.getName(),expectedData.getName());
    softAssert.assertEquals(actualData.getDescription(),expectedData.getDescription());
    softAssert.assertEquals(actualData.getPrice(),expectedData.getPrice());
    softAssert.assertEquals(actualData.getDefaultValMax(),expectedData.getDefaultValMax());
    softAssert.assertEquals(actualData.getDefaultValMin(),expectedData.getDefaultValMin());
   softAssert.assertAll();
 */


    }

    @Given("Admin HE goes to Medunna for post request the Test Item")
    public void adminHEGoesToMedunnaForPostRequestTheTestItem() {
        String name= ReusableMethods.getFaker().name().firstName();

        expectedData = new TestItemsPojo(name, "Catch a cold", 500.00, "200", "500");
        response = given().headers("Authorization", "Bearer " + generateToken()).contentType(ContentType.JSON).body(expectedData).
                when().post("https://medunna.com/api/c-test-items");

    }

    @When("Admin HE sends Post request")
    public void adminHESendsPostRequest() {
        response.prettyPrint();

    }

    @Then("Admin HE Status code is {int} oldugunu dogrular")
    public void adminHEStatusCodeIsOldugunuDogrular(int statuscode) {
        response.then().statusCode(statuscode);
    }

    @And("Admin HE Verify expected data equals to actual data")
    public void adminHEVerifyExpectedDataEqualsToActualData() {
        TestItemsPojo actualData = Object_Mapper.convertJsonToJava(response.asString(), TestItemsPojo.class);
        Assert.assertEquals(expectedData.getName(), actualData.getName());
        assertEquals(expectedData.getDescription(), actualData.getDescription());
        assertEquals(expectedData.getPrice(), actualData.getPrice());
        assertEquals(expectedData.getDefaultValMin(), actualData.getDefaultValMin());
        assertEquals(expectedData.getDefaultValMax(), actualData.getDefaultValMax());


    }
}
